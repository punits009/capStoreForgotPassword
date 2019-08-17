package com.cg.inputFormats;

public class PasswordEmail {

	private String emailid;
	private String password;

	public PasswordEmail() {
		// TODO Auto-generated constructor stub
	}

	public PasswordEmail(String emailid, String password) {
		super();
		this.emailid = emailid;
		this.password = password;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
