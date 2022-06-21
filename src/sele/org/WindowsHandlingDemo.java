package sele.org;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlingDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace"
				+ "\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement searchBox = driver.findElement(By.xpath("(//input[@name='keyword'])[1]"));
		searchBox.sendKeys("iphone");
		WebElement searchBtn = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		searchBtn.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='product-desc-rating '])[14]")).click();
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);
		List<String> l = new ArrayList<String>();
		l.addAll(allWindows);
		driver.switchTo().window(l.get(1));
		WebElement cart = driver.findElement(By.xpath("//*[@id=\"add-cart-button-id\"]"));
		cart.click();
	
		
		
	
		
	}

}
