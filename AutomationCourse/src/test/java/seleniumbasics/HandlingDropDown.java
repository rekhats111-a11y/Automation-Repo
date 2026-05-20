package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown extends Base {
	public void verifyDropDown() {
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropDown=driver.findElement(By.id("dropdowm-menu-1")); 
		WebElement dropDown2=driver.findElement(By.id("dropdowm-menu-2")); 
		
		Select select=new Select(dropDown);
		select.selectByIndex(1);
		Select select1=new Select(dropDown2);
		//select1.selectByIndex(2);
		//select1.selectByValue("maven");
		select1.selectByVisibleText("JUnit");
	}
	public void verifyCheckBox() {
		WebElement checkBox=driver.findElement(By.xpath("//input[@value='option-1']"));
		checkBox.click();
	}
	public void verifyRadioButton() {
		WebElement radioButton=driver.findElement(By.xpath("//input[@value='green']"));
		radioButton.click();
	}

	public static void main(String[] args) {
		HandlingDropDown down=new HandlingDropDown();
		down.browserLaunch();
		down.verifyDropDown();
		down.verifyCheckBox();
		down.verifyRadioButton();
		

	}

}
