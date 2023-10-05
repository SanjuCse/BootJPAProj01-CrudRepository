package pageobjects;

import org.openqa.selenium.By;
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
	private static By dateInputLocator = By.xpath("//input[@id='mui-5']");
	private static By accountdropdown= By.xpath("(//span[@class='MuiButton-label'])[4]");
	private static By accountbutton=By.xpath("//a[@role='button']//span[@class='MuiButton-label'][normalize-space()='Account']");
	//start
	 private static By create = By.xpath("(//button[@aria-label='COMMON009'])[2]");
	
	 private static By regiondropdowon= By.xpath("//div[@class='MuiFormControl-root MuiFormControl-fullWidth css-tzsjye']//div[@class='MuiOutlinedInput-root MuiInputBase-root MuiInputBase-colorPrimary MuiInputBase-fullWidth MuiInputBase-formControl MuiInputBase-sizeSmall css-1bp1ao6']");
	 private static By selectlist=By.xpath("//li[normalize-space()='Indialupayw']");
	 
	 private static By profile= By.name("companyName");
	 private static By accounttype=By.xpath("//div[@id='mui-component-select-companyType']");
	 private static By customer= By.xpath("//li[@role='option']");
	 private static By address= By.name("companyAddress");
	 private static By state= By.name("state");
	 private static By country= By.name("country");
	 private static By postalCode= By.name("postalCode");
	 private static By userFirstName= By.name("userFirstName");
	 private static By userEmail= By.name("userEmail");
	 private static By checkbox=By.xpath("//input[@type='checkbox']");
	 private static By Create=By.xpath("//button[normalize-space()='Create']");
	 private static By technical= By.xpath("(//button[@aria-label='Technician Assign'])[1]");
	 //private static By checkbox1= By.xpath("//input[@value='3']");
	 
	 
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
	
	
	//private static By dateInputLocator = By.xpath("//input[@id='mui-5']");
	public void setDate(String date) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            String script = "arguments[0].setAttribute('value', arguments[1]);";

            WebElement dateInput = driver.findElement(dateInputLocator);
            js.executeScript(script, dateInput, date);
        } catch (org.openqa.selenium.JavascriptException e) {
            // Handle the JavascriptException here (e.g., print the error message or log it)
            e.printStackTrace();
        }
    }

	public static By getaccountdropdown() {
		return accountdropdown;
		
	}
	public static By getaccountbutton() {
		return accountbutton;
	}

	 public void click() {
	        WebElement svgElement = driver.findElement(create);
	        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	        jsExecutor.executeScript("arguments[0].click();", svgElement);
	    }
		 
	 public static By getregiondropdown() {
		 return regiondropdowon;
	 }
public static By getselectlist() {
	return selectlist;
}
	 public static By getprofile() {
		 return profile;
	 }
	 public static By getaccounttype() {
		 return accounttype;
	 }
	 
	 public static By getcustomer() {
		 return customer;
	 }
	 public static By getaddress() {
		 return address;
	 }
	 public static By getstate() {
		 return state;
	 }
	 
	 public static By getcountry() {
		 return country;
		
	 }
	 public static By getpostalCode() {
		 return postalCode;
	 }
	 
	 
	 public static By getuserFirstName() {
		 return userFirstName;
		 
	 }
	 
	public static By getuserEmail() {
		return userEmail;
		
	}
	 
	 public static By getcheckbox() {
		 return checkbox;
	 }
	 
	 public static By getCreate() {
		 return Create;
	 }
	 public static By gettechnical() {
		 return technical;
	 }
	 

//	 public static By getcheckbox1() {
//		 return checkbox1;
//	 }
//	 public void assignee() {
//	        WebElement get = driver.findElement(technical);
//	        String text=get.getText();
//	        //JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//	        //jsExecutor.executeScript("arguments[0].click();", get);
//	        //return (String) jsExecutor.executeScript("return arguments[0].textContent", get);
//	        //return get.getText();
//	        System.out.println("technical assign"+text);

}


