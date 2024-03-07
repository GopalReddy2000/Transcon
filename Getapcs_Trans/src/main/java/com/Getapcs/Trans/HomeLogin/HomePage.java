package com.Getapcs.Trans.HomeLogin;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Trans.BASECLASS.TestBase;

public class HomePage extends TestBase {

//Secondary Master

	@FindBy(xpath = "(//span[@class='mdi mdi-menu'])[1]")
	WebElement threeLinesSideBarIcon;

	@FindBy(xpath = "(//span[normalize-space()='Secondary Master'])[1]")
	WebElement master1;

	@FindBy(xpath = "(//a[normalize-space()='Additional Charges'])[1]")
	WebElement additionalCharges;

	/// ******************************//

// Primary Master
	@FindBy(xpath = "(//span[normalize-space()='Primary Master'])[1]")
	WebElement primaryMaster;

	@FindBy(xpath = "(//span[normalize-space()='Company Master'])[1]")
	WebElement companyMaster;

	@FindBy(xpath = "//a[@routerlink='masters/company-master/create']")
	WebElement companyMasterCreate;

	@FindBy(xpath = "//a[@routerlink='masters/customer-master/table']")
	WebElement modifyorView1;

	@FindBy(xpath = "(//span[normalize-space()='Customer Master'])[1]")
	WebElement customerMaster;

	@FindBy(xpath = "//a[@routerlink='masters/customer-master/create']")
	WebElement customerMasterCreate;

	@FindBy(xpath = "//a[@routerlink='masters/company-master/table']")
	WebElement modifyorView;

	@FindBy(xpath = "(//i[@class='mdi mdi-pencil edit-icon'])[1]")
	WebElement editButton;

	@FindBy(xpath = "(//span[normalize-space()='Vendor Master'])[1]")
	WebElement venderMaster;

	@FindBy(xpath = "(//a[@routerlink='masters/vendor-master/create'])[1]")
	WebElement venderMasterCreate;

	@FindBy(xpath = "(//a[@routerlink='masters/vendor-master/table'])[1]")
	WebElement modifyorView2;

// Sales

	@FindBy(xpath = "(//span[normalize-space()='Sales'])[1]")
	WebElement sales;

	@FindBy(xpath = "(//span[normalize-space()='Item Price List'])[1]")
	WebElement itemPriceList;

	@FindBy(xpath = "(//a[@routerlink='master/item-price-list/form'])[1]")
	WebElement itemPriceListCreate;
	
	@FindBy(xpath = "//a[@routerlink='master/item-price-list/table']")
	WebElement itmePriceListView_Modify;

	@FindBy(xpath = "//span[text()='RFQ']")
	WebElement rfq;

	@FindBy(xpath = "(//a[@routerlink='sales/rfq/create'])[1]")
	WebElement createRFQ;

	@FindBy(xpath = "//a[@routerlink='sales/rfq/table']")
	WebElement modifyorViewRfq;

	@FindBy(xpath = "(//a[@routerlink='master/item-price-list/table'])[1]")
	WebElement modifyorViewItemPriceList;

	@FindBy(xpath = "(//a[@routerlink='sales/quote/table'])[1]")
	WebElement modifyorViewQuote;

	@FindBy(xpath = "//span[normalize-space()='Sourcing']")
	WebElement sourcing;

	@FindBy(xpath = "//a[@routerlink='sales/sourcing/table']")
	WebElement modifyorViewsourcing;

	@FindBy(xpath = "//span[normalize-space()='LP Costing']")
	WebElement lpCosting;

	@FindBy(xpath = "//a[@routerlink='sales/lp-costing/table']")
	WebElement lpCostingModifyorView;

	@FindBy(xpath = "(//span[normalize-space()='Quote'])[1]")
	WebElement quoteModuleDropDown;

	@FindBy(xpath = "//a[@routerlink='sales/quote/create']")
	WebElement createQuoteOption;

//Transaction

	@FindBy(xpath = "(//span[normalize-space()='Transactions'])[1]")
	WebElement transaction;

	@FindBy(xpath = "(//span[normalize-space()='IQC Confirmation'])[1]")
	WebElement iqcConfirmation;

	@FindBy(xpath = "//a[@routerlink='sales/rfq/table']")
	WebElement iqcCreate;

	// ShopOrder

	@FindBy(xpath = "(//span[normalize-space()='Shop Order'])[1]")
	WebElement shopOrder;

	@FindBy(xpath = "//a[@routerlink='transaction/shop-order/create']")
	WebElement createShopOrder;

	@FindBy(xpath = "(//a[@routerlink='transaction/shop-order/table'])[1]")
	WebElement modifyorViewShopOrder;

