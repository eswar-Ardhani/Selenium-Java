package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GitHub_TextBoxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/login");
		Thread.sleep(3000);
		WebElement UsernameTxt =   driver.findElement(By.id("login_field"));
		if(UsernameTxt.isDisplayed())
		{
			if(UsernameTxt.isEnabled())
			{
				UsernameTxt.sendKeys("Eswar");
				String enterTxt = UsernameTxt.getAttribute("value");
				System.out.println(enterTxt);
				Thread.sleep(3000);
				UsernameTxt.sendKeys(" Ardhani");
				Thread.sleep(3000);
			    UsernameTxt.clear();
			}
			else
			{
				System.out.println("User name  textBox is not enabled");
			}
		}
		else
		{
			System.out.println("User name textb box is not displayed");
		}

	}

}
