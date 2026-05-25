package com.cts.solidprinciples.srs;

public class UserDetails {

	private String userName;
	private String email;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public UserDetails(String userName, String email) {
		super();
		this.userName = userName;
		this.email = email;
	}

	public void saveUser() {
		// Code to save user to database
		System.out.println("User saved to database.");
	}

	public void sendEmail(String message) {
		// Code to send email
		System.out.println("Email sent to " + email + " with message: " + message);
	}

//getter/setters

	public static void main(String args[]) {
		UserDetails user = new UserDetails("James Smith", "smith.james@gmail.com");

		UserRepository userRepository = new UserRepository();
		userRepository.saveUser(user);

		EmailService emailService = new EmailService();
		emailService.sendEmail(user, "Welcome to our platform!");

	}
}

class UserRepository {
	public void saveUser(UserDetails user) {
		// Code to save user to database
		System.out.println("User " + user.getUserName() + " saved to database.");
	}
}

class EmailService {
	public void sendEmail(UserDetails user, String message) {
		// Code to send email
		System.out.println("Email sent to " + user.getEmail() + " with message: " + message);
	}
}
