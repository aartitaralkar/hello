package com.jbk.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jbk.qa.base.TestBase;

public class ActivityPage extends TestBase{

	public ActivityPage() throws IOException {
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//div[@class='page-title icon rounded-top activity-feed x2Activity']")
	WebElement activityLabel;
	
	@FindBy(xpath="//span[@class='fa fa-filter']")
	WebElement filterBtn;
	
	@FindBy(xpath="//a[contains(text(),'Select All')]")
	WebElement selectAllBtn;
	
	@FindBy(xpath="//a[@id='cke_1_toolbar_collapser']")
	WebElement expandToolbarBtn;
	
	@FindBy(xpath="//input[@id='filter-default']")
	WebElement setDefaultCheckbox;
	
	@FindBy(xpath="//a[@id='create-activity-report']")
	WebElement createReportBtn;
	
	public String verifyActivityPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean verifyActivityPageLabel()
	{
		return activityLabel.isDisplayed();
				
	}
	
	public boolean verifyFilterBtn()
	{
		return filterBtn.isEnabled();			
	}
	
	public boolean verifyselectAllBtn()
	{
		return selectAllBtn.isEnabled();			
	}
	
	public boolean verifyexpandToolbarBtn()
	{
		return expandToolbarBtn.isEnabled();			
	}
	
	public boolean verifysetDefaultCheckbox()
	{
		return setDefaultCheckbox.isSelected();			
	}

	public boolean verifycreateReportBtn()
	{
		return createReportBtn.isEnabled();			
	}


}
