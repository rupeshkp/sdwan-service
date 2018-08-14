package com.rkp.sdwan.model;

import java.util.List;

public class SdwanAccountDetails {

	private boolean hasSdwan;
	private List<String> accessLinks;
	private List<Circuit> sdwanCircuits;
	
	public boolean hasSdwan() {
		return hasSdwan;
	}
	public void setHasSdwan(boolean hasSdwan) {
		this.hasSdwan = hasSdwan;
	}
	public List<String> getAccessLinks() {
		return accessLinks;
	}
	public void setAccessLinks(List<String> accessLinks) {
		this.accessLinks = accessLinks;
	}
	public List<Circuit> getSdwanCircuits() {
		return sdwanCircuits;
	}
	public void setSdwanCircuits(List<Circuit> sdwanCircuits) {
		this.sdwanCircuits = sdwanCircuits;
	}
	
	
}