	@FindBy(xpath = "(//i[@class='mdi mdi-eye edit-icon'])[1]")
	WebElement viewButton;

	@FindBy(xpath = "(//a[@routerlink='transaction/purchase-order/table'])[1]")
	WebElement POmodelAndView;

	// SalesOrder

	@FindBy(xpath = "//span[normalize-space()='Quote']")
	WebElement quote;

	@FindBy(xpath = "//a[@routerlink='sales/quote/table']")
	WebElement quoteVieworModify;

	@FindBy(xpath = "//span[normalize-space()='Sales Order']")
	WebElement salesOrder;

	@FindBy(linkText = "Modify / View")
	WebElement salesOrderTablePage;

	@FindBy(xpath = "//tbody/tr[1]/td[1]/i[1]")
	WebElement clickOnSalesOrderEdit;

	@FindBy(linkText = "SO Confirm List")
	WebElement soCinfirmation;

	// Material Issue

	@FindBy(xpath = "(//span[normalize-space()='Material Issue'])[1]")
	WebElement materialIssueDropdown;

	@FindBy(xpath = "//a[@routerlink='transaction/material-issue/table']")
	WebElement materialIssue;

	// PR
	@FindBy(xpath = "//span[contains(text(),'Purchase Requisition (PR)')]")
	WebElement pr;

	@FindBy(linkText = "Create")
	WebElement prCreate;

	@FindBy(linkText = "Modify / View")
	WebElement prModifyorView;

	@FindBy(xpath = "//tbody/tr[9]/td[1]/i[1]")
	WebElement prEditOption;

	@FindBy(xpath = "(//a[normalize-space()='PR Approval-I'])[1]")
	WebElement prApproval1;

	@FindBy(xpath = "(//a[normalize-space()='PR Approval-II'])[1]")
	WebElement prApproval2;

	// PO

	@FindBy(xpath = "(//span[normalize-space()='Purchase Order (PO)'])[1]")
	WebElement purchaseOrder;

	@FindBy(xpath = "//a[@routerlink=\"transaction/purchase-order/create\"]")
	WebElement poCreate;

	@FindBy(xpath = "(//a[@routerlink='transaction/purchase-order/table'])[1]")
	WebElement POModifyandView;

	@FindBy(xpath = "(//a[normalize-space()='PO Approval-I'])[1]")
	WebElement poApproval1;

	@FindBy(xpath = "(//a[normalize-space()='PO Approval-II'])[1]")
	WebElement poApproval2;

	@FindBy(xpath = "(//a[normalize-space()='PO Confirmation'])[1]")
	WebElement poConfirm;

	// Open GRIN
	@FindBy(xpath = "//span[contains(text(),'Open GRIN')]")
	WebElement openGRIN;

	@FindBy(linkText = "Create")
	WebElement openGRIN_Create;

	@FindBy(linkText = "Modify / View")
	WebElement openGRIN_VieworModify;

	@FindBy(xpath = "//tbody/tr[1]/td[1]/i[1]")
	WebElement openGRINEditOption;

	// GRIN
	@FindBy(xpath = "//span[normalize-space()='GRIN']")
	WebElement grin;

	@FindBy(xpath = "//a[@routerlink='transaction/grin/create']")
	WebElement grin_Create;

	@FindBy(linkText = "Modify / View")
	WebElement grin_VieworModify;

	@FindBy(xpath = "//tbody/tr[8]/td[1]/i[1]")
	WebElement grin_Edit;

	// IQC Confirmation

	@FindBy(linkText = "Create")
	WebElement iqcConfirmationCreate;

	@FindBy(xpath = "(//a[@routerlink='transaction/iqc-confirmation/table'])[1]")
	WebElement iqcConfirmationTable;

	// Binning

	@FindBy(xpath = "(//span[normalize-space()='Binning'])[1]")
	WebElement binning;

	@FindBy(xpath = "(//a[@routerlink='transaction/binning/create'])[1]")
	WebElement binningCreate;

	@FindBy(xpath = "(//a[@routerlink='transaction/binning/table'])[1]")
	WebElement binningModifyorView;

	// Shop Order Confirmation

	@FindBy(xpath = "(//a[normalize-space()='Shop Order Confirm'])[1]")
	WebElement shopOrderConfirmation;

	@FindBy(xpath = "(//i[@class='mdi mdi-plus-box-outline edit-icon'])[1]")
	WebElement createshopOrderConfirmation;

	// OQC

	@FindBy(xpath = "(//span[normalize-space()='OQC'])[1]")
	WebElement oQC;

	@FindBy(xpath = "(//a[@routerlink='transaction/fg-oqc'])[1]")
	WebElement oQC1;

