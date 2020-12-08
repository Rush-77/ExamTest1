package com.iet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestIET {
	
	WebDriver driver;
	
	@BeforeClass
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver","D:\\IET\\ASDM\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	@Test (priority=1)
	public void searchbox() {
		driver.findElement(By.name("q")).sendKeys("IET Pune");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.name("btnK")).click();
		driver.manage().window().maximize();
	}
	
	@Test (priority=2)
	public void openiet() {
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/a")).click();
	}

	@Test (priority=3)
	public void facebookpage() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"icon_wrapper\"]/a[1]")).click();
	}
	
	@Test (priority=4)
	public void headingcheck() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Dimension i = driver.findElement(By.xpath("/html/body/div[1]/div/header/div/div/div[1]/div/div/div/div/div/a/img")).getSize();
		System.out.println("Dimension : " + i);
	}
	
}
