package com.dinesh.Phase5lession1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://id.heroku.com/login");
        
        
        driver.findElement(By.cssSelector("input#email")).sendKeys("Dinesh@gmail.com");
        driver.findElement(By.cssSelector("input#password")).sendKeys("Mandal");
        

        
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#login > form > button")).click();
        
        //Note : I have no account in this so that's why showing error message in login (for security purpose I havn't use my personal account)
        
        
	}

}
