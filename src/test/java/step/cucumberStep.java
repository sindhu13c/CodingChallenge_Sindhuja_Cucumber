package step;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class cucumberStep {
	
	WebDriver driver;
	String driverPath="./src/test/java/utility/chromedriver.exe";
	

	@Given("^User launch the application$")
	public void user_launch_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver=new ChromeDriver();
		
		driver.get("http://www.apple.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	
	@When("^User Click On Ipad Link$")
	public void user_Click_On_Ipad_Link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement ipadLink=driver.findElement(By.xpath("//*[@id='ac-globalnav']/div/ul[2]/li[3]/a"));
		ipadLink.click();
	}
	
	@Then("^Click On Buy Link$")
	public void click_On_Buy_Link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement buyLink=driver.findElement(By.xpath("//*[@id='main']/section[1]/div[1]/div/span/a[2]"));
		buyLink.click();
	}
	

	@Then("^Click On Silver Color$")
	public void click_On_Silver_Color() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);

		WebElement silverCol=driver.findElement(By.xpath("//*[@id='dimensionColor-silver']"));
		silverCol.click();
	}

	@Then("^Click On (\\d+)GB Storage$")
	public void click_On_GB_Storage(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		WebElement storageOpt=driver.findElement(By.xpath("//*[@id='Item2-dimensionCapacity-32gb']"));
		storageOpt.click();
	}

	@Then("^Click On WiFI\\+Cellular Connectivity$")
	public void click_On_WiFI_Cellular_Connectivity() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		WebElement connectOpt=driver.findElement(By.xpath("//*[@id='Item3-dimensionConnection-wificell']"));
		connectOpt.click();
	}

	@Then("^Click On AppleCare$")
	public void click_On_AppleCare() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		WebElement applecareOpt=driver.findElement(By.xpath("//*[@id='applecare_open']"));
		applecareOpt.click();
	}

	@Then("^Click On Add$")
	public void click_On_Add() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		WebElement addBtn=driver.findElement(By.xpath("html/body/overlay[6]/materializer/div/div[1]/div/materializer/accessory/div[3]/div/button"));
		addBtn.click();
	}

	@Then("^Click On Continue$")
	public void click_On_Continue() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		WebElement continueBtn=driver.findElement(By.name("proceed"));
		continueBtn.click();
	}

	@Then("^Click On AddToBag$")
	public void click_On_AddToBag() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		WebElement addtobagBtn=driver.findElement(By.xpath("//*[@id='summaryheader-form']/div/span/button"));
		addtobagBtn.click();
	}
	
	@Then("^Click On ReviewBag Button$")
	public void click_On_ReviewBag_Button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		WebElement reviewbagBtn=driver.findElement(By.xpath("//*[@id='summaryheader-form']/div/span/button"));
		reviewbagBtn.click();
	}

	@Then("^Click On CheckOut$")
	public void click_On_CheckOut() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);

		WebElement checkOutBtn=driver.findElement(By.xpath("//*[@id='shoppingCart.actions.checkout']"));
		checkOutBtn.click();
	}

	@Then("^Click On ContinueasGuest$")
	public void click_On_ContinueasGuest() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);

		WebElement contAsGuestBtn=driver.findElement(By.xpath("//*[@id='guest-checkout']"));
		contAsGuestBtn.click();
	}

	@Then("^Select ContinueToShipping Address$")
	public void select_ContinueToShipping_Address() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);

		WebElement contShipAddress=driver.findElement(By.xpath("//*[@id='checkout-container']/div/div[6]/div[1]/div[2]/div/div/div[3]/div/div/div/button"));
		contShipAddress.click();
	}

	@Then("^Enter Address Details$")
	public void enter_Address_Details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);

		WebElement firstName=driver.findElement(By.xpath("//*[@id='checkout.shipping.addressSelector.newAddress.address.firstName']"));
		firstName.sendKeys("sindhuja");
		
		Thread.sleep(1000);

		WebElement lastName=driver.findElement(By.xpath("//*[@id='checkout.shipping.addressSelector.newAddress.address.lastName']"));
		lastName.sendKeys("c");
		
		Thread.sleep(1000);

		WebElement streetAdre=driver.findElement(By.xpath("//*[@id='checkout.shipping.addressSelector.newAddress.address.street']"));
		streetAdre.sendKeys("580 mill creek ln");
		
		Thread.sleep(1000);

		WebElement apt=driver.findElement(By.xpath("//*[@id='checkout.shipping.addressSelector.newAddress.address.street2']"));
		apt.sendKeys("205");
		
		Thread.sleep(1000);

		WebElement email=driver.findElement(By.xpath("//*[@id='checkout.shipping.addressContactEmail.address.emailAddress']"));
		email.sendKeys("rvijayananth@gmail.com");
		
		Thread.sleep(1000);

		WebElement phone=driver.findElement(By.xpath("//*[@id='checkout.shipping.addressContactPhone.address.fullDaytimePhone']"));
		phone.sendKeys("650-655-5025");
		
	}

	@Then("^Click On ContinueToPayment$")
	public void click_On_ContinueToPayment() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);

		WebElement continueToPayBtn=driver.findElement(By.xpath(".//*[@id='checkout-container']/div/div[5]/div[1]/div[2]/div/div/div/div[1]/div[4]/div/div/div/div/button"));
		continueToPayBtn.click();
	}

	@Then("^Select Credit/Debit$")
	public void select_Credit_Debit() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);

		WebElement creditBtn=driver.findElement(By.xpath("//*[@id='checkout.billing.billingOptions.options.0-selector']"));
		creditBtn.click();
	}

	@Then("^Enter CreditCard Details$")
	public void enter_CreditCard_Details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);

		WebElement cardNo=driver.findElement(By.xpath("//*[contains(@id,'cardNumber')]"));
		cardNo.sendKeys("234456785678");
		
		Thread.sleep(1000);

		WebElement expDt=driver.findElement(By.xpath("//*[contains(@id,'expiration')]"));
		expDt.sendKeys("10/20");
	
		Thread.sleep(1000);

		WebElement cvvNo=driver.findElement(By.xpath("//*[contains(@id,'securityCode')]"));
		cvvNo.sendKeys("234");
	}

	@Then("^Click On Order$")
	public void click_On_Order() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);

		WebElement reviewBtn=driver.findElement(By.xpath(".//*[@id='checkout-container']/div/div[5]/div[1]/div[2]/div/div/div[1]/div[2]/div/div/div/button"));
		reviewBtn.click();
	}

	
	@Then("^Verify Error Message$")
	public void verify_Error_Message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(1000);

		WebElement errorMsg=driver.findElement(By.xpath("//*[contains(@id,'cardNumber-error')]"));
		Assert.assertEquals("Please enter a valid credit card number.", errorMsg.getText());
	
	}

	@Then("^Close Browser$")
	public void close_Browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(1000);

		driver.close();
	
	}

}
