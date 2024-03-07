package com.Getapcs.Trans.Engineering;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Trans.BASECLASS.TestBase;
import com.Getapcs.Trans.HomeLogin.HomePage;

public class Item_Master_Create_Page extends TestBase {

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

	@FindBy(xpath = "//input[@formcontrolname='photo']")
	WebElement uploadPhoto;

	// General Description

//	@FindBy(xpath = "(//a[normalize-space()='General Description'])[1]")
//	WebElement generalDescriptionTab;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement typeDropDown;
	@FindBy(xpath = "//span[normalize-space()='FG']")
	WebElement typeDropDownSelectData;
	@FindBy(xpath = "(//span[normalize-space()='PurchasePart'])[1]")
	WebElement typeDropDownSelectData1;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement commodity;
	@FindBy(xpath = "(//span[normalize-space()='TEST Commodity'])[1]")
	WebElement commodityDropDownSelectData;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement materialGroupDropDown;
	@FindBy(xpath = "(//span[normalize-space()='TEST MaterialType'])[1]")
	WebElement materialGroupDropDownSelectData;

	@FindBy(xpath = "(//input[@type='text'])[7]")
	WebElement purchaseGroupDropDown;
	@FindBy(xpath = "(//span[normalize-space()='TEST Purchase_Group'])[1]")
	WebElement purchaseGroupDropDownSelectData;

	@FindBy(xpath = "(//input[@type='text'])[8]")
	WebElement departmentDropDown;
	@FindBy(xpath = "(//span[normalize-space()='TEST Department'])[1]")
	WebElement departmentDropDownSelectData;
	//
	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement uOMDropDown;
	@FindBy(xpath = "(//span[normalize-space()='TEST UOM'])[1]")
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

	@FindBy(xpath = "(//select[@formcontrolname='poMaterialType'])[1]")
	WebElement poMaterialType;

	@FindBy(xpath = "(//option[@value='Direct'])[1]")
	WebElement poMaterialTypeSelect;

	// Alternative Tab

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/ul/li[2]/a")
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
	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/ul/li[3]/a")
	WebElement engineeringTab;

	@FindBy(xpath = "//input[@placeholder='Enter Drawing No']")
	WebElement drawingNoField;

	@FindBy(xpath = "//input[@placeholder='Enter Rev No']")
	WebElement revNoField;

	@FindBy(xpath = "//input[@placeholder='Enter Doc Ret']")
	WebElement docRetField;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/div/div/div[3]/div[1]/label[2]/span")
	WebElement cocToggleButton;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/div/div/div[3]/div[2]/label[2]/span")
	WebElement rOHSToggleButton;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/div/div/div[4]/div[1]/label[2]/span")
	WebElement selfLifeToggleButton;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/div/div/div[4]/div[2]/label[2]/span")
	WebElement rEACHToggleButton;

	@FindBy(xpath = "(//input[@placeholder='Enter Remarks To Vendor'])[1]")
	WebElement remarkField;

	// Dimensions Tab
	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/ul/li[4]/a")
	WebElement dimensionsTab;

	@FindBy(xpath = "(//input[@placeholder='Upload file'])[1]")
	WebElement filesUpload;

	@FindBy(xpath = "(//button[@title='Uploaded Files'])[1]")
	WebElement uploadButton;

//	@FindBy(xpath = "(//input[@placeholder='Please Upload files.'])[1]")
//	WebElement filesUpload;

	@FindBy(xpath = "(//button[normalize-space()='Save Files'])[1]")
	WebElement Savefiles;

	@FindBy(xpath = "(//button[normalize-space()='View Files'])[1]")
	WebElement viewFiles;

	@FindBy(xpath = "(//button[normalize-space()='Close'])[1]")
	WebElement closeViewFiles;

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
	@FindBy(xpath = "(//span[normalize-space()='M'])[1]")
	WebElement uOMDropdown1SelectData;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement uOMDropdown2;
	@FindBy(xpath = "(//span[normalize-space()='ML'])[1]")
	WebElement uOMDropdown2SelectData;

	@FindBy(xpath = "(//input[@type='text'])[7]")
	WebElement uOMDropdown3;
	@FindBy(xpath = "(//span[normalize-space()='G'])[1]")
	WebElement uOMDropdown3SelectData;

	// Routing Tab
	@FindBy(xpath = "(//a[normalize-space()='Routing'])[1]")
	WebElement routingTab;

	@FindBy(xpath = "//input[@placeholder='Enter Process Step']")
	WebElement processStepField;

