package com.org.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HelloWorldTest {
	
	@Test
	public void login() throws InterruptedException {
		
		System.out.println("John");
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/ennoc/Downloads/vivid-photo-master/index.html");
		System.out.println(driver.getTitle());
driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"about\"]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"popupAboutClose\"]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"projects\"]")).click();

		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"popupProjectsClose\"]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"blog\"]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"popupBlogClose\"]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"contact\"]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Konadu");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"subject\"]")).sendKeys("Autos");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Testmail@gmail.com");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"message\"]")).sendKeys("Dies ist nur eine Testnachricht");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"popupContact\"]/div/div[1]/div/form/input[4]")).click();
		
		
		
		
		
		driver.close();
		
			}

}
