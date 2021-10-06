package com.init.rest.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;

import com.init.rest.bean.BuyBean;
import com.init.rest.bean.LoginBean;
import com.init.rest.dtos.BuyDTO;
import com.init.rest.dtos.LoginResponseDTO;

@Repository("BuyDAO")
public class BuyDAO {
	
	private static Log log = LogFactory.getLog(BuyDAO.class);


	public BuyBean saveOrder(BuyDTO buyDTO) throws Exception {
		
		BuyBean response = new BuyBean();
		response = dataBase(buyDTO);
				
		return response;
	}
	
	public BuyBean dataBase(BuyDTO order) throws Exception {
		
		log.info("El usuario " + order.getUser());
		log.info("Ha comprado " + order.getQuantity() + " unidades de " + order.getAsset());
		log.info("El precio que ha pagado es $"+ order.getPayed() + ", contando la comision de $" + order.getCommission());
		
		BuyBean response = new BuyBean();
		response.setInfo("Orden Guardada con Exito");
		return response;	

	}
		
}
