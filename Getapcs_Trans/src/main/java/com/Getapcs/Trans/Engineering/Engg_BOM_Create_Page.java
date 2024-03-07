package com.Getapcs.Trans.Engineering;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Trans.BASECLASS.TestBase;
import com.Getapcs.Trans.HomeLogin.HomePage;

public class Engg_BOM_Create_Page extends TestBase {

	@FindBy(xpath = "(//input[@autocorrect='off'])[1]")
	WebElement itemNumberForItem;

	@FindBy(xpath = "//label[contains(text(), 'Item Description')]/following-sibling::textarea")
	WebElement itemDescriptionElement;

	@FindBy(xpath = "//label[normalize-space(text())='Item Type']/following-sibling::div/input[@formcontrolname='itemType']")
	WebElement itemTypeElement;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement activeStatusToggleButton;

	@FindBy(xpath = "//input[@formcontrolname='itemNoDesc']")
	WebElement itemNumberForChildItem;
	@FindBy(xpath = "//span[normalize-space()='88844455-Test Description']")
	WebElement itemNumberForChildItemDataSeelect;

	@FindBy(xpath = "//input[@placeholder='Enter Quantity']")
	WebElement quantityField;

	@FindBy(xpath = "//input[@placeholder='Enter Scrap Allowance']")
	WebElement scarpAllowanceField;

	@FindBy(xpath = "//textarea[@placeholder='Enter Remarks']")
	WebElement remarkField;

	@FindBy(xpath = "//label[normalize-space(text())='Item Type']/following-sibling::div/input[@formcontrolname='childItemType']")
	WebElement childItemTypeElement;

	@FindBy(xpath = "//label[normalize-space(text())='UOM']/following-sibling::div/input[@formcontrolname='uom']")
	WebElement uOMElement;

	@FindBy(xpath = "//label[normalize-space(text())='Version']/following-sibling::div/input[@formcontrolname='version']")
	WebElement versionElement;

	@FindBy(xpath = "(//span[@class='slider round'])[2]")
	WebElement childItemToggleButton;

	@FindBy(xpath = "//button[normalize-space()='Add']")
	WebElement addChildItemButton;

	// Alternates Tab
	@FindBy(linkText = "Alternates")
	WebElement alternatesTab;

	@FindBy(xpath = "//input[@formcontrolname='alterItemNoDesc']")
	WebElement alternateItemDropDown;

	@FindBy(xpath = "(//span[@class='mat-option-text'])[1]")
	WebElement alternateItemDropDownDataSeelect;

	@FindBy(xpath = "//label[normalize-space(text())='UOM']/following-sibling::div/input[@formcontrolname='alterUom']")
	WebElement alternateUOMElement;

	@FindBy(xpath = "//input[@placeholder='Enter Version']")
	WebElement versionField;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement customerNameField;

	@FindBy(xpath = "(//span[normalize-space()='VEDHARTH TECHNOLOGY'])[1]")
	WebElement customerNameFieldDataSelect;

	@FindBy(xpath = "//input[@placeholder='Enter Quantity']")
	WebElement quantityPerFeild;

	@FindBy(xpath = "//input[@placeholder='Enter Probability of Usage']")
	WebElement probabilityofUsageField;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement alternateitemNumberDropDown;
	@FindBy(xpath = "//span[normalize-space()='76543456']")
	WebElement alternateitemNumberDropDownDataSeelect;

	@FindBy(xpath = "//textarea[@placeholder='Enter Remarks']")
	WebElement alternateRemarkField;

	@FindBy(xpath = "(//span[@class='slider round'])[2]")
	WebElement alternateActiveToggleButton;

	@FindBy(xpath = "//button[normalize-space()='Add']")
	WebElement alternateAddButton;

