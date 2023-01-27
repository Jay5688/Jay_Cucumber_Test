package jaytestDefnition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Jay_Test_Steps {
	WebDriver driver;
	String expectedTitle= "Adactin.com - Search Hotel";
	
	@Given("User is on the login page")
	public void when_user_is_on_the_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Chrome_Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com");
		driver.manage().window().maximize();
		// Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Given("User name and Userid feilds are displayed")
	public void user_name_and_userid_feilds_are_displayed() {
		WebElement uName= driver.findElement(By.id("username"));
		String s1= uName.getAttribute("value");
		System.out.println(s1);
		WebElement uPass= driver.findElement(By.id("password"));
		String s2 =uPass.getAttribute("value");
		System.out.println(s2);
		
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@When("User enters username and password")
	public void user_enters_username_and_password() {
		WebElement uName= driver.findElement(By.id("username"));
		uName.sendKeys("Jayakishore");
		//usName= "Jayakishore";
		driver.findElement(By.id("password")).sendKeys("Test@12345");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.id("login")).click();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("Login is successfull")
	public void login_is_successfull() {
		String actualGreeting = driver.findElement(By.id("username_show")).getAttribute("value");
		String expectedGreeting = "Hello Jayakishore!";
		assertEquals(expectedGreeting, actualGreeting);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("Search Hotel page is displayed")
	public void search_hotel_page_is_displayed() {
		String actualTitle= driver.getTitle();
	    assertEquals(expectedTitle, actualTitle);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	

}
