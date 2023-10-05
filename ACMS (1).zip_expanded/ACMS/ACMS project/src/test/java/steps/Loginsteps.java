package steps;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertTrue;

import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.security.auth.spi.LoginModule;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.knowm.xchart.style.markers.Plus;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

import de.erichseifert.vectorgraphics2d.VectorHints.Key;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeOnErrorComplete.OnErrorCompleteMultiObserver;
import net.bytebuddy.utility.RandomString;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Loginsteps extends utils.base {
	private Properties properties;
	public WebDriverWait wait;
	String departnamewhilecreating;
	

	@Before("@acms")
	public void setup() throws IOException {

	
		properties = new Properties();
		
		FileInputStream fis1 = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\data.properties");
		properties.load(fis1);
		driver = initializeDriver("chrome", "x64", "windows");//
		ExtentCucumberAdapter.addTestStepLog("Driver Initialized");
		wait = new WebDriverWait(driver, 60);	
		ExtentCucumberAdapter.addTestStepLog("Organization page object Initialized");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@After("@acms")
	public void teardown(Scenario scenario) throws IOException, InterruptedException {
		if (scenario.isFailed()) {
			scenario.attach(getScreenshot(driver), "image/png", "screenshot name");
		}
		driver.quit();
	}
	@Given("I enter URL on the browser")
	public void i_enter_url_of_ngteco_application() throws Throwable {
		driver.get("https://acms.minervaiotdev.com/acms/login\"");
		Thread.sleep(1000);	
	}
	 @Then("I passed vaild user name and vaild password")
	    public void i_passed_valid_user_name_and_vail_password() throws InterruptedException {
		// WebElement E1=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(""));
	     driver.findElement(pageobjects.Login.getUserNameTextfield()).sendKeys(properties.getProperty("Usernamesyed"));
	     Thread.sleep(1000);
	     System.out.println("Username added");
	     
	     
	    driver.findElement(pageobjects.Login.getPassworsTextfield()).sendKeys(properties.getProperty("Passwordsyed"));
	    System.out.println("Password added");   
	 }
	 
	 @And ("Click on check box")
	 public void click_on_check_box() {
		 driver.findElement(pageobjects.Login.getcheckboxfield()).click();
		 System.out.println("checkbox clicked");
	 }
	  @And("Click On login button")  
	  public void click_on_login_button() throws InterruptedException{
	    driver.findElement(pageobjects.Login.getSignInButton()).click();
	    WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement welcomeMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[1]/header/div[1]/div/button/span[1]/img")));
       if(welcomeMessage.isDisplayed()) {
    	 System.out.println("login is successfull");  
    	 System.out.println("Congrats");
       }
	  }
	  
		
	  @Then("User will get Invalid Login message")
	  public void User_will_get_Invalid_Login_message() {
		  driver.findElement(pageobjects.Login.Errormsg());
		  WebDriverWait wait1 = new WebDriverWait(driver, 10);
		  WebElement InvalidLogin =wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"zndy6gzqnb\"]/div[1]")));
		  if(InvalidLogin.isDisplayed())
			  System.out.println("Login is not possible"+InvalidLogin.getText());
	  }
	@When("User Clicks on Region") 
	public void User_Clicks_on_Region() throws InterruptedException {
		driver.findElement(pageobjects.Login.getSystemRegion()).click();
		System.out.println("i clicked on Region");
		Thread.sleep(1000);
		driver.findElement(pageobjects.Login.getRegion()).click();
		System.out.println("I clicked on Region sub menu ");
		Thread.sleep(1000);
		
	}
	 @And("Add the details on it")
	 public void Add_the_details_on_it() throws InterruptedException{ 
	
		driver.findElement(pageobjects.Login.getRefresh()).click();
		System.out.println("REFRESHED");
		Thread.sleep(3000);
		driver.findElement(pageobjects.Login.getCreates()).click();
		System.out.println("I clicked on create icon");

		Thread.sleep(3000);
		driver.findElement(pageobjects.Login.getCodes()).sendKeys(properties.getProperty("codefield"));
		System.out.println("I have passed the user code");

		Thread.sleep(13000);
		driver.findElement(pageobjects.Login.getUserNameTextfields()).sendKeys(properties.getProperty("UserName"));
		System.out.println("i have passed the password");

		driver.findElement(pageobjects.Login.getUserNameTextFieldsText()).click();
		System.out.println("ihave passde the parent name");

		driver.findElement(pageobjects.Login.getUserNameTextFieldsTextss()).click();
//    driver.findElement(pageobjects.Login.getRemarks1234()).sendKeys(properties.getProperty("RemarksInfo"));	
//    	Thread.sleep(2000);
	 }		
		@Then("Click on create and User succesfully created")
		public void Click_on_create_and_User_succesfully_created() throws InterruptedException{
			Thread.sleep(4000);
		driver.findElement(pageobjects.Login.getCreateButton()).click();
		
		 WebDriverWait wait = new WebDriverWait(driver, 100);
		   WebElement welcomeMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"8b483xdxca\"]/div[1]")));
		   
		   Actions actions = new Actions(driver);
	        actions.click(welcomeMessage).build().perform();
	      // WebElement el = driver.findElement(By.xpath("//div[contains(text(),'Level deleted successfully.')]"));
		   

	        String ExpectedDeleteMessageLevel = welcomeMessage.getText();

	        System.out.println(ExpectedDeleteMessageLevel);

	        String actualDeleteMessageLevel = properties.getProperty("deleteLevelMessage");

	        System.out.println(actualDeleteMessageLevel);
		   Assert.assertEquals("Success message Matching", ExpectedDeleteMessageLevel, actualDeleteMessageLevel);
         if(welcomeMessage.isDisplayed())  
         {
		  System.out.println("success"+ welcomeMessage.getText());
         }

		  // Add any additional assertions or verifications as needed
	
			   
		//WebElement E1= driver.findElement(By.xpath("//*[@id=\\\"6hwhqajxks\\\"]/div[1]"));
		}
