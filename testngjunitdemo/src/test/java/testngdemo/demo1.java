package testngdemo;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
public class demo1 {
	
	
	public static String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	WebDriver driver;
@BeforeTest
public void beforeTest() throws InterruptedException {
		 
		  WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		  driver.get(url);
		  Thread.sleep(3000);
		  driver.manage().window().maximize();
		 
		 
		  Thread.sleep(3000);
		 
		 
		 
	  }
	
	
  @Test(dataProvider = "orangeHRM")
  public void f(String n, String s) throws InterruptedException {
	 
	  Thread.sleep(3000);
	  driver.findElement(By.name("username")).sendKeys(n);
	  driver.findElement(By.name("password")).sendKeys(s);
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@type='submit']")).click();
	 
	 
	 
	 
	 
  }
  @DataProvider
  public Object[][] orangeHRM() {
    return new Object[][] {
      new Object[] { "Admin", "admin123" },
      new Object[] { "Admin", "admin123" },
    };
  }
  
  @Test
  public void logout() throws InterruptedException
  {
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]")).click();
	 
	 
	 
  }
  @AfterTest
  public void afterTest() throws InterruptedException {
	 
	 	 
	  Thread.sleep(3000);
	  driver.close();
	 
	 
  }
}
