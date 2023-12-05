package services.doublei.models;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class LoginModel {

	@NotNull (message="Username required") 
	@Size(min =3, max =15, message="Username 3 to 15 chars")
	private String username;
	
	@NotNull  (message="Password required")
	@Size(min =3, max =15, message="Password 8 to 15 chars")
	private String password;
	
	
	public LoginModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginModel(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginModel [username=" + username + ", password=" + password + "]";
	}
	
	
	
}
