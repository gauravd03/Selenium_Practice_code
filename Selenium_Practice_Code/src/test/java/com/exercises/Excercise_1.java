package com.exercises;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excercise_1 {
	
	//Exercise 1:
//Write a script to open google.com and verify that title is Google and also verify that it is redirected to google.co.in

	public static void main(String args[]) {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	
	//store title
	String title=driver.getTitle();
	
	
	//verify title
	if(title.equals("Google")) {
		System.out.println("pass : Title is Google");
	}else {
		System.out.println("Fail, invalid title ,actual title: " +title);
	}
	
	//verify is it redirected to google or not
	
	String currentUrl =driver.getCurrentUrl();
	
	if(currentUrl.equals("https://www.google.com/")) {
		System.out.println("Pass: url mactched :" +currentUrl);
	}else {
		System.out.println("Fail: Url no matched , actual url: "+currentUrl);
	}
	
	driver.close();
}
}