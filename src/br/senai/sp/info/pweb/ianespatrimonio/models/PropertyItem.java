package br.senai.sp.info.pweb.ianespatrimonio.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PropertyItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "id_patrimonio", nullable = false)
//	@Column(nullable = false, unique = false, name = "id_patrimonio")
	private Property idProp;
	
	@ManyToOne
	@JoinColumn(name = "id_ambiente", nullable = false)
//	@Column(nullable = false, unique = false, name = "id_ambiente")
	private Place idPlace;
	
	@ManyToOne
	@JoinColumn(name = "id_usuario", nullable = false)
//	@Column(nullable = false, unique = false, name = "id_usuario")
	private User idUser;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Property getIdProp() {
		return idProp;
	}

	public void setIdProp(Property idProp) {
		this.idProp = idProp;
	}

	public Place getIdPlace() {
		return idPlace;
	}

	public void setIdPlace(Place idPlace) {
		this.idPlace = idPlace;
	}

	public User getIdUser() {
		return idUser;
	}

	public void setIdUser(User idUser) {
		this.idUser = idUser;
	}
}
