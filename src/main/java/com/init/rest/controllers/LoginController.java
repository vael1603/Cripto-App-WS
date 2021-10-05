package com.init.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.init.rest.bean.LoginBean;
import com.init.rest.dtos.LoginDTO;
import com.init.rest.services.ws.LoginWSService;

@RestController
@RequestMapping("/")
public class LoginController {

	@Autowired
	private LoginWSService loginWSService;
	
	@ResponseBody
	@RequestMapping(value="login", method=RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public LoginBean login(@RequestBody LoginDTO loginDTO) throws Exception {
		LoginBean loginBean = loginWSService.loginUser(loginDTO);
		return loginBean;
	}

}
