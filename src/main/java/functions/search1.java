package functions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.*;

@Listeners(listeners.mylisteners.class)
@Test
public class search1 extends Base {
	By searchbox=By.id("twotabsearchtextbox");
	String input1="oneplus";
	By searchbtn=By.id("nav-search-submit-button");
    By searchitem1=By.xpath("//span[text()=' 9 pro']");
    By reqitem1=By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span");
    
	public void search() throws InterruptedException {
		driver.findElement(searchbox).sendKeys(input1+Keys.ENTER);
		Thread.sleep(3000);
	}
	

}
