package com.samsusystem.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonbot {
public static void main(String args[]) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\seleniumBasic\\Binaries\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.com");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptops");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	driver.quit();
}
}
