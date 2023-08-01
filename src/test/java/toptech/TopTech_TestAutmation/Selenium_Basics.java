package toptech.TopTech_TestAutmation;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ScreenShots;

public class Selenium_Basics  {

	public static void main(String[] args) throws IOException {

		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
	//	ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		ScreenShots.takesScreenShot(driver);
		driver.close();
		
	}

}
