package com.cts;

class Browser {

	private static Browser browser;

	private Browser() {

	}

	public static Browser getInstance() {
		if (browser == null)
			browser = new Browser();

		return browser;
	}

	public void displayMsg() {
		System.out.println("displayed message");
	}
}

public class Singleton {

	public static void main(String args[]) {

		Browser.getInstance().displayMsg();

	}
}
