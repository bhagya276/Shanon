package new_proj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wordometer {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.worldometers.info/coronavirus/");
    //print corona virus cases
	String cvc = driver.findElement(By.xpath("//div[@class='maincounter-number']")).getText();
	System.out.println(cvc);
	//recovered cases
	String rcc = driver.findElement(By.xpath("(//div[@class='maincounter-number'])[3]")).getText();
	System.out.println(rcc);
	//death cases
	String dc = driver.findElement(By.xpath("(//div[@class='maincounter-number'])[2]")).getText();
	System.out.println(dc);
}

}
