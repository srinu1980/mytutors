package com.cts.solid.srp;

public class UserRepository {

	public void saveUser(User user) {
		System.out.println("User " + user.getName() + " saved to database.");
	}
}
