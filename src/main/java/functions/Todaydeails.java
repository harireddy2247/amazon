package functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Todaydeails {
	static By dismiss=By.xpath("//*[@id=\"nav-main\"]/div[1]/div/div/div[3]/span[1]/span/span//preceding-sibling::*");
	static By todadydeals=By.xpath("//a[@data-csa-c-slot-id='nav_cs_0']");
	static By gifts=By.xpath("//a[@id='swm-link']");
	static By fashion=By.xpath("//a[@aria-label='Fashion Gift Guide']");
	static By sweatshirts=By.xpath("//a[@aria-label='Soft Sweaters']");
	static By mensweatshirts=By.xpath("//*[@id=\"n/1044442\"]/span/a/span");
	static By filter1=By.xpath("//*[@id=\"p_n_feature_nineteen_browse-bin/2359343011\"]/span/a/span");
	static By filter2=By.xpath("//*[@id=\"p_n_feature_twelve_browse-bin/23575358011\"]/span/a/span");
	
	@Test
	public void dealsoftheday() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		driver.findElement(dismiss).click();
		driver.findElement(todadydeals).click();
		driver.findElement(gifts).click();
		driver.close();
		
	}
}