	@FindBy(xpath = "(//i[@class='mdi mdi-plus-box-outline edit-icon'])[1]")
	WebElement createOQC;

	// OQC Binning

	@FindBy(xpath = "(//span[normalize-space()='OQC-Binning'])[1]")
	WebElement oQCBinning;

	@FindBy(xpath = "(//a[@routerlink='transaction/oqc-binning'])[1]")
	WebElement oQCBinningModifyorView;

	@FindBy(xpath = "(//i[@class='mdi mdi-plus-box-outline edit-icon'])[1]")
	WebElement createOQCBinning;

	// Delivery Order

	@FindBy(xpath = "(//span[normalize-space()='Delivery Order'])[1]")
	WebElement deliveryOrder;

	@FindBy(xpath = "(//a[@routerlink='transaction/delivery-order/create'])[1]")
	WebElement createDeliveryOrder;

	@FindBy(xpath = "(//a[@routerlink='transaction/delivery-order/table'])[1]")
	WebElement MorVDeliveryOrder;

	@FindBy(xpath = "(//button[normalize-space()='Return DO'])[1]")
	WebElement returnDo;

	// Open Delivery Order

	@FindBy(xpath = "(//span[normalize-space()='Open Delivery Order'])[1]")
	WebElement openDeliveryOrder;

	@FindBy(xpath = "(//a[@routerlink='transaction/open-delivery-order/create'])[1]")
	WebElement createOpenDeliveryOrder;

	@FindBy(xpath = "(//a[@routerlink='transaction/open-delivery-order/table'])[1]")
	WebElement MorVOpenDeliveryOrder;

	@FindBy(xpath = "(//button[normalize-space()='Return ODO'])[1]")
	WebElement returnODO;

	// Invoice

	@FindBy(xpath = "//span[normalize-space()='Invoice']")
	WebElement invoice;

	@FindBy(linkText = "Create")
	WebElement invoiceCreate;

	@FindBy(xpath = "(//a[@routerlink='transaction/invoice/table'])[1]")
	WebElement invoiceMorV;

	// Material Request

	@FindBy(xpath = "(//span[normalize-space()='Material Request'])[1]")
	WebElement materialRequest;

	@FindBy(xpath = "(//a[@routerlink='transaction/create-material-request'])[1]")
	WebElement createMR;

	@FindBy(xpath = "(//a[@routerlink='transaction/material-request'])[1]")
	WebElement MRModifyORView;

	// Material ReturnNote

	@FindBy(xpath = "(//span[normalize-space()='Material Return Note'])[1]")
	WebElement materialReturnNote;

	@FindBy(xpath = "(//a[@routerlink='transaction/material-return-note'])[1]")
	WebElement MRNModifyORView;

	@FindBy(xpath = "(//a[@routerlink='transaction/create-material-return-note'])[1]")
	WebElement createMRN;

	// OpenMRN

	@FindBy(xpath = "(//a[normalize-space()='Open MRN'])[1]")
	WebElement openMRN;

//Engineering

	@FindBy(xpath = "(//span[normalize-space()='Engineering'])[1]")
	WebElement engineering;

	@FindBy(xpath = "//span[normalize-space()='Item Master']")
	WebElement itemMaster;

	@FindBy(xpath = "(//a[@routerlink='engineering/item-master/create'])[1]")
	WebElement create;

	@FindBy(xpath = "(//a[@routerlink='engineering/item-master/table'])[1]")
	WebElement modifyorViewItemMaster;

	@FindBy(xpath = "(//a[@routerlink='engineering/engg-bom/create'])[1]")
	WebElement createEnggBom;

	@FindBy(xpath = "(//span[normalize-space()='Engg Bom'])[1]")
	WebElement enggBom;

	@FindBy(xpath = "(//a[@routerlink='engineering/engg-bom/table'])[1]")
	WebElement modifyorViewEnggBom;

	@FindBy(xpath = "(//i[@class='mdi mdi-pencil edit-icon'])[1]")
	WebElement editButtonEnggBom;

	@FindBy(xpath = "(//a[normalize-space()='Release Bom'])[1]")
	WebElement releaseBom;

//Reports

	@FindBy(xpath = "(//span[normalize-space()='Reports'])[1]")
	WebElement reports;

	@FindBy(xpath = "(//a[normalize-space()='Inventory Report with Location'])[1]")
	WebElement inventryReportWithLocation;

	@FindBy(xpath = "//a[@routerlink='reports/item-master-report']")
	WebElement itemMasterReport;

	@FindBy(xpath = "(//a[normalize-space()='Sales Order Report'])[1]")
	WebElement salesOrderReports;

	@FindBy(xpath = "(//a[normalize-space()='Purchase Requisition Report'])[1]")
	WebElement prReports;

