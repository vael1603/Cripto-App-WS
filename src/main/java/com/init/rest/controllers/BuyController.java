package com.init.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.init.rest.bean.BuyBean;
import com.init.rest.dtos.BuyDTO;
import com.init.rest.services.ws.BuyWSService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/")
public class BuyController {

	@Autowired
	private BuyWSService buyWSService;
	
	@ResponseBody
	@RequestMapping(value="buy", method=RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public BuyBean login(@RequestBody BuyDTO buyDTO) throws Exception {
		BuyBean buyBean = buyWSService.bought(buyDTO);
		return buyBean;
	}

}
