package mjsexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class util {
	
	
public static void passingvalues(String message,WebElement element,WebDriver driver) {
	JavascriptExecutor js= ((JavascriptExecutor)driver);//javascript executor will type caste the driver into javascript
	js.executeScript("arguments[0].value='" + message + "'", element);
}

}
