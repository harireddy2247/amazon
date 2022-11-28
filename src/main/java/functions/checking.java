package functions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class checking {
static By dismiss=By.xpath("//*[@id=\"nav-main\"]/div[1]/div/div/div[3]/span[1]/span/span//preceding-sibling::*");
static By all=By.xpath("//*[@id=\"nav-hamburger-menu\"]/span");
static By electronics=By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[7]/a");
static By cellphones=By.xpath("//*[@id=\"hmenu-content\"]/ul[5]/li[6]/a");
static By apple=By.xpath("//*[@id=\"p_89/Apple\"]/span/a/span");
static By product=By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div[3]/div[1]/h2/a/span");

@Test
public void check() {
	System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
	driver.findElement(dismiss).click();
	driver.findElement(all).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(electronics).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(cellphones).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(apple).click();
	driver.findElement(product).click();
	driver.close();
	
}

}
