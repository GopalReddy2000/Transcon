package com.Getapcs.Trans.Sales;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Getapcs.Trans.BASECLASS.TestBase;
import com.Getapcs.Trans.HomeLogin.HomePage;

public class RFQ_EditPage extends TestBase {

	@FindBy(xpath = "//button[@class='navbar-toggler navbar-toggler align-self-center']//span[@class='mdi mdi-menu']")
	WebElement threeLineIconBar;

	@FindBy(xpath = "(//span[normalize-space()='Sales'])[1]")
	WebElement salesModuledropdown;

	@FindBy(xpath = "//span[text()='RFQ']")
	WebElement rfq;

	@FindBy(xpath = "//a[@routerlink='sales/rfq/create']")
	WebElement createRFQ;

	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement customerNameDropDown;

	@FindBy(xpath = "(//span[normalize-space()='0003 - Test comName'])[1]")
	WebElement customerNameDropDownSelect;

	@FindBy(xpath = "//input[@placeholder='Enter Customer Rfq Number']")
	WebElement customerRFQNumberField;

	@FindBy(xpath = "(//input[@placeholder='DD-MM-YYYY'])[1]")
	WebElement requestReceiveDatePicker;

	@FindBy(xpath = "(//input[@formcontrolname='quotesExpectedDate'])[1]")
	WebElement quoteExpectDatePicker;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement typeOfSolution;

	@FindBy(xpath = "(//span[normalize-space()='Automation'])[1]")
	WebElement typeOfSolutionSelect;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement productType;

	@FindBy(xpath = "(//span[normalize-space()='Upsell - Endo'])[1]")
	WebElement productTypeSelect;

	@FindBy(xpath = "(//input[@type='text'])[8]")
	WebElement roomName;

	@FindBy(xpath = "(//span[normalize-space()='Home'])[1]")
	WebElement roomNameSelect;

	@FindBy(xpath = "(//input[@role='combobox'])[1]")
	WebElement itemNumber;

	@FindBy(xpath = "(//span[normalize-space()='798878123-Test Description'])[1]")
	WebElement itemNumberSelect;

	@FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[1]")
	WebElement quantity;

	@FindBy(xpath = "(//button[normalize-space()='Close'])[1]")
	WebElement close;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement saveButton;

	@FindBy(xpath = "(//a[normalize-space()='Notes'])[1]")
	WebElement notesTab;

	@FindBy(xpath = "(//input[@type='text'])[7]")
	WebElement category;

	@FindBy(xpath = "(//span[normalize-space()='TEST Category'])[1]")
	WebElement categorySelect;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Note'])[1]")
	WebElement note;

	@FindBy(xpath = "(//button[normalize-space()='Add'])[1]")
	WebElement add;

	@FindBy(xpath = "//a[@routerlink='sales/rfq/table']")
	WebElement modifyorView;

	@FindBy(xpath = "(//i[@class='mdi mdi-pencil edit-icon'])[1]")
	WebElement editButton;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Remarks'])[1]")
	WebElement remarks;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Reason For Modification'])[1]")
	WebElement reasonForModification;

	@FindBy(xpath = "(//td[normalize-space()='1'])[1]")
	WebElement itemTable;

	@FindBy(xpath = "(//td[normalize-space()='test'])[1]")
	WebElement notesTable;

	@FindBy(xpath = "(//button[normalize-space()='Update'])[1]")
	WebElement update;

	public RFQ_EditPage() {
		PageFactory.initElements(driver, this);
	}


	public HomePage RFQEdit() throws Throwable {

		click(driver, saveButton);
		Thread.sleep(3000);
		return new HomePage();

	}
}
