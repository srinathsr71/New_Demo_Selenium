package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task2 {
	WebDriver driver,driver1,driver2;

	@BeforeTest
	public void test1() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	@Test(enabled=true)
	public void test2() throws InterruptedException {

		driver.findElement(By.id("name")).sendKeys("srinath");
		driver.findElement(By.id("phone")).sendKeys("9908808740");
		driver.findElement(By.id("email")).sendKeys("sr@gmail.com");
		driver.findElement(By.id("password")).sendKeys("12345");
		driver.findElement(By.id("address")).sendKeys("this is my address");
		driver.findElement(By.name("submit")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@class='form-check'][2]/label/input")).click();

		driver.findElement(By.xpath("//*[@class='form-check'][5]/label/input")).click();
		driver.findElement(By.xpath("//*[@class='form-check'][6]/label/input")).click();
		WebElement we=driver.findElement(By.className("custom-select"));
		Select se=new Select(we);
		se.selectByVisibleText("Italy");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://www.tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//*[@class='list-inline']/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@class='dropdown-menu dropdown-menu-right']/li/a")).click();
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.name("firstname")).sendKeys("srinath");
		driver.findElement(By.id("input-lastname")).sendKeys("sri");
		driver.findElement(By.name("email")).sendKeys("okervlsu@gmail.com");
		driver.findElement(By.name("telephone")).sendKeys("9686745638");
		driver.findElement(By.name("password")).sendKeys("12345");
		driver.findElement(By.name("confirm")).sendKeys("12345");
		driver.findElement(By.xpath("//*[@class='pull-right']/input")).click();
		driver.findElement(By.xpath("//*[@class='pull-right']/input[2]")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@class='list-inline']/li[2]/a")).click();
		driver.findElement(By.linkText("Logout")).click();

		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		driver.findElement(By.linkText("Leave")).click();
		WebElement ws=driver.findElement(By.xpath("//*[@class='oxd-table-body']/div[1]/div/div[3]"));
		String s=ws.getText();
		System.out.println(s);
		driver.findElement(By.xpath("//*[@class='oxd-userdropdown']")).click();
		driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			ArrayList<String> al=new ArrayList<String>(driver.getWindowHandles());
			System.out.println(al.size());
			driver.switchTo().window(al.get(1));
			Thread.sleep(5000);
			driver.quit();
			

	}

	@Test(enabled=true)
	public void test3() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver1=new ChromeDriver();
		driver1.get("https://testautomationpractice.blogspot.com/");
		driver1.manage().window().maximize();
		Actions ac=new Actions(driver1);
		WebElement drag=driver1.findElement(By.id("draggable"));
		WebElement drop=driver1.findElement(By.id("droppable"));
		ac.dragAndDrop(drag, drop).build().perform();

		driver1.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver1.switchTo().newWindow(WindowType.TAB);
		driver1.get("https://nxtgenaiacademy.com/alertandpopup/");
		System.out.println(driver1.getTitle());
		driver1.findElement(By.name("alertbox")).click();
		Alert as=driver1.switchTo().alert();
		as.accept();
		Thread.sleep(5000);

		driver1.findElement(By.name("confirmalertbox")).click();
		Alert sa=driver1.switchTo().alert();
		sa.dismiss();
		Thread.sleep(5000);

		driver1.findElement(By.name("promptalertbox1234")).click();
		Alert swa=driver1.switchTo().alert();
		swa.sendKeys("yes");
		swa.accept();
		Thread.sleep(5000);


		driver1.switchTo().newWindow(WindowType.TAB);
		driver1.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver1.findElement(By.name("username")).sendKeys("Admin");
		driver1.findElement(By.name("password")).sendKeys("admin123");
		driver1.findElement(By.xpath("//*[@type='submit']")).click();
		driver1.findElement(By.xpath("//*[@class='oxd-layout-context']/div/div[4]/div/div/i")).click();
		Thread.sleep(5000);
		driver1.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(5000);
		driver1.findElement(By.xpath("//*[@class='oxd-userdropdown']")).click();
		driver1.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();

		////		driver1.switchTo().newWindow(WindowType.TAB);
		//		driver1.get("https://demoqa.com/nestedframes");
		//		driver1.manage().window().maximize();
		//		Thread.sleep(5000);
		//		
		//		
		//		System.out.println(driver1.findElements(By.id("frame1")).size());
		//		//System.out.println(driver1.findElement(By.tagName("iframe")).getText());
		//	//	driver1.switchTo().frame(driver1.findElement(By.tagName("iframe")).getText());
		//		//System.out.println(driver1.findElement(By.tagName("p")).getText());
		//		//driver1.switchTo().frame(driver.findElement(By.tagName("body")).getText());
		//		WebElement we=driver1.findElement(By.tagName("iframe"));
		//		driver1.switchTo().frame(we);
		//		
		//		System.out.println(we.getText());
				ArrayList<String> alo=new ArrayList<String>(driver1.getWindowHandles());
				System.out.println(alo.size());
				driver1.switchTo().window(alo.get(1));
				Thread.sleep(6000);
				driver1.quit();
				

	}

	@Test(enabled=true)
	public void test6() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver2=new ChromeDriver();
		driver2.get("https://duckduckgo.com/");
		driver2.manage().window().maximize();
		WebElement ew=driver2.findElement(By.id("search_form_input_homepage"));
		if(ew.isDisplayed()) {
			System.out.println("search Box is visible");
		}
		else {
			System.out.println("search Box is not visible");
		}
		if(ew.isEnabled()) {
			System.out.println("search Box is enabled");
			ew.sendKeys("selenium");
		}
		else {
			System.out.println("search Box is not visible");
		}
		driver2.switchTo().newWindow(WindowType.TAB);		
		driver2.get("https://itera-qa.azurewebsites.net/home/automation");

		List<WebElement> li=driver2.findElements(By.name("optionsRadios"));
		System.out.println(li.size());
		boolean radio_value = false;
		radio_value = li.get(0).isSelected();
		Thread.sleep(6000);
		if(radio_value == true) {
			li.get(1).click();
			System.out.println("Button male selected"+ li.get(1).getText());
		}
		else {
			li.get(0).click();
			System.out.println("Button is female selected"+ li.get(0).getText());
		}
		driver2.switchTo().newWindow(WindowType.TAB);		
		driver2.get("https://itera-qa.azurewebsites.net/home/automation");
		driver2.findElement(By.linkText("Login")).click();
		driver2.navigate().back();
		Thread.sleep(5000);
		driver2.navigate().forward();
		Thread.sleep(5000);
		driver2.navigate().refresh();
		Thread.sleep(5000);
		driver2.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			ArrayList<String> ale=new ArrayList<String>(driver2.getWindowHandles());
			System.out.println(ale.size());
			driver2.switchTo().window(ale.get(1));
			Thread.sleep(5000);
			driver2.quit();
			
	}
	
//@AfterTest
//public void last() throws InterruptedException {
//	Thread.sleep(6000);
//	driver.quit();
//}

}


































