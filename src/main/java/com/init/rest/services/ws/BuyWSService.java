package com.init.rest.services.ws;

import com.init.rest.bean.BuyBean;
import com.init.rest.dtos.BuyDTO;

public interface BuyWSService {
	
	public BuyBean bought(BuyDTO buyDTO) throws Exception; 			
}