	@FindBy(xpath = "//a[@routerlink='reports/purchase-order-report']")
	WebElement poReports;

	@FindBy(xpath = "//a[@routerlink='reports/iqc-confirmation-report']")
	WebElement iqcConfirmationReports;
	@FindBy(xpath = "(//a[normalize-space()='GRIN Report'])[1]")
	WebElement grinReports;

	@FindBy(xpath = "(//a[normalize-space()='Binning Report'])[1]")
	WebElement binningReports;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

//Secandary Master

	public void clickOnSecondaryMaster() throws InterruptedException {
		threeLinesSideBarIcon.click();
		master1.click();
		additionalCharges.click();
		Thread.sleep(2000);

	}

	// **********************************************************//

//PrimaryMaster

	public void clickOnCompanyMasterCreate() throws InterruptedException {
		click(driver, threeLinesSideBarIcon);
		click(driver, primaryMaster);
		click(driver, companyMaster);
		click(driver, companyMasterCreate);
		click(driver, threeLinesSideBarIcon);
	}

	public void clickOnCompanyMasterEdit() throws InterruptedException {
		click(driver, threeLinesSideBarIcon);
		click(driver, primaryMaster);
		click(driver, companyMaster);
		click(driver, modifyorView);
		click(driver, editButton);
		click(driver, threeLinesSideBarIcon);
	}

	public void clickOnCustomerMasterCreate() throws InterruptedException {
		click(driver, threeLinesSideBarIcon);
		click(driver, primaryMaster);
		click(driver, companyMaster);
		click(driver, customerMaster);
		click(driver, customerMasterCreate);
		click(driver, threeLinesSideBarIcon);
		
	}

	public void clickOnCustomerMasterEdit() throws InterruptedException {
		threeLinesSideBarIcon.click();
		primaryMaster.click();
		customerMaster.click();
		modifyorView1.click();
		click(driver, editButton);

		Thread.sleep(4000);
	}

	public void clickOnVenderMasterCreate() throws InterruptedException {
		threeLinesSideBarIcon.click();
		primaryMaster.click();
		venderMaster.click();
		venderMasterCreate.click();
		Thread.sleep(4000);
	}

	public void clickOnVenderMasterEdit() throws InterruptedException {
		threeLinesSideBarIcon.click();
		primaryMaster.click();
		venderMaster.click();
		modifyorView2.click();
		click(driver, editButton);

		Thread.sleep(4000);
	}

//***********************************************************************************//

//Sales

	public void clickonTransactionPriceListCreate() {
		js.executeScript("arguments[0].click();", threeLinesSideBarIcon);
		click(driver, sales);
		itemPriceList.click();
		itemPriceListCreate.sendKeys(Keys.ENTER);
		click(driver, threeLinesSideBarIcon);
	}
	
	public void clickonSalesPriceListEdit() {
		click(driver, threeLinesSideBarIcon);
		click(driver, sales);
		click(driver, itemPriceList);
		click(driver, itmePriceListView_Modify);
		click(driver, threeLinesSideBarIcon);
	}


	public void clickonRFQCreate() {
		js.executeScript("arguments[0].click();", threeLinesSideBarIcon);
		click(driver, sales);
		click(driver, rfq);
		click(driver, createRFQ);
		click(driver, threeLinesSideBarIcon);
	}

	public void clickonSalesRfqModifyorView() {
		threeLinesSideBarIcon.click();
		sales.click();
		rfq.click();
		modifyorViewRfq.sendKeys(Keys.ENTER);
		click(driver, threeLinesSideBarIcon);

	}

	public void clickonSalesItemPriceListModifyorView() {
		threeLinesSideBarIcon.click();
		sales.click();
		itemPriceList.click();
		modifyorViewItemPriceList.sendKeys(Keys.ENTER);
		click(driver, threeLinesSideBarIcon);
	}

	public void clickonSalesQuoteCreate() {
		threeLinesSideBarIcon.click();
		click(driver, sales);
		click(driver, quoteModuleDropDown);
		click(driver, createQuoteOption);
		click(driver, threeLinesSideBarIcon);

	}

	public void clickonSalesQuoteModifyorView() {
		threeLinesSideBarIcon.click();
		sales.click();
		quote.click();
		click(driver, modifyorViewQuote);
		click(driver, threeLinesSideBarIcon);
	}

//Engineering

	public void clickOnItemMasterCreate() {
		threeLinesSideBarIcon.click();
		engineering.click();
		itemMaster.click();
		click(driver, create);
		click(driver, threeLinesSideBarIcon);

	}

