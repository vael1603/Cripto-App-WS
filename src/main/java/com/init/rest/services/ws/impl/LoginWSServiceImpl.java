package com.init.rest.services.ws.impl;


import org.springframework.stereotype.Service;

import com.init.rest.bean.LoginBean;
import com.init.rest.dao.LoginDAO;
import com.init.rest.dtos.LoginDTO;
import com.init.rest.services.ws.LoginWSService;

@Service
public class LoginWSServiceImpl implements LoginWSService {
	
	public static final LoginDAO loginDAO = new LoginDAO();

	@Override
	public LoginBean loginUser(LoginDTO logindto) throws Exception {
		LoginBean interpretado = new LoginBean();
		
		try {
				interpretado = loginDAO.loginUser(logindto);
			} catch (Exception e) {
				e.printStackTrace();
			}
		return interpretado;
	}
}
