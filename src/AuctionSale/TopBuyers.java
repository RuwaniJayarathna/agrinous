package AuctionSale;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class TopBuyers {
	WebDriver driver=new FirefoxDriver();

@BeforeClass
public void begin() throws Exception{
	driver.manage().timeouts().implicitlyWait(1/2, TimeUnit.MINUTES);
}

@Test
public void test() throws Exception{
	login();
	click_AuctionandSale();
	click_top_buyers();
	click_search_buyers();
	click_add_buyer();
	delete_buyer();
	
	
}

public void login() throws Exception{
	driver.get("https:thinkcube.agrinous.com");
	driver.findElement(By.xpath(".//*[@id='username']")).clear();
	driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("admin");
	driver.findElement(By.xpath(".//*[@id='password']")).clear();
	driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("admin123");
	driver.findElement(By.xpath(".//*[@id='root']/section/div/section/div/form/button")).click();	
	Thread.sleep(5000);	
	}
 


public void click_AuctionandSale() throws Exception{
	driver.findElement(By.xpath(".//*[@id='root']/section/div[2]/div/div[1]/section/ul/li[2]/a/span")).click();
	Thread.sleep(4000);	
}

public void click_top_buyers() throws Exception{
	driver.findElement(By.xpath(".//*[@id='root']/section/div[2]/div/div[1]/section/ul/li[2]/ul/li[2]/a/span")).click();
	Thread.sleep(3000);
	
}
public void click_search_buyers() throws Exception{
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[1]/div[3]/div/div[1]/div/div/input")).click();
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[1]/div[3]/div/div[1]/div/div/input")).sendKeys("a");
	Thread.sleep(6000);
	
	
	
}
public void click_add_buyer() throws Exception{
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[1]/div[3]/div/div[1]/div[2]/div/div[1]/div/div[1]/button")).click();
	Thread.sleep(5000);
}

public void delete_buyer() throws Exception{
	 driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[1]/div[3]/div/div[2]/div/div/div[1]/button")).click();
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("html/body/div[5]/div/div/div[2]/a[2]")).click();;
	 Thread.sleep(5000);
}


@AfterTest
public void end() throws Exception{
	driver.quit();
	
}
	
	
	
}
