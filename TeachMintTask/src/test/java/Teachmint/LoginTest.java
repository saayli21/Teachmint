package Teachmint;

import java.io.IOException;

import org.automation.base.Base_class;
import org.automation.element_repository.Administration_Page;
import org.automation.element_repository.Certificates_Page;
import org.automation.element_repository.Login_Page;
import org.automation.element_repository.SelectAccountPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends Base_class {
	@Test
	public void loginTest() throws IOException, InterruptedException {
		Login_Page lp=new Login_Page(driver);
		lp.loginApplication(driver, javaUtil, webUtil);
		
		SelectAccountPage sel=new SelectAccountPage(driver);
		sel.selectAccount(driver, webUtil);
		
		Administration_Page ap=new Administration_Page(driver);
		ap.clickOnAdmin();
		
		Certificates_Page cp=new Certificates_Page(driver);
		cp.getSchoolLivingCertificate().click();
	}
}
