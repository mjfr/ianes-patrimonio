package br.senai.sp.info.pweb.ianespatrimonio.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.util.DigestUtils;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 20, nullable = false, unique = false, name = "nome")
	@NotNull
	@Size(min = 1, max = 20)
	private String name;
	
	@Column(length = 40, nullable = false, unique = false, name = "sobrenome")
	@NotNull
	@Size(min = 1, max = 40)
	private String surname;
	
	@Column(length = 120, nullable = false, unique = true, name = "email")
	@NotNull
	@Email
	@Size(min = 1, max = 120)
	private String email;
	
	@Column(length = 32, nullable = false, unique = false, name = "senha") // 32 devido ao HASH
	@NotNull
	@Size(min = 6, max = 20)
	private String password;
	
	@NotNull
	private UserAuthority userAuthority;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserAuthority getUserAuthority() {
		return userAuthority;
	}

	public void setUserAuthority(UserAuthority userAuthority) {
		this.userAuthority = userAuthority;
	}
	
	public void passwordHash() {
		this.password = DigestUtils.md5DigestAsHex(this.password.getBytes());
	}
}