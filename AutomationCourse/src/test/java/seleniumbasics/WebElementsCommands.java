package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementsCommands extends Base{
	
	public void verifyWebElement() {
		
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement msgBox=driver.findElement(By.id("single-input-field"));
		msgBox.sendKeys("hello");
		WebElement value=driver.findElement(By.id("value-a"));
		value.sendKeys("10");
		WebElement showMsgBtn=driver.findElement(By.id("button-one"));
		showMsgBtn.click();
		msgBox.clear();
		WebElement msg=driver.findElement(By.id("message-one"));
		System.out.println(msg.getText());
		System.out.println(showMsgBtn.getTagName());
	}
	public static void main(String[] args) {
		WebElementsCommands commands=new WebElementsCommands();
		commands.browserLaunch();
		commands.verifyWebElement();
	
	}

}
