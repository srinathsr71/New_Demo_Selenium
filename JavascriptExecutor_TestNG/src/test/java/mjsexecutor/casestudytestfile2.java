package mjsexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class casestudytestfile2  {
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
		
		//email and password input and click sign in
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(0,900)");
		js.executeScript("document.getElementById('email').value='srsrinath378@gmail.com'");
		js.executeScript("document.getElementById('passwd').value='srinath123'");
		js.executeScript("document.getElementById('SubmitLogin').click()");
		Thread.sleep(5000);
	}	
	
	@Test
	public void test3() throws InterruptedException {
		
		Thread.sleep(5000);
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("document.querySelector('[title=\"T-shirts\"]').click()");
		js.executeScript("window.scrollTo(0,700)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector('[title=\"Add to cart\"]').click()");
		Thread.sleep(5000);
		js.executeScript("document.querySelector('[title=\"Proceed to checkout\"]').click()");
		Thread.sleep(4000);
		js.executeScript("window.scrollTo(0,500)");
		js.executeScript("document.getElementsByClassName('label label-success')[0].style.border=\"thick solid red\"");
	
	}
	
	@AfterTest
	public void at() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}

}






























