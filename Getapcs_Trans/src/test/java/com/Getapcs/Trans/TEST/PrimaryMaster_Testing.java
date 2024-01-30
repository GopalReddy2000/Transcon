package com.Getapcs.Trans.TEST;

import java.awt.AWTException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Getapcs.Trans.BASECLASS.TestBase;
import com.Getapcs.Trans.HomeLogin.HomePage;
import com.Getapcs.Trans.HomeLogin.LoginPage;
import com.Getapcs.Trans.PrimaryMaster.CompanyMaster;
import com.Getapcs.Trans.PrimaryMaster.CompanyMaster_Edit;
import com.Getapcs.Trans.PrimaryMaster.CustomerMaster;
import com.Getapcs.Trans.PrimaryMaster.VenderMaster;
import com.Getapcs.Trans.PrimaryMaster.VenderMasterEdit;



public class PrimaryMaster_Testing extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	CompanyMaster CompanyMaster;
	CompanyMaster_Edit companyMasterEdit;
	CustomerMaster CustomerMaster;
	VenderMaster VenderMaster;
	VenderMasterEdit VenderMasterEdit;
	
	public static final String companyId ="-TEST-02";;

	public PrimaryMaster_Testing() {
		super();
	}

	@BeforeTest
	public void setUp() throws InterruptedException, AWTException {
		initialization();

		CompanyMaster = new CompanyMaster();
		companyMasterEdit = new CompanyMaster_Edit();
		CustomerMaster = new CustomerMaster();
		VenderMaster = new VenderMaster();
		VenderMasterEdit = new VenderMasterEdit();
		loginPage = new LoginPage();
		homePage = loginPage.login("admin@mail.com", "admin@123");

	}

//	@Test(priority = 1)
//	public void verifyCompanyMaster() throws Exception {
//		homePage.clickOnCompanyMasterCreate();
//		
//		CompanyMaster.CompanyMasterCreate("Company"+companyId, "Test comName", "Test comAlias", "Test address",
//				" Test city", "Test state", "Test code", " boardnum", " www.googkle.com", "wyz@mail.com", " 8753",
//				"TEST Cell Name", "9098789876", "080-054678", "TEST First Name", "TEST Designation", "9498789876", "10",
//				"TEST Last Name", "admin@mail.com", "TEST Address", "9", "gavs6682", "TEST Branch", "8786745796",
//				"sgdv762178", "kh27", "jhh", "100000", "TEST Special Terms", "10000", "10", "TEST Icr", "10", "skill",
//				" 10", "10", "floor", "machine1", " tools", "sqft1", "erp2", "osp2", "approved");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://demo-tras.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 2)
//	public void verifyCompanyMasterEdit() throws InterruptedException, AWTException {
//		homePage.clickOnCompanyMasterEdit();
//		companyMasterEdit.CompanyMasterEdit("Test comName1"+companyId, "Test comAlias1"+companyId);
//		Thread.sleep(1000);
//		driver.navigate().to("https://demo-tras.getapcs.com/dashboard");
//
//	}

	@Test(priority = 3)
	public void verifyCustomerCreate() throws InterruptedException, AWTException {
		
		homePage.clickOnCustomerMasterCreate();
		CustomerMaster.CustomerMasterCreate("0007", "Test CustomerName", "Test CustomerAlias",
				"Test address", "Test city", "Test state", "Test code", "boardnum", "www.googkle.com",
				"wyz@mail.com", "8753", "TEST Cell Name", "9098789876", "080-054678", "TEST First Name",
				"TEST Designation", "9498789876", "10", "TEST Last Name", "admin@mail.com", "TEST Address", "9",
				"gavs6682", "TEST Branch", "8786745796", "sgdv762178", "kh27", "jhh", "100000", "TEST Special Terms",
				"10000", "10", "TEST Icr", "10", "skill", " 10", "10", "floor", "machine1", " tools", "sqft1", "erp2",
				"osp2", "approved");
		Thread.sleep(1000);
		driver.navigate().to("https://demo-tras.getapcs.com/dashboard");
	}
	@Test(priority = 3)
	public void verifyCustomerEdit() throws InterruptedException, AWTException {
		homePage.clickOnCustomerMasterCreate();

		CustomerMaster.CustomerMasterCreate("0007", "Test VenderName", "Test VenderAlias", "Test address",
				" Test city", "Test state", "Test code", " boardnum", " www.googkle.com", "wyz@mail.com", " 8753",
				"TEST Cell Name", "9098789876", "080-054678", "TEST First Name", "TEST Designation", "9498789876", "10",
				"TEST Last Name", "admin@mail.com", "TEST Address", "9", "gavs6682", "TEST Branch", "8786745796",
				"sgdv762178", "kh27", "jhh", "100000", "TEST Special Terms", "10000", "10", "TEST Icr", "10", "skill",
				" 10", "10", "floor", "machine1", " tools", "sqft1", "erp2", "osp2", "approved");
		Thread.sleep(1000);
		driver.navigate().to("https://demo-tras.getapcs.com/dashboard");
	}

	@Test(priority = 4)
	public void verifyCustomerMasterEdit() throws InterruptedException, AWTException {
		homePage.clickOnCustomerMasterEdit();

		homePage = CustomerMaster.CustomerMasterEdit("Test comName1", "Test comAlias1", "Test address1", " Test city1",
				"Test state1", "Test code1", " boardnum1", " www.google.com", "wyz12@mail.com", " 68753",
				"TEST Cell Name1", "9498789876", "080-054765", "TEST First Name1", "TEST Designation1", "9498789876",
				"9", "TEST Last Name", "admin@1mail.com", "TEST Address1", "9", "gavs66822", "TEST Branch1",
				"8786745778", "sgdv76217798", "kh98", "jhhjdc", "999999", "TEST Special Terms1", "99999", "9",
				"TEST Icr1", "10", "skill1", " 9", "101", "floor1", "machine2", " tools1", "sqft2", "approved1");
		Thread.sleep(1000);
		driver.navigate().to("https://demo-tras.getapcs.com/dashboard");

	}

	@Test(priority = 5)
	public void verifyVenderMasterField() throws Exception {
		homePage.clickOnVenderMasterCreate();

		homePage = VenderMaster.VenderMasterCreate("VD-001", "Test venName", "Test venAlias", "Test address",
				" Test city", "Test state", "Test code", " boardnum", " www.googkle.com", "wyz@mail.com", " 8753",
				"TEST Cell Name", "9098789876", "080-054678", "TEST First Name", "TEST Designation", "9498789876", "10",
				"TEST Last Name", "admin@mail.com", "TEST Address", "9", "gavs6682", "TEST Branch", "8786745796",
				"sgdv762178", "kh27", "jhh", "100000", "TEST Special Terms", "10000", "10", "TEST Icr", "10", "skill",
				" 10", "10", "floor", "machine1", " tools", "sqft1", "erp2", "osp2", "approved");

		Thread.sleep(1000);
		driver.navigate().to("https://demo-tras.getapcs.com/dashboard");
	}
