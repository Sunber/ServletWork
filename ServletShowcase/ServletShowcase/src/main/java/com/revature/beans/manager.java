package com.revature.beans;

public class manager {
	
	private int managerId;
	private String manFirstName;
	private String manLastName;
	private String manUserName;
	private String manPassword;
	public manager(int managerId, String manFirstName, String manLastName,
			String manUserName, String manPassword) {
		super();
		this.managerId = managerId;
		this.manFirstName = manFirstName;
		this.manLastName = manLastName;
		this.manUserName = manUserName;
		this.manPassword = manPassword;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public String getManFirstName() {
		return manFirstName;
	}
	public void setManFirstName(String manFirstName) {
		this.manFirstName = manFirstName;
	}
	public String getManLastName() {
		return manLastName;
	}
	public void setManLastName(String manLastName) {
		this.manLastName = manLastName;
	}
	public String getManUserName() {
		return manUserName;
	}
	public void setManUserName(String manUserName) {
		this.manUserName = manUserName;
	}
	public String getManPassword() {
		return manPassword;
	}
	public void setManPassword(String manPassword) {
		this.manPassword = manPassword;
	}

}
