package AuctionSale;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class ViewAuction {
	WebDriver driver=new FirefoxDriver();
	
@BeforeClass
public void begin() throws Exception{
	driver.manage().timeouts().implicitlyWait(1/2, TimeUnit.MINUTES);
	
}
@Test
public void test() throws Exception{
	login();
	click_AuctionandSale();
	click_go_to_auction();
	add_new_sale_lot();
	add_details();
	select_vendor();
	select_buyer();
	add_sale();
	edit_sale_lot();
	

	
	
}

public void login() throws Exception{
	driver.get("https:thinkcube.agrinous.com");
	driver.findElement(By.xpath(".//*[@id='username']")).clear();
	driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("admin");
	driver.findElement(By.xpath(".//*[@id='password']")).clear();
	driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("admin123");
	driver.findElement(By.xpath(".//*[@id='root']/section/div/section/div/form/button")).click();
		
	Thread.sleep(4000);
		
	}
 


public void click_AuctionandSale() throws Exception{
	
	driver.findElement(By.xpath(".//*[@id='root']/section/div[2]/div/div[1]/section/ul/li[2]/a/span")).click();
	Thread.sleep(4000);
	
	

}



public void click_go_to_auction() throws Exception{
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[1]/div[3]/div/div[7]/div/div[3]/a[2]")).click();
	Thread.sleep(1000);
	
	
}
	
public void add_new_sale_lot() throws Exception{
	
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[3]/div[2]/div/div[1]/a/i")).click();
	Thread.sleep(1000);
}

public void add_details() throws Exception{
	driver.findElement(By.xpath(".//*[@id='pen_no']")).clear();
	driver.findElement(By.xpath(".//*[@id='pen_no']")).sendKeys("50");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath(".//*[@id='lot_no']")).clear();
	driver.findElement(By.xpath(".//*[@id='lot_no']")).sendKeys("34");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath(".//*[@id='head_count']")).clear();
	driver.findElement(By.xpath(".//*[@id='head_count']")).sendKeys("2500");
	
	Thread.sleep(1000);
	

}	

public void select_vendor() throws Exception{
	driver.findElement(By.xpath("html/body/div[5]/div/div/div[2]/div/div[4]/div/div/div/div/div/span[2]/span")).click();
	
	Robot robot=new Robot();
	for(int i=0;i<3;i++){
		Thread.sleep(300);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);	
	}
	
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	
	Thread.sleep(1000);
}



public void select_buyer() throws Exception{
	driver.findElement(By.xpath("html/body/div[5]/div/div/div[2]/div/div[5]/div/div/div/div/div/span[2]/span")).click();
	Robot robot=new Robot();
	for(int i=0;i<2;i++){
		Thread.sleep(400);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);	
	}
	
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	
	Thread.sleep(1000);
	
}

public void add_sale() throws Exception{
	//add unit price
	driver.findElement(By.xpath(".//*[@id='unit_price']")).clear();
	driver.findElement(By.xpath(".//*[@id='unit_price']")).sendKeys("300");
	
	//click save button
	driver.findElement(By.xpath("html/body/div[5]/div/div/div[3]/button[2]")).click();
	Thread.sleep(5000);
}

public void edit_sale_lot() throws Exception {
	//click on last edit sale lot icon
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[3]/div[2]/div/div[2]/div[2]/table/tbody/tr[last()]/td[9]/p/button[1]")).click();
	Thread.sleep(1000);
	
//	driver.switchTo().activeElement();
	//edit unit price
	driver.findElement(By.xpath(".//*[@id='unit_price']")).clear();
	driver.findElement(By.xpath(".//*[@id='unit_price']")).sendKeys("234");
	Thread.sleep(1000);
	
	//click update
	
	driver.findElement(By.xpath("html/body/div[5]/div/div/div[3]/button[2]")).click();
	Thread.sleep(3000);
}





@AfterClass
public void end() throws Exception{
	driver.quit();
	
}	

}
