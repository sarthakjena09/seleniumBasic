package com.samsusystem.selenium;

import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormBot {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./binaries/chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://form-bot-anvsystems.pages.dev/");
	for(int i=0;i<10;i++) {
		driver.findElement(By.name("firstname")).sendKeys(UUID.randomUUID().toString().substring(6,8));
		driver.findElement(By.name("lastname")).sendKeys("jena");
		driver.findElement(By.name("email")).sendKeys("sam@gmail.com");
		driver.findElement(By.xpath("/html/body/div/div/form/label[4]/label[2]")).click();
		driver.findElement(By.name("phone")).sendKeys("8383091");
		Select s=new Select(driver.findElement(By.name("country")));
		s.selectByVisibleText("India");
		driver.findElement(By.xpath("//input[@value='Python']")).click();
		driver.findElement(By.tagName("button")).click();
	}
	Thread.sleep(2000);
	driver.quit();
}
}
