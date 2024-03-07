package com.Getapcs.Trans.Engineering;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Trans.BASECLASS.TestBase;
import com.Getapcs.Trans.HomeLogin.HomePage;

public class Item_Master_Edit_Page extends TestBase {

	@FindBy(xpath = "//div[@class='title_sub_div_1 mt-1']")
	WebElement headingText;

	@FindBy(xpath = "//input[@placeholder='Enter Item Number']")
	WebElement itemNumber;

	@FindBy(xpath = "//textarea[@placeholder='Enter Item Description']")
	WebElement descriptionField1;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement activeStatus;

	@FindBy(xpath = "(//span[@class='slider round'])[2]")
	WebElement obsoluteToggleButton;

	@FindBy(xpath = "//input[@id='uploadFile']")
	WebElement uploadPhoto;

	// General Description
	@FindBy(xpath = "(//a[normalize-space()='General Description'])[1]")
	WebElement generalDescriptionTab;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement typeDropDown;
	@FindBy(xpath = "//span[normalize-space()='FG']")
	WebElement typeDropDownSelectData;
	@FindBy(xpath = "(//span[normalize-space()='PurchasePart'])[1]")
	WebElement typeDropDownSelectData1;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement commodity;
	@FindBy(xpath = "//span[normalize-space()='LED DRIVERS']")
	WebElement commodityDropDownSelectData;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement materialGroupDropDown;
	@FindBy(xpath = "(//span[normalize-space()='TEST MaterialType1'])[1]")
	WebElement materialGroupDropDownSelectData;

	@FindBy(xpath = "(//input[@type='text'])[7]")
	WebElement purchaseGroupDropDown;
	@FindBy(xpath = "(//span[normalize-space()='TEST Purchase_Group1'])[1]")
	WebElement purchaseGroupDropDownSelectData;

	@FindBy(xpath = "(//input[@type='text'])[8]")
	WebElement departmentDropDown;
	@FindBy(xpath = "(//span[normalize-space()='TEST Department1'])[1]")
	WebElement departmentDropDownSelectData;
	//
	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement uOMDropDown;
	@FindBy(xpath = "(//span[normalize-space()='Units'])[1]")
	WebElement uomDropDownSelectData;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement hSNDropDown;
	@FindBy(xpath = "//span[normalize-space()='1002']")
	WebElement hSNDropDownSelectData;

	@FindBy(xpath = "(//span[@class='slider round'])[3]")
	WebElement prRequiredToggleButton;

	@FindBy(xpath = "(//span[@class='slider round'])[4]")
	WebElement openGRINToggleButton;

	@FindBy(xpath = "(//input[@placeholder='DD-MM-YYYY'])[1]")
	WebElement validFromDatePicker;

	@FindBy(xpath = "//input[@placeholder='Enter Valid To']")
	WebElement validToDatePicker;

	// Alternative Tab
	@FindBy(xpath = "(//a[normalize-space()='Alternates'])[1]")
	WebElement alternativeTab;

	@FindBy(xpath = "//input[@placeholder='Enter Alternate Part No']")
	WebElement alternatePartNoField;

	@FindBy(xpath = "//input[@id='manufacturer']")
	WebElement sourceManufacturerRadioButton;

	@FindBy(xpath = "//input[@id='customer']")
	WebElement sourceCustomerRadioButton;

	@FindBy(xpath = "//input[@placeholder='Enter Munufacturer/Customer']")
	WebElement manufacturerorCustomerField;

	@FindBy(xpath = "(//span[@class='slider round'])[3]")
	WebElement defaultToggleButton;

	@FindBy(xpath = "//button[normalize-space()='Add']")
	WebElement addAlternative;

	// Engineering Tab
	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-edit-item-master/div[2]/div/div/div/form/div/div[2]/ul/li[3]/a")
	WebElement engineeringTab;

	@FindBy(xpath = "//input[@placeholder='Enter Drawing No']")
	WebElement drawingNoField;

	@FindBy(xpath = "//input[@placeholder='Enter Rev No']")
	WebElement revNoField;

	@FindBy(xpath = "//input[@placeholder='Enter Doc Ret']")
	WebElement docRetField;

	@FindBy(xpath = "(//span)[54]")
	WebElement cocToggleButton;

	@FindBy(xpath = "(//span)[55]")
	WebElement rOHSToggleButton;

	@FindBy(xpath = "(//span)[56]")
	WebElement selfLifeToggleButton;

	@FindBy(xpath = "(//span)[57]")
	WebElement rEACHToggleButton;

	// Dimensions Tab
	@FindBy(xpath = "(//a[normalize-space()='Dimensions'])[1]")
	WebElement dimensionsTab;

	@FindBy(xpath = "//input[@placeholder='Upload file']")
	WebElement filesUpload;

	@FindBy(xpath = "(//button[normalize-space()='Uploaded Files'])[1]")
	WebElement filesUpload1;

	@FindBy(xpath = "//input[@placeholder='Enter Net Weight']")
	WebElement netWeightField;

	@FindBy(xpath = "//input[@placeholder='Enter Gross Weight']")
	WebElement grossWeightField;

	@FindBy(xpath = "//input[@placeholder='Enter Volume']")
	WebElement volumeField;

	@FindBy(xpath = "//input[@placeholder='Enter Size']")
	WebElement sizeField;

	@FindBy(xpath = "//input[@placeholder='Enter Foot Print']")
	WebElement footPrintField;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement uOMDropdown1;
	@FindBy(xpath = "(//span[normalize-space()='Units'])[1]")
	WebElement uOMDropdown1SelectData;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement uOMDropdown2;
	@FindBy(xpath = "(//span[normalize-space()='Units'])[1]")
	WebElement uOMDropdown2SelectData;

	@FindBy(xpath = "(//input[@type='text'])[7]")
	WebElement uOMDropdown3;
	@FindBy(xpath = "(//span[normalize-space()='Units'])[1]")
	WebElement uOMDropdown3SelectData;

	// Routing Tab
	@FindBy(xpath = "(//a[normalize-space()='Routing'])[1]")
	WebElement routingTab;

