package com.dinesh.Phase5lession2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeofreMethodAnnotation {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void startbrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
	}
	
	@Test(priority='1')
	public void TestWikiHomepage() throws InterruptedException
	{
		driver.get("https://www.wikipedia.org/");
		driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
		driver.findElement(By.id("searchInput")).sendKeys("Automation testing");
        Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
	}
	@Test(priority='2')
	public void TestWikiLoginPage() throws InterruptedException
	{
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:UserLogin&returnto=Special%3ASearch&returntoquery=search%3D%26go%3DGo");
		driver.findElement(By.id("wpName1")).sendKeys("Dinesh");
		driver.findElement(By.id("wpPassword1")).sendKeys("dinesh@gmail.com");
		Thread.sleep(5000);
	}

	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
}
