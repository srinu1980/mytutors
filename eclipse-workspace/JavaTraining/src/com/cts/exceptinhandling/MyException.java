package com.cts.exceptinhandling;

public class MyException extends Exception {

	private int ex;

	public MyException(int ex) {
		super();
		this.ex = ex;
	}

	@Override
	public String toString() {
		return "MyException [Negative Integer value entered :" + ex + "]";
	}

}
