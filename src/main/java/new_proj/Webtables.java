package new_proj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtables {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("C:\\Users\\lenovo\\Downloads\\Bhagya_Test\\table.html");
	String cn = driver.findElement(By.xpath("//td[text()='Alfreds Futterkiste']")).getText();
	System.out.println(cn);
	
	
	
}
}
