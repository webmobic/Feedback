package com.wm.feedback.dto;

import java.io.Serializable;

public class SessionDTO implements Serializable{
	
	private String userName;
	private String companyClientId;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCompanyClientId() {
		return companyClientId;
	}
	public void setCompanyClientId(String companyClientId) {
		this.companyClientId = companyClientId;
	}

}
