package com.Getapcs.Trans.PrimaryMaster;


import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Trans.BASECLASS.TestBase;
import com.Getapcs.Trans.HomeLogin.HomePage;

public class CompanyMaster_Edit extends TestBase {
	
	@FindBy(xpath = "(//td[normalize-space()='10'])[1]")
	WebElement headCountTable;

	@FindBy(xpath = "(//button[normalize-space()='Update'])[1]")
	WebElement updateHeadCountTable;

	@FindBy(xpath = "(//td[normalize-space()='TEST Address'])[1]")
	WebElement addressesTable;

	@FindBy(xpath = "(//td[normalize-space()='HDFC'])[1]")
	WebElement bankingTable;

	@FindBy(xpath = "(//button[normalize-space()='Update'])[1]")
	WebElement update;

	@FindBy(xpath = "(//input[@placeholder='Enter Company ID'])[1]")
	WebElement companyId;

	@FindBy(xpath = "(//input[@placeholder='Enter Company Name'])[1]")
	WebElement companyName;

	@FindBy(xpath = "(//input[@placeholder='Enter Company Alias'])[1]")
	WebElement companyAlias;

//General
	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement companyType;

	@FindBy(xpath = "(//span[normalize-space()='TEST Type_Of_Company'])[1]")
	WebElement companyTypeSelect;

	@FindBy(xpath = "//textarea[@placeholder='Enter Address']")
	WebElement address;

	@FindBy(xpath = "(//input[@placeholder='Enter city'])[1]")
	WebElement city;

	@FindBy(xpath = "(//input[@placeholder='Enter state'])[1]")
	WebElement state;

	@FindBy(xpath = "(//input[@type='text'])[12]")
	WebElement country;

	@FindBy(xpath = "(//span[normalize-space()='India'])[1]")
	WebElement countrySelect;

	@FindBy(xpath = "(//input[@placeholder='Enter Pin / Zip Code'])[1]")
	WebElement zipCode;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement purchaseGroup;

	@FindBy(xpath = "(//span[normalize-space()='TEST Purchase_Group'])[1]")
	WebElement purchaseGroupSelect;

	@FindBy(xpath = "(//input[@placeholder='Enter Board No'])[1]")
	WebElement boardNumber;

	@FindBy(xpath = "(//input[@placeholder='Enter Website'])[1]")
	WebElement website;

	@FindBy(xpath = "(//input[@placeholder='Enter Email'])[1]")
	WebElement email;

	@FindBy(xpath = "(//input[@type='text'])[13]")
	WebElement currency;

	@FindBy(xpath = "(//span[normalize-space()='INR'])[1]")
	WebElement currencySelect;

	@FindBy(xpath = "(//input[@placeholder='Enter Google Pin Location'])[1]")
	WebElement generalPinLocation;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement typeOfCompany;

	@FindBy(xpath = "(//span[normalize-space()='TEST Type_Of_Company'])[1]")
	WebElement typeOfCompanySelect;

	@FindBy(xpath = "(//input[@type='text'])[8]")
	WebElement exportUnitType;

	@FindBy(xpath = "(//span[normalize-space()='TEST Export_Unit_Type'])[1]")
	WebElement exportUnitTypeSelect;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement toggleButton;

	// Contacts

	@FindBy(xpath = "(//a[normalize-space()='Contacts'])[1]")
	WebElement contacts;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement salutation;

	@FindBy(xpath = "(//span[normalize-space()='TEST Salutations'])[1]")
	WebElement salutationSelect;

	@FindBy(xpath = "(//input[@placeholder='Enter Call Name'])[1]")
	WebElement callName;

	@FindBy(xpath = "(//input[@type='text'])[10]")
	WebElement mobileNumCode;

	@FindBy(xpath = "(//span[normalize-space()='+91'])[1]")
	WebElement mobileNumCodeSelect;

	@FindBy(xpath = "(//input[@placeholder='Enter Mobile No'])[1]")
	WebElement mobileNum;

	@FindBy(xpath = "(//input[@placeholder='Land Line'])[1]")
	WebElement landLineNo;

	@FindBy(xpath = "(//input[@placeholder='Time To Call'])[1]")
	WebElement timeToCall;

	@FindBy(xpath = "(//input[@placeholder='Enter First Name'])[1]")
	WebElement firstName;

	@FindBy(xpath = "(//input[@placeholder='Enter Designation'])[1]")
	WebElement designation;

	@FindBy(xpath = "(//input[@type='text'])[12]")
	WebElement mobileNumCode1;

	@FindBy(xpath = "(//span[normalize-space()='+91'])[2]")
	WebElement mobileNumCode1Select;

	@FindBy(xpath = "(//input[@placeholder='Enter Mobile No'])[2]")
	WebElement mobileNum1;

	@FindBy(xpath = "(//input[@placeholder='Extension'])[1]")
	WebElement extension;

	@FindBy(xpath = "(//input[@type='text'])[16]")
	WebElement language;

	@FindBy(xpath = "(//span[normalize-space()='TEST Language'])[1]")
	WebElement languageSelect;