	@FindBy(xpath = "//input[@placeholder='Enter Process Step']")
	WebElement processStepField;

	@FindBy(xpath = "//input[@aria-autocomplete='list']")
	WebElement processDropDown;

	@FindBy(xpath = "//div[normalize-space()='TEST Process']")
	WebElement processDropDownSelectData;

	@FindBy(xpath = "//textarea[@placeholder='Enter Description']")
	WebElement descriptionField;

	@FindBy(xpath = "//input[@placeholder='Enter Machine Hrs']")
	WebElement machineHoursField;

	@FindBy(xpath = "//input[@placeholder='Enter Labor Hrs']")
	WebElement labourHoursField;

	@FindBy(xpath = "(//span[@class='slider round'])[3]")
	WebElement activeToggleButtoninRouting;

	@FindBy(xpath = "//button[normalize-space()='Add']")
	WebElement addRoutingButton;

	// Approved Vender List Tab

	@FindBy(xpath = "(//td[normalize-space()='100'])[1]")
	WebElement approvedVenderTable;

	@FindBy(xpath = "(//button[normalize-space()='Update'])[1]")
	WebElement updateApprovedVender;

	@FindBy(xpath = "(//a[normalize-space()='Approved Vendor List'])[1]")
	WebElement approvedVenderListTab;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement vendorCodeDropDown;
	@FindBy(xpath = "//span[normalize-space()='VD-4']")
	WebElement vendorCodeDropDownDataSelect;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement venderNameDropDown;
	@FindBy(xpath = "//span[normalize-space()='MULTECH PCB TECHNOLOGIES CO LTD']")
	WebElement venderNameDropDownDataSelect;

	@FindBy(xpath = "//input[@placeholder='Enter Share of Business']")
	WebElement shareOFBusinessField;

	@FindBy(xpath = "//button[normalize-space()='Add']")
	WebElement addApprovedVenderList;

	// Planning Tab
	@FindBy(xpath = "(//a[normalize-space()='Planning'])[1]")
	WebElement planningTab;

	@FindBy(xpath = "//input[@placeholder='Enter MIN']")
	WebElement minField;

	@FindBy(xpath = "//input[@placeholder='Enter MAX']")
	WebElement maxField;

	@FindBy(xpath = "//input[@placeholder='Enter Re-Order']")
	WebElement reOrderField;

	@FindBy(xpath = "//input[@placeholder='Enter 2 Bin']")
	WebElement twoBinField;

	@FindBy(xpath = "//input[@placeholder='Enter Lead Time']")
	WebElement leadTimeField;

	@FindBy(xpath = "//div[@class='form-group gd_field_1']//span[@class='slider round']")
	WebElement kanbanToggleButton;

	// Warehouse Tab

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-edit-item-master/div[2]/div/div/div/form/div/div[2]/ul/li[8]/a")
	WebElement wareHouseTab;

	@FindBy(xpath = "(//button[normalize-space()='Add'])[1]")
	WebElement addWarehouse;

	@FindBy(xpath = "//input[@aria-autocomplete='list']")
	WebElement wareHouseDropDown;

	@FindBy(xpath = "(//span[normalize-space()='HYD-BH-RD5'])[1]")
	WebElement wareHouseDropDownDataSelect;

	@FindBy(xpath = "(//span[@class='slider round'])[3]")
	WebElement activeToggleButtoninWarehouse;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/div/div/div[2]/div/button")
	WebElement addWarehouseButton;

	@FindBy(xpath = "(//span[@class='slider round'])[4]")
	WebElement eSDToggleButtoninWarehouse;

	@FindBy(xpath = "(//span[@class='slider round'])[6]")
	WebElement cycleCountToggleButtoninWarehouse;

	@FindBy(xpath = "(//span)[65]")
	WebElement hazardousMaterialToggleButtoninWarehouse;

	@FindBy(xpath = "(//span)[62]")
	WebElement fIFOToggleButtoninWarehouse;

	@FindBy(xpath = "(//span[@class='slider round'])[7]")
	WebElement lIFOToggleButtoninWarehouse;

	@FindBy(xpath = "//input[@placeholder='Enter Expiry (Days)']")
	WebElement expiryDaysField;

	@FindBy(xpath = "//input[@placeholder='Enter Inspection Int (Days)']")
	WebElement inspectionIntDaysField;

	@FindBy(xpath = "//textarea[@placeholder='Enter Special Instructions']")
	WebElement specialInstructionsField;

	// Shipping Tab
	@FindBy(xpath = "(//a[normalize-space()='Shipping'])[1]")
	WebElement shippingTab;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Instructions'])[1]")
	WebElement instructionsField;

	// Quality Tab
	@FindBy(xpath = "(//a[normalize-space()='Quality'])[1]")
	WebElement qualityTab;

	@FindBy(xpath = "(//span[@class='slider round'])[3]")
	WebElement iqcToggleButton;

	@FindBy(xpath = "//input[@placeholder='Enter GR Processing (Days)']")
	WebElement grProcessingDaysField;

	@FindBy(xpath = "//input[@placeholder='Enter Batch Size']")
	WebElement batchSizeField;

	// Finance Tab
	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-edit-item-master/div[2]/div/div/div/form/div/div[2]/ul/li[11]/a")
	WebElement financeTab;

	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[1]")
	WebElement costCenterDropDown;
	@FindBy(xpath = "(//span[normalize-space()='TEST CostCenter'])[1]")
	WebElement costCenterDropDownDataSelect;

	@FindBy(xpath = "//input[@placeholder='Enter Std Cost']")
	WebElement stdCostField;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement costingMethodDropDown;
	@FindBy(xpath = "(//span[normalize-space()='TEST CostingMethod'])[1]")
	WebElement costingMethodDropDownDataSelect;

	@FindBy(xpath = "(//span)[62]")
	WebElement valuationToggleButton;

	@FindBy(xpath = "(//span)[63]")
	WebElement depreciationToggleButton;

	@FindBy(xpath = "(//span)[64]")
	WebElement pFOToggleButton;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement saveButton;

	public Item_Master_Edit_Page() {
		PageFactory.initElements(driver, this);
	}

