package new_proj;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamic {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[text()='✕']")).click();
driver.findElement(By.xpath("")).sendKeys("mobiles under 20000",Keys.ENTER);
//print the price of mobile phone
String price = driver.findElement(By.xpath("//div[@class='col col-7-12']//div[3]")).getText();
System.out.println(price);
//print the reviews
String rating=driver.findElement(By.xpath("")).getText();
System.out.println(rating);

}

}
