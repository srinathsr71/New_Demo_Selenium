
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
public class demomx {
	
	public String mxurl = "https://www.mxplayer.in/ ";
	// initialize the HtmlReporter
	String K;
	// initialize the HtmlReporter
	ExtentHtmlReporter htmlReporter;
	//initialize ExtentReports and attach the HtmlReporter
	ExtentReports extent;
	//creating tests
	ExtentTest test;
	WebDriver driver;
	@BeforeTest
	public void newadministration() throws InterruptedException
	{
		htmlReporter = new ExtentHtmlReporter("extent.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get(mxurl);
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@Test
	public void TestCase6() throws InterruptedException {
		driver.findElement(By.xpath("//*[@class='hc_go-ad-free']")).click();
	}
	
	//@Test
	public void TestCase7() throws InterruptedException {
		driver.findElement(By.xpath("//*[@class='button upgrade-block']")).click();
		
	}
	
	//@Test
	public void TestCase8() throws InterruptedException {
		
	}
	
	//@Test
	public void TestCase9() throws InterruptedException {
		
	}
	
	

}