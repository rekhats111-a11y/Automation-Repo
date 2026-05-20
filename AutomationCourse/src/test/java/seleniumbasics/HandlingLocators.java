package seleniumbasics;

import org.openqa.selenium.By;


public class HandlingLocators extends Base{
	public void verifyLocators() {
	 driver.findElement(By.id("button-one"));
	 driver.findElement(By.className("btn btn-primary"));
	 driver.findElement(By.tagName("button"));
	 driver.findElement(By.name("viewport"));
	 driver.findElement(By.linkText("Checkbox Demo"));
	 driver.findElement(By.partialLinkText("Checkbox"));
	 driver.findElement(By.cssSelector("button[id=\"button-one\"]"));
	 driver.findElement(By.xpath("//button[@id='button-one']"));
	 driver.findElement(By.xpath("//button[text()='Show Message']"));
	 driver.findElement(By.xpath("//div[contains(text(),'Single Input Field')]"));
	 driver.findElement(By.xpath("//button[@type='button' and @id='button-two']"));
	 driver.findElement(By.xpath("//div[contains(text(),'Single Input Field')]//parent::div[@class='card']"));
	 driver.findElement(By.xpath("//div[@class='card']//child::button[@id='button-one']"));
	 driver.findElement(By.xpath("//button[@id='button-one']/following::div[@class='card']"));
	 driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div\""));
	 driver.findElement(By.xpath("//div[@class='card']//descendant::div[5]"));
	}



}
