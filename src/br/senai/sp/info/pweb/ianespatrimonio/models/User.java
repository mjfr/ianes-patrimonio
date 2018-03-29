package br.senai.sp.info.pweb.ianespatrimonio.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	private Long id;
	
	@Column(length = 20, nullable = false, unique = false, name = "nome")
	private String name;
	
	@Column(length = 40, nullable = false, unique = false, name = "sobrenome")
	private String surname;
	
	@Column(length = 120, nullable = false, unique = true, name = "email")
	private String email;
	
	@Column(length = 32, nullable = false, unique = false, name = "senha") // 32 devido ao HASH
	private String password;
	
	@Column(unique = false, nullable = false, name = "id_tipo")
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
}