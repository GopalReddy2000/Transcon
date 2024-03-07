package com.Getapcs.Trans.Sales;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Trans.BASECLASS.TestBase;
import com.Getapcs.Trans.HomeLogin.HomePage;

public class ItemPriceList_CreatePage extends TestBase {
	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement priceListNameDropDown;

	@FindBy(xpath = "(//span[normalize-space()='TEST Price List 25'])[1]")
	WebElement priceListNameDropDownSelect;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement itemNumberdescriptionField;

	@FindBy(xpath = "(//span[normalize-space()='798878123-Test Description'])[1]")
	WebElement itemNumberdescriptionSearchableFieldSelect;

	@FindBy(xpath = "//input[@placeholder='Enter Quantity']")
	WebElement quantityTextBox;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement uocDropDown;

	@FindBy(xpath = "//span[text()='INR']")
	WebElement uocDropDownSelect;

	@FindBy(xpath = "(//input[@placeholder='Enter Least Cost'])[1]")
	WebElement leastCountTextBox;

	@FindBy(xpath = "(//input[@placeholder='Enter Markup'])[1]")
	WebElement markUpTextBox;

	@FindBy(xpath = "//input[@placeholder='Enter Least Cost Plus']")
	WebElement leastCostPlusTextBox;

	@FindBy(xpath = "(//input[@placeholder='Enter Least Cost Minus'])[1]")
	WebElement leastCostMinusTextBox;

	@FindBy(xpath = "//body[1]/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-item-price-list-form[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[9]/label[2]/span[1]")
	WebElement isDiscountApplicableToggleButton;

	@FindBy(xpath = "//input[@placeholder='Enter Discount Plus']")
	WebElement discountPlusTextBox;

	@FindBy(xpath = "//input[@placeholder='Enter Discount Minus']")
	WebElement discountMinusTextBox;

	@FindBy(xpath = "//input[@placeholder='DD-MM-YYYY']")
	WebElement validThroughDatePicker;

	@FindBy(xpath = "(//span[@class='slider round'])[2]")
	WebElement activeStatusToggleButton;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement saveButton;

	@FindBy(xpath = "(//span[normalize-space()='Sales'])[1]")
	WebElement sales;

	@FindBy(xpath = "(//span[normalize-space()='Item Price List'])[1]")
	WebElement itemPriceList;

	@FindBy(xpath = "(//a[@routerlink='master/item-price-list/form'])[1]")
	WebElement itemPriceListCreate;

	@FindBy(xpath = "(//span[@class='mdi mdi-menu'])[1]")
	WebElement threeLinesSideBarIcon;

	public ItemPriceList_CreatePage() {
		PageFactory.initElements(driver, this);
	}


