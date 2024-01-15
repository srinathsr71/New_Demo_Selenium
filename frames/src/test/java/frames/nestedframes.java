package frames;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class nestedframes {
	public String url="https://the-internet.herokuapp.com/nested_frames";
	WebDriver driver;
	
	
	@BeforeTest
	public void test() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test2() throws FileNotFoundException  {
		
		/*
		 * List<WebElement> li=driver.findElements(By.tagName("frameset")); int
		 * s=li.size(); System.out.println(s);
		 * driver.switchTo().frame(driver.findElement(By.name("frame-top")));
		 * //System.out.println(driver.switchTo().frame(driver.findElement(By.name(
		 * "frame-top")))); List<WebElement>
		 * li1=driver.findElements(By.tagName("frameset")); int s1=li1.size();
		 * System.out.println(s1);
		 * driver.switchTo().frame(driver.findElement(By.name("frame-middle")));
		 * System.out.println(driver.findElement(By.xpath("//*[@id='content']")).getText
		 * ());
		 */
		
//		driver.findElements(By.tagName("frameset")).size();
//		driver.switchTo().frame(driver.findElement(By.xpath("//*[@name='frame-top']"))).switchTo().frame(1);
//		System.out.println(driver.findElement(By.xpath("//*[@id='content']")).getText());
//		driver.close();
       
       
//		driver.findElements(By.tagName("frameset")).size();
//		driver.switchTo().frame(driver.findElement(By.xpath("//*[@name='frame-top']"))).switchTo().frame(1);
//		System.out.println(driver.findElement(By.xpath("//*[@id='content']")).getText());
//		PrintStream ps = new PrintStream(new File("C:\\Users\\S R SRINATH\\Desktop\\ss\\console.txt"));
//		 System.setOut(ps);
//		 ps.print(driver.findElement(By.xpath("//*[@id='content']")).getText());
//       
       driver.findElements(By.tagName("frameset")).size();
       driver.switchTo().frame(driver.findElement(By.name("frame-top"))).switchTo().frame(1);
       System.out.println(driver.findElement(By.id("content")).getText());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