	@FindBy(xpath = "//input[@aria-autocomplete='list']")
	WebElement processDropDown;
	@FindBy(xpath = "(//div[normalize-space()='TEST Process'])[1]")
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
	@FindBy(xpath = "(//a[normalize-space()='Approved Vendor List'])[1]")
	WebElement approvedVenderListTab;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement vendorCodeDropDown;
	@FindBy(xpath = "(//span[normalize-space()='VID0004'])[1]")
	WebElement vendorCodeDropDownDataSelect;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement venderNameDropDown;
	@FindBy(xpath = "(//span[normalize-space()='Real Time Quality Management Services'])[1]")
	WebElement venderNameDropDownDataSelect;

	@FindBy(xpath = "//input[@placeholder='Enter Share of Business']")
	WebElement shareOFBusinessField;

	@FindBy(xpath = "//button[normalize-space()='Add']")
	WebElement addApprovedVenderList;

	// Planning Tab
	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/ul/li[7]/a")
	WebElement planningTab;

	@FindBy(xpath = "(//input[@placeholder='Enter MIN'])[1]")
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
	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/ul/li[8]/a")
	WebElement wareHouseTab;

	@FindBy(xpath = "//input[@aria-autocomplete='list']")
	WebElement wareHouseDropDown;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/div/div/div[1]/div/div[1]/ng-select/ng-dropdown-panel/div/div[2]/div[1]")
	WebElement wareHouseDropDownDataSelect;

	@FindBy(xpath = "(//span[@class='slider round'])[3]")
	WebElement activeToggleButtoninWarehouse;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/div/div/div[2]/div/button")
	WebElement addWarehouseButton;

	@FindBy(xpath = "(//span[@class='slider round'])[4]")
	WebElement eSDToggleButtoninWarehouse;

	@FindBy(xpath = "(//span[@class='slider round'])[6]")
	WebElement cycleCountToggleButtoninWarehouse;

	@FindBy(xpath = "(//span[@class='slider round'])[8]")
	WebElement hazardousMaterialToggleButtoninWarehouse;

	@FindBy(xpath = "(//span)[61]")
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
	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/ul/li[9]/a")
	WebElement shippingTab;

	@FindBy(xpath = "//textarea[@placeholder='Enter Instructions']")
	WebElement instructionsField;

	// Quality Tab
	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/ul/li[10]/a")
	WebElement qualityTab;

	@FindBy(xpath = "(//span[@class='slider round'])[3]")
	WebElement iqcToggleButton;

	@FindBy(xpath = "//input[@placeholder='Enter GR Processing (Days)']")
	WebElement grProcessingDaysField;

	@FindBy(xpath = "//input[@placeholder='Enter Batch Size']")
	WebElement batchSizeField;

	// Finance Tab
	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/ul/li[11]/a")
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

	@FindBy(xpath = "//body[1]/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-create-item-master[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/label[2]/span[1]")
	WebElement valuationToggleButton;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/div/div/div[5]/div/label[2]/span")
	WebElement depreciationToggleButton;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/div/div/div[6]/div/label[2]/span")
	WebElement pFOToggleButton;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement saveButton;

	public Item_Master_Create_Page() {
		PageFactory.initElements(driver, this);
	}

