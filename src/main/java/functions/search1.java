package functions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.*;

@Listeners(listeners.mylisteners.class)
@Test
public class search1 {
	static By searchbox=By.id("twotabsearchtextbox");
	static String input1="oneplus";
	static By searchbtn=By.id("nav-search-submit-button");
	static By searchitem1=By.xpath("//span[text()=' 9 pro']");
	static By reqitem1=By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span");
	public void search() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.findElement(searchbox).sendKeys(input1);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(searchitem1).click();
		driver.findElement(reqitem1).click();
		driver.close();
	}
	

}
