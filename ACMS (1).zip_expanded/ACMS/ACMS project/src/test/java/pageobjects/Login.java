package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Login {
	private WebDriver driver;

    //Initialization

	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Locators
	private static By userNameTextfield = By.id("outlined-adornment-password");
	private static By passworsTextfield = By.xpath("//div[@class='MuiInputBase-root MuiOutlinedInput-root jss1 MuiInputBase-fullWidth MuiInputBase-adornedEnd MuiOutlinedInput-adornedEnd']//input[@id='outlined-adornment-password']");
	private static By checkboxfield= By.xpath("//input[@value='false']");
	
	private static By SignInButton = By.xpath("//span[normalize-space()='Login']");
	
	//private static By welcomeMessage=By.xpath("//*[@id=\\\"root\\\"]/div[1]/header/div[1]/div/button/span[1]/img");
	
	private static By Errormsg=By.xpath("//*[@id=\"tpxtjnma7a\"]/div[1]");
	
	private static By SystemRegion=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[4]/button[1]/span[1]/span[1]");
	
	private static By Region=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[4]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/div[1]/a[1]/span[1]");
	

	
	private static By Refresh=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/button[1]/*[name()='svg'][1]");
	
	

	
	private static By Creates=By.xpath("//div[@class='MuiGrid-root css-rfnosa']//div[2]//button[1]");
	
	
	
	private static By Codes=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
	
	private static By UserNameTextfields=By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/div/div[2]/div[2]/form/div[3]/div/div/div/input");
	
	private static By UserNameTextFieldsText=By.xpath("//div[@id='demo-simple-select']");
	
	private static By UserNameTextFieldsTextss=By.xpath("//*[@id=\"menu-parentId\"]/div[3]/ul/li[2]");
	
	
	private static By Remarks1234=By.xpath("//*[@id=\"mui-65\"]");
	
//	private static By Remarks1234=By.cssSelector("#mui-65");
	
	private static By CreateButton=By.xpath("//button[text()='Create']");
	
	private static By Updatedfields=By.xpath("(//*[name()='svg'][@class='MuiSvgIcon-root'])[6]");
	

	private static By CodeUpdates=By.xpath("//input[@id='customer']");
	
	private static By NameEdit=By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/div/div[2]/div[2]/form/div[3]/div/div/div/input");
	
	private static By Parent=By.xpath("//*[@id=\"demo-simple-select\"]");
	
	private static By Dropdown=By.xpath("//*[@id=\"menu-parentId\"]/div[3]/ul/li[6]");
	
	//private static By Remarksudt=By.xpath("//*[@id=\"mui-31\"]");
	
    private static By Created=By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div/div/div[2]/div[2]/form/div[8]/div/button[1]"); 	
    
    private static By Toast1=By.xpath("/html/body/div[1]/div[3]/div/div/div[1]");
    
    private static By Account=By.xpath("//span[@class='MuiButton-label']//span[contains(text(),'Account')]");
    
    private static By AccountCreate=By.xpath("//a[@role='button']//span[@class='MuiButton-label'][normalize-space()='Account']");
    
    private static By PlusSymbol=By.xpath("(//*[name()='svg'][@class='MuiSvgIcon-root'])[4]");
    
    private static By AccRegion=By.xpath("//*[@id=\"mui-component-select-regionId\"]");
    
    private static By AccRegionSel=By.xpath("//*[@id=\"menu-regionId\"]/div[3]/ul/li[7]");
    
    private static By TextField1=By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/div/div[2]/form/div[2]/div[3]/div[1]/div/div/input");
    
    private static By AccountType=By.xpath("//*[@id=\"mui-component-select-companyType\"]");
    
    private static By AccountTypeSelect=By.xpath("//*[@id=\"menu-companyType\"]/div[3]/ul/li[1]");
    
    private static By Address=By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/div/div[2]/form/div[2]/div[3]/div[4]/div/div/input");
    
    private static By City=By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/div/div[2]/form/div[2]/div[3]/div[5]/div/div/input");
    
    private static By State=By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/div/div[2]/form/div[2]/div[3]/div[7]/div/div/input");
    
    private static By Country=By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/div/div[2]/form/div[2]/div[3]/div[8]/div/div/input");
    
    private static By Pincode=By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/div/div[2]/form/div[2]/div[3]/div[10]/div/div/input");
    
    private static By FirstName=By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/div/div[2]/form/div[2]/div[5]/div[1]/div/div/input");
    
    private static By LastNamees=By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/div/div[2]/form/div[2]/div[5]/div[2]/div/div/input");
    
    private static By gmail=By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/div/div[2]/form/div[2]/div[5]/div[4]/div/div/input");
    
    private static By PhoneNo=By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/div/div[2]/form/div[2]/div[5]/div[5]/div/div/div/div/div/div/button[1]/svg/path");
    
   // private static By Phonepin=By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/div/div[2]/form/div[2]/div[5]/div[5]/div/div/div/div/div/input");
    
    private static By Phonecode=By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/div/div[2]/form/div[2]/div[5]/div[5]/div/div/input");
    
    private static By checkBox=By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/div/div[2]/form/div[2]/div[6]/fieldset/div/label[1]/span[1]/input");
    
    private static By CreateAcc=By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/div/div[2]/form/div[2]/div[7]/div/button[1]");
    	
    private static By Calen=By.xpath("//*[@id=\"mui-16\"]");
    
    private static By TextAcc=By.xpath("(//span[contains(text(),'Account')])[1]");
    
    private static By AccountType1=By.xpath("//a[@role='button']//span[@class='MuiButton-label'][normalize-space()='Account']");
    
    private static By crediticon=By.xpath("(//button[@title='Credit Recharge'])[1]");
   
    private static By  Fileupload=By.xpath("//*[name()='path' and contains(@d,'M10 4H4c-1')]");
   // private static By calender=By.className("MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl MuiInputBase-sizeSmall css-1v4ccyo");
	
	public static By getUserNameTextfield() {
		return userNameTextfield;
	}

	public static By getPassworsTextfield() {
		return passworsTextfield;
	} 


	public static By getcheckboxfield() {
		return checkboxfield;
		
	}
	public static By getSignInButton() {
		return SignInButton;
	}
	
//	public static By getwelcomeMessage() {
//		return welcomeMessage;
//	}
	public static By Errormsg() {
		return Errormsg;
	}
	
	public static By getSystemRegion() {
		return SystemRegion;
	}
	public static By getRegion() {
		return Region;
	}
	
	public static By getRefresh() {
		return Refresh;
	}
	
	public static By getCreates() {
		return  Creates;
	}
public static By getCodes() {
	return Codes;
}
public static By getUserNameTextfields() {
	return UserNameTextfields;
}
	
public static By getUserNameTextFieldsText() {
	return UserNameTextFieldsText;
}

public static By getUserNameTextFieldsTextss() {
	return UserNameTextFieldsTextss;
}
//public static By getRemarks123() {
//	return Remarks123;
//}

public static By getRemarks1234() {
	return Remarks1234;
}
public static By getCreateButton() {
	return CreateButton;
}
	public static By getToast1() {
		return Toast1;
	}

public static By getUpdatedfields() {
	return Updatedfields;
}
public static By getCodeUpdates() {
	return CodeUpdates;
}
public static By getNameEdit() {
	return NameEdit;
}

public static By getParent() {
	return Parent;
}
public static By getDropdown() {
	return Dropdown;
}

//public static By getRemarksudt() {
//	return Remarksudt;
//}
public static By getCreated() {
	return Created;
}

public static By getAccount() {
	return Account;
}
public static By getAccountCreate() {
	return AccountCreate;
}
public static By getPlusSymbol() {
	return PlusSymbol;
}
public static By getAccRegion() {
	return AccRegion;
}
public static By getAccRegionSel() {
	return AccRegionSel;
}
public static By getTextField1() {
	return TextField1;
}

public static By getAccountType() {
	return AccountType;
}

public static By getAccountTypeSelect() {
	return AccountTypeSelect;
}

public static By getAddress() {
	return Address;
}

public static By getCity() {
	return City;
}

public static By getState() {
	return State;
}

public static By getCountry() {
	return Country;
}

public static By getPincode() {
	return Pincode;
}

public static By getFirstName() {
	return FirstName;
}

public static By getLastNamees() {
	return LastNamees;
}

public static By getgmail() {
	return gmail;
}

public static By getCalen() {
	return Calen;
}

public static By getTextAcc() {
	return TextAcc;
}

//public static By getPhoneNo() {
//	return PhoneNo;
//	
//}
//
//public static By getPhonepin() {
//	return Phonepin;
//}

public static By getcheckBox() {
	return checkBox;
}

public static By getPhonecode() {
	return Phonecode;
}

public static By getCreateAcc() {
	return CreateAcc;
}

public static By getAccountType1() {
	return AccountType1;
}

//public static By getCalender() {
//	return Calender;
public static By getcrediticon() {
	return crediticon;
}

public static By getFileupload() {
	return Fileupload;
}




public void click() {
	 WebElement svgElementss = driver.findElement(PlusSymbol);
     JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
     jsExecutor.executeScript("arguments[0].click();", svgElementss);
}

public void call() {
	WebElement Calll=driver.findElement(Calen);
	JavascriptExecutor jsExcetuor =(JavascriptExecutor) driver;
	jsExcetuor.executeScript("arguments[0].click();", Calll);
}


public void clickablee() {
    WebDriver svgEleme = (WebDriver) this.driver.findElement(Refresh);
    JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
    jsExecutor.executeScript("arguments[0].click();",svgEleme);
}

public void selecteddd() {
    WebDriver selectedd = (WebDriver) this.driver.findElement(Creates);
    JavascriptExecutor jsExecutor = (JavascriptExecutor)this.driver;
    jsExecutor.executeScript("arguments[0].click();", selectedd);
}

public void updatedClick() {
    WebDriver selectedClicks = (WebDriver) this.driver.findElement(Updatedfields);
    JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
    jsExecutor.executeScript("arguments[0].click();",selectedClicks);
}

public void selected() {
    WebDriver selectedd = (WebDriver) this.driver.findElement(Refresh);
    JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
    jsExecutor.executeScript("arguments[0].click();", selectedd);
}

public void voiclick() {
	   WebDriver selects123 = (WebDriver) this.driver.findElement(PhoneNo);
	    JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
	    jsExecutor.executeScript("arguments[0].click();", selects123);
}

public void crefitopt() {
	WebDriver creditbee= (WebDriver) this.driver.findElement(crediticon);
	  JavascriptExecutor jsExecutor =(JavascriptExecutor)driver;
	  jsExecutor.executeScript("arguments[0].click();", creditbee );
}

public void file() {
	WebElement Fileup=driver.findElement(Fileupload);
	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
    jsExecutor.executeScript("arguments[0].click();",Fileup );
			
}
}







	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
