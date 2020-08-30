package gmail;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class gm {

	@Test
	public void google() throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
		
		driver.get("https://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("jagadeeshsoftwaretesting");
		driver.findElement(By.xpath("//*[@id='identifierNext']")).click();
		driver.findElement(By.name("password")).sendKeys("password@1234");
		driver.findElement(By.xpath("//*[@id='passwordNext']")).click();
		// click on the profile icon
		driver.findElement(By.xpath("//*[@id='gb']/div[2]/div[3]/div/div[2]/div/a")).click();
		// click on the sign out
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement Test = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Sign out')]")));
		Test.click();
		 driver.quit();
	}

}

