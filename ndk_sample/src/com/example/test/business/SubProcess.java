package com.example.test.business;

public class SubProcess {

	public static native String getWord();
	
	public native String getHello();


	public native String getHello2();
	
	static{
		System.loadLibrary("test");
	}
}
