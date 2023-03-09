package seleniumtest;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Webdrivertest {
	@SuppressWarnings("deprecation")
	public static void main(String [] args) {
		System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='iPhone']")).click();
		String price=driver.findElement(By.xpath("//div[@id='content']//h2[contains(text(),'$')]")).getText();
		driver.findElement(By.name("quantity")).clear();
		driver.findElement(By.name("quantity")).sendKeys("2");
		driver.findElement(By.id("button-cart")).click();
		//driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).isDisplayed();
		//driver.findElement(By.xpath("//div[@id='product-product']/div[contains(text(),'Success:')")).isDisplayed();
		driver.findElement(By.xpath("//span[@id='cart-total']")).click();
		
		
}
}
