package com.init.rest.services.ws;

import com.init.rest.bean.LoginBean;
import com.init.rest.dtos.LoginDTO;

public interface LoginWSService {
	
	public LoginBean loginUser(LoginDTO loginDTO) throws Exception; 			
}