	@FindBy(xpath = "(//input[@placeholder='Enter Last Name'])[1]")
	WebElement lastName;

	@FindBy(xpath = "(//input[@type='text'])[9]")
	WebElement department;

	@FindBy(xpath = "(//span[normalize-space()='TEST Department'])[1]")
	WebElement departmentSelect;

	@FindBy(xpath = "(//input[@placeholder='Email'])[1]")
	WebElement email1;

	// Related Company Link

	@FindBy(xpath = "(//a[normalize-space()='Related Company Link'])[1]")
	WebElement relatedCompanyLink;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement company;

	@FindBy(xpath = "(//span[normalize-space()='TRASCCON INTERCONNECTION SYSTEMS PVT LTD'])[1]")
	WebElement companySelect;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement natureOfRelationship;

	@FindBy(xpath = "(//span[normalize-space()='TEST Nature_Of_Relationship'])[1]")
	WebElement natureOfRelationshipSelect;

	// Addresses

	@FindBy(xpath = "(//a[normalize-space()='Addresses'])[1]")
	WebElement addresses;

	@FindBy(xpath = "(//textarea[@placeholder='Enter PO Address'])[1]")
	WebElement poAddress;

	@FindBy(xpath = "(//input[@placeholder='GSTN Number'])[1]")
	WebElement gstnNum;

	@FindBy(xpath = "(//input[@placeholder='PAN Number'])[1]")
	WebElement panNum;

	@FindBy(xpath = "(//button[normalize-space()='Add'])[1]")
	WebElement addAddress;

	// Banking

	@FindBy(xpath = "(//a[normalize-space()='Banking'])[1]")
	WebElement banking;

	@FindBy(xpath = "(//input[@aria-autocomplete='list'])[1]")
	WebElement bankName;

	@FindBy(xpath = "(//span[normalize-space()='TEST Bank Name'])[1]")
	WebElement bankNameSelect;

	@FindBy(xpath = "(//input[@placeholder='Enter Branch'])[1]")
	WebElement branch;

	@FindBy(xpath = "(//input[@placeholder='Enter Account Number'])[1]")
	WebElement accountNumber;

	@FindBy(xpath = "(//input[@placeholder='Enter IFSC Code'])[1]")
	WebElement ifscCode;

	@FindBy(xpath = "(//input[@placeholder='Enter Swift Code'])[1]")
	WebElement switchCode;

	@FindBy(xpath = "(//input[@placeholder='Enter IBAN Code'])[1]")
	WebElement ibanCode;

	@FindBy(xpath = "(//span)[58]")
	WebElement primaryToggleButton;

	@FindBy(xpath = "(//button[normalize-space()='Add'])[1]")
	WebElement addBanking;

//Terms

	@FindBy(xpath = "(//a[normalize-space()='Terms'])[1]")
	WebElement terms;

	@FindBy(xpath = "(//input[@placeholder='Enter Advance (%)'])[1]")
	WebElement advance;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement paymentTerms;

	@FindBy(xpath = "(//span[normalize-space()='NET 15 DAYS'])[1]")
	WebElement paymentTermsSelect;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement incoTerm;

	@FindBy(xpath = "(//span[normalize-space()='TEST INCO_Term'])[1]")
	WebElement incoTermSelect;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Special Terms'])[1]")
	WebElement specialTerms;

	@FindBy(xpath = "(//input[@type='text'])[7]")
	WebElement preferredFreightForwarder;

	@FindBy(xpath = "(//span[normalize-space()='TEST Preferred_Freight_Forwarder'])[1]")
	WebElement preferredFreightForwarderSelect;

//statutory

	@FindBy(xpath = "(//a[normalize-space()='Statutory'])[1]")
	WebElement statutory;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement incorporation;

	@FindBy(xpath = "(//span[@class='slider round'])[2]")
	WebElement tin;

	@FindBy(xpath = "(//span[@class='slider round'])[3]")
	WebElement gst1;

	@FindBy(xpath = "(//span[@class='slider round'])[4]")
	WebElement iec;

	@FindBy(xpath = "(//span[@class='slider round'])[5]")
	WebElement pan1;

	@FindBy(xpath = "(//span[@class='slider round'])[6]")
	WebElement udhyamCertificate;

	@FindBy(xpath = "(//span[@class='slider round'])[7]")
	WebElement msme;

//certifications/Docs

	@FindBy(xpath = "(//a[normalize-space()='Certifications/Docs'])[1]")
	WebElement certifications;

	@FindBy(xpath = "(//span)[52]")
	WebElement iso;

	@FindBy(xpath = "(//span)[53]")
	WebElement as;

	@FindBy(xpath = "(//span)[54]")
	WebElement medical;

	@FindBy(xpath = "(//span)[55]")
	WebElement nadcap;

//Details

	@FindBy(xpath = "(//a[normalize-space()='Details'])[1]")
	WebElement details;

	@FindBy(xpath = "(//input[@placeholder='Enter Turn Over (3 Years)'])[1]")
	WebElement turnOver;