	public void clickOnItemMasterEdit() {
		threeLinesSideBarIcon.click();
		engineering.click();
		itemMaster.click();
		modifyorViewItemMaster.sendKeys(Keys.ENTER);
		js.executeScript("arguments[0].click();", editButton);
		click(driver, threeLinesSideBarIcon);

	}

	public void clickOnItemMasterTable() {
		threeLinesSideBarIcon.click();
		engineering.click();
		itemMaster.click();
		modifyorViewItemMaster.sendKeys(Keys.ENTER);
		click(driver, threeLinesSideBarIcon);

	}

	public void clickOnBomCreatePage() {
		// TODO Auto-generated method stub
		threeLinesSideBarIcon.click();
		engineering.click();
		enggBom.click();
		createEnggBom.sendKeys(Keys.ENTER);
	}

	public void clickOnBomEditPage() {
		// TODO Auto-generated method stub
		threeLinesSideBarIcon.click();
		engineering.click();
		enggBom.click();
		modifyorViewEnggBom.sendKeys(Keys.ENTER);
		js.executeScript("arguments[0].click();", editButtonEnggBom);
	}

	public void clickOnBomTablePage() {
		// TODO Auto-generated method stub
		threeLinesSideBarIcon.click();
		engineering.click();
		enggBom.click();
		modifyorViewEnggBom.sendKeys(Keys.ENTER);
		click(driver, threeLinesSideBarIcon);
	}

	public void clickOnReleaseBomPage() {
		// TODO Auto-generated method stub
		click(driver, threeLinesSideBarIcon);
		engineering.click();
		enggBom.click();
		releaseBom.sendKeys(Keys.ENTER);
	}

	// Sales
	public void clickonSoucing() throws InterruptedException {
		click(driver, threeLinesSideBarIcon);
		click(driver, sales);
		click(driver, sourcing);
		click(driver, modifyorViewsourcing);
		click(driver, threeLinesSideBarIcon);
		Thread.sleep(3000);
	}

	public void clickonLpCosting() throws InterruptedException {
		click(driver, threeLinesSideBarIcon);
		click(driver, sales);
		click(driver, lpCosting);
		click(driver, lpCostingModifyorView);
		click(driver, threeLinesSideBarIcon);
		Thread.sleep(3000);
	}

//Transaction

	public void clickOnSalesOrderCreate() throws InterruptedException {
		threeLinesSideBarIcon.click();
		sales.click();
		quote.click();
		js.executeScript("arguments[0].click();", quoteVieworModify);
		Thread.sleep(6000);
		threeLinesSideBarIcon.click();
	}

	public void clickOnSalesOrderEdit() throws InterruptedException {
//		menu.click();
		js.executeScript("arguments[0].click();", threeLinesSideBarIcon);
		transaction.click();
		salesOrder.click();
		salesOrderTablePage.click();
		Thread.sleep(4000);
//		menu.click();
		js.executeScript("arguments[0].click();", threeLinesSideBarIcon);
//		clickOnSalesOrderEdit.click();
		js.executeScript("arguments[0].click();", clickOnSalesOrderEdit);
		Thread.sleep(3000);
	}

	public void clickOnSalesOrderTable() throws InterruptedException {
//		menu.click();
		js.executeScript("arguments[0].click();", threeLinesSideBarIcon);
		transaction.click();
		salesOrder.click();
		salesOrderTablePage.click();
		click(driver, threeLinesSideBarIcon);
	}

	public void clickonTransactionIQCConfirmationCreate() {
		threeLinesSideBarIcon.click();
		transaction.click();
		iqcConfirmation.click();
		iqcCreate.sendKeys(Keys.ENTER);

	}

	public void clickOnTransactionShopOrderCreate() {

		click(driver, threeLinesSideBarIcon);
		click(driver, transaction);
		click(driver, shopOrder);
		click(driver, createShopOrder);
		click(driver, threeLinesSideBarIcon);

	}

	public void clickOnTransactionShopOrderEdit() {
		// TODO Auto-generated method stub
		threeLinesSideBarIcon.click();
		transaction.click();
		js.executeScript("arguments[0].click();", shopOrder);
		modifyorViewShopOrder.sendKeys(Keys.ENTER);
		js.executeScript("arguments[0].click();", editButton);

	}

	public void clickOnTransactionShopOrderView() {
		// TODO Auto-generated method stub
		threeLinesSideBarIcon.click();
		transaction.click();
		js.executeScript("arguments[0].click();", shopOrder);
		modifyorViewShopOrder.sendKeys(Keys.ENTER);
		js.executeScript("arguments[0].click();", viewButton);

	}

	public void clickOnTransactionShopOrder() {
		// TODO Auto-generated method stub
		threeLinesSideBarIcon.click();
		transaction.click();
		js.executeScript("arguments[0].click();", shopOrder);
		modifyorViewShopOrder.sendKeys(Keys.ENTER);
	}
	// Material Issue

