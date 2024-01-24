package com.practice1_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserHandlingCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*Exercise :
 Practice Exercise:-
Launch new Browser
Open DemoQA.com website
Click on Registration link using "driver.findElement(By.xpath(".//[@id='menu-item-374']/a")).click();"*
Come back to Home page (Use 'Back' command)
Again go back to Registration page (This time use 'Forward' command)
Again come back to Home page (This time use 'To' command)
Refresh the Browser (Use 'Refresh' command)
Close the Browser
		 */
		
		
		WebDriver driver=new ChromeDriver();
		//open web page
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//click on link
		driver.findElement(By.xpath("//a[@class=\"blinkingText\"]")).click();
		
		//get url check
		String url=driver.getCurrentUrl();
		System.out.println("clicked url: "+url);
		
		//navigate to back
		driver.navigate().back();
		System.out.println("after back command page title: "+driver.getTitle());
		
		//naavigate to forword
		driver.navigate().forward();
		driver.navigate().back();
		
		//referesh page 
		
	driver.navigate().refresh();
	
		//CLOSE Browser 
		driver.close();
	}

}
