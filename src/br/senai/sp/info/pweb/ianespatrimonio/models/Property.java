package br.senai.sp.info.pweb.ianespatrimonio.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Property {

	@Id
	private Long id;
	
	@Column(length = 40, nullable = false, unique = true, name = "nome")
	private String property;
	
	@Column(nullable = false, unique = false, name = "data_cadastro")
	//@DateTimeFormat(pattern = "yyyy-MM-dd") é para quando recebemos pela requisição por causa do Spring, aqui é apenas hibernate
	private Date registerDate;
	
	@ManyToOne
	@JoinColumn(name = "id_categoria", nullable = false)
//	@Column(nullable = false, unique = true, name = "id_categoria")
	private PropertyCategory idCat;
	
	@ManyToOne
	@JoinColumn(name = "id_usuario", nullable = false) // Serve para alterar informações sobre a chave estrangeira
//	@Column(nullable = false, unique = true, name = "id_usuario")
	private User idUser;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	public PropertyCategory getIdCat() {
		return idCat;
	}

	public void setIdCat(PropertyCategory idCat) {
		this.idCat = idCat;
	}

	public User getIdUser() {
		return idUser;
	}

	public void setIdUser(User idUser) {
		this.idUser = idUser;
	}
}