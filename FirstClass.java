package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		//driver.get("https://www.google.com/");
		driver.get("https://www.github.com/login");
	}

}
