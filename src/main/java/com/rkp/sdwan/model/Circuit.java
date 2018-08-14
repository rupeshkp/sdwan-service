package com.rkp.sdwan.model;


public class Circuit {
	//This model includes only those attributes that are needed by Sdwan Service
	//not including city/state/zip/tsp etc needed by other functional pieces
	private String exchangeCarrierCircuitId;

	public String getExchangeCarrierCircuitId() {
		return exchangeCarrierCircuitId;
	}

	public void setExchangeCarrierCircuitId(String exchangeCarrierCircuitId) {
		this.exchangeCarrierCircuitId = exchangeCarrierCircuitId;
	}
	
	
}
