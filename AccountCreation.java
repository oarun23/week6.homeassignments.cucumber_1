package home_steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountCreation {
	
	ChromeDriver driver;
	
	@Given("Set the Salesforce environment")
	public void set_the_salesforce_environment() {
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--disable-notifications");
	 
		driver = new ChromeDriver(option);
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

	@Given("Enter the salesforce username")
	public void enter_the_salesforce_username() {

		driver.findElement(By.id("username")).sendKeys("gokul.sekar@testleaf.com");
			
	}

	@Given("Enter the salesforce password")
	public void enter_the_salesforce_password() {
		
		driver.findElement(By.id("password")).sendKeys("Leaf$321");
	
	}

	@When("clik on login button1")
	public void clik_on_login_button() {
	   
		driver.findElement(By.id("Login")).click();
	}

	@When("Click on toggle button")
	public void click_on_toggle_button() {
		driver.findElement(By.xpath("//button[@title='App Launcher']")).click();
		driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		
	}

	@When("Click on Accounts tab")
	public void click_on_accounts_tab() {
	   WebElement element = driver.findElement(By.xpath("//span[text()='Accounts']"));
	   
	   Actions action =new Actions(driver);
	   
	   action.moveToElement(element).click().perform();
	}

	@When("Click on New Button")
	public void click_on_new_button() {
	   
		driver.findElement(By.xpath("//div[text()='New']")).click();
	}

	@Given("Enter your name")
	public void enter_your_name() {
	  
		//driver.findElement(By.name("Name")).sendKeys("Arun Owaiyar");
		
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Arun Owaiyar");
	}

	@Given("Select Ownership as Public")
	public void select_ownership_as_public() {
	  
		driver.findElement(By.xpath("//button[@aria-label='Ownership']")).click();
		driver.findElement(By.xpath("//span[@title='Public']")).click();
		
	}

	@When("Click save button")
	public void click_save_button() {
	   driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	}

	@Then("Verify the Account name")
	public void verify_the_account_name() {
	    
		String text = driver.findElement(By.xpath("//span/a[@title='Arun Owaiyar']")).getText();
		
		if(text.equals("Arun Owaiyar")) {
			System.out.println("The verfication is success");
		}else {
			System.out.println("The verification is not valid");
		}
		
	}

}
