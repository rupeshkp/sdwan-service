package com.rkp.sdwan.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.rkp.sdwan.model.SdwanAccountDetails;
import com.rkp.sdwan.services.SdwanService;

@RestController
@RequestMapping(value="/v1/sdwan")
public class SdwanServiceController {
	
	@Autowired
	SdwanService sdwanService;
	
    @RequestMapping(value="/getAccountDetails/{globalAccountId}", method=RequestMethod.GET)
    public String getSdwanAccountDetails(@PathVariable("globalAccountId") String globalAccountId) {
        
    	System.out.println("Inside getSdwanAccountDetails");
        SdwanAccountDetails details = sdwanService.getSdwanAccountDetails(globalAccountId);
        Gson gson = new Gson();
        String json = gson.toJson(details);
        System.out.println("Json is: "+json);
        return json;
     }
    
    /*
	public String helloDocker(@PathVariable(value = "name") String name) {
        String response = "Hello " + name + " Response received on : " + new Date();
        System.out.println(response);
        return response;
     }*/
    
    
}


