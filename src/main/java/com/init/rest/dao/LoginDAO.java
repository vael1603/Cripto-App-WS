package com.init.rest.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;

import com.init.rest.bean.LoginBean;
import com.init.rest.dtos.LoginDTO;

@Repository("LoginDAO")
public class LoginDAO {
	
	private static Log log = LogFactory.getLog(LoginDAO.class);
	
	public List<LoginDTO> usersData = new ArrayList<LoginDTO>();

	public LoginBean loginUser(LoginDTO loginDTO) throws Exception {
		
		dataBase();

		LoginBean loginBean = new LoginBean();
				
		String user = loginDTO.getUser();
		String password = loginDTO.getPassword();
		
		List<String> usersList = new ArrayList<String>(); 
		for (int i = 0; i < usersData.size(); ++i) {
			usersList.add(usersData.get(i).getUser());
		}
		
		if(usersList.contains(user)) {
			int i = usersList.indexOf(user);
			String userPassword = usersData.get(i).getPassword();
			
			if(password.equals(userPassword)) {
				loginBean.setLogged(true);
				loginBean.setUser(user);
				loginBean.setCorrectPassword(true);
				loginBean.setFoundUser(true);
			} else {
				loginBean.setLogged(false);
				loginBean.setUser(user);
				loginBean.setCorrectPassword(false);
				loginBean.setFoundUser(true);
			}
		} else {
			loginBean.setLogged(false);
			loginBean.setUser("Not Found");
			loginBean.setCorrectPassword(false);
			loginBean.setFoundUser(false);
			
		}
		
		return loginBean;
	}
	
	public void dataBase() throws Exception {

		log.info("*********************************************************");
		usersData.add(new LoginDTO("evalenzuela", "Contraseña"));
		usersData.add(new LoginDTO("juan", "123456"));
		usersData.add(new LoginDTO("pedro", "Qwerty"));
		usersData.add(new LoginDTO("jazmin", "123456"));
		usersData.add(new LoginDTO("maria", "Contraseña"));
		List<String> lista = new ArrayList<String>();
		
		lista.add("evalenzuela");
		lista.add("evalenzue");
		lista.add("evalena");
		
		log.info(lista.contains("evalenzuela"));
	}
		
}