	public HomePage ItemPriceListCreate(String quantity, String leastCount, String markUp, String leastCostMinus,
			String discountPlus, String discountMinus) throws InterruptedException {

		driver.navigate().to("https://demo-tras.getapcs.com/master/price-list/table");

		String tableXpath = "//table[@class='table table-striped']";

		String PriceList = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText();

		String elementXpath = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath = elementXpath.replace("Item-FG-11-TEST", PriceList);

		System.out.println(updatedXpath);
		Thread.sleep(4000);
		// **************************//
		driver.navigate().to("https://demo-tras.getapcs.com/engineering/engg-bom/table");

		String tableXpath1 = "//table[@class='table table-striped']";

		String ItemNumber = driver.findElement(By.xpath(tableXpath1 + "/tbody/tr[1]/td[2]")).getText();

		String elementXpath1 = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath1 = elementXpath1.replace("Item-FG-11-TEST", ItemNumber + "-Test Description FG");

		System.out.println(updatedXpath1);
		Thread.sleep(4000);
		driver.navigate().to("https://demo-tras.getapcs.com/dashboard");
		click(driver, threeLinesSideBarIcon);
		click(driver, sales);
		click(driver, itemPriceList);
		click(driver, itemPriceListCreate);
		

		Thread.sleep(2000);

		// PriceList-Sales Module
		click(driver, priceListNameDropDown);
		isSelected(driver, priceListNameDropDown, "priceListNameDropDown");
		WebElement priceListNameDropDownSelect = driver.findElement(By.xpath(updatedXpath));
		click(driver, priceListNameDropDownSelect);

		// Description Field
		click(driver, itemNumberdescriptionField);
		isSelected(driver, itemNumberdescriptionField, "itemNumberdescriptionField");
		WebElement itemNumberdescriptionSearchableFieldSelect = driver.findElement(By.xpath(updatedXpath1));
		click(driver, itemNumberdescriptionSearchableFieldSelect);

		// Quantity Text Box
		click(driver, quantityTextBox);
		isSelected(driver, quantityTextBox, "quantityTextBox");
		quantityTextBox.clear();
		quantityTextBox.sendKeys(quantity);

		// Verify Quantity Field is Accepting Numeric or String
		String quantityinputValue = quantityTextBox.getAttribute("value");
		boolean isNumericQuantityTextBox = quantityinputValue.matches("\\d+"); // This regex matches one or more digits
		assertTrue(isNumericQuantityTextBox, "The input is not numeric");

		// Verify and Click on UOC DropDown and Select in Create-Item PriceList-Sales
		click(driver, uocDropDown);
		isSelected(driver, uocDropDown, "uocDropDown");
		click(driver, uocDropDownSelect);

		// Verify and Enter Data on Least Count TextBox in Create-Item PriceList-Sales
		click(driver, leastCountTextBox);
		isSelected(driver, leastCountTextBox, "leastCountTextBox");
		leastCountTextBox.clear();
		leastCountTextBox.sendKeys(leastCount);

		// Verify Least Count Field is Accepting Numeric or String
		String leastCountinputValue = quantityTextBox.getAttribute("value");
		boolean isNumericLeastCountTextBox = leastCountinputValue.matches("\\d+"); // This regex matches one or more
		assertTrue(isNumericLeastCountTextBox, "The input is not numeric");

		// Verify and Enter Data on MarkUp TextBox in Create-Item PriceList-Sales Module
		click(driver, markUpTextBox);
		isSelected(driver, markUpTextBox, "markUpTextBox");
		markUpTextBox.clear();
		markUpTextBox.sendKeys(markUp);
		// Verify MarkUp Field is Accepting Numeric or String
		String markUpinputValue = markUpTextBox.getAttribute("value");
		boolean isNumericMarkUpTextBox = markUpinputValue.matches("\\d+"); // This regex matches one or more digits
		assertTrue(isNumericMarkUpTextBox, "The input is not numeric");

		// Verify and Enter Data on Least Cost Plus TextBox in Create-Item
		click(driver, leastCostPlusTextBox);
		isSelected(driver, leastCostPlusTextBox, "leastCostPlusTextBox");
		leastCostPlusTextBox.clear();
		leastCostPlusTextBox.sendKeys(leastCount);
		// Verify Least Cost Plus Field is Accepting Numeric or String
		String leastCostPlusinputValue = leastCostPlusTextBox.getAttribute("value");
		boolean isNumericLeastCostPlusTextBox = leastCostPlusinputValue.matches("\\d+"); // This regex matches one or
		assertTrue(isNumericLeastCostPlusTextBox, "The input is not numeric");

		// Verify and Enter Data on Least Cost Minus TextBox in Create-Item
		click(driver, leastCostMinusTextBox);
		isSelected(driver, leastCostMinusTextBox, "leastCostMinusTextBox");
		leastCostMinusTextBox.clear();
		leastCostMinusTextBox.sendKeys(leastCostMinus);
		// Verify Least Cost Minus Field is Accepting Numeric or String
		String leastCostMinusinputValue = leastCostMinusTextBox.getAttribute("value");
		boolean isNumericLeastCostMinusTextBox = leastCostMinusinputValue.matches("\\d+"); // This regex matches one or
		assertTrue(isNumericLeastCostMinusTextBox, "The input is not numeric");

		// Verify and Click on IsDiscount Applicable Toggle Button in Create-Item
		click(driver, isDiscountApplicableToggleButton);
		click(driver, isDiscountApplicableToggleButton);

		// Verify and Enter Data on Discount Plus TextBox in Create-Item PriceList-Sales
		click(driver, discountPlusTextBox);
		isSelected(driver, discountPlusTextBox, "discountPlusTextBox");
		discountPlusTextBox.clear();
		discountPlusTextBox.sendKeys(discountPlus);
		// Verify Discount Plus Field is Accepting Numeric or String
		String discountPlusinputValue = discountPlusTextBox.getAttribute("value");
		boolean isNumericDiscountPlusTextBox = discountPlusinputValue.matches("\\d+"); // This regex matches one or more
		assertTrue(isNumericDiscountPlusTextBox, "The input is not numeric");

		// Verify and Enter Data on Discount Minus TextBox in Create-Item
		click(driver, discountMinusTextBox);
		isSelected(driver, discountMinusTextBox, "discountMinusTextBox");
		discountMinusTextBox.clear();
		discountMinusTextBox.sendKeys(discountMinus);
		// Verify Discount Plus Field is Accepting Numeric or String
		String discountMinusinputValue = discountMinusTextBox.getAttribute("value");
		boolean isNumericDiscountMinusTextBox = discountMinusinputValue.matches("\\d+"); // This regex matches one or
		assertTrue(isNumericDiscountMinusTextBox, "The input is not numeric");

		// Verify Valid Through Date Picker in Create-Item PriceList-Sales Module
		datePicker(driver, validThroughDatePicker);

		// Verify and Click on Active Status Toggle Button in Create-Item
		click(driver, activeStatusToggleButton);
		click(driver, activeStatusToggleButton);

		// Verify and Click on Save Button in Create-Item PriceList-Sales Module
		boolean saveButtonIsDisplayed = saveButton.isDisplayed();
		assertTrue(saveButtonIsDisplayed, "Save Button is not Displayed");
		saveButton.click();
		return new HomePage();

	}
}
