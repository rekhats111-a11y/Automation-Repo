package seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base{
	public void verifySimpleAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement simpleAlertBtn = driver.findElement(By.id("alertButton"));
		simpleAlertBtn.click();
		Alert al=driver.switchTo().alert();
		al.accept();
	}
	public void verifyConfirmAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement confirmAlertBtn =driver.findElement(By.id("confirmButton"));
		confirmAlertBtn.click();
		Alert al=driver.switchTo().alert();
		al.dismiss();
		
		
	}
	public void verifyPromptAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement promptAlertBtn=driver.findElement(By.id("promtButton"));
		promptAlertBtn.click();
		Alert al=driver.switchTo().alert();
		al.sendKeys("Rekha");
		al.accept();
	}
	

	public static void main(String[] args) {
		AlertHandling alert = new AlertHandling();
		alert.browserLaunch();
		//alert.verifySimpleAlert();
		//alert.verifyConfirmAlert();
		alert.verifyPromptAlert();

	}

}