	public HomePage itemMasterEdit(String description) throws Throwable {

		String actualText = headingText.getText();
		String expectedText = "Item Master";
		assertEquals(actualText, expectedText);

		Thread.sleep(2000);
		// 1Verifying that Description Text Field is Enabled or not
		click(driver, descriptionField1);
		isSelected(driver, descriptionField1, "descriptionField1");
		descriptionField1.clear();
		descriptionField1.clear();
		descriptionField1.sendKeys(description);

//		// verifying that ActiveStatus is displayed or hidden.
//		boolean isDisplayedActiveStatus = activeStatus.isDisplayed();
//		assertTrue(isDisplayedActiveStatus);
//		boolean isHiddenActiveStatus = !activeStatus.isDisplayed();
//		assertFalse(isHiddenActiveStatus);
//
//		// Verifying that ObsoluteToggleButton is enabled or not
//		boolean isEnabledObsoluteToggleButton = obsoluteToggleButton.isEnabled();
//		assertTrue(isEnabledObsoluteToggleButton);
//		boolean isDisabledObsoluteToggleButton = !obsoluteToggleButton.isEnabled();
//		assertFalse(isDisabledObsoluteToggleButton);
//
//		// verifying that ObsoluteToggleButton is displayed or hidden.
//		boolean isDisplayedObsoluteToggleButton = obsoluteToggleButton.isDisplayed();
//		assertTrue(isDisplayedObsoluteToggleButton);
//		boolean isHiddenObsoluteToggleButton = !obsoluteToggleButton.isDisplayed();
//		assertFalse(isHiddenObsoluteToggleButton);
//
//		// Verifying and Upload Photo in Grin Create
//		js.executeScript("arguments[0].click();", uploadPhoto);
//		robot.delay(2000);
//		StringSelection stringSelection1 = new StringSelection(
//				"search-ms:displayname=Search%20Results%20in%20Downloads&crumb=System.Generic.String%3Aimage&crumb=location:C%3A%5CUsers%5CW2191%5CDownloads\\image");
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection1, null);
//
//		// Press Enter to open the file dialog
//
//		robot.delay(2000);
//
//		// Press Ctrl+V to paste the file path
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_V);
//		robot.delay(2000);
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//		robot.keyRelease(KeyEvent.VK_V);
//
//		robot.delay(2000);
//		// Press Enter to confirm the file selection
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
//
//		// ###################### GeneralDescription ##############################
//
//		// Verifying that do we have proper Text heading.
//		String generalDescriptionactualText = generalDescriptionTab.getText();
//		String generalDescriptionExpectedText = "General Description";
//		assertEquals(generalDescriptionactualText, generalDescriptionExpectedText);
//
//		typeDropDown.click();
//		js.executeScript("arguments[0].click();", typeDropDownSelectData);
//
//		commodity.sendKeys(Keys.ENTER);
//		js.executeScript("arguments[0].click();", commodityDropDownSelectData);
//
//		materialGroupDropDown.sendKeys(Keys.ENTER);
//		js.executeScript("arguments[0].click();", materialGroupDropDownSelectData);
//
//		purchaseGroupDropDown.sendKeys(Keys.ENTER);
//		js.executeScript("arguments[0].click();", purchaseGroupDropDownSelectData);
//
//		departmentDropDown.sendKeys(Keys.ENTER);
//		js.executeScript("arguments[0].click();", departmentDropDownSelectData);
//
//		uOMDropDown.sendKeys(Keys.ENTER);
//
//		js.executeScript("arguments[0].click();", uomDropDownSelectData);
//
//		hSNDropDown.sendKeys(Keys.ENTER);
//		js.executeScript("arguments[0].click();", hSNDropDownSelectData);
//
//		js.executeScript("arguments[0].click();", prRequiredToggleButton);
//
//		js.executeScript("arguments[0].click();", openGRINToggleButton);
//
//		validFromDatePicker.sendKeys(Keys.ENTER);
//		validFromDatePicker.sendKeys(Keys.RIGHT);
//		validFromDatePicker.sendKeys(Keys.ENTER);
//
//		validToDatePicker.sendKeys(Keys.ENTER);
//		validToDatePicker.sendKeys(Keys.RIGHT);
//		validToDatePicker.sendKeys(Keys.ENTER);
//
//		// Alternatives Tab
//		alternativeTab.sendKeys(Keys.ENTER);
//
//		// 1Verifying that Alternative Part No Text Field is Enabled or not
//		boolean isEnabledAlternativePartNoField = alternatePartNoField.isEnabled();
//		assertTrue(isEnabledAlternativePartNoField);
//		boolean isDisabledAlternativePartNoFieldn = !alternatePartNoField.isEnabled();
//		assertFalse(isDisabledAlternativePartNoFieldn);
//
//		// Verifying that Alternative Text Field is displayed or hidden.
//		boolean isDisplayedAlternativePartNoField = alternatePartNoField.isDisplayed();
//		assertTrue(isDisplayedAlternativePartNoField);
//		boolean isHiddenAlternativePartNoField = !alternatePartNoField.isDisplayed();
//		assertFalse(isHiddenAlternativePartNoField);
//		alternatePartNoField.clear();
//		alternatePartNoField.sendKeys(alternativeNo);
//
////		sourceManufacturerRadioButton.click();
////		sourceCustomerRadioButton.click();
//
//		// 1Verifying that Alternative Part No Text Field is Enabled or not
//		boolean isEnabledCustomerNameField = manufacturerorCustomerField.isEnabled();
//		assertTrue(isEnabledCustomerNameField);
//		boolean isDisabledCustomerNameFieldn = !manufacturerorCustomerField.isEnabled();
//		assertFalse(isDisabledCustomerNameFieldn);
//
//		// Verifying that Description Text Field is displayed or hidden.
//		boolean isDisplayedCustomerNameField = manufacturerorCustomerField.isDisplayed();
//		assertTrue(isDisplayedCustomerNameField);
//		boolean isHiddenCustomerNameField = !manufacturerorCustomerField.isDisplayed();
//		assertFalse(isHiddenCustomerNameField);
//		manufacturerorCustomerField.clear();
//		manufacturerorCustomerField.sendKeys(manufacturerorCustomerName);
//
//		// Verifying the Placeholder which is present in Description text field.
//
//		defaultToggleButton.click();
//
//		// Verifying that Add button is Enabled or not
//
//		boolean isEnabledAdd = addAlternative.isEnabled();
//		assertTrue(isEnabledAdd);
//		boolean isDisabledAdd = !addAlternative.isEnabled();
//		assertFalse(isDisabledAdd);
//
//		// Verifying that Add button is displayed or hidden.
//		boolean isDisplayedAdd = addAlternative.isDisplayed();
//		assertTrue(isDisplayedAdd);
//		boolean isHiddenAdd = !addAlternative.isDisplayed();
//		assertFalse(isHiddenAdd);
//		addAlternative.click();
//
//		// Engineering
//		engineeringTab.sendKeys(Keys.ENTER);
//
//		// 1Verifying that drawingNo Text Field is Enabled or not
//		boolean isEnableddrawingNoField = drawingNoField.isEnabled();
//		assertTrue(isEnableddrawingNoField);
//		boolean isDisableddrawingNoFieldn = !drawingNoField.isEnabled();
//		assertFalse(isDisableddrawingNoFieldn);
//
//		// Verifying that drawingNo Field is displayed or hidden.
//		boolean isDisplayeddrawingNoField = drawingNoField.isDisplayed();
//		assertTrue(isDisplayeddrawingNoField);
//		boolean isHiddendrawingNoField = !drawingNoField.isDisplayed();
//		assertFalse(isHiddendrawingNoField);
//		drawingNoField.clear();
//		drawingNoField.sendKeys(drawingNo);
//
//		// 1Verifying that RevNo Text Field is Enabled or not
//		boolean isEnabledRevNoField = revNoField.isEnabled();
//		assertTrue(isEnabledRevNoField);
//		boolean isDisabledRevNoFieldn = !revNoField.isEnabled();
//		assertFalse(isDisabledRevNoFieldn);
//
//		// Verifying that RevNo Field is displayed or hidden.
//		boolean isDisplayedRevNoField = revNoField.isDisplayed();
//		assertTrue(isDisplayedRevNoField);
//		boolean isHiddenRevNoField = !revNoField.isDisplayed();
//		assertFalse(isHiddenRevNoField);
//		revNoField.clear();
//		revNoField.sendKeys(revNo);
//
//		// Verifying the Placeholder which is present in RevNo field.
//		String displayedTextInRevNo = revNoField.getAttribute("placeholder");
//
//		String expected_placeholderRevNo = "Enter Rev No";
//
//		assertEquals(displayedTextInRevNo, expected_placeholderRevNo);
//		// 1Verifying that EnterDocRet Text Field is Enabled or not
//		boolean isEnabledEnterDocRetField = docRetField.isEnabled();
//		assertTrue(isEnabledEnterDocRetField);
//		boolean isDisabledEnterDocRetFieldn = !docRetField.isEnabled();
//		assertFalse(isDisabledEnterDocRetFieldn);
//
//		// Verifying that EnterDocRet Field is displayed or hidden.
//		boolean isDisplayedEnterDocRetField = docRetField.isDisplayed();
//		assertTrue(isDisplayedEnterDocRetField);
//		boolean isHiddenEnterDocRetField = !docRetField.isDisplayed();
//		assertFalse(isHiddenEnterDocRetField);
//		docRetField.clear();
//		docRetField.sendKeys(docRet);
//
//		cocToggleButton.click();
//
//		rOHSToggleButton.click();
//
//		selfLifeToggleButton.click();
//
//		rEACHToggleButton.click();
//
////  	click(driver, filesUpload1);
//
////		uploadFile(driver, filesUpload, 1);
//
//		// Dimensions Tab
//		dimensionsTab.sendKeys(Keys.ENTER);
//
//		// 1Verifying that NetWeight Text Field is Enabled or not
//		boolean isEnabledNetWeightField = netWeightField.isEnabled();
//		assertTrue(isEnabledNetWeightField);
//		boolean isDisabledNetWeightFieldn = !netWeightField.isEnabled();
//		assertFalse(isDisabledNetWeightFieldn);
//
//		// Verifying that NetWeight Field is displayed or hidden.
//		boolean isDisplayedNetWeightField = netWeightField.isDisplayed();
//		assertTrue(isDisplayedNetWeightField);
//		boolean isHiddenNetWeightField = !netWeightField.isDisplayed();
//		assertFalse(isHiddenNetWeightField);
//
//		// Verifying the Placeholder which is present in NetWeight field.
//		String displayedTextInNetWeight = netWeightField.getAttribute("placeholder");
//
//		String expected_placeholderNetWeight = "Enter Net Weight";
//
//		assertEquals(displayedTextInNetWeight, expected_placeholderNetWeight);
//		netWeightField.clear();
//		netWeightField.sendKeys(netWeight);
//
//		// 1Verifying that GrossWeight Text Field is Enabled or not
//		boolean isEnabledGrossWeightField = grossWeightField.isEnabled();
//		assertTrue(isEnabledGrossWeightField);
//		boolean isDisabledGrossWeightFieldn = !grossWeightField.isEnabled();
//		assertFalse(isDisabledGrossWeightFieldn);
//
//		// Verifying that GrossWeight Field is displayed or hidden.
//		boolean isDisplayedGrossWeightField = grossWeightField.isDisplayed();
//		assertTrue(isDisplayedGrossWeightField);
//		boolean isHiddenGrossWeightField = !grossWeightField.isDisplayed();
//		assertFalse(isHiddenGrossWeightField);
//
//		// Verifying the Placeholder which is present in GrossWeight field.
//		String displayedTextInGrossWeight = grossWeightField.getAttribute("placeholder");
//
//		String expected_placeholderGrossWeight = "Enter Gross Weight";
//
//		assertEquals(displayedTextInGrossWeight, expected_placeholderGrossWeight);
//		grossWeightField.clear();
//		grossWeightField.sendKeys(grossWeight);
//
//		// 1Verifying that Volume Text Field is Enabled or not
//		boolean isEnabledVolumeField = volumeField.isEnabled();
//		assertTrue(isEnabledVolumeField);
//		boolean isDisabledVolumeFieldn = !volumeField.isEnabled();
//		assertFalse(isDisabledVolumeFieldn);
//
//		// Verifying that Volume Field is displayed or hidden.
//		boolean isDisplayedVolumeField = volumeField.isDisplayed();
//		assertTrue(isDisplayedVolumeField);
//		boolean isHiddenVolumeField = !volumeField.isDisplayed();
//		assertFalse(isHiddenVolumeField);
//		volumeField.clear();
//		volumeField.sendKeys(volume);
//
//		// 1Verifying that Size Text Field is Enabled or not
//		boolean isEnabledSizeField = sizeField.isEnabled();
//		assertTrue(isEnabledSizeField);
//		boolean isDisabledSizeFieldn = !sizeField.isEnabled();
//		assertFalse(isDisabledSizeFieldn);
//
//		// Verifying that Size Field is displayed or hidden.
//		boolean isDisplayedSizeField = sizeField.isDisplayed();
//		assertTrue(isDisplayedSizeField);
//		boolean isHiddenSizeField = !sizeField.isDisplayed();
//		assertFalse(isHiddenSizeField);
//		sizeField.clear();
//		sizeField.sendKeys(size);
//
//		// 1Verifying that FootPrint Text Field is Enabled or not
//		boolean isEnabledFootPrintField = footPrintField.isEnabled();
//		assertTrue(isEnabledFootPrintField);
//		boolean isDisabledFootPrintFieldn = !footPrintField.isEnabled();
//		assertFalse(isDisabledFootPrintFieldn);
//
//		// Verifying that FootPrint Field is displayed or hidden.
//		boolean isDisplayedFootPrintField = footPrintField.isDisplayed();
//		assertTrue(isDisplayedFootPrintField);
//		boolean isHiddenFootPrintField = !footPrintField.isDisplayed();
//		assertFalse(isHiddenFootPrintField);
//
//		footPrintField.clear();
//		footPrintField.sendKeys(footPrint);
//
//		click(driver, uOMDropdown1);
//		click(driver, uOMDropdown1SelectData);
//
//		click(driver, uOMDropdown2);
//		click(driver, uOMDropdown2SelectData);
//
//		click(driver, uOMDropdown3);
//		click(driver, uOMDropdown3SelectData);
//
//		// Routing
//		click(driver, routingTab);
//
//		click(driver, processStepField);
//		processStepField.sendKeys(processStep);
//		// 1Verifying that Process Step Text Field is Enabled or not
//		boolean isEnabledProcessStepField = processStepField.isEnabled();
//		assertTrue(isEnabledProcessStepField);
//		boolean isDisabledProcessStepFieldn = !processStepField.isEnabled();
//		assertFalse(isDisabledProcessStepFieldn);
//
//		// Verifying that Process Step Field is displayed or hidden.
//		boolean isDisplayedProcessStepField = processStepField.isDisplayed();
//		assertTrue(isDisplayedProcessStepField);
//		boolean isHiddenProcessStepField = !processStepField.isDisplayed();
//		assertFalse(isHiddenProcessStepField);
//
//		processDropDown.click();
//		processDropDownSelectData.click();
//
//		descriptionField.sendKeys(descriptinRouting);
//		// 1Verifying that DescriptionRouting Text Field is Enabled or not
//		boolean isEnabledDescriptionRoutingField = descriptionField.isEnabled();
//		assertTrue(isEnabledDescriptionRoutingField);
//		boolean isDisabledDescriptionRoutingFieldn = !descriptionField.isEnabled();
//		assertFalse(isDisabledDescriptionRoutingFieldn);
//
//		// Verifying that DescriptionRouting Field is displayed or hidden.
//		boolean isDisplayedDescriptionRoutingField = descriptionField.isDisplayed();
//		assertTrue(isDisplayedDescriptionRoutingField);
//		boolean isHiddenDescriptionRoutingField = !descriptionField.isDisplayed();
//		assertFalse(isHiddenDescriptionRoutingField);
//
//		machineHoursField.sendKeys(machinHrs);
//		// 1Verifying that MachineHours Text Field is Enabled or not
//		boolean isEnabledMachineHoursField = machineHoursField.isEnabled();
//		assertTrue(isEnabledMachineHoursField);
//		boolean isDisabledMachineHoursFieldn = !machineHoursField.isEnabled();
//		assertFalse(isDisabledMachineHoursFieldn);
//
//		// Verifying that MachineHours Field is displayed or hidden.
//		boolean isDisplayedMachineHoursField = machineHoursField.isDisplayed();
//		assertTrue(isDisplayedMachineHoursField);
//		boolean isHiddenMachineHoursField = !machineHoursField.isDisplayed();
//		assertFalse(isHiddenMachineHoursField);
//
//		labourHoursField.sendKeys(labourHrs);
//		// 1Verifying that LaborHours Text Field is Enabled or not
//		boolean isEnabledLaborHoursField = labourHoursField.isEnabled();
//		assertTrue(isEnabledLaborHoursField);
//		boolean isDisabledLaborHoursFieldn = !labourHoursField.isEnabled();
//		assertFalse(isDisabledLaborHoursFieldn);
//
//		// Verifying that LaborHours Field is displayed or hidden.
//		boolean isDisplayedLaborHoursField = labourHoursField.isDisplayed();
//		assertTrue(isDisplayedLaborHoursField);
//		boolean isHiddenLaborHoursField = !labourHoursField.isDisplayed();
//		assertFalse(isHiddenLaborHoursField);
//
//		activeToggleButtoninRouting.click();
//		activeToggleButtoninRouting.click();
//
//		addRoutingButton.click();
//
//		// ApprovedVenderList
//
//		click(driver, approvedVenderListTab);
//
//		click(driver, approvedVenderTable);
//
//		click(driver, vendorCodeDropDown);
//
//		click(driver, vendorCodeDropDownDataSelect);
//
//		click(driver, venderNameDropDown);
//
//		click(driver, venderNameDropDownDataSelect);
//
//		click(driver, shareOFBusinessField);
//
//		shareOFBusinessField.clear();
//		shareOFBusinessField.sendKeys(shareofBusiness);
//		// 1Verifying that ShareOFBusiness Text Field is Enabled or not
//		boolean isEnabledShareOFBusinessField = shareOFBusinessField.isEnabled();
//		assertTrue(isEnabledShareOFBusinessField);
//		boolean isDisabledShareOFBusinessFieldn = !shareOFBusinessField.isEnabled();
//		assertFalse(isDisabledShareOFBusinessFieldn);
//
//		// Verifying that ShareOFBusiness Field is displayed or hidden.
//		boolean isDisplayedShareOFBusinessField = shareOFBusinessField.isDisplayed();
//		assertTrue(isDisplayedShareOFBusinessField);
//		boolean isHiddenShareOFBusinessField = !shareOFBusinessField.isDisplayed();
//		assertFalse(isHiddenShareOFBusinessField);
//
//		// Verifying the Placeholder which is present in ShareOFBusiness field.
//		String displayedTextInShareOFBusiness = shareOFBusinessField.getAttribute("placeholder");
//
//		String expected_placeholderShareOFBusiness = "Enter Share of Business";
//
//		assertEquals(displayedTextInShareOFBusiness, expected_placeholderShareOFBusiness);
//
//		click(driver, updateApprovedVender);
//
//		// Planning
//		planningTab.click();
//
//		// 1Verifying that Min Text Field is Enabled or not
//		boolean isEnabledMinField = minField.isEnabled();
//		assertTrue(isEnabledMinField);
//		boolean isDisabledMinFieldn = !minField.isEnabled();
//		assertFalse(isDisabledMinFieldn);
//
//		// Verifying that Min Field is displayed or hidden.
//		boolean isDisplayedMinField = minField.isDisplayed();
//		assertTrue(isDisplayedMinField);
//		boolean isHiddenMinField = !minField.isDisplayed();
//		assertFalse(isHiddenMinField);
//		minField.clear();
//		minField.sendKeys(min);
//
//		// 1Verifying that Max Text Field is Enabled or not
//		boolean isEnabledMaxField = maxField.isEnabled();
//		assertTrue(isEnabledMaxField);
//		boolean isDisabledMaxFieldn = !maxField.isEnabled();
//		assertFalse(isDisabledMaxFieldn);
//
//		// Verifying that Max Field is displayed or hidden.
//		boolean isDisplayedMaxField = maxField.isDisplayed();
//		assertTrue(isDisplayedMaxField);
//		boolean isHiddenMaxField = !maxField.isDisplayed();
//		assertFalse(isHiddenMaxField);
//		maxField.clear();
//		maxField.sendKeys(max);
//
//		int MinfieldHeightSize = minField.getSize().getHeight();
//		int MinfieldWidthSize = minField.getSize().getWidth();
//
//		int MaxfieldHeightSize = maxField.getSize().getHeight();
//		int MaxfieldWidthSize = maxField.getSize().getWidth();
//
//		assertEquals(MinfieldHeightSize, MaxfieldHeightSize);
//		assertEquals(MaxfieldWidthSize, MinfieldWidthSize);
//		;
//
//		// 1Verifying that ReOrder Text Field is Enabled or not
//		boolean isEnabledReOrderField = reOrderField.isEnabled();
//		assertTrue(isEnabledReOrderField);
//		boolean isDisabledReOrderFieldn = !reOrderField.isEnabled();
//		assertFalse(isDisabledReOrderFieldn);
//
//		// Verifying that ReOrder Field is displayed or hidden.
//		boolean isDisplayedReOrderField = reOrderField.isDisplayed();
//		assertTrue(isDisplayedReOrderField);
//		boolean isHiddenReOrderField = !reOrderField.isDisplayed();
//		assertFalse(isHiddenReOrderField);
//		reOrderField.clear();
//		reOrderField.sendKeys(reOrder);
//
//		// 1Verifying that Bin Text Field is Enabled or not
//		boolean isEnabledBinField = twoBinField.isEnabled();
//		assertTrue(isEnabledBinField);
//		boolean isDisabledBinFieldn = !twoBinField.isEnabled();
//		assertFalse(isDisabledBinFieldn);
//
//		// Verifying that Bin Field is displayed or hidden.
//		boolean isDisplayedBinField = twoBinField.isDisplayed();
//		assertTrue(isDisplayedBinField);
//		boolean isHiddenBinField = !twoBinField.isDisplayed();
//		assertFalse(isHiddenBinField);
//		twoBinField.clear();
//		twoBinField.sendKeys(twoBin);
//
//		int ReorderfieldHeightSize = reOrderField.getSize().getHeight();
//		int ReorderfieldWidthSize = reOrderField.getSize().getWidth();
//
//		int BinfieldHeightSize = twoBinField.getSize().getHeight();
//		int BinfieldWidthSize = twoBinField.getSize().getWidth();
//
//		assertEquals(ReorderfieldHeightSize, BinfieldHeightSize);
//		assertEquals(ReorderfieldWidthSize, BinfieldWidthSize);
//		;
//
//		// 1Verifying that LeadTime Text Field is Enabled or not
//		boolean isEnabledLeadTimeField = leadTimeField.isEnabled();
//		assertTrue(isEnabledLeadTimeField);
//		boolean isDisabledLeadTimeFieldn = !leadTimeField.isEnabled();
//		assertFalse(isDisabledLeadTimeFieldn);
//
//		// Verifying that LeadTime Field is displayed or hidden.
//		boolean isDisplayedLeadTimeField = leadTimeField.isDisplayed();
//		assertTrue(isDisplayedLeadTimeField);
//		boolean isHiddenLeadTimeField = !leadTimeField.isDisplayed();
//		assertFalse(isHiddenLeadTimeField);
//		leadTimeField.clear();
//		leadTimeField.sendKeys(leadTime);
//
//		kanbanToggleButton.click();
//
//		// Warehouse
//		wareHouseTab.click();
//
////		addWarehouseButton.click();
//
//		eSDToggleButtoninWarehouse.click();
//		// Verifying that ESDToggleButton is enabled or not
//		boolean isEnabledESDToggleButton = eSDToggleButtoninWarehouse.isEnabled();
//		assertTrue(isEnabledESDToggleButton);
//		boolean isDisabledESDToggleButton = !eSDToggleButtoninWarehouse.isEnabled();
//		assertFalse(isDisabledESDToggleButton);
//
//		// verifying that ESDToggleButton is displayed or hidden.
//		boolean isDisplayedESDToggleButton = eSDToggleButtoninWarehouse.isDisplayed();
//		assertTrue(isDisplayedESDToggleButton);
//		boolean isHiddenESDToggleButton = !eSDToggleButtoninWarehouse.isDisplayed();
//		assertFalse(isHiddenESDToggleButton);
//
//		cycleCountToggleButtoninWarehouse.click();
//		// Verifying that CycleCountToggleButton is enabled or not
//		boolean isEnabledCycleCountToggleButton = cycleCountToggleButtoninWarehouse.isEnabled();
//		assertTrue(isEnabledCycleCountToggleButton);
//		boolean isDisabledCycleCountToggleButton = !cycleCountToggleButtoninWarehouse.isEnabled();
//		assertFalse(isDisabledCycleCountToggleButton);
//
//		// verifying that CycleCountToggleButton is displayed or hidden.
//		boolean isDisplayedCycleCountToggleButton = cycleCountToggleButtoninWarehouse.isDisplayed();
//		assertTrue(isDisplayedCycleCountToggleButton);
//		boolean isHiddenCycleCountToggleButton = !cycleCountToggleButtoninWarehouse.isDisplayed();
//		assertFalse(isHiddenCycleCountToggleButton);
//
//		// verifying that LIFOToggleButton is displayed or hidden.
//		boolean isDisplayedLIFOToggleButton = lIFOToggleButtoninWarehouse.isDisplayed();
//		assertTrue(isDisplayedLIFOToggleButton);
//		boolean isHiddenLIFOToggleButton = !lIFOToggleButtoninWarehouse.isDisplayed();
//		assertFalse(isHiddenLIFOToggleButton);
//
//		// 1Verifying that ExpiryDays Text Field is Enabled or not
//		boolean isEnabledExpiryDaysField = expiryDaysField.isEnabled();
//		assertTrue(isEnabledExpiryDaysField);
//		boolean isDisabledExpiryDaysFieldn = !expiryDaysField.isEnabled();
//		assertFalse(isDisabledExpiryDaysFieldn);
//
//		// Verifying that ExpiryDays Field is displayed or hidden.
//		boolean isDisplayedExpiryDaysField = expiryDaysField.isDisplayed();
//		assertTrue(isDisplayedExpiryDaysField);
//		boolean isHiddenExpiryDaysField = !expiryDaysField.isDisplayed();
//		assertFalse(isHiddenExpiryDaysField);
//		expiryDaysField.clear();
//		expiryDaysField.sendKeys(expiryDays);
//
//		inspectionIntDaysField.sendKeys(inspectionIntDays);
//
//		// 1Verifying that InspectionIntDays Text Field is Enabled or not
//		boolean isEnabledInspectionIntDaysField = inspectionIntDaysField.isEnabled();
//		assertTrue(isEnabledInspectionIntDaysField);
//		boolean isDisabledInspectionIntDaysFieldn = !inspectionIntDaysField.isEnabled();
//		assertFalse(isDisabledInspectionIntDaysFieldn);
//
//		// Verifying that InspectionIntDays Field is displayed or hidden.
//		boolean isDisplayedInspectionIntDaysField = inspectionIntDaysField.isDisplayed();
//		assertTrue(isDisplayedInspectionIntDaysField);
//		boolean isHiddenInspectionIntDaysField = !inspectionIntDaysField.isDisplayed();
//		assertFalse(isHiddenInspectionIntDaysField);
//
//		specialInstructionsField.sendKeys(specialInstructions);
//
//		// 1Verifying that SpecialInstructions Text Field is Enabled or not
//		boolean isEnabledSpecialInstructionsField = specialInstructionsField.isEnabled();
//		assertTrue(isEnabledSpecialInstructionsField);
//		boolean isDisabledSpecialInstructionsFieldn = !specialInstructionsField.isEnabled();
//		assertFalse(isDisabledSpecialInstructionsFieldn);
//
//		// Verifying that SpecialInstructions Field is displayed or hidden.
//		boolean isDisplayedSpecialInstructionsField = specialInstructionsField.isDisplayed();
//		assertTrue(isDisplayedSpecialInstructionsField);
//		boolean isHiddenSpecialInstructionsField = !specialInstructionsField.isDisplayed();
//		assertFalse(isHiddenSpecialInstructionsField);
//
//		// Shipping
//		click(driver, shippingTab);
//
//		// 1Verifying that Instructions Text Field is Enabled or not
//		boolean isEnabledInstructionsField = instructionsField.isEnabled();
//		assertTrue(isEnabledInstructionsField);
//		boolean isDisabledInstructionsFieldn = !instructionsField.isEnabled();
//		assertFalse(isDisabledInstructionsFieldn);
//
//		// Verifying that Instructions Field is displayed or hidden.
//		boolean isDisplayedInstructionsField = instructionsField.isDisplayed();
//		assertTrue(isDisplayedInstructionsField);
//		boolean isHiddenInstructionsField = !instructionsField.isDisplayed();
//		assertFalse(isHiddenInstructionsField);
//		instructionsField.clear();
//		instructionsField.sendKeys(instructions);
//
//		// Quality
////		WebElement Quality = driver.findElement(By.xpath("/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/ul/li[10]/a"));
//
//		qualityTab.click();
//
//		iqcToggleButton.click();
//
//		// Verifying that IQCToggleButton is enabled or not
//		boolean isEnabledIQCToggleButton = iqcToggleButton.isEnabled();
//		assertTrue(isEnabledIQCToggleButton);
//		boolean isDisabledIQCToggleButton = !iqcToggleButton.isEnabled();
//		assertFalse(isDisabledIQCToggleButton);
//
//		// verifying that IQCToggleButton is displayed or hidden.
//		boolean isDisplayedIQCToggleButton = iqcToggleButton.isDisplayed();
//		assertTrue(isDisplayedIQCToggleButton);
//		boolean isHiddenIQCToggleButton = !iqcToggleButton.isDisplayed();
//		assertFalse(isHiddenIQCToggleButton);
//
//		// 1Verifying that GRProcessing Text Field is Enabled or not
//		boolean isEnabledGRProcessingField = grProcessingDaysField.isEnabled();
//		assertTrue(isEnabledGRProcessingField);
//		boolean isDisabledGRProcessingFieldn = !grProcessingDaysField.isEnabled();
//		assertFalse(isDisabledGRProcessingFieldn);
//
//		// Verifying that GRProcessing Field is displayed or hidden.
//		boolean isDisplayedGRProcessingField = grProcessingDaysField.isDisplayed();
//		assertTrue(isDisplayedGRProcessingField);
//		boolean isHiddenGRProcessingField = !grProcessingDaysField.isDisplayed();
//		assertFalse(isHiddenGRProcessingField);
//		grProcessingDaysField.clear();
//		grProcessingDaysField.sendKeys(grProcess);
//
//		// Verifying the Placeholder which is present in GRProcessing field.
//		String displayedTextInGRProcessing = grProcessingDaysField.getAttribute("placeholder");
//
//		String expected_placeholderGRProcessing = "Enter GR Processing (Days)";
//
//		assertEquals(displayedTextInGRProcessing, expected_placeholderGRProcessing);
//
////		WebElement BatchSize = driver.findElement(By.xpath("//input[@placeholder='Enter Batch Size']"));
//
//		// 1Verifying that BatchSize Text Field is Enabled or not
//		boolean isEnabledBatchSizeField = batchSizeField.isEnabled();
//		assertTrue(isEnabledBatchSizeField);
//		boolean isDisabledBatchSizeFieldn = !batchSizeField.isEnabled();
//		assertFalse(isDisabledBatchSizeFieldn);
//
//		// Verifying that BatchSize Field is displayed or hidden.
//		boolean isDisplayedBatchSizeField = batchSizeField.isDisplayed();
//		assertTrue(isDisplayedBatchSizeField);
//		boolean isHiddenBatchSizeField = !batchSizeField.isDisplayed();
//		assertFalse(isHiddenBatchSizeField);
//		batchSizeField.clear();
//		batchSizeField.sendKeys(batchSize);
//
//		// Costing
//		financeTab.click();
//
//		costCenterDropDown.click();
//		js.executeScript("arguments[0].click();", costCenterDropDownDataSelect);
//
//		// 1Verifying that StdCost Text Field is Enabled or not
//		boolean isEnabledStdCostField = stdCostField.isEnabled();
//		assertTrue(isEnabledStdCostField);
//		boolean isDisabledStdCostFieldn = !stdCostField.isEnabled();
//		assertFalse(isDisabledStdCostFieldn);
//
//		// Verifying that StdCost Field is displayed or hidden.
//		boolean isDisplayedStdCostField = stdCostField.isDisplayed();
//		assertTrue(isDisplayedStdCostField);
//		boolean isHiddenStdCostField = !stdCostField.isDisplayed();
//		assertFalse(isHiddenStdCostField);
//		stdCostField.clear();
//		stdCostField.sendKeys(stdCost);
//
//		click(driver, costingMethodDropDown);
//		click(driver, costingMethodDropDownDataSelect);
//
//		valuationToggleButton.click();
//
//		// Verifying that ValuationToggleButton is enabled or not
//		boolean isEnabledValuationToggleButton = valuationToggleButton.isEnabled();
//		assertTrue(isEnabledValuationToggleButton);
//		boolean isDisabledValuationToggleButton = !valuationToggleButton.isEnabled();
//		assertFalse(isDisabledValuationToggleButton);
//
//		// verifying that ValuationToggleButton is displayed or hidden.
//		boolean isDisplayedValuationToggleButton = valuationToggleButton.isDisplayed();
//		assertTrue(isDisplayedValuationToggleButton);
//		boolean isHiddenValuationToggleButton = !valuationToggleButton.isDisplayed();
//		assertFalse(isHiddenValuationToggleButton);
//
//		depreciationToggleButton.click();
//
//		// Verifying that DepreciationToggleButton is enabled or not
//		boolean isEnabledDepreciationToggleButton = depreciationToggleButton.isEnabled();
//		assertTrue(isEnabledDepreciationToggleButton);
//		boolean isDisabledDepreciationToggleButton = !depreciationToggleButton.isEnabled();
//		assertFalse(isDisabledDepreciationToggleButton);
//
//		// verifying that DepreciationToggleButton is displayed or hidden.
//		boolean isDisplayedDepreciationToggleButton = depreciationToggleButton.isDisplayed();
//		assertTrue(isDisplayedDepreciationToggleButton);
//		boolean isHiddenDepreciationToggleButton = !depreciationToggleButton.isDisplayed();
//		assertFalse(isHiddenDepreciationToggleButton);
//
//		pFOToggleButton.click();
//
//		// Verifying that PFOToggleButton is enabled or not
//		boolean isEnabledPFOToggleButton = pFOToggleButton.isEnabled();
//		assertTrue(isEnabledPFOToggleButton);
//		boolean isDisabledPFOToggleButton = !pFOToggleButton.isEnabled();
//		assertFalse(isDisabledPFOToggleButton);
//
//		// verifying that PFOToggleButton is displayed or hidden.
//		boolean isDisplayedPFOToggleButton = pFOToggleButton.isDisplayed();
//		assertTrue(isDisplayedPFOToggleButton);
//		boolean isHiddenPFOToggleButton = !pFOToggleButton.isDisplayed();
//		assertFalse(isHiddenPFOToggleButton);
//
//		String beforeSaveButton = driver.getCurrentUrl();
//		System.out.println(beforeSaveButton + "\n");

		saveButton.click();

		Thread.sleep(3000);
		String afterSaveButton = driver.getCurrentUrl();
		System.out.println(afterSaveButton + "\n");

//		assertNotEquals(beforeSaveButton, afterSaveButton, "URLs are the same"); 
		return new HomePage();
	}
}
