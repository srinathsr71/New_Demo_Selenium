package Categories;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class category {

	public String url="https://www.tatacliq.com";
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


	//verify the functionality of men one feature fashion
	@Test(enabled=true)
	public void testcase1() throws InterruptedException {
		test = extent.createTest("Checking the functionality of categories  feature");
		Actions ase=new Actions(driver);
		WebElement menuOption = driver.findElement(By.xpath("*//div[contains(text(),'Categories')]"));
		ase.moveToElement(menuOption).build().perform();
		
		test.pass("user is navigated to categories  feature");		
	}

	
@Test
public void testcase2() throws InterruptedException {
	test = extent.createTest("Checking the functionality of men fashion  feature");
	Actions as=new Actions(driver);
	WebElement submenuOption2 = driver.findElement(By.xpath("*//div[contains(text(),'Men')]"));
	as.moveToElement(submenuOption2).build().perform();
	as.click(submenuOption2).build().perform();
	Thread.sleep(10000);
	test.pass("user is navigated to men feature");
}
@Test
public void testcase3() throws InterruptedException {
	test = extent.createTest("Checking the functionality of men fashion one feature");
	Thread.sleep(6000);
	List<WebElement> li=driver.findElements(By.xpath("//*[@class='QuickLinks__quickLinksCard']"));
	System.out.println(li.size());
	Thread.sleep(10000);
	li.get(0).click();
	Thread.sleep(10000);
	Thread.sleep(30000);
	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript("window.scrollTo(0,500)");
	test.pass("user is navigated to men sub feature");
}




	//verify the functionality of filter in the products page.
	@Test
	public void testcase4() throws InterruptedException {
		test = extent.createTest("Checking the functionality of filters in the products page");
		Thread.sleep(20000);
		JavascriptExecutor js1=((JavascriptExecutor)driver);
		js1.executeScript("window.scrollTo(0,400)");
		test.pass("user is able to add filters");


	}
	
	@Test
	public void testcase5() throws InterruptedException {
		test = extent.createTest("Checking the functionality of filters by adding one option in the products page");
		driver.findElement(By.xpath("//*[@class='FilterDesktop__newFilterHolder']/div[4]")).click();
		List<WebElement>li3=driver.findElements(By.xpath("//*[@class='CheckBox__base']"));
		System.out.println(li3.size());
		Thread.sleep(9000);
		li3.get(4).click();
		test.pass("user is able to add one  filter");
	}


	//verify the functionality of sort feature in the product page.

	@Test
	public void testcase6() throws InterruptedException {
		test = extent.createTest("Checking the functionality of sort in the products page");

		Select M=new Select(driver.findElement(By.xpath("//*[@class='SelectBoxDesktop__hideSelect']")));
		Thread.sleep(5000);
		M.selectByVisibleText("Price Low to High");
		Thread.sleep(5000);
		test.pass("user is able to modify sort ");
	}

	//verify the functionality of similar products of the particular product
	@Test
	public void testcase7() throws InterruptedException {
		test = extent.createTest("Checking the functionality of similar  products button is clicking");
		driver.findElement(By.xpath("//*[@class='ProductModule__display4by4']/div")).click();
		Thread.sleep(5000);
		test.pass("user is able to click similar product option");
		
	}
	
	//verify the fuctionality of view all products button in the products page
	@Test
	public void testcase8() throws InterruptedException {
		test = extent.createTest("Checking the functionality of view all  products button is clicking");
		driver.findElement(By.linkText("View All Products")).click();
		Thread.sleep(5000);
		test.pass("user is able to click view all products");
		
	}
	
	@Test
	public void testcase9() throws InterruptedException //Checking the functionality of add to bag feature
	{	
	test = extent.createTest("Checking the functionality of product is clicking or not");
	test = extent.createTest("Checking the functionality of size and add to bag feature");
	test = extent.createTest("Checking the functionality of buy now feature");
	driver.findElement(By.xpath("//*[@class='ProductImage__base']/div/div/img")).click();
	ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	int s=tabs.size();
	System.out.println(s);
    driver.switchTo().window(tabs.get(1));	
    JavascriptExecutor js = ((JavascriptExecutor)driver);
    js.executeScript("window.scrollTo(0,400)");
	Thread.sleep(10000);
	driver.findElement(By.xpath("//h4[text()='S']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@class='ProductDescriptionPage__buttonWrapper']/div[2]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@class='ProductDescriptionPage__buttonWrapper']/div[1]")).click();
    test.pass("user able to click particular product");
    test.pass("user is navigated to mybag");
    test.pass("user is navigated to buynow");
	}

	@AfterTest
	public void af() {
		driver.quit();
		test.info("closing all browsers");
		extent.flush();
	}



}











