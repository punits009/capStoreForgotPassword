package com.cg.inputFormats;

public class PasswordFormat {
	
	private String email;
	private String category;
	private String answer1;
	private String answer2;
	
	public PasswordFormat() {
		// TODO Auto-generated constructor stub
	}

	public PasswordFormat(String email, String category, String answer1, String answer2) {
		super();
		this.email = email;
		this.category = category;
		this.answer1 = answer1;
		this.answer2 = answer2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAnswer1() {
		return answer1;
	}

	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}

	public String getAnswer2() {
		return answer2;
	}

	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}
	
	

}