	public void clickOnTransactionMaterialIssue() {
		// TODO Auto-generated method stub
		click(driver, threeLinesSideBarIcon);
		click(driver, transaction);
		click(driver, materialIssueDropdown);
		click(driver, materialIssue);
		click(driver, threeLinesSideBarIcon);

	}

//Purchase Requisition

	public void clickOnPRCreatePage() throws InterruptedException {

		click(driver, threeLinesSideBarIcon);
		click(driver, transaction);
		click(driver, pr);
		click(driver, prCreate);
		click(driver, threeLinesSideBarIcon);

	}

	public void clickOnPOApproval1() throws InterruptedException {
		click(driver, threeLinesSideBarIcon);
		click(driver, transaction);
		click(driver, pr);
		click(driver, prApproval1);
		click(driver, threeLinesSideBarIcon);
	}

	public void clickOnPRApproval2() throws InterruptedException {

		click(driver, threeLinesSideBarIcon);
		click(driver, transaction);
		click(driver, pr);
		click(driver, prApproval2);
		click(driver, threeLinesSideBarIcon);
	}

	public void clickOnPREditPage() throws InterruptedException {
		threeLinesSideBarIcon.click();
		transaction.click();
		pr.click();
		prModifyorView.click();
		Thread.sleep(4000);
		click(driver, threeLinesSideBarIcon);
		js.executeScript("arguments[0].click();", prEditOption);
		Thread.sleep(4000);
//		prEditOption.click();
	}

	public void clickOnPRTablePage() throws InterruptedException {
		threeLinesSideBarIcon.click();
		transaction.click();
		pr.click();
		prModifyorView.click();
		Thread.sleep(4000);
		click(driver, threeLinesSideBarIcon);
	}
//Purchase Order

	public void clickontransactionPOcreate() {
		threeLinesSideBarIcon.click();
		transaction.click();
		purchaseOrder.click();
		poCreate.click();
		click(driver, threeLinesSideBarIcon);

	}

	public void clickontransactionPOModelAndView() {
		click(driver, threeLinesSideBarIcon);
		click(driver, transaction);
		click(driver, purchaseOrder);
		click(driver, POmodelAndView);
	}

	public void clickontransactionPOApproval1() {
		threeLinesSideBarIcon.click();
		transaction.click();
		purchaseOrder.click();
		click(driver, poApproval1);
	}

	public void clickontransactionPOApproval2() {
		threeLinesSideBarIcon.click();
		transaction.click();
		purchaseOrder.click();
		click(driver, poApproval2);

	}

	public void clickonPOEdit() {
		threeLinesSideBarIcon.click();
		transaction.click();
		purchaseOrder.click();
		POModifyandView.click();
		js.executeScript("arguments[0].click();", threeLinesSideBarIcon);
	}

	public void clickonPOTable() {
		threeLinesSideBarIcon.click();
		transaction.click();
		purchaseOrder.click();
		POModifyandView.click();
		js.executeScript("arguments[0].click();", threeLinesSideBarIcon);
	}

	// Open Grin

	public void clickOnOpenGRINCreate() throws InterruptedException {
		click(driver, threeLinesSideBarIcon);
		click(driver, transaction);
		click(driver, openGRIN);
		click(driver, openGRIN_Create);
		click(driver, threeLinesSideBarIcon);
		Thread.sleep(3000);
	}

	// GRIN

	public void clickOnGRINCreate() throws InterruptedException {
		threeLinesSideBarIcon.click();
		transaction.click();
		grin.click();
		grin_Create.click();
		js.executeScript("arguments[0].click();", threeLinesSideBarIcon);
//			menu.click();
		Thread.sleep(3000);

	}

	public void clickOnGRINTable() throws InterruptedException {

		click(driver, threeLinesSideBarIcon);
		click(driver, transaction);
		click(driver, grin);
		click(driver, grin_VieworModify);
		click(driver, threeLinesSideBarIcon);
		Thread.sleep(3000);

	}

	// IQC Confirmation

	public void clickOnIQCConfirmationCreate() throws InterruptedException {
		click(driver, threeLinesSideBarIcon);
		transaction.click();
		iqcConfirmation.click();
//			iqcConfirmationCreate.click();
		js.executeScript("arguments[0].click();", iqcConfirmationCreate);
		js.executeScript("arguments[0].click();", threeLinesSideBarIcon);
//			menu.click();
		Thread.sleep(3000);

	}

