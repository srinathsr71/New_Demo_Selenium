package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReport2 {

	public static String tour="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	WebDriver guru;
	String K;
	// initialize the HtmlReporter
	ExtentHtmlReporter htmlReporter;
	//initialize ExtentReports and attach the HtmlReporter
	ExtentReports extent;
	//creating tests
	ExtentTest test;

	@BeforeTest
	public void beforetest() throws InterruptedException
	{
		htmlReporter = new ExtentHtmlReporter("extent1.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		WebDriverManager.chromedriver().setup();
		guru =new ChromeDriver();
		//guru.get(tour);
		guru.navigate().to(tour);
		Thread.sleep(3000);
		K=guru.getTitle();
		System.out.println("The tile of the Page is " +K);
	}
	@Test
	public void Testcase1() throws InterruptedException
	{
		test = extent.createTest("MyFirstTest");
		//SoftAssert SA=new SoftAssert();
		guru.findElement(By.name("username")).sendKeys("Admin");
		test.pass("entered username");
		guru.findElement(By.name("password")).sendKeys("admin123");
		test.pass("entered password");
		guru.findElement(By.xpath("//*[@type='submit']")).click();
		test.pass("you are in admin page");
		String Aferlogin=guru.getCurrentUrl();
		System.out.println(Aferlogin);
		//SA.assertEquals(Aferlogin, "file:///H:/spring-selenium-workspace/TestNG%20ExtentReport/extent.html");
		//SA.assertAll();

		Thread.sleep(2000);
	}


	@AfterTest()
	public void aftertest() throws InterruptedException
	{

		//System.out.println("Current URL "+guru.getCurrentUrl());

		guru.close();
		extent.flush();

	}
}