	public HomePage itemMasterCreate(String itemNo, String description, String alternativeNo,
			String manufacturerorCustomerName, String drawingNo, String revNo, String docRet, String netWeight,
			String grossWeight, String volume, String size, String footPrint, String processStep,
			String descriptinRouting, String machinHrs, String labourHrs, String shareofBusiness, String min,
			String max, String reOrder, String twoBin, String leadTime, String expiryDays, String inspectionIntDays,
			String specialInstructions, String instructions, String grProcess, String batchSize, String stdCost)
			throws Throwable {

		String actualText = headingText.getText();
		String expectedText = "Item Master";
		assertEquals(actualText, expectedText);

		click(driver, itemNumber);
		isSelected(driver, itemNumber, "itemNumber");
		descriptionField1.clear();
		itemNumber.sendKeys(itemNo);

		click(driver, descriptionField1);
		isSelected(driver, descriptionField1, "descriptionField1");
		descriptionField1.clear();
		descriptionField1.sendKeys(description);

		uploadFile(driver, uploadPhoto, 0);

		// ###################### GeneralDescription ##############################

		// Verifying that do we have proper Text heading.
//		String generalDescriptionactualText = generalDescriptionTab.getText();
//		String generalDescriptionExpectedText = "General Description";
//		assertEquals(generalDescriptionactualText, generalDescriptionExpectedText);

		click(driver, typeDropDown);
		click(driver, typeDropDownSelectData);

		click(driver, commodity);
		click(driver, commodityDropDownSelectData);

		click(driver, materialGroupDropDown);
		click(driver, materialGroupDropDownSelectData);

		click(driver, purchaseGroupDropDown);
		click(driver, purchaseGroupDropDownSelectData);

		click(driver, departmentDropDown);
		click(driver, departmentDropDownSelectData);

		click(driver, uOMDropDown);
		click(driver, uomDropDownSelectData);

		click(driver, hSNDropDown);
		isSelected(driver, hSNDropDown, "hSNDropDown");
		click(driver, hSNDropDownSelectData);

		click(driver, prRequiredToggleButton);

		click(driver, openGRINToggleButton);

		selectPreviousDate(driver, validFromDatePicker, 5);
		datePicker(driver, validToDatePicker);

		click(driver, poMaterialType);

		click(driver, poMaterialTypeSelect);

		// Alternatives Tab
		click(driver, alternativeTab);

		// 1Verifying that Alternative Part No Text Field is Enabled or not
		click(driver, alternatePartNoField);
		isSelected(driver, alternatePartNoField, "alternatePartNoField");
		alternatePartNoField.sendKeys(alternativeNo);

//		sourceManufacturerRadioButton.click();
//		sourceCustomerRadioButton.click();

		// 1Verifying that Alternative Part No Text Field is Enabled or not
		click(driver, manufacturerorCustomerField);
		isSelected(driver, manufacturerorCustomerField, "manufacturerorCustomerField");
		manufacturerorCustomerField.clear();
		manufacturerorCustomerField.sendKeys(manufacturerorCustomerName);

		// Verifying the Placeholder which is present in Description text field.

		defaultToggleButton.click();
		defaultToggleButton.click();

		// Verifying that Add button is Enabled or not
		click(driver, addAlternative);

		// Engineering
		click(driver, engineeringTab);

		// 1Verifying that drawingNo Text Field is Enabled or not
		click(driver, drawingNoField);
		isSelected(driver, drawingNoField, "drawingNoField");
		drawingNoField.clear();
		drawingNoField.sendKeys(drawingNo);

		// 1Verifying that RevNo Text Field is Enabled or not
		click(driver, revNoField);
		isSelected(driver, revNoField, "revNoField");
		revNoField.sendKeys(revNo);

		// 1Verifying that EnterDocRet Text Field is Enabled or not
		click(driver, docRetField);
		isSelected(driver, docRetField, "docRetField");
		docRetField.sendKeys(docRet);

		click(driver, cocToggleButton);

		click(driver, rOHSToggleButton);

		click(driver, selfLifeToggleButton);

		click(driver, rEACHToggleButton);

//Upload File

		uploadFile(driver, filesUpload, 1);
		click(driver, uploadButton);

		click(driver, remarkField);
		isSelected(driver, remarkField, "remarkField");
		remarkField.sendKeys("Test Remark");

//		click(driver, Savefiles);
//
//		click(driver, viewFiles);
//
//		click(driver, closeViewFiles);

		// Dimensions Tab
		click(driver, dimensionsTab);

		// 1Verifying that NetWeight Text Field is Enabled or not
		click(driver, netWeightField);
		isSelected(driver, netWeightField, "netWeightField");
		netWeightField.sendKeys(netWeight);

		// 1Verifying that GrossWeight Text Field is Enabled or not
		click(driver, grossWeightField);
		isSelected(driver, grossWeightField, "grossWeightField");
		grossWeightField.sendKeys(grossWeight);

//		// 1Verifying that Volume Text Field is Enabled or not
		click(driver, volumeField);
		isSelected(driver, volumeField, "volumeField");
		volumeField.sendKeys(volume);

		// 1Verifying that Size Text Field is Enabled or not
		click(driver, sizeField);
		isSelected(driver, sizeField, "sizeField");
		sizeField.sendKeys(size);

		// 1Verifying that FootPrint Text Field is Enabled or not
		click(driver, footPrintField);
		isSelected(driver, footPrintField, "footPrintField");
		footPrintField.sendKeys(footPrint);

		click(driver, uOMDropdown1);
		click(driver, uOMDropdown1SelectData);

		click(driver, uOMDropdown2);
		click(driver, uOMDropdown2SelectData);

		click(driver, uOMDropdown3);
		click(driver, uOMDropdown3SelectData);

		// Routing
		routingTab.click();
		click(driver, routingTab);

		click(driver, processStepField);
		isSelected(driver, processStepField, "processStepField");
		processStepField.sendKeys(processStep);

		click(driver, processDropDown);
		click(driver, processDropDownSelectData);

		click(driver, descriptionField);
		isSelected(driver, descriptionField, "descriptionField");
		descriptionField.sendKeys(descriptinRouting);

		machineHoursField.sendKeys(machinHrs);
		click(driver, machineHoursField);
		isSelected(driver, machineHoursField, "machineHoursField");

		click(driver, labourHoursField);
		isSelected(driver, labourHoursField, "labourHoursField");
		labourHoursField.sendKeys(labourHrs);

		click(driver, activeToggleButtoninRouting);
		click(driver, activeToggleButtoninRouting);

		click(driver, addRoutingButton);

		// ApprovedVenderList

		click(driver, approvedVenderListTab);

		click(driver, vendorCodeDropDown);
		click(driver, vendorCodeDropDownDataSelect);
//		
//		click(driver, venderNameDropDown);
//		click(driver, venderNameDropDownDataSelect);

		click(driver, shareOFBusinessField);
		isSelected(driver, shareOFBusinessField, "shareOFBusinessField");
		shareOFBusinessField.sendKeys(shareofBusiness);

		click(driver, addApprovedVenderList);

		// Planning
		click(driver, planningTab);

		click(driver, minField);
		isSelected(driver, minField, "minField");
		minField.sendKeys(min);

		// 1Verifying that Max Text Field is Enabled or not
		click(driver, maxField);
		isSelected(driver, maxField, "maxField");
		maxField.sendKeys(max);

		// 1Verifying that ReOrder Text Field is Enabled or not
		click(driver, reOrderField);
		isSelected(driver, reOrderField, "reOrderField");
		reOrderField.sendKeys(reOrder);

		// 1Verifying that Bin Text Field is Enabled or not
		click(driver, twoBinField);
		isSelected(driver, twoBinField, "twoBinField");
		twoBinField.sendKeys(twoBin);

		// 1Verifying that LeadTime Text Field is Enabled or not
		click(driver, leadTimeField);
		isSelected(driver, leadTimeField, "leadTimeField");
		leadTimeField.sendKeys(leadTime);

		click(driver, kanbanToggleButton);

		// Warehouse
		click(driver, wareHouseTab);

		click(driver, wareHouseDropDown);
		click(driver, wareHouseDropDownDataSelect);

		click(driver, activeToggleButtoninWarehouse);
		click(driver, activeToggleButtoninWarehouse);

		click(driver, addWarehouseButton);

		click(driver, eSDToggleButtoninWarehouse);

		click(driver, cycleCountToggleButtoninWarehouse);

		click(driver, hazardousMaterialToggleButtoninWarehouse);

		click(driver, fIFOToggleButtoninWarehouse);

		click(driver, lIFOToggleButtoninWarehouse);

		click(driver, expiryDaysField);
		isSelected(driver, expiryDaysField, "expiryDaysField");
		expiryDaysField.sendKeys(expiryDays);

		click(driver, inspectionIntDaysField);
		isSelected(driver, inspectionIntDaysField, "inspectionIntDaysField");
		inspectionIntDaysField.sendKeys(inspectionIntDays);

		click(driver, specialInstructionsField);
		isSelected(driver, specialInstructionsField, "specialInstructionsField");
		specialInstructionsField.sendKeys(specialInstructions);


		// Shipping
		click(driver, shippingTab);

		// 1Verifying that Instructions Text Field is Enabled or not
		click(driver, instructionsField);
		isSelected(driver, instructionsField, "instructionsField");
		instructionsField.sendKeys(instructions);

		// Quality

		click(driver, qualityTab);

		click(driver, iqcToggleButton);

		// 1Verifying that GRProcessing Text Field is Enabled or not
		click(driver, grProcessingDaysField);
		isSelected(driver, grProcessingDaysField, "grProcessingDaysField");
		grProcessingDaysField.sendKeys(grProcess);

		// 1Verifying that BatchSize Text Field is Enabled or not
		click(driver, batchSizeField);
		isSelected(driver, batchSizeField, "batchSizeField");
		batchSizeField.sendKeys(batchSize);

		// Costing
		click(driver, financeTab);

		click(driver, costCenterDropDown);
		click(driver, costCenterDropDownDataSelect);

		// 1Verifying that StdCost Text Field is Enabled or not
		click(driver, stdCostField);
		isSelected(driver, stdCostField, "stdCostField");
		stdCostField.sendKeys(stdCost);

		click(driver, costingMethodDropDown);
		click(driver, costingMethodDropDownDataSelect);

		click(driver, valuationToggleButton);

		// Verifying that ValuationToggleButton is enabled or not
		click(driver, depreciationToggleButton);

		click(driver, pFOToggleButton);

		String beforeSaveButton = driver.getCurrentUrl();
		System.out.println(beforeSaveButton + "\n");

		click(driver, saveButton);

		Thread.sleep(3000);
		String afterSaveButton = driver.getCurrentUrl();
		System.out.println(afterSaveButton + "\n");

//		assertNotEquals(beforeSaveButton, afterSaveButton, "URLs are the same"); 
		return new HomePage();
	}
}
