package definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Step_definition {
	
	public String url="https://www.kooapp.com/";
	WebDriver driver;
	

	@SuppressWarnings("deprecation")
	@Given("I should go to the Koo Homepage")
	public void i_should_go_to_the_koo_homepage() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@Then("Click on the search button")
	public void click_on_the_search_button() {
		driver.findElement(By.xpath("//*[@class='_2tfuk _2-VTS'][4]")).click();
		driver.close();
	}


	

}
