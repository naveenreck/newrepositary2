package sele.org;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace"
				+ "\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Actions a = new Actions(driver);
		WebElement s = driver.findElement(By.xpath("(//li[@id='fourth'])[2]"));
		WebElement d = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		a.dragAndDrop(s, d).perform();
	}

}
