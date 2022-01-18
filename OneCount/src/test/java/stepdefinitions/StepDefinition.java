package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.util.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinition
{	
	
	WebDriver driver;
	public static String Username = "inputEmailAddress";
	public static String Password = "passwordLogin";
	public static String LoginBtn = "//*[@value = 'Log in']";
	public static String SetUp = "//*[@id='nav-list-main']/span[1]";
	public static String Demograpghics = "//*[@id='nav-item-list']/li[1]/a";
	public static String CreateDemo = "//*[@class='oc-action-link']/a";
	public static String NewDemoHdng = "//*[@id='ui-id-1']";
	public static String NewDemoHdng_updt = "//*[@id='ui-id-1']";
	public static String NewDemoName = "//*[@id='qtext']";
	public static String NewDemoRspTyp = "//*[@id='qType']";
	public static String NewDemoAlsName = "//*[@id='qAlias']";
	public static String NewDemoRepHdr= "//*[@id='qRepHead']";
	public static String NewDemoTag = "//*[@id='demo_model']/div/div[10]/div/div[1]";
	public static String NewDemoLookup = "//*[@id='demo_model']/div/div[12]/div/div[1]";
	public static String NewDemoSaveBn = "//*[@id='save_form_button']";
	public static String NewDemocancelBtn= "//*[@id='cancel_form_button']";
	public static String DemoSrchBox= "//*[@id='dataTable_filter']/label/input";
	public static String Demo_Data= "//*[@id='dataTable']/tbody/tr";
	
	public static String Demo_Tbl_Hdr= "//*[@id='dataTable']/thead";  
	public static String Demo_Tbl= "//*[@id='dataTable']";   
	public static String Demo_Tbl_Act_Icons= "//*[@id='dataTable']/tbody/tr[1]/td[8]";
	
	//Need to write Code for this
	public static String Demo_Ele_Edit= "//*[@id='dataTable']/tbody/tr[1]/td[8]/div[1]/a/img";  
	public static String Demo_Ele_Delete= "//*[@id='dataTable']/tbody/tr[1]/td[8]/div[2]/a/img";   
	public static String Demo_Ele_Copy= "//*[@id='dataTable']/tbody/tr[1]/td[8]/div[3]/a/img";
	
	
	
	public static String LogOut= "//*[@id='side-menu']/li[8]/a/span";
	
	
	String SearchContent = "Automation_New";
	
	
	// Robot robot = new Robot();
	
	
	
	@Given("user navigate to the onecount App and login with {string} and {string}")
	public void user_navigate_to_the_onecount_app_and_login_with_and(String UserName, String PassWord) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\azeem\\eclipse-workspace\\OneCount\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://test.onecount.net/onecount/admin/index.php");
		
	    if(driver.findElement(By.id(Username)).isDisplayed())
	    {
	    	driver.findElement(By.id(Username)).sendKeys(UserName);
	    }
	    
	   if(driver.findElement(By.name(Password)).isDisplayed())
	    {
	    	driver.findElement(By.name(Password)).sendKeys(PassWord);
	    }
	    
	    Thread.sleep(3000);
	    
	    if(driver.findElement(By.xpath(LoginBtn)).isDisplayed())
	    {
	    	driver.findElement(By.xpath(LoginBtn)).click();
	    }
	    WebDriverWait wait=new WebDriverWait(driver, 20);  	   
	    WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SetUp)));
	
	}

	@When("user clicks on Setup Side menu and navigates to the Demograhics page")
	public void user_clicks_on_setup_side_menu_and_navigates_to_the_demograhics_page()
	{
		if(driver.findElement(By.xpath(SetUp)).isDisplayed())
	    {
	    	driver.findElement(By.xpath(SetUp)).click();
	    }
		
		if(driver.findElement(By.xpath(Demograpghics)).isDisplayed())
	    {
	    	driver.findElement(By.xpath(Demograpghics)).click();
	    }
	}
	

@Then("Verify the user is able to view the Create Demo Button")
public void verify_the_user_is_able_to_view_the_create_demo_button() {
	if(driver.findElement(By.xpath(CreateDemo)).isDisplayed())
    {
    	System.out.println("Currently user is in Demographic page");
    	}else
    	{
    		System.out.println("Currently user is not in Demographic page");
    	}
     }

@Given("user clicks on create demo button in Demographics Page")
public void user_clicks_on_create_demo_button_in_demographics_page() 
{
	if(driver.findElement(By.xpath(CreateDemo)).isDisplayed())
    {
		driver.findElement(By.xpath(CreateDemo)).click();	
    }
}

