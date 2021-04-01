package Demotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

public WebDriver driver;
@BeforeSuite
public void setup() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	}
@Test
public void dologin() {
	driver.get("https://www.facebook.com/?stype=lo&jlou=AfeHuAJLb66vFBmSRYcJBTkOkimbxp4ouCB4PlSkX1s2vML2b-2766PJGMdOLDJt07DZMDmSBVSA3wExhYiUmODCVk6gj2-3_pLU2PS2f7KIUQ&smuh=28241&lh=Ac_XlQsZnPIL9m7y_RQ");
driver.findElement(By.id("email")).sendKeys("piyushgolu9199@gmail.com");
driver.findElement(By.id("pass")).sendKeys("7209296269");
driver.findElement(By.id("SignIn")).click();
}
@AfterSuite
public void teardown() {
	driver.quit();
}
	
}
