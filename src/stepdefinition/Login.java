package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Login {
	//System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
	WebDriver driver;
@Given("User is in search page")
public void navigateSearchpage() {
	System.out.println("we are in given");
	System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://tutorialsninja.com/demo");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
}

@When("User enters {string} product")
public void enterproduct(String s) {
	System.out.println("we are in when");
	driver.findElement(By.xpath("//input[@name='search']")).sendKeys(s);
	
	
}
@And("click on search button")
public void clicksearch() {
	System.out.println("we are in and");
	driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
}
@Then("Product {string} should be displayed")
public void verifyproduct(String product) {
	System.out.print(product);
	String s=driver.findElement(By.xpath("//div[@class='caption']//p[1]")).getText();
	if(s.contains(product)) {
	System.out.println("product got displayed");
	}
	else {
		System.out.println("product not displayed");
	}
    driver.quit();
}
}
