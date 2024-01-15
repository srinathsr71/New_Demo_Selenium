package testngdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class demo126 {
	WebDriver driver;
	public String title;
	public String url;

@BeforeTest
public void bt() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.google.com");
}

@Test(priority = 0)
public void Apple() {
	title=driver.getTitle();
	Assert.assertEquals("srinath", "srinath");
}
@Test(priority=1,dependsOnMethods = "Apple",alwaysRun = true)
public void car() {
	url=driver.getCurrentUrl();
}
@Test(priority=2)
public void Bat() {
System.out.println(title+url);
}
	
	
@AfterTest
public void at() {
	driver.close();
}
}
