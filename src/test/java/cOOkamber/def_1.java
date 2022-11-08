package cOOkamber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class def_1 {
	WebDriver driver ;
	@Given("I should go to the login page")
	public void i_should_go_to_the_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();  
	   driver.get("https://demoapp.skillrary.com/login.php?type=login");
	   driver.manage().window().maximize();  
	}
	@And("Enter the username {string}")
	public void enter_the_username(String string) {
	   driver.findElement(By.name("email")).sendKeys(string);
	}
	@And("Enter the password {string}")
	public void enter_the_password(String string) {
		driver.findElement(By.name("password")).sendKeys(string); 
	}
	@And("Click on the login button")
	public void click_on_the_login_button() {
		 driver.findElement(By.xpath("//*[@id='last']")).click();  
	}
	@Then("I should see the username as {string}")
	public void i_should_see_the_username_as(String string) {
		String v = driver.getTitle();
		 Assert.assertEquals(string,v);
	}
	@And("click on the username")
	public void click_on_the_username() {
		driver.findElement(By.xpath("//*[@class='dropdown-toggle']")).click();  
	}
	@And("click on the sign out")
	public void click_on_the_sign_out() {
		driver.findElement(By.linkText("Sign out")).click();  
	}
	@Then("I have to go to skillrary homepage as {string}")
	public void i_have_to_go_to_skillrary_homepage_as(String string) {
		String V = driver.getTitle();
		 Assert.assertEquals(string,V);
	}
}