	public void clickOnIQCConfirmationTable() throws InterruptedException {
		click(driver, threeLinesSideBarIcon);
		transaction.click();
		iqcConfirmation.click();
//			iqcConfirmationCreate.click();
		js.executeScript("arguments[0].click();", iqcConfirmationTable);
		js.executeScript("arguments[0].click();", threeLinesSideBarIcon);
//			menu.click();
		Thread.sleep(3000);

	}
	// Binning

	public void clickOnBinningCreate() throws InterruptedException {
		threeLinesSideBarIcon.click();
		transaction.click();
		click(driver, binning);
//			iqcConfirmationCreate.click();
		js.executeScript("arguments[0].click();", binningCreate);
		js.executeScript("arguments[0].click();", threeLinesSideBarIcon);
//			menu.click();
		Thread.sleep(3000);

	}

	public void clickOnBinningTable() throws InterruptedException {
		click(driver, threeLinesSideBarIcon);
		transaction.click();
		click(driver, binning);
		js.executeScript("arguments[0].click();", binningModifyorView);
		js.executeScript("arguments[0].click();", threeLinesSideBarIcon);
		Thread.sleep(3000);

	}

	// Shop Order Confirmation

	public void clickOnShopOrderConfirmationCreate() throws InterruptedException {
		threeLinesSideBarIcon.click();
		transaction.click();
		js.executeScript("arguments[0].click();", shopOrder);
		js.executeScript("arguments[0].click();", shopOrderConfirmation);
		js.executeScript("arguments[0].click();", createshopOrderConfirmation);
		js.executeScript("arguments[0].click();", threeLinesSideBarIcon);
	}

	public void clickOnShopOrderConfirmationTable() throws InterruptedException {
		threeLinesSideBarIcon.click();
		transaction.click();
		js.executeScript("arguments[0].click();", shopOrder);
		js.executeScript("arguments[0].click();", shopOrderConfirmation);
		js.executeScript("arguments[0].click();", threeLinesSideBarIcon);
	}

	// OQC

	public void clickOnOQCCreate() throws InterruptedException {
		threeLinesSideBarIcon.click();
		transaction.click();
		js.executeScript("arguments[0].click();", oQC);
		js.executeScript("arguments[0].click();", oQC1);
		js.executeScript("arguments[0].click();", createOQC);
		js.executeScript("arguments[0].click();", threeLinesSideBarIcon);
	}

	public void clickOnOQCTable() throws InterruptedException {
		threeLinesSideBarIcon.click();
		transaction.click();
		js.executeScript("arguments[0].click();", oQC);
		js.executeScript("arguments[0].click();", oQC1);
		js.executeScript("arguments[0].click();", threeLinesSideBarIcon);
	}

	// OQC Binning

	public void clickOnOQCBinningCreate() throws InterruptedException {
		threeLinesSideBarIcon.click();
		transaction.click();
		js.executeScript("arguments[0].click();", oQCBinning);
		js.executeScript("arguments[0].click();", oQCBinningModifyorView);
		js.executeScript("arguments[0].click();", createOQCBinning);
		js.executeScript("arguments[0].click();", threeLinesSideBarIcon);
	}

	public void clickOnOQCBinningTable() throws InterruptedException {
		threeLinesSideBarIcon.click();
		transaction.click();
		js.executeScript("arguments[0].click();", oQCBinning);
		js.executeScript("arguments[0].click();", oQCBinningModifyorView);
		js.executeScript("arguments[0].click();", threeLinesSideBarIcon);
	}

	// Delivery Order

	public void clickOnDOCreate() throws InterruptedException {
		threeLinesSideBarIcon.click();
		transaction.click();
		js.executeScript("arguments[0].click();", deliveryOrder);
		js.executeScript("arguments[0].click();", createDeliveryOrder);
		js.executeScript("arguments[0].click();", threeLinesSideBarIcon);
	}

	public void clickOnDOTable() throws InterruptedException {
		threeLinesSideBarIcon.click();
		transaction.click();
		js.executeScript("arguments[0].click();", deliveryOrder);
		js.executeScript("arguments[0].click();", MorVDeliveryOrder);
		js.executeScript("arguments[0].click();", threeLinesSideBarIcon);
	}

	public void clickOnReturnDO() throws InterruptedException {

		click(driver, threeLinesSideBarIcon);
		click(driver, transaction);
		click(driver, deliveryOrder);
		click(driver, MorVDeliveryOrder);
		click(driver, threeLinesSideBarIcon);
		click(driver, returnDo);

		Thread.sleep(3000);

	}

	// Open Delivery Order

	public void clickOnOpenDeliveryOrder() throws InterruptedException {
		click(driver, threeLinesSideBarIcon);
		click(driver, transaction);
		click(driver, openDeliveryOrder);
		click(driver, createOpenDeliveryOrder);
		click(driver, threeLinesSideBarIcon);

		Thread.sleep(3000);

	}