@Then("user switches to the new demo popup and verifies the title of the popup")
public void user_switches_to_the_new_demo_popup_and_verifies_the_title_of_the_popup() throws InterruptedException 
{
	if(driver.findElement(By.xpath(NewDemoHdng)).isDisplayed())
	{
		String Demopopuphdng = driver.findElement(By.xpath(NewDemoHdng)).getText();
		System.out.println(Demopopuphdng);
		
	}
    
	if(driver.findElement(By.xpath(NewDemoName)).isDisplayed())
    {
		driver.findElement(By.xpath(NewDemoName)).sendKeys(SearchContent);
    }
	
	if(driver.findElement(By.xpath(NewDemoRspTyp)).isDisplayed())
    {
		Select drpCountry = new Select(driver.findElement(By.xpath(NewDemoRspTyp)));
		drpCountry.selectByVisibleText("Text Area");
    }
	
	if(driver.findElement(By.xpath(NewDemoAlsName)).isDisplayed())
    {
		driver.findElement(By.xpath(NewDemoAlsName)).sendKeys("Automation_New");
    }
	
	if(driver.findElement(By.xpath(NewDemoRepHdr)).isDisplayed())
    {
		driver.findElement(By.xpath(NewDemoRepHdr)).sendKeys("Test Hdr");
    }
	
//	if(driver.findElement(By.xpath(NewDemoTag)).isDisplayed())
//    {
//		driver.findElement(By.xpath(NewDemoTag)).click();
//		
//		driver.findElement(By.xpath(NewDemoLookup)).sendKeys("DEGREE");
//		driver.findElement(By.xpath(NewDemoLookup)).sendKeys(Keys.ENTER);
////		Select DemoTag = new Select(driver.findElement(By.xpath(NewDemoRspTyp)));
////		DemoTag.selectByVisibleText("DEGREE");
//    }
//	Thread.sleep(3000);
	
//	if(driver.findElement(By.xpath(NewDemoLookup)).isDisplayed())
//    {
//		driver.findElement(By.xpath(NewDemoLookup)).click();
//		driver.findElement(By.xpath(NewDemoLookup)).sendKeys("Yes");
//		//drpCountry.selectByVisibleText("Yes");
//    }
//	Thread.sleep(3000);
	
}

@When("user pass the input data and clicks the save button")
public void user_pass_the_input_data_and_clicks_the_save_button() 
{
	if(driver.findElement(By.xpath(NewDemoSaveBn)).isDisplayed())
    {
		driver.findElement(By.xpath(NewDemoSaveBn)).click();
    }
}

@Then("user verifies the newly created Demo is displayed in the Demo builder page")
public void user_verifies_the_newly_created_demo_is_displayed_in_the_demo_builder_page() throws InterruptedException 
{
	if(driver.findElement(By.xpath(DemoSrchBox)).isDisplayed())
    {
		Thread.sleep(2000);
		driver.findElement(By.xpath(DemoSrchBox)).sendKeys(SearchContent);
    }
	
	Thread.sleep(5000);
    
	if(driver.findElement(By.xpath(Demo_Data)).isDisplayed())
    {
		System.out.println("New Created Item Has Displayed");
		String CreatedDemo = driver.findElement(By.xpath(Demo_Data)).getText();
		Thread.sleep(2000);
		if(CreatedDemo.contains(SearchContent))
		{
			System.out.println("MyDemo got Created");
		}else
		{
			System.out.println("MyDemo not Created");
		}
    }
}


@Then("Verify the user is able to view the datatable and Operations tab in the DemoPage")
public void verifyTheUserIsAbleToViewTheDatatableAndOperationsTabInTheDemoPage() throws InterruptedException 
{
	if(driver.findElement(By.xpath(Demo_Tbl)).isDisplayed())
    {
		
		String TblHdr = driver.findElement(By.xpath(Demo_Tbl_Hdr)).getText();
		System.out.println(TblHdr);
		if(TblHdr.contains("OPERATIONS"))
		{
			System.out.println("Check for the Actions Icons");
		}
    }
    
}

@Then("Verify the user is able to view the action icons")
public void verifyTheUserIsAbleToViewTheActionIcons() 
{
	if(driver.findElement(By.xpath(Demo_Tbl)).isDisplayed())
    {
		
		if(driver.findElement(By.xpath(Demo_Tbl_Act_Icons)).isDisplayed())
	    {
			System.out.println("Actions Icons are getting displayed Successfully");
	    }
    }
    
}


@Then("Verify the user is able to perform the Edit action and update the demo.")
public void verifyTheUserIsAbleToPerformTheEditActionAndUpdateTheDemo() {
	if(driver.findElement(By.xpath(Demo_Ele_Edit)).isDisplayed())
    {
		driver.findElement(By.xpath(Demo_Ele_Edit)).click();
    }
	
	if(driver.findElement(By.xpath(NewDemoHdng_updt)).isDisplayed())
    {
		String DmoNme= driver.findElement(By.xpath(NewDemoHdng_updt)).getText();
		
		if(DmoNme.equals("Update Demo"))
		{
			System.out.println("I am Editing the Demo");
		}
		else
		{
			System.out.println("Element is not in right window...... :)");
		}
		if(driver.findElement(By.xpath(NewDemoSaveBn)).isDisplayed())
	    {
			driver.findElement(By.xpath(NewDemoSaveBn)).click();
	    }
    }
}


@Then("Verify the user is able to perform the Delete action and search for the same Demo.")
public void verifyTheUserIsAbleToPerformTheDeleteActionAndSearchForTheSameDemo() 
	{
	if(driver.findElement(By.xpath(Demo_Ele_Delete)).isDisplayed())
    {
		driver.findElement(By.xpath(Demo_Ele_Delete)).click();
    }
	
	
	}


@Then("Verify the user is able to logout and close the browser")
public void verifyTheUserIsAbleToLogoutAndCloseTheBrowser() throws InterruptedException 
{
	Thread.sleep(2000);
	if(driver.findElement(By.xpath(LogOut)).isDisplayed())
    {
		driver.findElement(By.xpath(LogOut)).click();
    }
	
	driver.close();
}


}
