package sele.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextAndContains {
	//public static void main(String[] args) {
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace"
	//			+ "\\Selenium\\Drivers\\chromedriver.exe");
	//	WebDriver driver = new ChromeDriver();
	//	driver.get("https://www.facebook.com/");
	//	WebElement forgot = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
	//	String t = forgot.getText();
	//	System.out.println(t);
	//	forgot.click();
	//	}
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace"
				+ "\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement text = driver.findElement(By.xpath("//h2[contains(text(),'Facebook')]"));
		String t = text.getText();
		System.out.println(t);
	
	}
	

}
