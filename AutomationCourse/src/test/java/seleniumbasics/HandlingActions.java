package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base {
	public void verifyMouseOver() {
		WebElement othersBtn =driver.findElement(By.id("others"));
		Actions act=new Actions(driver);
		act.moveToElement(othersBtn).build().perform();
		
	}
	public void verifyRightClick() {
		WebElement othersBtn =driver.findElement(By.id("others"));
		Actions act=new Actions(driver);
		act.contextClick(othersBtn).build().perform();
	}
	public void verifyDragandDrop() {
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement dragBtn=driver.findElement(By.id("draggable"));
		WebElement dropBtn=driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		act.dragAndDrop(dragBtn, dropBtn).build().perform();
		
	}

	public static void main(String[] args) {
		HandlingActions actions=new HandlingActions();
		actions.browserLaunch();
		//actions.verifyMouseOver();
		//actions.verifyRightClick();
		actions.verifyDragandDrop();

	}

}
