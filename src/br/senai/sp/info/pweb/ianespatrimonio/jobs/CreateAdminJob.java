package br.senai.sp.info.pweb.ianespatrimonio.jobs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import br.senai.sp.info.pweb.ianespatrimonio.dao.UserDAO;
import br.senai.sp.info.pweb.ianespatrimonio.models.User;
import br.senai.sp.info.pweb.ianespatrimonio.models.UserAuthority;

@Component
public class CreateAdminJob implements ApplicationListener<ContextRefreshedEvent>{

	@Autowired
	private UserDAO userDAO;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		User admin = new User();
		admin.setEmail("juca@ianes.com");
		admin.setName("Jucelino");
		admin.setSurname("alguma coisa");
		admin.setPassword("jucaban");
		admin.setUserAuthority(UserAuthority.ADMINISTRATOR);
		
		userDAO.persist(admin);
		System.out.println("[JOB] - O usuário administrador está pronto para uso");
	}	
}