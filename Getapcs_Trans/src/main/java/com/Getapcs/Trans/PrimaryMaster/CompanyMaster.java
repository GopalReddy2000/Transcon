package com.Getapcs.Trans.PrimaryMaster;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Trans.BASECLASS.TestBase;
import com.Getapcs.Trans.HomeLogin.HomePage;

public class CompanyMaster extends TestBase {

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
	

	public CompanyMaster() {
		PageFactory.initElements(driver, this);
	}


	public HomePage CompanyMasterCreate(String comId, String comName, String comAlias, String add, String cty,
			String stat, String code, String boardnum, String web, String eml, String generalpin, String cName,
			String mobileNo, String llNum, String fN, String desig, String mobileno2, String exten, String lN,
			String eml1, String addrs, String gst, String pan, String brch, String account, String ifsc, String swtch,
			String Iban, String adv, String specialtms, String turnovr, String dnb, String icr, String headcount,
			String skill, String people, String cacp, String floor, String machine1, String tools, String sqft1,
			String erp2, String osp2, String approved) throws Exception {

		click(driver, companyId);
		isSelected(driver, companyId, "companyId");
		companyId.sendKeys(comId);


		click(driver, companyName);
		isSelected(driver, companyName, "companyName");
		companyName.sendKeys(comName);

		click(driver, companyAlias);
		isSelected(driver, companyAlias, "companyAlias");
		companyAlias.sendKeys(comAlias);


		// *****************************//

//General

		click(driver, companyType);
		isSelected(driver, companyType, "customerType");
		click(driver, companyTypeSelect);

		click(driver, address);
		isSelected(driver, address, "address");
		address.sendKeys(add);

		click(driver, city);
		isSelected(driver, city, "city");
		city.sendKeys(cty);

		click(driver, state);
		isSelected(driver, state, "state");
		state.sendKeys(stat);

		click(driver, country);
		isSelected(driver, country, "country");
		click(driver, countrySelect);

		click(driver, zipCode);
		isSelected(driver, zipCode, "zipCode");
		zipCode.sendKeys(code);

		// Verify that PurchaseGroup Field
		click(driver, purchaseGroup);
		isSelected(driver, purchaseGroup, "purchaseGroup");
		click(driver, purchaseGroupSelect);

		// Verify that boardNumber Field
		click(driver, boardNumber);
		isSelected(driver, boardNumber, "boardNumber");
		boardNumber.sendKeys(boardnum);

		// Verify that webSite Field is Displayed or not
		click(driver, website);
		isSelected(driver, website, "website");
		website.sendKeys(web);

		// Verify that email Field is Displayed or not
		click(driver, email);
		isSelected(driver, email, "email");
		email.sendKeys(eml);

		// Verify that Currency Field is Displayed or not
		click(driver, currency);
		isSelected(driver, currency, "currency");
		click(driver, currencySelect);

		// Verify that generalPinLocation Field is Displayed or not
		click(driver, generalPinLocation);
		isSelected(driver, generalPinLocation, "generalPinLocation");
		generalPinLocation.sendKeys(generalpin);

		// Verify that typeOfCompany Field is Displayed or not

		click(driver, typeOfCompany);
		isSelected(driver, typeOfCompany, "typeOfCompany");
		typeOfCompany.sendKeys(Keys.ENTER);
		click(driver, typeOfCompanySelect);

		// Verify that exportUnitType Field is Displayed or not

		click(driver, exportUnitType);
		isSelected(driver, exportUnitType, "exportUnitType");
		click(driver, exportUnitTypeSelect);

		click(driver, toggleButton);

//Contacts

		click(driver, contacts);

		// Verify that salutation Field is Displayed or not
		click(driver, salutation);
		isSelected(driver, salutation, "salutation");
		click(driver, salutationSelect);

		// Verify that callName Field is Displayed or not
		click(driver, callName);
		isSelected(driver, callName, "callName");
		callName.sendKeys(cName);

		// Verify that mobileNumCode Field is Displayed or not
		click(driver, mobileNumCode);
		isSelected(driver, mobileNumCode, "mobileNumCode");
		click(driver, mobileNumCodeSelect);

		// Verify that mobileNum Field is Displayed or not
		click(driver, mobileNum);
		isSelected(driver, mobileNum, "mobileNum");
		mobileNum.sendKeys(mobileNo);

		// Verify that landLineNo Field is Displayed or not
		click(driver, landLineNo);
		isSelected(driver, landLineNo, "landLineNo");
		landLineNo.sendKeys(llNum);

		click(driver, timeToCall);
		timeToCall.sendKeys("12");
		timeToCall.sendKeys("12");

		// Verify that firstName Field is Displayed or not
		click(driver, firstName);
		isSelected(driver, firstName, "firstName");
		firstName.sendKeys(fN);

		// Verify that designation Field is Displayed or not
		click(driver, designation);
		isSelected(driver, designation, "designation");
		designation.sendKeys(desig);

		// Verify that mobileNumCode1 Field is Displayed or not
		click(driver, mobileNumCode1);
		isSelected(driver, mobileNumCode1, "mobileNumCode1");
		click(driver, mobileNumCode1Select);

		// Verify that mobileNum1 Field is Displayed or not
		click(driver, mobileNum1);
		isSelected(driver, mobileNum1, "mobileNum1");
		mobileNum1.sendKeys(mobileno2);

		// Verify that Extension Field is Displayed or not
		click(driver, extension);
		isSelected(driver, extension, "extension");
		extension.sendKeys(exten);

		// Verify that language Field is Displayed or not
		click(driver, language);
		isSelected(driver, language, "language");
		click(driver, languageSelect);

		// Verify that lastName Field is Displayed or not
		click(driver, lastName);
		isSelected(driver, lastName, "lastName");
		lastName.sendKeys(lN);

		// Verify that department Field is Displayed or not
		click(driver, department);
		isSelected(driver, department, "department");
		click(driver, departmentSelect);

		// Verify that email1 Field is Displayed or not
		click(driver, email1);
		isSelected(driver, email1, "email1");
		email1.sendKeys(eml1);

		// **********************//

//RelatedCompanyLink

		click(driver, relatedCompanyLink);

		// Verify that company Field is Displayed or not
		click(driver, company);
		isSelected(driver, company, "company");
		click(driver, companySelect);

		// Verify that natureOfRelationship Field is Displayed or not
		click(driver, natureOfRelationship);
		isSelected(driver, natureOfRelationship, "natureOfRelationship");
		click(driver, natureOfRelationshipSelect);

//Addressess		
		click(driver, addresses);

		// Verify that poAddress Field is Displayed or not
		click(driver, poAddress);
		isSelected(driver, poAddress, "poAddress");
		poAddress.sendKeys(addrs);

		// Verify that gstnNum Field is Displayed or not
		click(driver, gstnNum);
		isSelected(driver, gstnNum, "gstnNum");
		gstnNum.sendKeys(gst);

		// Verify that panNum Field is Displayed or not
		click(driver, panNum);
		isSelected(driver, panNum, "panNum");
		panNum.sendKeys(pan);

		addAddress.click();

//Banking
		click(driver, banking);

		click(driver, bankName);
		isSelected(driver, bankName, "bankName");
		click(driver, bankNameSelect);

		// Verify that branch Field is Displayed or not
		click(driver, branch);
		isSelected(driver, branch, "branch");
		branch.sendKeys(brch);

		// Verify that accountNum Field is Displayed or not
		click(driver, accountNumber);
		isSelected(driver, accountNumber, "accountNumber");
		accountNumber.sendKeys(account);

		// Verify that ifscCode Field is Displayed or not
		click(driver, ifscCode);
		isSelected(driver, ifscCode, "ifscCode");
		ifscCode.sendKeys(ifsc);

		// Verify that switchCode Field is Displayed or not
		click(driver, switchCode);
		isSelected(driver, switchCode, "switchCode");
		switchCode.sendKeys(swtch);

		// Verify that ibanCode Field is Displayed or not
		click(driver, ibanCode);
		isSelected(driver, ibanCode, "ibanCode");
		ibanCode.sendKeys(Iban);

		click(driver, addBanking);

//Terms

		click(driver, terms);

		// Verify that advance Field is Displayed or not
		click(driver, advance);
		isSelected(driver, advance, "advance");
		advance.sendKeys(adv);

		// Verify that paymentTerms Field is Displayed or not
		click(driver, paymentTerms);
		isSelected(driver, paymentTerms, "paymentTerms");
		click(driver, paymentTermsSelect);

		// Verify that incoTerms Field is Displayed or not
		click(driver, incoTerm);
		isSelected(driver, incoTerm, "incoTerm");
		click(driver, incoTermSelect);

		// Verify that specialTerms Field is Displayed or not
		click(driver, specialTerms);
		isSelected(driver, specialTerms, "specialTerms");
		specialTerms.sendKeys(specialtms);

		// Verify that preferredFreightForwarder Field is Displayed or not
		click(driver, preferredFreightForwarder);
		isSelected(driver, preferredFreightForwarder, "preferredFreightForwarder");
		click(driver, preferredFreightForwarderSelect);

//Satutory

		click(driver, statutory);

		click(driver, incorporation);

		click(driver, tin);

		click(driver, gst1);

		click(driver, iec);

		click(driver, pan1);

		click(driver, udhyamCertificate);

		click(driver, incorporation);

		click(driver, msme);

//CertificatesDocs

		click(driver, certifications);

		click(driver, iso);

		click(driver, as);

		click(driver, medical);

		click(driver, nadcap);

//Details

		click(driver, details);

		// Verify that turnOver Field is Displayed or not
		click(driver, turnOver);
		isSelected(driver, turnOver, "turnOver");
		turnOver.sendKeys(turnovr);

		// Verify that dnbNumber Field is Displayed or not
		click(driver, dnbNumber);
		isSelected(driver, dnbNumber, "dnbNumber");
		dnbNumber.sendKeys(dnb);

		// Verify that icra Field is Displayed or not
		click(driver, icra);
		isSelected(driver, icra, "icra");
		icra.sendKeys(icr);

		click(driver, headCount1);

		click(driver, enterHeadCount);
		isSelected(driver, enterHeadCount, "enterHeadCount");
		enterHeadCount.sendKeys(headcount);

		// Verifying that skill Text Field is Enabled or not
		click(driver, enterskill);
		isSelected(driver, enterskill, "enterskill");
		enterskill.sendKeys(skill);

		// Verifying that numOfPeople Text Field is Enabled or not
		click(driver, noOfPeople);
		isSelected(driver, noOfPeople, "noOfPeople");
		noOfPeople.sendKeys(people);

		click(driver, addheadCount);

		// Verify that capacity Field is Displayed or not
		click(driver, capacity);
		isSelected(driver, capacity, "capacity");
		capacity.sendKeys(cacp);

		// Verify that floorSpace Field is Displayed or not
		click(driver, floorSpace);
		isSelected(driver, floorSpace, "floorSpace");
		floorSpace.sendKeys(floor);

		// Verify that machine Field is Displayed or not
		click(driver, machine);
		isSelected(driver, machine, "machine");
		machine.sendKeys(machine1);

		// Verify that toolsAndEquip Field is Displayed or not
		click(driver, toolsAndEquip);
		isSelected(driver, toolsAndEquip, "toolsAndEquip");
		toolsAndEquip.sendKeys(tools);

		// Verify that sqft Field is Displayed or not
		click(driver, sqft);
		isSelected(driver, sqft, "sqft");
		sqft.sendKeys(sqft1);

		// Verify that uom Field is Displayed or not
		click(driver, uom);
		isSelected(driver, uom, "uom");
		click(driver, uomSelect);

		click(driver, erpToggle);

		// Verify that erp Field is Displayed or not
		click(driver, enterErp);
		isSelected(driver, enterErp, "enterErp");
		enterErp.sendKeys(erp2);

		click(driver, esdSetup);

		click(driver, hazmatSetup);

		click(driver, ospToggle);

		// Verify that osp1 Field is Displayed or not
		click(driver, enterOsp);
		isSelected(driver, enterOsp, "enterOsp");
		enterOsp.sendKeys(osp2);

// Company Approval

		click(driver, companyApproval);

		// Verify that scopeOfSupply Field is Displayed or not
		click(driver, scopeOfSupply);
		isSelected(driver, scopeOfSupply, "scopeOfSupply");
		click(driver, scopeOfSupplySelect);

		// Verify that companyCategory Field is Displayed or not
		click(driver, companyCategory);
		isSelected(driver, companyCategory, "companyCategory");
		click(driver, companyCategorySelect);

		// Verify that basisOfApproval Field is Displayed or not
		click(driver, basisOfApproval);
		isSelected(driver, basisOfApproval, "basisOfApproval");
		click(driver, basisOfApprovalSelect);

		// Verify that inventoryItem Field is Displayed or not
		click(driver, inventoryItem);

		// Verify that approvedBy Field is Displayed or not
		click(driver, approvedBy);
		isSelected(driver, approvedBy, "approvedBy");
		approvedBy.sendKeys(approved);

		// Verify that reaudit Field is Displayed or not
		click(driver, reaudit);

		click(driver, auditFrequency);
		isSelected(driver, auditFrequency, "auditFrequency");
		click(driver, auditFrequencySelect);


		datePicker(driver, approvalDate);

		// Verifing that do we able to upload files or not.
		uploadFile(driver, uploadFiles, 1);
		click(driver, saveFileButton);
		click(driver, viewFileButton);
		click(driver, fileCloseButton);
		

		click(driver, saveButton);

		return new HomePage();
	}


	

	
}
