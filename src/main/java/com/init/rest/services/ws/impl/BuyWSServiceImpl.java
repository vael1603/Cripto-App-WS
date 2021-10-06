package com.init.rest.services.ws.impl;


import org.springframework.stereotype.Service;

import com.init.rest.bean.BuyBean;
import com.init.rest.dao.BuyDAO;
import com.init.rest.dtos.BuyDTO;
import com.init.rest.services.ws.BuyWSService;

@Service
public class BuyWSServiceImpl implements BuyWSService {
	
	public static final BuyDAO buyDAO = new BuyDAO();

	@Override
	public BuyBean bought(BuyDTO buyDTO) throws Exception {
		BuyBean interpretado = new BuyBean();
		
		try {
				interpretado = buyDAO.saveOrder(buyDTO);
			} catch (Exception e) {
				e.printStackTrace();
			}
		return interpretado;
	}
}
