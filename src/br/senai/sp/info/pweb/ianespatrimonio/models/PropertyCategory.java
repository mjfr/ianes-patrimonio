package br.senai.sp.info.pweb.ianespatrimonio.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PropertyCategory {

	@Id
	private Long id;
	
	@Column(length = 30, nullable = false, unique = true, name = "categoria_patrimonio")
	private String pCategory;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getpCategory() {
		return pCategory;
	}

	public void setpCategory(String pCategory) {
		this.pCategory = pCategory;
	}
}