package Configurations;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class Add_Auction_Location {
	WebDriver driver=new FirefoxDriver();
	
@BeforeClass
public void begin() throws Exception{
	driver.manage().timeouts().implicitlyWait(1/2, TimeUnit.MINUTES);
	
	
}

@Test
public void test() throws Exception{
	login();
	go_to_CreateAuctionLocation_page();
	add_details();
	edit_Auction();
	delete();
	
}

public void login() throws Exception{
	driver.get("https://thinkcube.agrinous.com");
	driver.findElement(By.xpath(".//*[@id='username']")).clear();
	driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("admin");
	
	driver.findElement(By.xpath(".//*[@id='password']")).clear();
	driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("admin123");
	
	driver.findElement(By.xpath(".//*[@id='root']/section/div/section/div/form/button")).click();
	Thread.sleep(6000);
}

public void go_to_CreateAuctionLocation_page() throws Exception{
	//click on configurations tab
		driver.findElement(By.xpath(".//*[@id='root']/section/div[2]/div/div[1]/section/ul/li[4]/a")).click();
		Thread.sleep(2000);
		
		//click on geographical configuration tab
		driver.findElement(By.xpath(".//*[@id='root']/section/div[2]/div/div[1]/section/ul/li[4]/ul/li/a[4]")).click();
		Thread.sleep(2000);
		
		//click on Auction Location tab
		driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[2]/div/a[3]")).click();
		
		//click on add auction location icon
		driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[1]/div[3]/div[1]/a/i")).click();
		Thread.sleep(1000);

}

public void add_details() throws Exception{
	//enter location name
	driver.findElement(By.xpath(".//*[@id='name']")).clear();
	driver.findElement(By.xpath(".//*[@id='name']")).sendKeys("Test Location-new");
	
	//enter description
	driver.findElement(By.xpath(".//*[@id='description']")).clear();
	driver.findElement(By.xpath(".//*[@id='description']")).sendKeys("testing");
	
	//select state
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[3]/div[2]/div[4]/div/div/div/div/div/span[2]/span")).click();
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	//enter address
	driver.findElement(By.xpath(".//*[@id='address']")).clear();
	driver.findElement(By.xpath(".//*[@id='address']")).sendKeys("23 lake side");
	
	
	//enter postal code
	driver.findElement(By.xpath(".//*[@id='postal_code']")).clear();
	driver.findElement(By.xpath(".//*[@id='postal_code']")).sendKeys("0899");
	
	//enter contact number
	driver.findElement(By.xpath(".//*[@id='contact_number']")).clear();
	driver.findElement(By.xpath(".//*[@id='contact_number']")).sendKeys("0112367778");
	
	//enter prefixes
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[3]/div[2]/div[8]/div/div/div/div/div")).click();
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[3]/div[2]/div[8]/div/div/div/div/div")).sendKeys("a");
	
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[3]/div[2]/div[8]/div/div/div/div/ul/li/a")).click();
	
	Thread.sleep(1000);
	
	//click on save
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[3]/div[3]/button[2]")).click();
	
	Thread.sleep(3000);
		
}

public void edit_Auction() throws Exception{
	//click on edit icon of a location
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[1]/div[3]/div[2]/table/tbody/tr[1]/td[4]/p/button[1]")).click();
	Thread.sleep(3000);
	//edit location name
	driver.findElement(By.xpath(".//*[@id='name']")).clear();
	driver.findElement(By.xpath(".//*[@id='name']")).sendKeys("Bendigo");
	
	//click update
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[3]/div[3]/button[2]")).click();
	Thread.sleep(3000);
	
	//click on back button
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[3]/div[1]/h1/span")).click();
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[3]/div[1]/h1/span")).click();
	Thread.sleep(1000);
}

public void delete() throws Exception{
	//click on delete icon
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[1]/div[3]/div[2]/table/tbody/tr[1]/td[4]/p/button[2]")).click();
	Thread.sleep(1000);
	//click on ok
	driver.findElement(By.xpath("html/body/div[5]/div/div/div[2]/a[2]")).click();
	Thread.sleep(3000);
	
}
	
@AfterClass
public void end()throws Exception{
	driver.close();
}


	
}
