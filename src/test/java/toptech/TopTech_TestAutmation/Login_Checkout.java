package toptech.TopTech_TestAutmation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Checkout {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));

		String url = "https://testenvironment.toptechschool.us/";
		driver.get(url);

		driver.manage().window().maximize();

		// findElement();

		WebElement MyAccount = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]"));
		MyAccount.click();

		Thread.sleep(3000);
		WebElement login = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a"));
		login.click();
		
		Thread.sleep(3000);
		
		WebElement email = driver.findElement(By.id("input-email"));
		email.sendKeys("sadatsayedibrahim@gmail.com");
		Thread.sleep(3000);
		
		WebElement password = driver.findElement(By.id("input-password"));
		password.sendKeys("test123");
		Thread.sleep(3000);
		
		WebElement loginBttn = driver.findElement(By.id("signinbtn"));
		loginBttn.click();
		Thread.sleep(3000);
	//	driver.findElement(By.cssSelector("button[class='btn btn-inverse btn-block btn-lg ']")).click();
	//	driver.findElement(By.cssSelector("a[class='btn btn-primary']")).click();
		
		WebElement items =driver.findElement(By.xpath("//*[@id=\"cart\"]/a/button"));
		items.click();
		
		Thread.sleep(3000);
		
		WebElement checkout =driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/a"));
		checkout.click();
		Thread.sleep(3000);
	}

}
