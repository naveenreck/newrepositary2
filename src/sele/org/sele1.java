package sele.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class sele1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace"
				+ "\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement user = driver.findElement(By.xpath("//input[@id='email']"));
		user.sendKeys("naveen");
		WebElement pass = driver.findElement(By.xpath("//input[@name='pass']"));
		pass.sendKeys("123456789");
		WebElement click = driver.findElement(By.xpath("//button[@name='login']"));
		click.click();
	}
	

}
