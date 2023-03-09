package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class BlogPage {
	
	public class Login {
		//System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
		WebDriver driver;
	@Given("user is in Blog page")
	public void navigateSearchpage() {
		System.out.println("we are in given");
		System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://Omayo.blogspot.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

	@When("user enters data in search field")
	public void enterproduct(String s) {
		System.out.println("we are in when");
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys(s);
}
