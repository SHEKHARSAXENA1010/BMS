package com.bms.entity;

public class LoginDetails {

	private String email;
	private String password;
	private String response;
	private String role;
	private long id;
	private String isactive = "false";

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIsactive() {
		return isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	@Override
	public String toString() {
		return "LoginDetails [email=" + email + ", password=" + password + ", response=" + response + ", role=" + role
				+ ", id=" + id + ", isactive=" + isactive + ", toString()=" + super.toString() + "]";
	}

}
