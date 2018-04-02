package br.senai.sp.info.pweb.ianespatrimonio.dao.jpa;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.senai.sp.info.pweb.ianespatrimonio.dao.UserDAO;
import br.senai.sp.info.pweb.ianespatrimonio.models.User;

@Repository
public class UserJPA implements UserDAO{

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void alter(User obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User search(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> searchAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(User obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void persist(User obj) {
		sessionFactory.getCurrentSession().persist(obj);
		
	}	
}