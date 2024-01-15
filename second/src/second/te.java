package second;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class te {
	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
	            "H:\\Downloads\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//Thread.sleep(5000);
		driver.manage().window().maximize();
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		Select obj=new Select(driver.findElement(By.id("userSelect")));
//		obj.selectByValue("2");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]/a")).click();
		Thread.sleep(5000);
		//WebElement le=driver.findElement(By.xpath("//*[@class='orangehrm-container']"));
		
//		driver.findElements(By.xpath("//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).get(6).click();
//		System.out.println(driver.findElement(By.xpath("//*[@class='oxd-table-card'][6]//div[2]/div")).getText());
//		driver.findElements(By.xpath("//*[@class='oxd-icon bi-trash']")).get(6).click();
//		driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@class='oxd-userdropdown']")).click();
//		driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
////		
		
//		for(int i=0;i<=size;i++) 
//		{
//			if(i==5) {
//				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//				driver.findElements(By.xpath("//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).get(i).click();
//				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//				WebElement ew=driver.findElements(By.xpath("//*[@class='oxd-table-row oxd-table-row--with-border")).get(i);
//				String re=ew.getText();
//				//ew.click();
//				System.out.println("User Name:"+re);
//				driver.findElements(By.xpath("//*[@class='oxd-icon bi-trash']")).get(i).click();
//				driver.findElements(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).get(i).click();
//			}
//		}
		
		
		
		
		
		
		
		List<WebElement> li=driver.findElements(By.xpath("//*[@class='oxd-table-card']"));
		System.out.println(li.size());
		
		for(int i=0;i<=li.size()-1;i++)
		{
			
			//System.out.println(li.get(8));
			
			if(li.get(i)!=null) {
				WebElement lee=driver.findElement(By.xpath("//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']"));
					lee.click();;
				//System.out.println(ls);
			//System.out.println(li.get(i));
		}

		 
		
//		ArrayList<WebElement> ar=new ArrayList<>(driver.findElements(By.xpath("//*[@class='oxd-table-body']")));
//		System.out.println(ar);
	
//		
	}
	}
}