	public void clickOnReturnOpenDeliveryOrder() throws InterruptedException {
		click(driver, threeLinesSideBarIcon);
		click(driver, transaction);
		click(driver, openDeliveryOrder);
		click(driver, MorVOpenDeliveryOrder);
		click(driver, returnODO);
		click(driver, threeLinesSideBarIcon);

		Thread.sleep(3000);

	}

	public void clickOnInvoiceCreate() throws InterruptedException {
		click(driver, threeLinesSideBarIcon);
		click(driver, transaction);
		click(driver, invoice);
		click(driver, invoiceCreate);
		click(driver, threeLinesSideBarIcon);
		Thread.sleep(3000);

	}

	public void clickOnInvoiceTable() throws InterruptedException {
		threeLinesSideBarIcon.click();
		transaction.click();
		click(driver, invoice);
		click(driver, invoiceMorV);
		click(driver, threeLinesSideBarIcon);
		Thread.sleep(3000);

	}

	public void clickOnMaterialRequest() throws InterruptedException {
		click(driver, threeLinesSideBarIcon);
		click(driver, transaction);
		click(driver, materialRequest);
		click(driver, createMR);
		click(driver, threeLinesSideBarIcon);
		Thread.sleep(3000);

	}

	public void clickOnMaterialRequestTable() throws InterruptedException {
		click(driver, threeLinesSideBarIcon);
		click(driver, transaction);
		click(driver, materialRequest);
		click(driver, MRModifyORView);
		click(driver, threeLinesSideBarIcon);
		Thread.sleep(3000);

	}

	public void clickOnMaterialReturnNote() throws InterruptedException {
		click(driver, threeLinesSideBarIcon);
		click(driver, transaction);
		click(driver, materialReturnNote);
		click(driver, createMRN);
		click(driver, threeLinesSideBarIcon);
		Thread.sleep(3000);

	}

	public void clickOnMaterialReturnNoteTable() throws InterruptedException {
		click(driver, threeLinesSideBarIcon);
		click(driver, transaction);
		click(driver, materialReturnNote);
		click(driver, MRNModifyORView);
		click(driver, threeLinesSideBarIcon);
		Thread.sleep(3000);

	}

	public void clickOnMaterialReturnNoteOpenMRN() throws InterruptedException {
		click(driver, threeLinesSideBarIcon);
		click(driver, transaction);
		click(driver, materialReturnNote);
		click(driver, openMRN);
		click(driver, threeLinesSideBarIcon);
		Thread.sleep(3000);

	}

//Reports

	public void clickOnInventryReportWithLocation() throws InterruptedException {
		click(driver, threeLinesSideBarIcon);
		click(driver, reports);
		click(driver, inventryReportWithLocation);
		click(driver, threeLinesSideBarIcon);
		Thread.sleep(3000);
		

	}

	public void clickOnItemMasterReports() throws InterruptedException {
		click(driver, threeLinesSideBarIcon);
		click(driver, reports);
		click(driver, itemMasterReport);
		click(driver, threeLinesSideBarIcon);

	}

	public void clickOnSalesOrderReport() throws InterruptedException {
		click(driver, threeLinesSideBarIcon);
		click(driver, reports);
		click(driver, salesOrderReports);
		click(driver, threeLinesSideBarIcon);
		Thread.sleep(3000);

	}

	public void clickOnPurchaseReqisitionReport() throws InterruptedException {
		click(driver, threeLinesSideBarIcon);
		click(driver, reports);
		click(driver, prReports);
		click(driver, threeLinesSideBarIcon);
		Thread.sleep(3000);

	}

	public void clickOnPurchaseOrderReport() throws InterruptedException {
		click(driver, threeLinesSideBarIcon);
		click(driver, reports);
		click(driver, poReports);
		click(driver, threeLinesSideBarIcon);
		Thread.sleep(3000);

	}

	public void clickOnIQC_ConfirmationReport() throws InterruptedException {
		click(driver, threeLinesSideBarIcon);
		click(driver, reports);
		click(driver, iqcConfirmationReports);
		click(driver, threeLinesSideBarIcon);
		Thread.sleep(3000);

	}

	public void clickOnGRINReport() throws InterruptedException {
		click(driver, threeLinesSideBarIcon);
		click(driver, reports);
		click(driver, grinReports);
		click(driver, threeLinesSideBarIcon);
		Thread.sleep(3000);

	}

	public void clickonBinningReports() throws InterruptedException {
		click(driver, threeLinesSideBarIcon);
		click(driver, reports);
		click(driver, binningReports);
		click(driver, threeLinesSideBarIcon);
		Thread.sleep(3000);

	}
}
