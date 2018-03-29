package br.senai.sp.info.pweb.ianespatrimonio.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Place {

	@Id
	private Long id;
	
	@Column(length = 30, nullable = false, unique = true, name = "ambiente")
	private String place;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}
}