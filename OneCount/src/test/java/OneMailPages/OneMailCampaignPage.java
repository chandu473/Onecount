package OneMailPages;

import org.openqa.selenium.WebDriver;

public class OneMailCampaignPage 
{
	WebDriver driver;
	
	public static String OneMailUsername = "login"; // name locater
	public static String OneMailPassword = "password";  //name Locator
	public static String OneMailcont = "process"; // Name locator
	public static String OneMailStrtCamp = "//*[@id='gettingstarted']/div/a[1]";
	public static String OneMailStrtNewCmp = "//*[@id='wrapp']/p[1]/a";
	public static String OneMailAbTestChkbx = "//*[@id='abtestcheck']";
	public static String OneMailSmplSize = "samplesizeinput"; // id locator
	public static String OneMailTimeIntvl = "timeintervalinput"; // id locator
	public static String OneMailMetric = "metricinput";  // id locator
	public static String OneMailCmpnTitle = "campaigntitleinput";  // id locator
	public static String OneMailNxtIcn = "//*[@id='sendmessageform']/div[2]/div[1]/div/a/span";
	
	
	//Version-A Tab Elements
	public static String OneMailCmpnSub = "subjectinput";  // id locator
	public static String OneMailCmpnPreheader = "preheaderinput";  // id locator
	public static String OneMailCmpkeywrd = "keywordinput";  // id locator
	public static String OneMailCmpMsg = "cke_1_contents";  // id locator
	public static String OneMailNxtIcn2 = "//*[@id='sendmessageform']/div[2]/div[1]/div/a[2]/span";
	
	//Version-B Tab Elements
	//Need To Use OneMailCmpMsg Element first and OneMailNxtIcn2 for Navigation
	
	
	//Scheduling Tab Elements
	public static String OneMailSchdlDay = "//*[@id='schedulecontent']/div[2]/div[2]/select[1]";
	public static String OneMailSchdlMnth = "//*[@id='schedulecontent']/div[2]/div[2]/select[2]";
	public static String OneMailSchdlHrs = "//*[@id='schedulecontent']/div[2]/div[2]/select[4]";
	public static String OneMailSchdlMints = "//*[@id='schedulecontent']/div[2]/div[2]/select[5]";
	public static String OneMailSchdlStpDay = "//*[@id='schedulecontent']/div[3]/div[2]/select[1]";
	public static String OneMailSchdlStpMnth = "//*[@id='schedulecontent']/div[3]/div[2]/select[2]";
	public static String OneMailSchdlStpHrs = "//*[@id='schedulecontent']/div[3]/div[2]/select[4]";
	public static String OneMailSchdlStpMints = "//*[@id='schedulecontent']/div[3]/div[2]/select[5]";
	public static String OneMailSchdlReptPrd = "repeatinterval "; //  Name Locator
	// Use  OneMailNxtIcn2 Element for navigation here.
	
	// List Of users Page
	public static String OneMailSchdlUsrLstchkbx = "//*[@id='targetlist1']/ul/li[1]/input[2]";
	public static String OneMailSchdlUsrLstchkbx1 = "//*[@id='targetlist1']/ul/li[2]/input[1]";
	
	// Use  OneMailNxtIcn2 Element for navigation here.
	public static String OneMailrssDaily = "rsstemplatedaily";
	public static String OneMailrssWeekly = "rsstemplateweekly";
	public static String OneMailrssMonthly = "rsstemplatemonthly";
	public static String OneMailrssHourly = "rsstemplatehourly";
	public static String OneMailCondSegmnt = "//*[@id='sendmessageform']/div[2]/div[2]/div[1]/div[3]/span/span[1]/span/ul/li/input";
	public static String OneMailLodSgmnt = "//*[@id='sendmessageform']/div[2]/div[2]/div[1]/div[3]/input";
	
	
	// Need to do contyinutiopn again
	

}
