package functions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utils.Base;

@Test
public class checking extends Base {
 By dismiss=By.xpath("//*[@id=\"nav-main\"]/div[1]/div/div/div[3]/span[1]/span/span//preceding-sibling::*");
 By all=By.xpath("//*[@id=\"nav-hamburger-menu\"]/span");
 By electronics=By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[7]/a");
 By cellphones=By.xpath("//*[@id=\"hmenu-content\"]/ul[5]/li[6]/a");
 By apple=By.xpath("//*[@id=\"p_89/Apple\"]/span/a/span");
 By product=By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div[3]/div[1]/h2/a/span");


public void check() throws Throwable {
	driver.findElement(dismiss).click();
	driver.findElement(all).click();
	Thread.sleep(3000);
	
}

}
