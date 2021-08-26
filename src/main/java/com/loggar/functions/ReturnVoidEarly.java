package com.loggar.functions;

public class ReturnVoidEarly {

	public void returnVoidEarly() {

		if (System.getenv("SERVER.ENV").equals("development")) {
			return;
		}
		// do something
	}
}
