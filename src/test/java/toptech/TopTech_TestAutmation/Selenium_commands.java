package toptech.TopTech_TestAutmation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_commands {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		String url = "https://testenvironment.toptechschool.us/";
		driver.get(url);

		Thread.sleep(3000);
		driver.manage().window().fullscreen();
		//driver.manage().window().maximize();
		//driver.manage().window().minimize();
		
		String pageTitle =driver.getTitle();
		System.out.println(pageTitle);
		
		String currentUrl =driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://facebook.com");
		driver.navigate().back();

		Thread.sleep(3000);
		driver.navigate().forward();

		Thread.sleep(3000);
		driver.navigate().refresh();

		driver.close();
		//driver.quit();
	}
}
