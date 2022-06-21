package sele.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace"
				+ "\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		List<WebElement> f1 = driver.findElements(By.tagName("frame"));
		int a = f1.size();
		System.out.println(a);
		WebElement frame = driver.findElement(By.xpath("//frame[@name='login_page']"));
		driver.switchTo().frame(frame);
		WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
		user.sendKeys("99887766");
		WebElement clickBtn = driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']"));
		clickBtn.click();
		
	}

}
