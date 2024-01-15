package mjsexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class casestudytestfile extends demoutil {

	WebDriver driver;
	String url="http://automationpractice.com/index.php?controller=authentication&back=my-account";
	
	@BeforeTest
	public void test1() {
		WebDriverManager.chromedriver().setup();

		ChromeOptions option=new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		driver=new ChromeDriver(option);
		driver.get(url);
		driver.manage().window().maximize();
	}
	@Test
	public void test2() throws InterruptedException {
		//WebElement web=driver.findElement(By.xpath("//*[@name='email']"));
		//WebElement web1=driver.findElement(By.xpath("//*[@name='passwd']"));
		WebElement web=driver.findElement(By.xpath("//button[@type='submit']"));
		//demoutil.passingValuesUsingJS(web, "testing", driver);
		//demoutil.clickElementByJS(web1, driver);
		demoutil.scrollIntoView(web, driver);
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("document.getElementsByName('email')[0].value='srsrinath378@gmail.com'");
		Thread.sleep(5000);
		js.executeScript("document.getElementsByName('passwd')[0].value='srinath123'");
		Thread.sleep(5000);
		demoutil.scrollIntoView(web, driver);
		js.executeScript("document.getElementsByName('passwd')[0].value='srinath123'");
		js.executeScript("document.getElementsByName('SubmitLogin')[0].click()");
		Thread.sleep(5000);
				
	}
	
	
	@Test
	public void test3() throws InterruptedException {
		Thread.sleep(5000);
		WebElement tshirt=	driver.findElement(By.xpath("//*[@title='T-shirts']"));
		demoutil.clickElementByJS(tshirt, driver);
		Thread.sleep(3000);
		WebElement cart=driver.findElement(By.xpath("//*[@class='button ajax_add_to_cart_button btn btn-default']"));
		Thread.sleep(6000);
		demoutil.scrollIntoView(cart, driver);
		demoutil.clickElementByJS(cart, driver);
		Thread.sleep(5000);
		
	}
	@Test
	public void test4() throws InterruptedException {
		
		WebElement check=driver.findElement(By.xpath("//*[@title='Proceed to checkout']"));
		//util1.scrollIntoView(check, driver);
		demoutil.clickElementByJS(check, driver);
		Thread.sleep(5000);
	WebElement stock=	driver.findElement(By.xpath("//*[@class='label label-success']"));
		demoutil.scrollIntoView(stock, driver);
	demoutil.drawBorder(stock, driver);
	//util1.changeColor("Black", stock, driver);
	}
	@AfterTest
	public void  at() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
}
}