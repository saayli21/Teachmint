package Teachmint;

import java.awt.AWTException;
import java.io.IOException;

import org.automation.base.Base_class;
import org.automation.element_repository.Administration_Page;
import org.automation.element_repository.Certificates_Page;
import org.automation.element_repository.EnterDetails_Page;
import org.automation.element_repository.Login_Page;
import org.automation.element_repository.SelectAccountPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_001 extends Base_class {
	@Test
	public void loginTest() throws IOException, InterruptedException, AWTException {
		Login_Page lp=new Login_Page(driver);
		lp.loginApplication(driver, javaUtil, webUtil);
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void selectAccountTest() throws InterruptedException, AWTException {
		SelectAccountPage sel=new SelectAccountPage(driver);
		sel.selectAccount(driver, webUtil);
	}
	@Test(dependsOnMethods = "selectAccountTest")
	public void adminstTest() {
		Administration_Page ap=new Administration_Page(driver);
		ap.clickOnAdmin();
	}
	@Test(dependsOnMethods = "adminstTest")
	public void certificateTest() throws InterruptedException {
		Certificates_Page cp=new Certificates_Page(driver);
		cp.certificate();
	}
	@Test(dependsOnMethods = "certificateTest")
	public void enterDetailsValidateTest() throws InterruptedException {
		EnterDetails_Page ed=new EnterDetails_Page(driver);
		String expMsg="Document generated successfully";
		
		ed.enterDetailsValidate(driver, expMsg, webUtil);
		
	}
}