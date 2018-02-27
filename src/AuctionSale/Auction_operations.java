package AuctionSale;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class Auction_operations {

	public static  WebDriver driver;
	
		 

@BeforeClass
public void begin() throws Exception{
	System.setProperty("webdriver.chrome.driver", "/home/thinkcube/Downloads/chromedriver");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(1/2, TimeUnit.MINUTES);
	driver.manage().window().maximize();
	
}	

@Test
public void test() throws Exception{
	login();
	 click_AuctionandSale();
	 click_go_to_auction();
	 add_sale_lot();
	 click_vendor_tab();
	 click_buyer_tab();
	 click_salelot_tab();
	 edit_salelot();
	 click_export();
	 delete_salelot();
	 click_export();
	 
	 
	
}	


public void login() throws Exception{
	driver.get("https:thinkcube.agrinous.com");
	driver.findElement(By.xpath(".//*[@id='username']")).clear();
	driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("admin");
	driver.findElement(By.xpath(".//*[@id='password']")).clear();
	driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("admin123");
	driver.findElement(By.xpath(".//*[@id='root']/section/div/section/div/form/button")).click();	
	Thread.sleep(6000);	
	}
 


public void click_AuctionandSale() throws Exception{
	
	driver.findElement(By.xpath(".//*[@id='root']/section/div[2]/div/div[1]/section/ul/li[2]/a/span")).click();
	Thread.sleep(6000);	
}

public void click_go_to_auction() throws Exception{
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[3]/div/div[1]/div/div[3]/a[2]")).click();
	Thread.sleep(1000);	
	
	//click on sale lot tab
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[2]/div/a[2]")).click();
	Thread.sleep(4000);
}
/*
public void  click_new_sale_lot() throws Exception{
	
	 there were two pricing types before and a total weight column.
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[2]/div/a[2]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[3]/div[2]/div/div[1]/a/i")).click();
	Thread.sleep(1000);
	if(driver.findElements(By.xpath(".//*[@id='total_weight']")).size() != 0){
		Thread.sleep(1000);
		add_sale_lot2();
		
	}
	else {
		add_sale_lot1();
	}
	
}
public void add_sale_lot1() throws Exception{
	//add pen no
	driver.findElement(By.xpath(".//*[@id='pen_no']")).clear();
	driver.findElement(By.xpath(".//*[@id='pen_no']")).sendKeys("34");
	Thread.sleep(1000);
	
	//add lot nu
	driver.findElement(By.xpath(".//*[@id='lot_no']")).clear();
	driver.findElement(By.xpath(".//*[@id='lot_no']")).sendKeys("36");
	Thread.sleep(1000);
	
	//add headcount
	driver.findElement(By.xpath(".//*[@id='head_count']")).clear();
	driver.findElement(By.xpath(".//*[@id='head_count']")).sendKeys("23");
	Thread.sleep(1000);
	
	//add vendor
	driver.findElement(By.xpath("html/body/div[5]/div/div/div[2]/div/div[4]/div/div/div/div/div/span[2]/span")).click();
	Robot robot=new Robot();
	Thread.sleep(1000);
	for(int i=0; i<3;i++){
		Thread.sleep(400);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
	}
	
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
	//add buyer
	driver.findElement(By.xpath("html/body/div[5]/div/div/div[2]/div/div[5]/div/div/div/div/div/span[2]/span")).click();
	Thread.sleep(1000);
	Robot robot1=new Robot();
	
	for(int i=0; i<5;i++){
		Thread.sleep(400);
		robot1.keyPress(KeyEvent.VK_DOWN);
		robot1.keyRelease(KeyEvent.VK_DOWN);
	}
	
		robot1.keyPress(KeyEvent.VK_ENTER);
		robot1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
	
	//add per head price
	driver.findElement(By.xpath(".//*[@id='unit_price']")).clear();
	driver.findElement(By.xpath(".//*[@id='unit_price']")).sendKeys("234");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("html/body/div[5]/div/div/div[3]/button[2]")).click();
	Thread.sleep(3000);
}

public void add_sale_lot2() throws Exception{
	//add pen no
		driver.findElement(By.xpath(".//*[@id='pen_no']")).clear();
		driver.findElement(By.xpath(".//*[@id='pen_no']")).sendKeys("34");
		Thread.sleep(1000);
		
		//add lot nu
		driver.findElement(By.xpath(".//*[@id='lot_no']")).clear();
		driver.findElement(By.xpath(".//*[@id='lot_no']")).sendKeys("36");
		Thread.sleep(1000);
		
		//add headcount
		driver.findElement(By.xpath(".//*[@id='head_count']")).clear();
		driver.findElement(By.xpath(".//*[@id='head_count']")).sendKeys("23");
		Thread.sleep(1000);
		
		//add vendor
		driver.findElement(By.xpath("html/body/div[5]/div/div/div[2]/div/div[4]/div/div/div/div/div/span[2]/span")).click();
		Robot robot=new Robot();
		Thread.sleep(1000);
		for(int i=0; i<3;i++){
			Thread.sleep(400);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
		}
		
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
		//add buyer
		driver.findElement(By.xpath("html/body/div[5]/div/div/div[2]/div/div[5]/div/div/div/div/div/span[2]/span")).click();
		Thread.sleep(1000);
		Robot robot1=new Robot();
		
		for(int i=0; i<5;i++){
			Thread.sleep(400);
			robot1.keyPress(KeyEvent.VK_DOWN);
			robot1.keyRelease(KeyEvent.VK_DOWN);
		}
		
			robot1.keyPress(KeyEvent.VK_ENTER);
			robot1.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
		
		//add per head price
		driver.findElement(By.xpath(".//*[@id='unit_price']")).clear();
		driver.findElement(By.xpath(".//*[@id='unit_price']")).sendKeys("234");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(".//*[@id='total_weight']")).clear();
		driver.findElement(By.xpath(".//*[@id='total_weight']")).sendKeys("250");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("html/body/div[5]/div/div/div[3]/button[2]")).click();
		Thread.sleep(3000);
	
}
*/

	

 public void add_sale_lot() throws Exception{
	 	
	 	//click on add new salelot
	    driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[3]/div[2]/div/div[1]/a")).click();
	    Thread.sleep(1000);
	    
	    //select type
	    driver.findElement(By.xpath("html/body/div[6]/div/div/div[2]/div/div[1]/div/div/div/div/div[1]/label/div")).click();
	    Thread.sleep(1000);
	    
	    //select prefix
	    driver.findElement(By.xpath("html/body/div[6]/div/div/div[2]/div/div[2]/div/div/div/div/div/span[2]/span")).click();
	    Robot robot=new Robot();
	    robot.keyPress(KeyEvent.VK_DOWN);
	    robot.keyRelease(KeyEvent.VK_DOWN);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    
	    
		//add pen no
		driver.findElement(By.xpath(".//*[@id='pen_no_int']")).clear();
		driver.findElement(By.xpath(".//*[@id='pen_no_int']")).sendKeys("34");
		Thread.sleep(1000);
		
		//select suffix
		driver.findElement(By.xpath("html/body/div[6]/div/div/div[2]/div/div[4]/div/div/div/div/div/span[2]/span")).click();
		
	    robot.keyPress(KeyEvent.VK_DOWN);
	    robot.keyRelease(KeyEvent.VK_DOWN);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		//add headcount
		driver.findElement(By.xpath(".//*[@id='headCount']")).clear();
		driver.findElement(By.xpath(".//*[@id='headCount']")).sendKeys("23");
		Thread.sleep(1000);
		
		//add vendor
		driver.findElement(By.xpath("html/body/div[6]/div/div/div[2]/div/div[6]/div/div/div/div/div/span[2]/span")).click();
	
		Thread.sleep(1000);
		for(int i=0; i<3;i++){
			Thread.sleep(400);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
		}
		
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
		
		//add buyer
		driver.findElement(By.xpath("html/body/div[6]/div/div/div[2]/div/div[7]/div/div/div/div/div/span[2]/span")).click();
		Thread.sleep(1000);
		Robot robot1=new Robot();
		
		for(int i=0; i<5;i++){
			Thread.sleep(400);
			robot1.keyPress(KeyEvent.VK_DOWN);
			robot1.keyRelease(KeyEvent.VK_DOWN);
		}
		
			robot1.keyPress(KeyEvent.VK_ENTER);
			robot1.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
		
		//add per head price
		driver.findElement(By.xpath(".//*[@id='price']")).clear();
		driver.findElement(By.xpath(".//*[@id='price']")).sendKeys("234");
		Thread.sleep(1000);
		
		//click on save button
		driver.findElement(By.xpath("html/body/div[6]/div/div/div[3]/button[2]")).click();
		Thread.sleep(3000);
	}
public void click_vendor_tab() throws Exception{
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[2]/div/a[3]")).click();
	Thread.sleep(1000);
}
public void click_buyer_tab() throws Exception{
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[2]/div/a[4]")).click();
	Thread.sleep(2000);
	
	//clcik on preview icon
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[3]/div/div/div/div[2]/div/table/tbody/tr[1]/td[6]/p/a[1]")).click();
	Thread.sleep(5000);
	
	//click cancel button(x)
	driver.findElement(By.xpath("html/body/div[5]/div/div/div/div[1]/a")).click();
	Thread.sleep(2000);
}

public void click_salelot_tab() throws Exception{
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[2]/div/a[2]")).click();
	Thread.sleep(1000);
}


public void edit_salelot() throws Exception{
	//click on edit icon of a ale lot
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[3]/div[2]/div/div[2]/div[2]/table/tbody/tr[1]/td[10]/p/button[1]")).click();
	Thread.sleep(3000);              
	
	//edit price
	driver.findElement(By.xpath(".//*[@id='price']")).clear();
	driver.findElement(By.xpath(".//*[@id='price']")).sendKeys("234788");
	Thread.sleep(1000);
	
	//click on update
	driver.findElement(By.xpath("html/body/div[5]/div/div/div[3]/button[2]")).click();
	Thread.sleep(3000);	
}

public void click_export() throws Exception{
	//clcik export
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[3]/div[1]/div/div[3]/div[2]/button")).click();
	Thread.sleep(3000);
	
	//click select columns
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[3]/div[1]/div/div[2]/div/div/div/div/div")).click();
	Thread.sleep(1000);
	
	Robot robot1=new Robot();
		Thread.sleep(400);
		robot1.keyPress(KeyEvent.VK_DOWN);
		robot1.keyRelease(KeyEvent.VK_DOWN);
		robot1.keyPress(KeyEvent.VK_ENTER);
		robot1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
	
		driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[3]/div[1]/div/div[2]/div/div/div/div/div")).click();
		Thread.sleep(1000);
		
			Thread.sleep(400);
			robot1.keyPress(KeyEvent.VK_DOWN);
			robot1.keyRelease(KeyEvent.VK_DOWN);
			robot1.keyPress(KeyEvent.VK_ENTER);
			robot1.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			
	//tick save template tickbox
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[3]/div[1]/div/div[3]/div[1]/div/div/div/label/div")).click();
	Thread.sleep(1000);
	
	//add template name
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[3]/div[1]/div/div[4]/div[1]/div/div/input")).clear();
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[3]/div[1]/div/div[4]/div[1]/div/div/input")).sendKeys("test madu");
	
	//click on save
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[3]/div[1]/div/div[4]/div[2]/button")).click();
	
    //click to select template
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[3]/div[1]/div/div[1]/div/div/div/div/span[2]/span")).click();
	Thread.sleep(1000);
	
	for(int i=0; i<2;i++){
		Thread.sleep(400);
		robot1.keyPress(KeyEvent.VK_DOWN);
		robot1.keyRelease(KeyEvent.VK_DOWN);
	}
	
		robot1.keyPress(KeyEvent.VK_ENTER);
		robot1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
	//edit template name
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[3]/div[1]/div/div[3]/div/div/div/input")).clear();
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[3]/div[1]/div/div[3]/div/div/div/input")).sendKeys("test madu new");
	
	//click save and export button
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[3]/div[1]/div/div[3]/button[1]")).click();
	Thread.sleep(3000);
		
	//click delete button to delte template
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[3]/div[1]/div/div[3]/button[3]")).click();
	Thread.sleep(1000);
	
	//click cancel button to calcel deletion
	driver.findElement(By.xpath("html/body/div[7]/div/div/div[2]/a[1]")).click();
	Thread.sleep(2000);
	
	//delete the template
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[3]/div[1]/div/div[3]/button[3]")).click();
	Thread.sleep(3000);
	
	//close sale
	if(driver.findElements(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[1]/div[2]/button")).size() != 0){
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[1]/div[2]/button")).click();
		Thread.sleep(2000);
	}
	else {
		driver.navigate().refresh();
	}
	Thread.sleep(1000);
}

public void delete_salelot()throws Exception{
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[3]/div[2]/div/div[2]/div[2]/table/tbody/tr/td[9]/p/button[2]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("html/body/div[6]/div/div/div[2]/a[2]")).click();
	Thread.sleep(3000);
}
@AfterClass
public void end() throws Exception{
	driver.quit();
	
}

}
