package com.cts.solid.srp;

public class EmailService {

	public void sendEmail(User user, String message) {
		System.out.println("Email send to " + user.getEmail() + " with Message " + message);
	}
}
