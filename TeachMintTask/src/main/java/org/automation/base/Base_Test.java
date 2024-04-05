package org.automation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Base_Test {
	public WebDriver driver;

	public Base_Test(WebDriver driver) {
		PageFactory.initElements(driver, this);    //to avoid stale ele 
		this.driver = driver;
	}
	
	@FindBy(xpath = "//div[text()='Administration']")
	private WebElement administration;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getAdministration() {
		return administration;
	}

}
