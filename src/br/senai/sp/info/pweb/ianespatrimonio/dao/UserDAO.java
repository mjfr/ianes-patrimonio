package br.senai.sp.info.pweb.ianespatrimonio.dao;

import java.util.List;

import br.senai.sp.info.pweb.ianespatrimonio.models.User;

public interface UserDAO {

	public void alter(User obj);
	
	public User search(Long id);
	
	public List<User> searchAll();
	
	public void delete(User obj);
	
	public void persist(User obj);
}