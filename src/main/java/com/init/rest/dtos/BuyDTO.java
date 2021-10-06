package com.init.rest.dtos;

public class BuyDTO {
	
	private String 	asset;
	private float 	quantity;
	private float 	payed;
	private float 	commission;
	private String 	user;
	
	public String getAsset() {
		return asset;
	}
	public void setAsset(String asset) {
		this.asset = asset;
	}
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	public float getPayed() {
		return payed;
	}
	public void setPayed(float payed) {
		this.payed = payed;
	}
	public float getCommission() {
		return commission;
	}
	public void setCommission(float commission) {
		this.commission = commission;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}

	
}
