package second;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver",
//	            "H:\\Downloads\\chromedriver.exe");
//		
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		//Thread.sleep(5000);
//		driver.manage().window().maximize();
//		//Thread.sleep(3000);
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.findElement(By.name("username")).sendKeys("Admin");
//		driver.findElement(By.name("password")).sendKeys("admin123");
//		driver.findElement(By.xpath("//*[@type='submit']")).click();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		
//		List<WebElement> links=driver.findElements(By.tagName("a"));
//		System.out.println(links.size());
//		for(int i=0;i<links.size();i++)
//	        //System.out.println(links.get(i).getText());
//				System.out.println(links.get(i).getAttribute("href"));
		
		//each page links
		System.setProperty("webdriver.chrome.driver",
	            "H:\\Downloads\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//Thread.sleep(5000);
		driver.manage().window().maximize();
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]/a")).click();	
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++)
	        //System.out.println(links.get(i).getText());
				//	System.out.println(links.get(i).getAttribute("href"));
				System.out.println(links.get(i).getLocation());
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
