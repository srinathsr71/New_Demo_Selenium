package second;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2345 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver",
	            "H:\\Downloads\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.voot.com/shows");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		//driver.findElement(By.xpath(contains(".slick-slide slick-active slick-center slick-current')))
		//driver.findElement(By.xpath("//*[@class='slick-slider center slick-initialized']"));
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@class='slick-dots']/li[4]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='slick-slide slick-active slick-center slick-current']/div/a")).click();
		
		//driver.findElement(By.xpath("//*[@class='slick-arrow slick-next arrow-button']")).click();
		//String beforelogin=driver.getTitle();
		//driver.findElement(By.xpath("//*[@class='slick-slider center slick-initialized']//button[1]//span//img")).click();
	}

}
