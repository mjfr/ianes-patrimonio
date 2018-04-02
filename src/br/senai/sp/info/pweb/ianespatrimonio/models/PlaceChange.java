package br.senai.sp.info.pweb.ianespatrimonio.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PlaceChange {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, unique = false, name = "data_cadastro")
	private Date registerDate;
	
	@ManyToOne
	@JoinColumn(name = "id_atual_ambiente", nullable = false)
//	@Column(nullable = false, unique = false, name = "id_ambiente1")
	private Place idPlace1;
	
	@ManyToOne
	@JoinColumn(name = "id_destino_ambiente", nullable = false)
//	@Column(nullable = false, unique = false, name = "id_ambiente2")
	private Place idPlace2;
	
	@ManyToOne
	@JoinColumn(name = "id_usuario", nullable = false)
//	@Column(nullable = false, unique = false, name = "id_usuario")
	private User idUser;
	
	@ManyToOne
	@JoinColumn(name = "id_item", nullable = false)
//	@Column(nullable = false, unique = false, name = "id_item")
	private PropertyItem idItem;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Place getIdPlace1() {
		return idPlace1;
	}

	public void setIdPlace1(Place idPlace1) {
		this.idPlace1 = idPlace1;
	}

	public Place getIdPlace2() {
		return idPlace2;
	}

	public void setIdPlace2(Place idPlace2) {
		this.idPlace2 = idPlace2;
	}

	public User getIdUser() {
		return idUser;
	}

	public void setIdUser(User idUser) {
		this.idUser = idUser;
	}

	public PropertyItem getIdItem() {
		return idItem;
	}

	public void setIdItem(PropertyItem idItem) {
		this.idItem = idItem;
	}
}