//		@Then("I can see the successful message")
		public void I_can_see_the_successful_message() throws InterruptedException{
			
			
	//	WebElement error1=	driver.findElement(pageobjects.Login.getToast1()).click();
			
//			  WebDriverWait wait = new WebDriverWait(driver, 10);
//			  WebElement Toast= driver.findElement(By.xpath("//*[@id=\\\"6hwhqajxks\\\"]/div[1]"));
		 // System.out.println("Region created Successfully"+error1.getText());
//	    WebElement Toast  = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"6hwhqajxks\"]/div[1]")));
//	    
//	   if(Toast.isDisplayed())
//			{
//	    	System.out.println("Created Successfully"+Toast.getText());
//	    	Thread.sleep(5000);
//	    	
//	    	Thread.sleep(1000);
//	    	driver.close();
//			}
//	

//	 
//	    else {	
//	    	 WebDriverWait waitss = new WebDriverWait(driver, 10);
//			  WebElement popp=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath( "//*[@id=\"iwk2czly8f\"]/div[1]"))); 
//			  if(popp.isDisplayed()) {
//			 System.out.println(popp.getText()); }
//	    driver.quit();	   
}
		
	@And("User have started upadting the Region")
	public void User_have_started_upadting_the_Region() throws InterruptedException{
		driver.findElement(pageobjects.Login.getUpdatedfields()).click();
		Thread.sleep(5000);
	}
		@And("User have Entered all the updated fields")
		public void User_have_Entered_all_the_updated_fields() throws InterruptedException{
			driver.findElement(pageobjects.Login.getCodeUpdates()).sendKeys(properties.getProperty("CodesUpdate"));
			Thread.sleep(5000);
			driver.findElement(pageobjects.Login.getNameEdit()).sendKeys(properties.getProperty("NAMEEDIT"));
			Thread.sleep(5000);
			driver.findElement(pageobjects.Login.getParent()).click();
			Thread.sleep(5000);
			driver.findElement(pageobjects.Login.getDropdown()).click();
			Thread.sleep(5000);
//			driver.findElement(pageobjects.Login.getRemarksudt()).sendKeys(properties.getProperty("RemarkSsyed"));
		}
		@Then("User click on Update and display Toast Message")
		public void User_click_on_Update_and_display_Toast_Message() throws InterruptedException{
			driver.findElement(pageobjects.Login.getCreated()).click();
			Thread.sleep(5000);
			WebElement warningmsz=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div[3]/div/div/div[1]")));
			if(warningmsz.isDisplayed())
				System.out.println("Created Successfully"+warningmsz.getText());
		driver.quit();
	    
		}
		@Then("Click on create Account and add all mandatory fields")
		public void Click_on_create_Account_and_add_all_mandatory_fields() throws InterruptedException{
			driver.findElement(pageobjects.Login.getAccount()).click();
			Thread.sleep(5000);
			driver.findElement(pageobjects.Login.getAccountCreate()).click();
			Thread.sleep(5000);
			driver.findElement(pageobjects.Login.getPlusSymbol()).click();
				driver.findElement(pageobjects.Login.getAccRegion()).click();
				Thread.sleep(5000);
				driver.findElement(pageobjects.Login.getAccRegionSel()).click();
				
		}
				@And("Added all mandatory fields")
			
				public void Added_all_mandatory_fields()throws InterruptedException {
			
				
				driver.findElement(pageobjects.Login.getTextField1()).sendKeys(properties.getProperty("Namefield")); 
				Thread.sleep(5000);
				driver.findElement(pageobjects.Login.getAccountType()).click();
				Thread.sleep(5000);
				driver.findElement(pageobjects.Login.getAccountTypeSelect()).click();
				Thread.sleep(5000);
			    driver.findElement(pageobjects.Login.getAddress()).sendKeys(properties.getProperty("AddressInfo"));
			    Thread.sleep(5000);
			    driver.findElement(pageobjects.Login.getCity()).sendKeys(properties.getProperty("CityName"));
			    Thread.sleep(5000);
			    driver.findElement(pageobjects.Login.getState()).sendKeys(properties.getProperty("stateTextField"));
			    Thread.sleep(5000);
			    driver.findElement(pageobjects.Login.getCountry()).sendKeys(properties.getProperty("CountryName"));
			    Thread.sleep(5000);
			    driver.findElement(pageobjects.Login.getPincode()).sendKeys(properties.getProperty("Postalcode"));
			    Thread.sleep(5000);
			    WebElement company=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div/div/div[2]/form/div[2]/div[2]/div/h6/b")));
				if(company.isDisplayed())
				{
					System.out.println("company visible"+company.getText());	
				}
				Thread.sleep(1000);
		}
			@And("I have Validated Admin Profile")
			public void I_have_Validated_Admin_Profile() throws InterruptedException {
				WebElement Admin=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div/div/div[2]/form/div[2]/div[4]/div/h6/b")));
				if(Admin.isDisplayed())
				{
					System.out.println("AdminProfileVisisble"+Admin.getText());
				}
			driver.findElement(pageobjects.Login.getFirstName()).sendKeys(properties.getProperty("FirstNamee"));
			Thread.sleep(5000);
			driver.findElement(pageobjects.Login.getLastNamees()).sendKeys(properties.getProperty("LastNamee"));
			Thread.sleep(5000);
			driver.findElement(pageobjects.Login.getgmail()).sendKeys(properties.getProperty("Gmaill"));
			
			Thread.sleep(5000);
			//driver.findElement(pageobjects.Login.getPhoneNo()).click();
			Thread.sleep(5000);
			//driver.findElement(pageobjects.Login.getPhonepin()).sendKeys(properties.getProperty("Countrycode"));
			driver.findElement(pageobjects.Login.getPhonecode()).sendKeys(properties.getProperty("Phonenumber"));
			Thread.sleep(5000);
			driver.findElement(pageobjects.Login.getcheckBox()).click();
			Thread.sleep(5000);
			driver.findElement(pageobjects.Login.getCreateAcc()).click();
			WebElement E1=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"dv6p1peswx\"]/div[1]")));
			if(E1.isDisplayed())
			{
				System.out.println("Account Created Successfully"+E1.getText());
				Thread.sleep(15000);
				driver.quit();
			}
			}
               @When("I click on Claender icon")
               public void I_click_on_Claender_icon() {   
			    driver.findElement(pageobjects.Login.getCalen()).click();
			    WebDriverWait Waiting=new WebDriverWait(driver, 10);
			    WebElement date=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/input[1]"));
		    Actions action =new Actions(driver);
			    action.moveToElement(date).click().perform();
		    WebElement Target=driver.findElement(By.xpath("/td[@data-date='2023-08-09']"));
			    	        
               }	
               
               
               @Then("I have Uploaded the po file")
               public void I_have_Uploaded_the_po_file() throws InterruptedException{    
               driver.findElement(pageobjects.Login.getTextAcc()).click();
				Thread.sleep(2000);
				driver.findElement(pageobjects.Login.getAccountType1()).click();
				Thread.sleep(5000);
				driver.findElement(pageobjects.Login.getcrediticon()).click();
				Thread.sleep(2000);
				 WebElement fileInput = driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M10 4H4c-1')]")); // Replace with your file input element's ID
                        fileInput.click();
                        Thread.sleep(2000);
			        // Specify the file path to upload
			        String filePath = "C:/Users/syedjeelan/OneDrive - ZKTECO BIOMETRICS INDIA PVT.LTD/Pictures/Screenshots/Screenshot (1).png"; // Replace with the actual file path

			        // Use JavaScript Executor to set the file path
			        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			        jsExecutor.executeScript("arguments[0].style.display='block';", fileInput); // Make the element visible
			        fileInput.sendKeys(filePath);

			        // Perform assertions or further actions
			        // ...

			        Thread.sleep(3000); // Just for demonstration

				
				
				
				
				
				
				
				
//				WebElement Upload=driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M10 4H4c-1')]"));
//				Upload.click();
//				Thread.sleep(2000);
//				Upload.sendKeys("C:/Users/syedjeelan/OneDrive - ZKTECO BIOMETRICS INDIA PVT.LTD/Pictures/Screenshots/Screenshot (1).png");
			  // driver.findElement(pageobjects.Login.getFileupload()).click();
			   Thread.sleep(3000);
//			   driver.findElement(pageobjects.Login.getFileupload()).sendKeys("C:\\Users\\syedjeelan\\OneDrive - ZKTECO BIOMETRICS INDIA PVT.LTD\\Pictures\\Screenshots\\Screenshot (1).png");
//			    Thread.sleep(2000);
			   
		 
			}
}
			
			


			
			
			
			
			
		
 


