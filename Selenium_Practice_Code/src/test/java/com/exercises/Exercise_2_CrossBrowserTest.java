package com.exercises;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exercise_2_CrossBrowserTest {

	
	public static void main(String args[]) {
		
		
		WebDriver driver; 
		
		String browser="edge";
		String url="https://www.google.com/";
		
		if(browser.equals("chrome")){
			driver=new ChromeDriver();
			driver.get(url);
		}else if(browser.equals("firefox")) {
			driver=new FirefoxDriver();
			driver.get(url);
			
		}else if(browser.equals("edge")) {
			driver=new EdgeDriver();
			driver.get(url);
		}
	}
}
