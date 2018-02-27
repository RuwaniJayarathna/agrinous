package AuctionSale;

import java.awt.Robot;
		
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class AddAuctionandSale {
	WebDriver driver=new FirefoxDriver();
	
@BeforeClass
public void begin(){
	driver.manage().timeouts().implicitlyWait(1/2, TimeUnit.MINUTES);
}

@Test
public void test() throws Exception{
	login();
	click_AuctionandSale();
	add_new_sale();
	select_livestock_type();
	untick_all_staff();
	select_contract_staff();
	select_livestock_sale_type();
	//select_dateandtime();
	enter_dateandtime();
	enter_saleyard_staff();
	Thread.sleep(2000);
	click_pricing_type();
	click_save() ;
	
	 
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
	
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[1]/div[1]/a/i")).click();
	Thread.sleep(3000);
}



public void add_new_sale() throws Exception{
	
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[2]/div[1]/div/div/div/input")).click();
	Thread.sleep(3500);
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[2]/div[1]/div/div/div/input")).sendKeys("Auction test");
	Thread.sleep(2500);
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[2]/div[2]/div/div/div/textarea")).clear();
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[2]/div[2]/div/div/div/textarea")).sendKeys("this is the description");

	Thread.sleep(2000);
}

public void select_livestock_type() throws Exception{
	
	driver.findElement(By.xpath(".//*[@id='react-select-2--value']/div[1]")).click();
	
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyRelease(KeyEvent.VK_DOWN);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(5000);
	
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[2]/div[3]/div[3]/div/div/div/div/div/span[2]/span")).click();
	Thread.sleep(5000);
	for(int i=0;i<2;i++){
		Thread.sleep(100);
		robot.keyPress(KeyEvent.VK_DOWN);
		
		robot.keyRelease(KeyEvent.VK_DOWN);
		
	}
	
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(500);
	
}


public void untick_all_staff() throws Exception{
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[2]/div[3]/div[5]/div/div/div/div/label/div")).click();
	Thread.sleep(500);
	
}

public void select_contract_staff() throws Exception{
driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[2]/div[3]/div[7]/div/div/div/div/div")).click();
	
	Robot robot=new Robot();
	for(int i=0;i<5;i++){
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_DOWN);
		
		robot.keyRelease(KeyEvent.VK_DOWN);
		
	}
	
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(500);
	
	
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[2]/div[3]/div[7]/div/div/div/div/div")).click();
	Thread.sleep(500);          
	for(int i=0;i<6;i++){         
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_DOWN);
		
		robot.keyRelease(KeyEvent.VK_DOWN);
		
	}
	
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(500);
	
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[2]/div[3]/div[7]/div/div/div/div/div/div[1]/span")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[2]/div[3]/div[7]/div/div/div/div/button")).click();
	Thread.sleep(1000);
}
                              
public void select_livestock_sale_type() throws Exception{
	driver.findElement(By.xpath(".//*[@id='react-select-3--value']/div[1]")).click();
	Robot robot =new Robot();
	Thread.sleep(500);          
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyRelease(KeyEvent.VK_DOWN);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(1000);

}

public void select_dateandtime() throws Exception{
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[2]/div[3]/div[4]/div/div/div/div/input")).click(); 
	Thread.sleep(3000);
	DateFormat dateFormat2 = new SimpleDateFormat("dd/MM/yyyy"); 
    Date date2 = new Date();

    String today = dateFormat2.format(date2); 

    //find the calendar
    
    WebElement dateWidget = driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[2]/div[3]/div[4]/div/div/div/div/div/div/table/thead/tr[1]/th[2]")); 
	Thread.sleep(1000);
    List<WebElement> columns=dateWidget.findElements(By.tagName("td"));  
	Thread.sleep(5000);
    //comparing the text of cell with today's date and clicking it.
    for (WebElement cell : columns)
    {
       if (cell.getText().equals(today))
       {
          cell.click();
          break;
       }
    }
	Thread.sleep(1000);
}

public void enter_dateandtime() throws Exception{
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[2]/div[3]/div[4]/div/div/div/div/input")).sendKeys("18-07-2019 00:00:00");
	Thread.sleep(1000);
}
public void enter_saleyard_staff() throws Exception{
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[2]/div[3]/div[6]/div/div/div/div/div")).click();

	
	Robot robot=new Robot();
	for(int i=0;i<5;i++){
		Thread.sleep(100);
		robot.keyPress(KeyEvent.VK_DOWN);
		
		robot.keyRelease(KeyEvent.VK_DOWN);
		
	}
	
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(500);
	
	
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[2]/div[3]/div[6]/div/div/div/div/div")).click();
	Thread.sleep(500);          
	for(int i=0;i<6;i++){         
		Thread.sleep(100);
		robot.keyPress(KeyEvent.VK_DOWN);
		
		robot.keyRelease(KeyEvent.VK_DOWN);
		
	}
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(100);
	
	Thread.sleep(3000);
}
public void click_pricing_type() throws Exception{
	WebElement option1=driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[2]/div[3]/div[8]/div/div/div/div/div[2]/label/div"));
	if (option1.isSelected() == false)
	  {
	       option1.click();
	  }
	Thread.sleep(3000);
}

public void click_save() throws Exception{
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[3]/button[2]")).click();
	Thread.sleep(3000);
}
@AfterClass
public void end() throws Exception{
	driver.quit();
	
}



}


