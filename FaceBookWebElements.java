package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookWebElements {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		Thread.sleep(3000);
		driver.findElements(By.className("_9axz"));
		Thread.sleep(3000);
		highlight(driver, driver.findElement(By.name("pass")));
		Thread.sleep(3000);
		highlight(driver, driver.findElement(By.linkText("Forgotten account?")));
		Thread.sleep(3000);
		highlight(driver, driver.findElement(By.id("facebook")));
		
		

	}
	
	public static void highlight(WebDriver driver, WebElement webElement) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", webElement);
	}

}
