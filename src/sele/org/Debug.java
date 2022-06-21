package sele.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Debug {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace"
				+ "\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement create = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		create.click();
		Thread.sleep(10000);
		WebElement maleBtn = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		maleBtn.click();
	}

}
