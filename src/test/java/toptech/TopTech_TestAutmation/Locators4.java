package toptech.TopTech_TestAutmation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators4 {  // id, name, className, tagName, linkText, PartialLinkText, cssSelector

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		String url = "https://www.facebook.com/";
		driver.get(url);

		driver.manage().window().maximize();
	
	//driver.findElement(By.linkText("Forgot password?")).click();
		driver.findElement(By.partialLinkText("Forgot")).click();
	
		
	}
}
