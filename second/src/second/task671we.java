package second;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class task671we {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
	            "H:\\Downloads\\chromedriver.exe");
	
		WebDriver guru=new ChromeDriver();
		guru.get("https://demo.guru99.com/test/newtours/");
		guru.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> le=guru.findElements(By.tagName("a"));
		String[] li=new String[le.size()];
		System.out.println(le.size());
//		for(int i=0;i<li;i++) {
//			//System.out.println(le.get(i).getText());
//			//System.out.println(le.get(i).getAttribute("href"));
//		String url=le.get(i).getAttribute("href");	
//		}
		guru.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		int	i = 0;					
		String s="Under Construction: Mercury Tours";//welcome:mercury:home,flights:text
		//extract the link texts of each link element		
		for (WebElement a : le) {							
			li[i] = a.getText();//demo		//home//flight					
			i++;//i=1			
		}		
			guru.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//test each link		
			for (String t : li) {							
			guru.findElement(By.linkText(t)).click();
			//link title
			guru.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//System.out.println(guru.getTitle());
			if (guru.getTitle().equals(s)) {							
		        System.out.println("\"" + t + "\""								
		                + " is under construction.");			
		    } else {			
		    	guru.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		        System.out.println("\"" + t + "\""								
		                + " is working.");			
		    }		
			guru.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			guru.navigate().back();			
		}

	}

}




//for (WebElement e : le) {							
//	li[i] = e.getText();							
//	i++;			
//}		
//	guru.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	//test each link		
//	for (String t : li) {							
//	guru.findElement(By.linkText(t)).click();					
//	if (guru.getTitle().equals(s)) {							
//        System.out.println("\"" + t + "\""								
//                + " is under construction.");			
//    } else {			
//        System.out.println("\"" + t + "\""								
//                + " is working.");			
//    }		
//	guru.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	guru.navigate().back();			
//}		