//	@Test(priority = 5)
//	public void verifyVenderMasterField() throws InterruptedException, AWTException {
//		homePage.clickOnVenderMasterCreate();
//
//		homePage = VenderMaster.VenderMasterCreate("123456789", "Test venName", "Test venAlias", "Test address",
//				" Test city", "Test state", "Test code", " boardnum", " www.googkle.com", "wyz@mail.com", " 8753",
//				"TEST Cell Name", "9098789876", "080-054678", "TEST First Name", "TEST Designation", "9498789876", "10",
//				"TEST Last Name", "admin@mail.com", "TEST Address", "9", "gavs6682", "TEST Branch", "8786745796",
//				"sgdv762178", "kh27", "jhh", "100000", "TEST Special Terms", "10000", "10", "TEST Icr", "10", "skill",
//				" 10", "10", "floor", "machine1", " tools", "sqft1", "erp2", "osp2", "approved");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://demo-tras.getapcs.com/dashboard");
//	}

//	@Test(priority = 6)
//	public void verifyvenderMasterEdit() throws InterruptedException, AWTException {
//		homePage.clickOnVenderMasterEdit();
//
//		homePage = VenderMasterEdit.VenderMasterEdit1("Test venderName1", "Test VenderAlias1", "Test address1",
//				" Test city1", "Test state1", "Test code1", " boardnum1", " www.google.com", "wyz12@mail.com", " 68753",
//				"TEST Cell Name1", "9498789876", "080-054765", "TEST First Name1", "TEST Designation1", "9498789876",
//				"9", "TEST Last Name", "admin@1mail.com", "TEST Address1", "9", "gavs66822", "TEST Branch1",
//				"8786745778", "sgdv76217798", "kh98", "jhhjdc", "999999", "TEST Special Terms1", "99999", "9",
//				"TEST Icr1", "10", "skill/Department", " 10", "101", "floor1", "machine2", " tools1", "sqft2",
//				"approved1");
//
//	}

	@AfterTest
	public void tearDown() {
		 driver.manage().window().minimize();
		 driver.quit();
	}
}
