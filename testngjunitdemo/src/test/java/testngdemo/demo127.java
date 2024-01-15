package testngdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class demo127 {
	WebDriver driver;
	public String title;
	public String url;

@Before
public void bt() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("www.youtube.com");
}
	
@Test
public void test1() {
	title=driver.getTitle();
}
@Test
public void test2() {
	url=driver.getCurrentUrl();
}
@After
public void at() {
	driver.close();
}
}
