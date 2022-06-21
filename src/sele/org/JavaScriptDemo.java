package sele.org;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class JavaScriptDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace"
				+ "\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement user = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].setAttribute('value','naveen')", user);
		Object ob1 = js.executeScript("return arguments[0].getAttribute('value')", user);
		System.out.println(ob1);
		WebElement passWord = driver.findElement(By.id("pass"));
		js.executeScript("arguments[0].setAttribute('value','123456789')", passWord);
		Object ob2 = js.executeScript("return arguments[0].getAttribute('value')",passWord);
		System.out.println(ob2);
		WebElement loginBtn = driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click()", loginBtn);

}
}