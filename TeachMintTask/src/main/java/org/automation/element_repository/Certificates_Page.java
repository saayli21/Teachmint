package org.automation.element_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Certificates_Page {

	
	
	@FindBy(xpath = "//div[contains(@class,'Cards_templateImageContainer__2UfJm')]/../../../..//h6[text()='Default templates - 7']")
	public WebElement schoolLivingCertificate;
	
	public Certificates_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}

	public WebElement getSchoolLivingCertificate() {
		return schoolLivingCertificate;
	}

	public void setSchoolLivingCertificate(WebElement schoolLivingCertificate) {
		this.schoolLivingCertificate = schoolLivingCertificate;
	}
	
}
