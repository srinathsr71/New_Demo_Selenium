package koo_remain_testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_cases {
	public String url="https://www.kooapp.com/";
	WebDriver driver;
	String K;
	// initialize the HtmlReporter
	ExtentHtmlReporter htmlReporter;
	//initialize ExtentReports and attach the HtmlReporter
	ExtentReports extent;
	//creating tests
	ExtentTest test;
	@SuppressWarnings("deprecation")
	@BeforeTest
	public void beforetest() {
		htmlReporter = new ExtentHtmlReporter("extent.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test
	public void test_case1() {
		test = extent.createTest("Checking the functionality of search  feature");
		driver.findElement(By.xpath("//*[@class='_2tfuk _2-VTS'][4]")).click();
		test.pass("user able to see all options inside the search option");
			
	}
	
	@Test 
	public void test_case2() {
		test = extent.createTest("Checking the functionality of Feed  feature");
		driver.findElement(By.xpath("//h5[contains(text(),'Feed')]")).click();
		driver.findElement(By.xpath("//*[@class='_3KfDD']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Go to Feed')]")).click();
		test.pass("user is able to open Feed and click any one of Feed and back to feed");
	}
	
	@Test
	public void test_case3() throws InterruptedException {
		test = extent.createTest("Checking the functionality of Language  feature");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@class='_3klPV'][3]/button")).click();
		//System.out.println("language is click");
		Thread.sleep(8000);
		WebElement ew=driver.findElement(By.xpath("//*[@class='_1Syf4']//button[1]"));
			ew.click();
			Thread.sleep(8000);
			driver.findElement(By.xpath("//*[@class='_3klPV'][3]/button")).click();
			//System.out.println("language is click");
			Thread.sleep(8000);
			WebElement ey=driver.findElement(By.xpath("//*[@class='_1Syf4']//button[2]"));
				ey.click();
				Thread.sleep(8000);
		test.pass("User able to select language and select default one also");
	}
	
	@Test
	public void test_case4() {
		test = extent.createTest("Checking the functionality of New  feature");
		driver.findElement(By.xpath("//h5[contains(text(),'New')]")).click();
		driver.findElement(By.xpath("//*[@class='_1UriQ']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Go to Feed')]")).click();
		test.pass("user is able to click New option and click any one post");
	}
	
	@Test
	public void test_case5() {
		test = extent.createTest("Checking the functionality of Following  feature");
		driver.findElement(By.xpath("//h5[contains(text(),'Following')]")).click();
		driver.findElement(By.xpath("//*[@class='_1UriQ']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Go to Feed')]")).click();
		test.pass("user is able to click Following option and click any one post");
		
	}
	
	@Test
	public void test_case6() throws InterruptedException {
		test = extent.createTest("Checking the functionality of all options present in Feed feature");
		List<WebElement> ls=driver.findElements(By.xpath("//*[@class='_5ZKJ8']"));
			ls.get(0).click();
			Thread.sleep(6000);
			ls.get(1).click();
			Thread.sleep(6000);
			ls.get(2).click();
			Thread.sleep(6000);
			ls.get(3).click();
			Thread.sleep(6000);
			ls.get(4).click();
			Thread.sleep(6000);
			ls.get(5).click();
			Thread.sleep(6000);
			ls.get(6).click();
	test.pass("user able to select all options");		
	}

	@Test
	public void test_case7() throws InterruptedException {
		test = extent.createTest("Checking the functionality of search feature by adding name");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//h5[contains(text(),'Feed')]")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@class='_3klPV'][4]/button")).click();
		driver.findElement(By.xpath("//*[@class='_36HlG']/input")).sendKeys("sanjay");
		List<WebElement> lg=driver.findElements(By.xpath("//*[@class='_2PBwC']"));
		lg.get(0).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h5[contains(text(),'Feed')]")).click();
		test.pass("user able to search by using name and select any one person");
	}
	@Test
	public void test_case8() throws InterruptedException {
		test = extent.createTest("Checking the functionality of search feature by adding numbers");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@class='_3klPV'][4]/button")).click();
		driver.findElement(By.xpath("//*[@class='_36HlG']/input")).sendKeys("12344");
		List<WebElement> lg=driver.findElements(By.xpath("//*[@class='_2PBwC']"));
		lg.get(0).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h5[contains(text(),'Feed')]")).click();
		test.pass("user able to search by using number and select any one person");
	}
	@Test
	public void test_case9() throws InterruptedException {
		test = extent.createTest("Checking the functionality of search feature by adding alphanumeric and special character");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@class='_3klPV'][4]/button")).click();
		driver.findElement(By.xpath("//*[@class='_36HlG']/input")).sendKeys("sri123@");
		List<WebElement> lg=driver.findElements(By.xpath("//*[@class='_2PBwC']"));
		lg.get(0).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h5[contains(text(),'Feed')]")).click();
		test.pass("user able to search by using alphanumeric and special characters and select any one person");
	}
	
@AfterTest
public void aftest() {
	driver.close();
	test.info("closing all browsers");
	extent.flush();
}
}


























