package RelationshipManagement;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class AddNewPerson {
	WebDriver driver=new FirefoxDriver();
	
@BeforeClass
public void begin() throws Exception{
	driver.manage().timeouts().implicitlyWait(1/2, TimeUnit.MINUTES);
	
}

@Test
public void test() throws Exception{
	login();
	go_to_add_person();
	add_details_in_about_tab();
	//add_links();
	add_addresses();
	add_reminders();
	ops_of_Portal_Acess();
	add_notes();
	
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

public void go_to_add_person() throws Exception{
	//click on Relationship management tab
	driver.findElement(By.xpath(".//*[@id='root']/section/div[2]/div/div[1]/section/ul/li[3]/a")).click();
	Thread.sleep(1000);
	
	//click on people tab
	driver.findElement(By.xpath(".//*[@id='root']/section/div[2]/div/div[1]/section/ul/li[3]/ul/li[2]/a")).click();
	Thread.sleep(2000);
	
	// click on Add New person icon
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[1]/div/div[1]/a")).click();
	//driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[1]/div/div[1]/a")).click();
	Thread.sleep(3000);

}
public void add_details_in_about_tab() throws Exception{
	//add first name
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div/div/input")).clear();
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div/div/input")).sendKeys("Akila");
	
	//add last name
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div[3]/div/div/div/input")).click();
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div[3]/div/div/div/input")).sendKeys("Nilakshi");
	
	//add mobile
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[3]/div[2]/div/div/div/input")).clear();
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[3]/div[2]/div/div/div/input")).sendKeys("0712345678");
	
	//add email
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[3]/div[3]/div/div/div/input")).clear();
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[3]/div[3]/div/div/div/input")).sendKeys("aki@gmail.com");
	Thread.sleep(4000);
	
	//select prefered contact
	WebElement inputBox = driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[3]/div[2]/div/div/div/input"));
	Thread.sleep(3000);
	
	// Check whether input field is blank
	if(inputBox.getAttribute("value").isEmpty()){
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[3]/div[4]/div/div/div/div/div[1]/label/div")).click();
	}
	else{
		driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[3]/div[4]/div/div/div/div/div[2]/label/div")).click();
	}
	Thread.sleep(1000);
	
	
	
	
	
	
	
	
}	
public void add_links() throws Exception{
	//click on links tab
	driver.findElement(By.xpath(".//*[@id='tab2']")).click();
	
	//select person/business
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/input[1]")).click();
	Robot robot =new Robot();
	for(int i=1;i<4;i++)
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(1000);
	
	
	//enter role
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div/div[3]/div[1]/div/div/div/input")).clear();
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div/div[3]/div[1]/div/div/div/input")).sendKeys("QA");
	
	//put a tick on "Has a charge"
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div/div[3]/div[2]/div/div/div/div/label/div")).click();
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div/div[3]/div[3]/div/div/div/div/div/input[1]")).click();
	
	for(int i=1;i<4;i++)
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(1000);
	
	//click add button
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div/div[3]/div[2]/button")).click();
	Thread.sleep(1000);
}	
public void add_addresses() throws Exception{
	//click on addresses tab
	driver.findElement(By.xpath(".//*[@id='tab3']")).click();
	
	//add address1
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div/textarea")).clear();
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div/textarea")).sendKeys("23 main street");
	
	//add address2
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div/div[3]/div/div/div/textarea")).clear();
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div/div[3]/div/div/div/textarea")).sendKeys("304 west hills");
	
	//add city
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div/div[4]/div/div/div/input")).clear();
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div/div[4]/div/div/div/input")).sendKeys("bendigo");
	
	//select state
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div/div[5]/div/div/div/div/div/span[2]/span")).click();
	
	Robot robot =new Robot();
	for(int i=1;i<4;i++)
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(1000);
	
	//click on ADD button
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div/div[8]/button")).click();
	
	Thread.sleep(2000);
	
	
}	
 
public void add_reminders() throws Exception{
	//click on reminders tab
	driver.findElement(By.xpath(".//*[@id='tab4']")).click();
	Thread.sleep(1000);
	
	//enter date
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div/div/input")).clear();
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div/div/input")).sendKeys("14-11-2017");
	
	//enter event
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div/div[3]/div/div/div/input")).clear();
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div/div[3]/div/div/div/input")).sendKeys("private auction");
	
	//select reminder type
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div/div[4]/div/div/div/div/div/span[2]/span")).click();
	Robot robot =new Robot();
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(1000);
	
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div/div[5]/button")).click();
	Thread.sleep(1000);	
}

public void ops_of_Portal_Acess() throws Exception{
	//click portal acess tab
	driver.findElement(By.xpath(".//*[@id='tab5']")).click();
	Thread.sleep(1000);
	
	//select status
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div[1]/div/div/div/div/div/span[2]/span")).click();
	Thread.sleep(1000);
	Robot robot =new Robot();
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(1000);
	
	//tick portal notification
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div/div/div/label/div")).click();
	Thread.sleep(1000);
		
}

public void add_notes() throws Exception{
	//click notes tab
	driver.findElement(By.xpath(".//*[@id='tab6']")).click();
	Thread.sleep(1000);
	
	//enter note
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div/div/div[2]/div/div/div/textarea")).clear();
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div/div/div[2]/div/div/div/textarea")).sendKeys("test data");
	
	//click add button
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div/div/div[3]/button")).click();
	
	//click on save
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[1]/div[1]/div/button[2]")).click();
	Thread.sleep(3000);
	
	
	
	
	
}
@AfterClass	
public void end() throws Exception{
	driver.close();;
	
}	
	
}
