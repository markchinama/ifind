package com.IFind.Entity;

import java.util.Map;
import java.util.Set;

public class User extends BasicEntity {

	private String userName;
	private String password;
	private String neckName;
	private String mailAddress;
	private String liveAddress;

	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNeckName() {
		return neckName;
	}

	public void setNeckName(String neckName) {
		this.neckName = neckName;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getLiveAddress() {
		return liveAddress;
	}

	public void setLiveAddress(String liveAddress) {
		this.liveAddress = liveAddress;
	}

}