	// NRE \ Consumable Tab
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-create-engg-bom[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/ul[1]/li[3]/a[1]")
	WebElement nreOrConsumableTab;

	@FindBy(xpath = "(//input[@role='combobox'])[1]")
	WebElement itemNumberDropDowninNRE;
	@FindBy(xpath = "(//span[@class='mat-option-text'])[1]")
	WebElement itemNumberDropDowninNREDataSelect;

	@FindBy(xpath = "//input[@placeholder='Enter Quantity']")
	WebElement quantityFieldInNRE;

	@FindBy(xpath = "//input[@placeholder='Enter Cost']")
	WebElement costFieldInNRE;

	@FindBy(xpath = "//button[normalize-space()='Add']")
	WebElement addButtonInNRE;

	@FindBy(xpath = "//input[@placeholder='Upload Items']")
	WebElement fileUploadInBomCreate;

	@FindBy(xpath = "//button[normalize-space()='Close']")
	WebElement fileCloseButton;

	@FindBy(xpath = "//button[text()='Save']")
	WebElement saveButton;

	@FindBy(xpath = "(//button[normalize-space()='Close'])[1]")
	WebElement closeButton;

	public Engg_BOM_Create_Page() {
		PageFactory.initElements(driver, this);

	}

	public HomePage bomCreate(String quantity, String scarpAllowance, String remark, String version, String quantityPer,
			String probability, String alternateRemark, String quantityNRE, String cost) throws Throwable {

		driver.navigate().to("https://demo-tras.getapcs.com/engineering/item-master/table");

		String tableXpath = "//table[@class='table table-striped']";

		// Get the first FG number text from table
		String ItemNumberFG = driver.findElement(By.xpath(tableXpath + "/tbody/tr[2]/td[2]")).getText();

		// Store the element with hard coded PR number
		String elementXpath = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath = elementXpath.replace("Item-FG-11-TEST", ItemNumberFG);

		System.out.println(updatedXpath);

		// *******************//

		String tableXpath2 = "//table[@class='table table-striped']";

		// Get the first PR number text from table
		String ItemNumPP = driver.findElement(By.xpath(tableXpath2 + "/tbody/tr[1]/td[2]")).getText();

		// Store the element with hard coded PR number
		String elementXpath1 = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath1 = elementXpath1.replace("Item-FG-11-TEST", ItemNumPP + "-Test Description PP");

		System.out.println(updatedXpath1);

		driver.navigate().to("https://demo-tras.getapcs.com/engineering/engg-bom/create");

		// Item Number

		// Verify that itemNumber Field is Displayed or not
		Thread.sleep(5000);
		click(driver, itemNumberForItem);
		isSelected(driver, itemNumberForItem, "itemNumberForItem");

		WebElement itemNumberDropDownDataSelect = driver.findElement(By.xpath(updatedXpath));
		click(driver, itemNumberDropDownDataSelect);

		// Verifying that ItemDescription Field is displayed or hidden.
		dataPrint(driver, itemDescriptionElement, "itemDescriptionElement");

		// Verifying that Item Type Field is displayed or hidden.
		dataPrintFromInputtag(driver, itemTypeElement, "itemTypeElement");

//       activeStatusToggleButton.click();
//       activeStatusToggleButton.click();

		// ############## Child Item Tab ################

		// Verify that itemNumber Field is Displayed or not

//		Thread.sleep(5000);
//		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
//		
//		wait1.until((ExpectedCondition<Boolean>) wd ->
//        ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
		waitUntilAPILoaded(driver);
		click(driver, itemNumberForChildItem);
		itemNumberForChildItem.sendKeys(ItemNumPP);
		WebElement itemNumberForChildItemDataSelect = driver.findElement(By.xpath(updatedXpath1));
		click(driver, itemNumberForChildItemDataSelect);

		click(driver, quantityField);
		isSelected(driver, quantityField, "quantityField");
		quantityField.sendKeys(quantity);

		// 1Verifying that ScrapAllowance Field is Enabled or not
		click(driver, scarpAllowanceField);
		isSelected(driver, scarpAllowanceField, "scarpAllowanceField");
		scarpAllowanceField.sendKeys(scarpAllowance);

		// 1Verifying that Remarks Field is Enabled or not
		click(driver, remarkField);
		isSelected(driver, remarkField, "remarkField");
		remarkField.sendKeys(remark);

		dataPrintFromInputtag(driver, childItemTypeElement, "childItemTypeElement");

		// Verifying that UOM Field is displayed or hidden.
		dataPrintFromInputtag(driver, uOMElement, "uOMElement");

		// Verifying that Version Field is displayed or hidden.
		dataPrintFromInputtag(driver, versionElement, "versionElement");

		click(driver, childItemToggleButton);
		click(driver, childItemToggleButton);

		click(driver, addChildItemButton);

		click(driver, alternatesTab);

		click(driver, alternateItemDropDown);
		click(driver, alternateItemDropDownDataSeelect);

		// Verifying that UOM Field is displayed or hidden.
		dataPrintFromInputtag(driver, alternateUOMElement, "alternateUOMElement");
		// 1Verifying that VersionAlternates Field is Enabled or not
		click(driver, versionField);
		isSelected(driver, versionField, "versionField");
		versionField.sendKeys(version);

		click(driver, customerNameField);
		click(driver, customerNameFieldDataSelect);

		// 1Verifying that QualityPer Field is Enabled or not
		click(driver, quantityPerFeild);
		isSelected(driver, quantityPerFeild, "quantityPerFeild");
		quantityPerFeild.sendKeys(quantityPer);

		// 1Verifying that ProbabilityofUsage Field is Enabled or not
		click(driver, probabilityofUsageField);
		isSelected(driver, probabilityofUsageField, "probabilityofUsageField");
		probabilityofUsageField.sendKeys(probability);

		click(driver, alternateitemNumberDropDown);
		click(driver, alternateitemNumberDropDownDataSeelect);

		click(driver, alternateRemarkField);
		isSelected(driver, alternateRemarkField, "alternateRemarkField");
		alternateRemarkField.sendKeys(alternateRemark);

		click(driver, alternateActiveToggleButton);
		click(driver, alternateActiveToggleButton);

		click(driver, alternateAddButton);

		click(driver, nreOrConsumableTab);

		click(driver, itemNumberDropDowninNRE);
		click(driver, itemNumberDropDowninNREDataSelect);

		// 1Verifying that QualityNRE Field is Enabled or not
		click(driver, quantityFieldInNRE);
		isSelected(driver, quantityFieldInNRE, "quantityFieldInNRE");

		quantityFieldInNRE.sendKeys(quantityNRE);

		click(driver, costFieldInNRE);
		isSelected(driver, costFieldInNRE, "costFieldInNRE");
		costFieldInNRE.sendKeys(cost);

		addButtonInNRE.click();

//Upload File

		uploadFile(driver, fileUploadInBomCreate, 1);

		click(driver, closeButton);

//		System.out.println(driver.getCurrentUrl());
//		Thread.sleep(1000);

		saveButton.click();

//		Thread.sleep(3000);
//		System.out.println(driver.getCurrentUrl());

//				assertNotEquals(beforeSaveButton, afterSaveButton, "URLs are the same");
		return new HomePage();
	}

}
