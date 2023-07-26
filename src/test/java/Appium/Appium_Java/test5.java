package Appium.Appium_Java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test5 {

	@Test(groups="Regression")
	public void test5()
	{
		System.out.println("print test 5");
		System.setProperty("webdriver.chrome.driver", "G:\\API Automation Udemy Class\\Appium_Java\\src\\main\\java\\utils\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.udemy.com");
		driver.manage().window().maximize();
		driver.close();
	}
}
