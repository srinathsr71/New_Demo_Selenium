package second;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class taskwed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
	            "H:\\Downloads\\chromedriver.exe");
	
		WebDriver guru=new ChromeDriver();
		guru.get("https://demo.guru99.com/test/newtours/");
		guru.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> le=guru.findElements(By.tagName("a"));
		int li=le.size();
		System.out.println(le.size());
		for(int i=0;i<le.size();i++)
		{
		
			
		//  System.out.println(links1.get(i).getText());
	// System.out.println(links1.get(i).getAttribute("href"));
		 
		 
		String uc=le.get(i).getAttribute("href");
		
		String Uc1="https://demo.guru99.com/test/newtours/support.php";
		//System.out.println(Uc1);
		
	if(uc.equals(Uc1))
	{
		System.out.println("The link is under construction " + le.get(i).getText());
	}
	else
	{
		System.out.println("The link is working  "  +le.get(i).getText());
	}
		}
		guru.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				

	}

}















