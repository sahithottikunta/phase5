package com.simplilearn.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateWebApplication {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "E:\\p5 installations\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement email = driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:email\\:\\:content"));
		email.sendKeys("sahith@gmail.com");
		Thread.sleep(1000);
		
		
		
		WebElement password = driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:password\\:\\:content"));
		password.sendKeys("Cakewin@7777");
		
		Thread.sleep(1000);
		
		WebElement repassword = driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:retypePassword\\:\\:content"));
		repassword.sendKeys("Cakewin@7777");
		
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
		
		WebElement country = driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:country\\:\\:content"));
		country.sendKeys("India");
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
		
		WebElement firstname = driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:firstName\\:\\:content"));
		firstname.sendKeys("ottikunta");
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		WebElement lastname = driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:lastName\\:\\:content"));
		lastname.sendKeys("Sahith");
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		WebElement jobTitle = driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:jobTitle\\:\\:content"));
		jobTitle.sendKeys("Engineer");
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		WebElement workPhone = driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:workPhone\\:\\:content"));
		workPhone.sendKeys("6987654854");
		Thread.sleep(1000);
		
		WebElement companyName = driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:companyName\\:\\:content"));
		companyName.sendKeys("Neeladri Pvt Ltd");
		Thread.sleep(1000);
		
		WebElement address = driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:address1\\:\\:content"));
		address.sendKeys("Road2,near bustand,tirupathi");
		Thread.sleep(1000);
		
		WebElement city = driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:city\\:\\:content"));
		city.sendKeys("Tirupathi");
		Thread.sleep(1000);
		
		WebElement state = driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:state\\:\\:content"));
		state.sendKeys("Andhra pradesh");
		Thread.sleep(1000);
		
		WebElement pinCode = driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:postalCode\\:\\:content"));
		pinCode.sendKeys("548464");
		
		Thread.sleep(1000);
		
		WebElement register= driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:b1"));
		register.click();   
		
	
	}

}