package steps;

import static org.junit.Assert.assertTrue;

import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
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
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeOnErrorComplete.OnErrorCompleteMultiObserver;
import net.bytebuddy.utility.RandomString;
import pageobjects.Login;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class Loginsteps extends utils.base {
	private Properties properties;
	public WebDriverWait wait;
	String departnamewhilecreating;
	

	@Before("@acms")
	public void setup() throws IOException {

		// page object
		properties = new Properties();
		
		FileInputStream fis1 = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\data.properties");
		properties.load(fis1);
		//This line creates a new FileInputStream to read the data from a properties file. 
		//The properties file is located in the specified path relative to the project's base directory.
		
		driver = initializeDriver("chrome", "x64", "windows");//
		//This line initializes the WebDriver object. It calls a method named initializeDriver (not provided in the code snippet) 
		//that sets up the WebDriver with the specified browser, platform, and other desired configurations.
		
		
		ExtentCucumberAdapter.addTestStepLog("Driver Initialized");
		//This line logs a test step using the ExtentCucumberAdapter framework.
		//It adds a log entry to indicate that the WebDriver has been initialized.
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
		Thread.sleep(2000);
		
	}
	 @Then("I passed vaild user name and vaild password")
	    public void i_passed_valid_user_name_and_vail_password() throws InterruptedException {
	     driver.findElement(pageobjects.Login.getUserNameTextfield()).sendKeys(properties.getProperty("Usernameavi"));
	     Thread.sleep(2000);
	     System.out.println("Username added");
	     
	    driver.findElement(pageobjects.Login.getPassworsTextfield()).sendKeys(properties.getProperty("Passwordavi"));
	    System.out.println("Password added");
	    
	 }
	 
	 @ And ("Click on check box")
	 public void click_on_check_box() {
		 driver.findElement(pageobjects.Login.getcheckboxfield()).click();
		 System.out.println("checkbox clicked");
	 }
	  @And("Click On login button")  
	  public void click_on_login_button() throws InterruptedException{
	    driver.findElement(pageobjects.Login.getSignInButton()).click();
	    Thread.sleep(3000);
	     System.out.println("clicked on sign button");
	  }
	  @Then("Enter a date into date to textfield")
	  public void Enter_a_date_into_date_to_tetfield() throws InterruptedException {
		  Login login = new Login(driver);
		login.setDate("2023-07-21");
		  /// how to call setdate method in this block
		Thread.sleep(3000);
		System.out.println("calender date is print");
		
	  }
	  @And ("Click on account module")
	  public void Click_on_account_module() throws InterruptedException {
		 driver.findElement(pageobjects.Login.getaccountdropdown()).click();
		 System.out.println("Click on account module");
		 Thread.sleep(3000);
		  
	  }
	  
	 @And ("Click on under account submodule account button")
	 public void Click_on_under_account_submodule_account_button() throws InterruptedException {
		driver.findElement(pageobjects.Login.getaccountbutton()).click();
		 System.out.println("Click on under account submodule account button");
		 Thread.sleep(3000);
	 }
	 @And ("Click on create button")
	 public void  Click_on_create_button() throws InterruptedException{
		 Login login = new Login(driver);
		 login.click();
		 Thread.sleep(3000);
		  }
@And ("Select region dropdown")
public void Select_region_dropdown() throws InterruptedException {
	driver.findElement(pageobjects.Login.getregiondropdown()).click();
	System.out.println("region dropdown selected");
	Thread.sleep(3000);
}
@And ("Select dropdown click")
public void Select_dropdown_click() throws InterruptedException {
	driver.findElement(pageobjects.Login.getselectlist()).click();
	System.out.println("particular region is selected");
	Thread.sleep(3000);
}

@And ("enter company profile name")
public void enter_company_profile_name() throws InterruptedException {
	driver.findElement(pageobjects.Login.getprofile()).sendKeys("cqaqwapzeqswzqa752333");
	System.out.println("profile name entered");
	Thread.sleep(3000);
}

@And ("select account type dropdown")
public void select_account_type_dropdown() throws InterruptedException {
	driver.findElement(pageobjects.Login.getaccounttype()).click();
	System.out.println("account type dropdown is selected");
	Thread.sleep(3000);
	}

@And ("select a customer")
public void select_a_customer() throws InterruptedException {
	driver.findElement(pageobjects.Login.getcustomer()).click();
	System.out.println("customer is selected");
	Thread.sleep(3000);
}

@And ("enter address in the textfield")
public void enter_address_in_the_textfield() throws InterruptedException {
	driver.findElement(pageobjects.Login.getaddress()).sendKeys("bhubaneswar");
	Thread.sleep(3000);
	System.out.println("address entered");
}

@And ("enter state in the textfield")
public void enter_state_in_the_textfield() throws InterruptedException {
	driver.findElement(pageobjects.Login.getstate()).sendKeys("odisha");
	Thread.sleep(3000);
	System.out.println("state entered");
}

@And ("enter country in the textfield")
public void enter_country_in_the_textfield() throws InterruptedException {
	driver.findElement(pageobjects.Login.getcountry()).sendKeys("India");
	Thread.sleep(3000);
	System.out.println("country entered");
}

@And ("enter postcode in the textfield")
public void enter_postcode_in_the_textfield() throws InterruptedException {
	driver.findElement(pageobjects.Login.getpostalCode()).sendKeys("750001");
	Thread.sleep(3000);
	System.out.println("postal code entered");
}


@And ("enter admin profile name")
public void enter_admin_profile_name() throws InterruptedException {
	driver.findElement(pageobjects.Login.getuserFirstName()).sendKeys("kanhu_gouda323");
	Thread.sleep(3000);
	System.out.println("profile name entered");
}

@And ("enter email")
public void enter_email() throws InterruptedException {
	driver.findElement(pageobjects.Login.getuserEmail()).sendKeys("jptw@biumemail.com");
	Thread.sleep(3000);
	System.out.println();
}

@And ("click on manage account checkbox")
public void click_on_manage_account_checkbox() throws InterruptedException {
	driver.findElement(pageobjects.Login.getcheckbox()).click();
	Thread.sleep(3000);
	System.out.println("checkbox clicked");
}

@And ("clik on create button")
public void clik_on_create_button() throws InterruptedException {
	driver.findElement(pageobjects.Login.getCreate()).click();
	Thread.sleep(3000);
	System.out.println("create button clicked");
	Thread.sleep(10000);
}
//@And ("select one customer")
//public void select_one_customer() throws InterruptedException {
//	driver.findElement(pageobjects.Login.getcheckbox1()).click();
//	Thread.sleep(3000);
//	System.out.println("checkbox cliked");
//	Thread.sleep(3000);
//}
@And ("get text from technical assignee")
	 public void get_text_from_technical_assignee() throws InterruptedException {
        WebElement get = driver.findElement(By.xpath("//button[@aria-label='Technician Assign']"));
		 Actions actions = new Actions(driver);
		 actions.moveToElement(get).perform();
		 Thread.sleep(3000);
		 WebElement tooltipElement = driver.findElement(By.xpath("//div[@class='MuiTooltip-tooltip MuiTooltip-tooltipPlacementBottom css-1spb1s5']"));
         String tooltipText = tooltipElement.getText();
         System.out.println("Tooltip Message: " + tooltipText);
     	Thread.sleep(5000);
		}
	 }		 
		 
		 
//String str = driver.findElement(pageobjects.Login.gettechnical()).getText();
//System.out.println(str);		 
	








		 //		 String buttonText = get.getText();
//         System.out.println("Text of the 'Technical Assign' button: " + get);
//     } finally {
//         // Remember to close the browser after you're done
//         driver.quit();
//     }
 
		 
//		 Login login = new Login(driver);
//		 //login.assignee();
//		 WebElement get = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@aria-label='Technician Assign']")));
//if (get.isDisplayed()) {
//	System.out.println("technical is visibale"+get.getText());
//	
//}
	        //Thread.sleep(1000);
//		 WebElement  = driver.findElement(technical);
//	        String text=get.getText();
//		driver.findElement(pageobjects.Login.gette)
		//System.out.println(str);
		//System.out.println("technical assignee"+str);
	
