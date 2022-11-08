package guru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class gurudefi {
	WebDriver driver;
	@Given("i should go to login page")
	public void i_should_go_to_login_page() {
	   WebDriverManager.chromedriver() .setup();
	   driver = new ChromeDriver();
	   driver.get("https://demo.guru99.com/test/newtours/index.php");
	   driver.manage().window().maximize();
	}
	@When("enter the username {string}")
	public void enter_the_username(String string) {
		driver.findElement(By.xpath("//*[@name='userName']")).sendKeys(string);
	}
	@When("enter the password {string}")
	public void enter_the_password(String string) {
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys(string);

	}
	@When("click on the submit button")
	public void click_on_the_submit_button() {
		driver.findElement(By.xpath("//*[@name='submit']")).click();
	}
	@Then("i should see title as {string}")
	public void i_should_see_title_as(String string) {
	  String d= driver.getTitle();
	  System.out.println("title is " + d);
	  Assert.assertEquals(string,d);
	}
	@Then("click on sign off")
	public void click_on_sign_off() {
		driver.findElement(By.linkText("SIGN-OFF"));
	}
}
