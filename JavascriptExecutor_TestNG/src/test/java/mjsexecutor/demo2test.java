package mjsexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo2test {
	WebDriver driver;
	String url="https://www.twoplugs.com/";
	
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
		WebElement web=driver.findElement(By.xpath("//*[@type='text']"));
		WebElement web1=driver.findElement(By.xpath("//button[@class='btn green']"));
		demoutil.passingValuesUsingJS(web, "testing", driver);
		demoutil.clickElementByJS(web1, driver);
	}
}
