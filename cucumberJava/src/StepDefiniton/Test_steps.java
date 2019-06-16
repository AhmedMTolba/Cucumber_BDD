package StepDefiniton;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Test_steps {
	
	WebDriver driver ;
	
	@Given("User in Login Page")
	public void user_in_Login_Page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	}

	@When("User view LoginPage Successfuly")
	public void user_view_LoginPage_Successfuly() {
	   
		Assert.assertTrue(driver.getTitle().contains("The Internet"));
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String Username, String Password) {
	    driver.findElement(By.id("username")).sendKeys("tomsmith");
	    driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
	    driver.findElement(By.xpath("//button[@type=\'submit\']")).click();
	    
		
		
	}

	@Then("Message displayed Login Sucessfuly")
	public void message_displayed_Login_Sucessfuly() {
	    Assert.assertTrue(driver.findElement(By.xpath("//div[@id='flash']")).isDisplayed()); 
	    driver.quit();
	    
	}
	
	
	
}
