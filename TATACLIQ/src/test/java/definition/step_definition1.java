package definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class step_definition1 {
	public String url="https://www.tatacliq.com";
	WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@Given("I should go to the Tatacliq Homepage")
	public void i_should_go_to_the_tatacliq_homepage() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@And("Mouse Over on Categories feature")
	public void mouse_over_on_categories_feature() {
		Actions actions = new Actions(driver);
		//Retrieve WebElement 'Music' to perform mouse hover 
		WebElement menuOption = driver.findElement(By.xpath("*//div[contains(text(),'Categories')]"));
		actions.moveToElement(menuOption).build().perform();
	}
	@And("click all the features under the categories")
	public void click_all_the_features_under_the_categories() throws InterruptedException {
		Actions actions = new Actions(driver);
		WebElement menuOption = driver.findElement(By.xpath("*//div[contains(text(),'Categories')]"));
		actions.moveToElement(menuOption).build().perform();
		WebElement submenuOption1 = driver.findElement(By.xpath("*//div[contains(text(),'Women')]"));
		actions.moveToElement(submenuOption1).build().perform();
		actions.click(submenuOption1).build().perform();
		Thread.sleep(10000);
		driver.navigate().back();



		actions.moveToElement(menuOption).build().perform();
		WebElement submenuOption2 = driver.findElement(By.xpath("*//div[contains(text(),'Men')]"));
		actions.moveToElement(submenuOption2).build().perform();
		actions.click(submenuOption2).build().perform();
		Thread.sleep(10000);
		driver.navigate().back();




		actions.moveToElement(menuOption).build().perform();
		WebElement submenuOption3 = driver.findElement(By.xpath("*//div[contains(text(),'Kid')]"));
		actions.moveToElement(submenuOption3).build().perform();
		actions.click(submenuOption3).build().perform();
		Thread.sleep(10000);
		driver.navigate().back();


		actions.moveToElement(menuOption).build().perform();
		WebElement submenuOption4 = driver.findElement(By.xpath("*//div[contains(text(),'Home')]"));
		actions.moveToElement(submenuOption4).build().perform();
		actions.click(submenuOption4).build().perform();
		Thread.sleep(10000);
		driver.navigate().back();


		actions.moveToElement(menuOption).build().perform();
		WebElement submenuOption5 = driver.findElement(By.xpath("*//div[contains(text(),'Beauty')]"));
		actions.moveToElement(submenuOption5).build().perform();
		actions.click(submenuOption5).build().perform();
		Thread.sleep(10000);
		driver.navigate().back();


		actions.moveToElement(menuOption).build().perform();
		WebElement submenuOption6 = driver.findElement(By.xpath("*//div[contains(text(),'Gadgets')]"));
		actions.moveToElement(submenuOption6).build().perform();
		actions.click(submenuOption6).build().perform();
		Thread.sleep(10000);
		driver.navigate().back();



		actions.moveToElement(menuOption).build().perform();
		WebElement submenuOption7 = driver.findElement(By.xpath("*//div[contains(text(),'Jewellery')]"));
		actions.moveToElement(submenuOption7).build().perform();
		actions.click(submenuOption7).build().perform();
		Thread.sleep(10000);
		driver.navigate().back();




		actions.moveToElement(menuOption).build().perform();
		WebElement submenuOption8 = driver.findElement(By.xpath("*//div[contains(text(),'Accessories')]"));
		actions.moveToElement(submenuOption8).build().perform();
		actions.click(submenuOption8).build().perform();
		Thread.sleep(10000);
	  
	}
	
	@Then("I should go to men fashion")
	public void i_should_go_to_men_fashion() throws InterruptedException {
		Actions actio = new Actions(driver);
		WebElement menuOption = driver.findElement(By.xpath("*//div[contains(text(),'Categories')]"));
		actio.moveToElement(menuOption).build().perform();
		WebElement submenuOption1 = driver.findElement(By.xpath("*//div[contains(text(),'Men')]"));
		actio.moveToElement(submenuOption1).build().perform();
		actio.click(submenuOption1).build().perform();
		Thread.sleep(5000);
		driver.close();
		
	  
	}	
	
	
}
