package com.rkp.sdwan.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rkp.sdwan.config.ServiceConfig;
import com.rkp.sdwan.model.Circuit;
import com.rkp.sdwan.model.SdwanAccountDetails;

@Service
public class SdwanService {
	
	@Autowired
	ServiceConfig config;
	
	public SdwanAccountDetails getSdwanAccountDetails(String globalAccountId) {
		return getDummyDetails(globalAccountId);
	}
	
	private SdwanAccountDetails getDummyDetails(String globalAccountId) {
		
		SdwanAccountDetails sdwanActDetail = new SdwanAccountDetails();
		sdwanActDetail.setHasSdwan(true);
		
		List<String> accessLinks = new ArrayList<String>();
		accessLinks.add("Broadband");
		accessLinks.add("Cellular-Broadband");

		List<Circuit> circuits = new ArrayList<Circuit>();
		Circuit ckt1 = new Circuit();
		ckt1.setExchangeCarrierCircuitId("SDWAN-Circuit-1");
		Circuit ckt2 = new Circuit();
		ckt2.setExchangeCarrierCircuitId("SDWAN-Circuit-2");
		circuits.add(ckt1);
		circuits.add(ckt2);
		
		sdwanActDetail.setAccessLinks(accessLinks);
		sdwanActDetail.setSdwanCircuits(circuits);

		String vendor = getSdwanVendorInstance(globalAccountId);
		return sdwanActDetail;
	}
	
	private String getSdwanVendorInstance(String globalAccountId) {
		
		String url = config.getSdwanMiddlewareUrl();
		System.out.println("SDWAN Middleware URL is: "+url);
		return "XYZ";
	}

}
