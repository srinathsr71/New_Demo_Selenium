package second;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test3456 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
	            "H:\\Downloads\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.manage().window().maximize();
        // click on date picker so that we can get the calendar in view 
		driver.findElement(By.id("datepicker")).click();
	
        // this will find all matching nodes in calendar		
		List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));

        // now we will iterate all values and will capture the text. We will select when date is 28
		for(WebElement ele:allDates)
		{
	
			String date=ele.getText();
		
                // once date is 28 then click and break
				if(date.equalsIgnoreCase("28"))
				{
					ele.click();
					break;
				}
	
		}

	}

}























