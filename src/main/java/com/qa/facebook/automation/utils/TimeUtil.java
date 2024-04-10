package com.qa.facebook.automation.utils;

public class TimeUtil {
	
	//Synechronization problem 
	
	//Static wait  --> Thread.sleep(2000) -->it will pause your execution for specified wait 
	
	//Implicit wait --> You need to write this wait at the first line of your code   ----> NO 
	
	//Explicitwait  --> wait for Specific element  --> highly recomendaded to use
	
	//FluentWait   --> polling activity --> 1/2 second 500
	
	
	//1] Static wait 
	//sort wait
	//medium wait
	//Longwait
	//Generic wait
	
	public static void shortWait() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void mediumWait() {
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void longWait() {
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void genericWait(int time) {
		try {
			Thread.sleep(time*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
