package com.cts.solid.srp;

public class Main {

	public static void main(String[] args) {

		User user = new User("Rohit Sharma", "rohit.sharma@gmail.com");

		UserRepository userRepository = new UserRepository();
		userRepository.saveUser(user);

		EmailService emailService = new EmailService();
		emailService.sendEmail(user, "Welcome to our Platform!");
	}

}
