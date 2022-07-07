package com.bms.entity;

public class ForgotPassword {

	private String email;
	private String oldpassword;
	private String newpassword;
	private String confirmpassword;
	private String response;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOldpassword() {
		return oldpassword;
	}

	public void setOldpassword(String oldpassword) {
		this.oldpassword = oldpassword;
	}

	public String getNewpassword() {
		return newpassword;
	}

	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}

	public String getConfirmpassword() {
		return confirmpassword;
	}

	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	@Override
	public String toString() {
		return "ForgotPassword [email=" + email + ", oldpassword=" + oldpassword + ", newpassword=" + newpassword
				+ ", confirmpassword=" + confirmpassword + ", response=" + response + ", toString()=" + super.toString()
				+ "]";
	}

}
