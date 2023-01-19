package step_Def;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Actistep {
	WebDriver driver=null;
	@Given("browser is open")
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

	@Given("user is on login page")
	public void onApp() {
		driver.get("https://demo.actitime.com/login.do");
			}
	@When("user enters valid username & password")
	public void onLogin() {
		
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
			
			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		
	}

	

	@When("click on login button")
	public void loginBtn() {
		
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		
	}

	@Then("user should navigate to homepage")
	public void homepage() {
		String expT="Enter Time-Track";
		String actT=driver.findElement(By.xpath("//td[text()='Enter Time-Track']")).getText();
		
		if(actT.equals(expT)) {
			System.out.println("User navigates to home page");
		}
		else {
			System.out.println("TC failed");
		}
	}

}
