package mjsexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class demoutil {
 public static void falshelement(WebElement element,WebDriver driver) {
	 String bgcolor=element.getCssValue("backgroundColor");
	 for (int i=0;i<10;i++) {
		 changeColor("#FF0000",element,driver);
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
			js.executeScript("arguments[0].style.border = '3px solid red '", element);
		}
	 public static void passingValuesUsingJS(WebElement element, String message, WebDriver driver) {
			JavascriptExecutor js= ((JavascriptExecutor)driver);
			js.executeScript("arguments[0].value='" + message + "'", element);
			//js.executeScript("document.getElementsByName('username')[0].value='" + message + "'", element);
			//js.executeScript("document.getElementsByName('password')[0].value='" + message + "'", element);
		}

	 public static void clickElementByJS(WebElement element, WebDriver driver) {
			JavascriptExecutor js= ((JavascriptExecutor)driver);
			js.executeScript("document.getElementsByTagName('button')[0].click()",element);
		}
	 public static void scrollIntoView(WebElement element, WebDriver driver) {
			JavascriptExecutor js= ((JavascriptExecutor)driver);
			js.executeScript("arguments[0].scrollIntoView(true);", element);
		}


}
