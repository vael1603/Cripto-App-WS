package com.init.rest.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;

import com.init.rest.bean.LoginBean;
import com.init.rest.dtos.LoginDTO;
import com.init.rest.dtos.LoginResponseDTO;

@Repository("LoginDAO")
public class LoginDAO {
	
	private static Log log = LogFactory.getLog(LoginDAO.class);
	
	public List<LoginResponseDTO> usersData = new ArrayList<LoginResponseDTO>();

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
				loginBean.setName(usersData.get(i).getName());
				loginBean.setLastName(usersData.get(i).getLastName());
			} else {
				loginBean.setLogged(false);
				loginBean.setUser(user);
				loginBean.setCorrectPassword(false);
				loginBean.setFoundUser(true);
				loginBean.setName("");
				loginBean.setLastName("");
			}
		} else {
			loginBean.setLogged(false);
			loginBean.setUser("Not Found");
			loginBean.setCorrectPassword(false);
			loginBean.setFoundUser(false);
			loginBean.setName("");
			loginBean.setLastName("");
			
		}
		
		return loginBean;
	}
	
	public void dataBase() throws Exception {

		usersData.add(new LoginResponseDTO("evalenzuela", "Contraseña", "Elias", "Valenzuela"));
		usersData.add(new LoginResponseDTO("juan", "123456", "Juan", "Flores"));
		usersData.add(new LoginResponseDTO("pedro", "Qwerty", "Pedro", "jimenez"));
		usersData.add(new LoginResponseDTO("jazmin", "123456", "Jazmin", "Salazar"));
		usersData.add(new LoginResponseDTO("maria", "Contraseña", "Maria", "Felquer"));
		
	}
		
}
