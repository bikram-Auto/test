package com.akhilsystem_release.base.data;

import java.time.Duration;

public class Data {

//	WebDriver driver = new WebDriver;
	protected Duration timeout = Duration.ofSeconds(9);
	protected String url = "https://akhil-systems-his.squbix.com/";
	protected double sleep = .1;
	
	protected void sleep(double d) {
		try {
			Thread.sleep((long) (d*2000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