	@FindBy(xpath = "(//input[@placeholder='Enter DNB (Hoovers) Number'])[1]")
	WebElement dnbNumber;

	@FindBy(xpath = "(//input[@placeholder='Enter ICRA'])[1]")
	WebElement icra;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-company-master/div[2]/div/div/div/form/div/div[4]/div/div/div[4]/mat-expansion-panel/mat-expansion-panel-header/span[2]")
	WebElement headCount1;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-edit-company-master/div[2]/div/div/div/form/div/div[4]/div/div/div[4]/mat-expansion-panel/mat-expansion-panel-header/span[2]")
	WebElement headCount2;

	@FindBy(xpath = "(//input[@placeholder='Enter Head Count'])[1]")
	WebElement enterHeadCount;

	@FindBy(xpath = "(//input[@placeholder='Skill/Dept'])[1]")
	WebElement enterskill;

	@FindBy(xpath = "(//input[@placeholder='Qty'])[1]")
	WebElement noOfPeople;

	@FindBy(xpath = "(//button[normalize-space()='Add'])[1]")
	WebElement addheadCount;

	@FindBy(xpath = "(//input[@placeholder='Enter Capacity'])[1]")
	WebElement capacity;

	@FindBy(xpath = "(//input[@placeholder='Enter Floor Space'])[1]")
	WebElement floorSpace;

	@FindBy(xpath = "(//input[@placeholder='Enter Machine'])[1]")
	WebElement machine;

	@FindBy(xpath = "(//input[@placeholder='Enter Tools & Equip'])[1]")
	WebElement toolsAndEquip;

	@FindBy(xpath = "(//input[@aria-autocomplete='list'])[1]")
	WebElement uom;

	@FindBy(xpath = "(//span[normalize-space()='TEST UOM'])[1]")
	WebElement uomSelect;

	@FindBy(xpath = "(//input[@placeholder='Enter Sqft'])[1]")
	WebElement sqft;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement erpToggle;

	@FindBy(xpath = "(//input[@placeholder='Enter ERP'])[1]")
	WebElement enterErp;
	
	@FindBy(xpath = "(//input[@value='yes'])[1]")
	WebElement esdSetup;
	
	@FindBy(xpath = "(//input[@value='yes'])[2]")
	WebElement hazmatSetup;
	
	@FindBy(xpath = "(//span[@class='slider round'])[2]")
	WebElement ospToggle;

	@FindBy(xpath = "(//textarea[@placeholder='Enter OSP'])[1]")
	WebElement enterOsp;

//Company Approval

	@FindBy(xpath = "(//a[normalize-space()='Company Approval'])[1]")
	WebElement companyApproval;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement scopeOfSupply;

	@FindBy(xpath = "(//span[normalize-space()='TEST Scope_Of_Supply'])[1]")
	WebElement scopeOfSupplySelect;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement companyCategory;

	@FindBy(xpath = "(//span[normalize-space()='TEST Vender_Category'])[1]")
	WebElement companyCategorySelect;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement basisOfApproval;

	@FindBy(xpath = "(//span[normalize-space()='TEST Basis OF Approval'])[1]")
	WebElement basisOfApprovalSelect;

	@FindBy(xpath = "//input[@formcontrolname='inventory_item']/..//span[@class='slider round']")
	WebElement inventoryItem;

	@FindBy(xpath = "(//input[@placeholder='Approved By'])[1]")
	WebElement approvedBy;

	@FindBy(xpath = "(//span)[72]")
	WebElement reaudit;

	@FindBy(xpath = "(//input[@type='text'])[9]")
	WebElement auditFrequency;

	@FindBy(xpath = "(//span[normalize-space()='TEST Audit Frequency Name'])[1]")
	WebElement auditFrequencySelect;
	
	@FindBy(xpath = "(//input[@placeholder='DD-MM-YYYY'])[1]")
	WebElement approvalDate;
	
	@FindBy(xpath = "(//input[@placeholder='Select Upload file'])[1]")
	WebElement uploadFiles;
	
	@FindBy(xpath = "//button[normalize-space()='Save Files']")
	WebElement saveFileButton;
	
	@FindBy(xpath = "//button[normalize-space()='View Files']")
	WebElement viewFileButton;
	
	@FindBy(xpath = "//button[normalize-space()='Close']")
	WebElement fileCloseButton;
	
	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement saveButton;
	
	
	
	public CompanyMaster_Edit(){
		PageFactory.initElements(driver, this);
	}
	
	public HomePage CompanyMasterEdit(String comName, String comAlias)
			throws InterruptedException, AWTException {
		
		click(driver, companyName);
		isSelected(driver, companyName, "companyName");
		companyName.clear();
		companyName.sendKeys(comName);
		
		
		click(driver, companyAlias);
		isSelected(driver, companyAlias, "companyAlias");
		companyAlias.clear();
		companyAlias.sendKeys(comAlias);
		
		click(driver, saveButton);
		
		return new HomePage();
	}

}
