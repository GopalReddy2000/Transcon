package com.Getapcs.Trans.Sales;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Trans.BASECLASS.TestBase;
import com.Getapcs.Trans.HomeLogin.HomePage;

public class RFQ_ReleaseCS extends TestBase {

	@FindBy(xpath = "(//button[@type='button'][normalize-space()='CS'])[1]")
	WebElement csButton;

	@FindBy(xpath = "(//button[text()='CS'])[1]")
	WebElement csButton1;

	@FindBy(xpath = "(//input[@placeholder='Enter Item Number'])[1]")
	WebElement itemNumber;

	@FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[1]")
	WebElement quantity;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Description'])[1]")
	WebElement description;

	@FindBy(xpath = "(//input[@placeholder='Upload file'])[1]")
	WebElement uploadFiles;

	@FindBy(xpath = "(//button[normalize-space()='Add Schedule'])[1]")
	WebElement addShedule;

	@FindBy(xpath = "(//input[@formcontrolname='scheduleQty'])[1]")
	WebElement quantityInaddShedule;

	@FindBy(xpath = "(//button[@type='submit'][normalize-space()='Add'])[1]")
	WebElement addButtonInShedule;

	@FindBy(xpath = "(//button[normalize-space()='Ok'])[1]")
	WebElement oKButton;

	@FindBy(xpath = "(//button[normalize-space()='Add'])[1]")
	WebElement addButton;

	@FindBy(xpath = "(//a[normalize-space()='Notes'])[1]")
	WebElement notesTab;

	@FindBy(xpath = "(//input[@aria-autocomplete='list'])[1]")
	WebElement category;

	@FindBy(xpath = "(//span[normalize-space()='TEST Category1'])[1]")
	WebElement categorySelect;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Note'])[1]")
	WebElement note;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-rfq-item-view/div[2]/div/div/div/form/div/div[4]/div/div/div/table/thead/tr/th[1]/input")
	WebElement itemTabCheckBox;

	@FindBy(xpath = "(//input[@value='1400'])[1]")
	WebElement itemTabCheckBox1;

	@FindBy(xpath = "(//button[normalize-space()='Release'])[1]")
	WebElement releaseButtonInCSRelease;

	public RFQ_ReleaseCS() {
		PageFactory.initElements(driver, this);
	}

	JavascriptExecutor executor = (JavascriptExecutor) driver;

	public HomePage RFQCs(String ItemNumber, String Quantity, String Description, String QuantityInaddShedule,
			String Note) throws Throwable {

//		click(driver, csButton);

		click(driver, csButton1);

		click(driver, itemNumber);

		itemNumber.sendKeys(ItemNumber);

		click(driver, quantity);

		quantity.sendKeys(Quantity);

		click(driver, description);

		description.sendKeys(Description);

		uploadFile(driver, uploadFiles, 1);

		click(driver, addShedule);

		click(driver, quantityInaddShedule);

		quantityInaddShedule.sendKeys(QuantityInaddShedule);

		click(driver, addButtonInShedule);

		click(driver, oKButton);

		click(driver, addButton);

		click(driver, notesTab);

		click(driver, category);

		click(driver, categorySelect);

		click(driver, note);

		note.sendKeys(Note);

		click(driver, addButton);

		click(driver, saveButton);

		// Verify and Release the CS
		// Verify and Click on CS Button1
		boolean csButton1IsDisplayed = csButton1.isDisplayed();
		assertTrue(csButton1IsDisplayed, "CS Button1 is not Dsiplayed");
		csButton1.sendKeys(Keys.ENTER);

		Thread.sleep(4000);

		// Verify and Click on Check Box which is Present in Item Tab-CS Release
//		click(driver, itemTabCheckBox);
		itemTabCheckBox.sendKeys(Keys.SPACE);
		// itemTabCheckBox1.sendKeys(Keys.SPACE);

		Thread.sleep(2000);

		// Verify and Click on Release Button in Notes Tab -CS Release Page
		boolean releaseButtonInCSReleaseIsDisplayed = releaseButtonInCSRelease.isDisplayed();
		assertTrue(releaseButtonInCSReleaseIsDisplayed, "Release Button is not Displayed in CS Release Page.");

		click(driver, releaseButtonInCSRelease);
		return new HomePage();

	}

}
