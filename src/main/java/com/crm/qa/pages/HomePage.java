package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath ="//td[contains(text(),'User: Anil kashyap')]")
	WebElement userLabel;
	
	@FindBy(xpath="//div[@id = 'navmenu']//a[ contains(text(),'Calendar') ]")//or xpath ="//a[@title='Calendar']"
	WebElement calendarLink;
	
	@FindBy(xpath ="//div[@id = 'navmenu']//a[ contains(text(),'Companies') ]")//or xpath ="//a[@title='Companies']"
	WebElement companiesLink;
	
	@FindBy(xpath ="//a[contains(text(), 'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath ="//a[contains(text(), 'Deals')]")
	WebElement dealsLink;
	
	@FindBy(xpath ="//a[contains(text(), 'Tasks')]")
	WebElement tasksLink;
	
	@FindBy(xpath="//a[contains(text(), 'Cases')]")
	WebElement casesLink;
	
	@FindBy(xpath="//a[@title ='Call']")
	WebElement callLink;
	
	@FindBy(xpath="//a[@title ='Email']")
	WebElement emailLink;
	
	@FindBy(xpath="//a[@title ='Text/SMS']")
	WebElement textAndsmsLink;
	
	@FindBy(xpath="//a[@title ='Print']")
	WebElement printLink;
	
	@FindBy(xpath ="//a[@title ='Campaigns']")
	WebElement campaignLink;
	
	@FindBy(xpath="//a[@title ='Docs']")
	WebElement docsLink;
	
	@FindBy(xpath ="//a[@title ='Forms']")
	WebElement formsLink;
	
	@FindBy(xpath="//a[@title ='Reports']")
	WebElement reportsLink;
	
	//Initializing the page object
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	public String verifyingPageTitle(){
		return driver.getTitle();
	}
	
	public CalendarPage clickOnCalendarLink(){
		calendarLink.click();
		return new CalendarPage();
	}
	
	public CallPage clickOncallLink(){
		callLink.click();
		return new CallPage();
	}
	
	public CampaignsPage clickOnCampaignLink(){
		companiesLink.click();
		return new CampaignsPage();
	}
	
	public CasesPage clickOnCasesLink(){
		casesLink.click();
		return new CasesPage();
	}
	
	public CompaniesPage clickOnCompaniesLink(){
		companiesLink.click();
		return new CompaniesPage();
	}
	
	public ContactsPage clickOnContactsLink(){
		contactsLink.click();
		return new ContactsPage();
	}
	
	public DealPage clickOnDealLink(){
		dealsLink.click();
		return new DealPage();
	}
	
	public DealPage clickOnDocsLink(){
		docsLink.click();
		return new DealPage();
	}
	
	public EmailPage clickOnEmailLink(){
		emailLink.click();
		return new EmailPage();
	}
	
	public FormsPage clickOnFormsLink(){
		formsLink.click();
		return new FormsPage();
	}
	
	public PrintPage clickOnPrintLink(){
		printLink.click();
		return new PrintPage();
	}

	public ReportPage clickOnReportLink(){
		reportsLink.click();
		return new ReportPage();
	}
	
	public TasksPage clickOnTasksLink(){
		tasksLink.click();
		return new TasksPage();
	}
	
	public TextAndSmsPage clickOnTextAndSmsLink(){
		textAndsmsLink.click();
		return new TextAndSmsPage();
		
	}
}
