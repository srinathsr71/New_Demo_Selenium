package jsexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class demoutil {
 public static void falshelement(WebElement element,WebDriver driver) {
	 String bgcolor=element.getCssValue("backgroundColor");
	 for (int i=0;i<10;i++) {
		 changeColor("#FFFFFF",element,driver);
		 changeColor(bgcolor,element,driver);
	 }
 }	 
	 public static void changeColor(String color,WebElement element,WebDriver driver) {
		 JavascriptExecutor js=((JavascriptExecutor)driver);
		 js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);
		 try {
				Thread.sleep(3000);
			}catch(InterruptedException e) {
				
			}
	 }
	 public static void drawBorder(WebElement element,WebDriver driver) {
			JavascriptExecutor js= ((JavascriptExecutor)driver);
			js.executeScript("arguments[0].style.border = '3px solid blue '", element);
		}
	 


}
