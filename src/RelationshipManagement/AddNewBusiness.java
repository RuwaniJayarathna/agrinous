package RelationshipManagement;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class AddNewBusiness {
	WebDriver driver=new FirefoxDriver();

@BeforeClass
public void begin() throws Exception{
	driver.manage().timeouts().implicitlyWait(1/2, TimeUnit.MINUTES);
	
}
@Test
public void test() throws Exception{
	login();
	click_businesses();
	click_Add_New_Business();
	add_basic_details();
	add_address();
	//add_links();
	add_trading_details();
	add_bank_details();
	//add_roles();
	add_livestock();
	add_interactions();
	
	
	
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

public void click_businesses() throws Exception{
	driver.findElement(By.xpath(".//*[@id='root']/section/div[2]/div/div[1]/section/ul/li[3]/a/span")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath(".//*[@id='root']/section/div[2]/div/div[1]/section/ul/li[3]/ul/li[1]/a/span")).click();
	Thread.sleep(3000);
}

public void click_Add_New_Business() throws Exception{
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[1]/div/div[1]/a/i")).click();
	Thread.sleep(3000);
	
}
public void add_basic_details() throws Exception{
	//add name
	driver.findElement(By.xpath("//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div/div/input")).clear();
	driver.findElement(By.xpath("//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div/div/input")).sendKeys("kasuni");
	
	//add phone
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[3]/div[2]/div/div/div/input")).clear();
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[3]/div[2]/div/div/div/input")).sendKeys("0712546677");
	
	//add fax
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[3]/div[3]/div/div/div/input")).clear();
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[3]/div[3]/div/div/div/input")).sendKeys("011234556");
	
	//add website
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[3]/div[4]/div/div/div/input")).clear();
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[3]/div[4]/div/div/div/input")).sendKeys("www.madushika.com");
	
	//add email
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[3]/div[5]/div/div/div/input")).clear();
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[3]/div[5]/div/div/div/input")).sendKeys("kasunika@gmail.com");
	
	//click on social profile link
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[3]/a")).click();
	
	//add linkedin
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[3]/div[6]/div[1]/div/div/div/input")).clear();	
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[3]/div[6]/div[1]/div/div/div/input")).sendKeys("www.madulinkedin.com");
	Thread.sleep(1000);
	
	
	/*
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[3]")).click();
	Robot robot =new Robot();
	for(int i=0; i<10; i++){
		Thread.sleep(500);
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyRelease(KeyEvent.VK_DOWN);
	}
	
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	*/

	WebElement element = driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[3]/div[6]/div[1]/div/div/label"));
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].scrollIntoView(true);", element);

	
	Thread.sleep(1000);
	
	
	
	//add facebook
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[3]/div[6]/div[2]/div/div/div/input")).clear();
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[3]/div[6]/div[2]/div/div/div/input")).sendKeys("madufacebook");
	Thread.sleep(1000);
	
	//add twitter
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[3]/div[6]/div[3]/div/div/div/input")).clear();
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[3]/div[6]/div[3]/div/div/div/input")).sendKeys("madutwitter");
	
	Thread.sleep(1000);
}
public void add_address() throws Exception{
	//# and street
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[4]/div[2]/div/div/div/textarea")).clear();
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[4]/div[2]/div/div/div/textarea")).sendKeys("56 Main Street");
	
	//add city
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[4]/div[3]/div/div/div/input")).clear();
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[4]/div[3]/div/div/div/input")).sendKeys("Warakapola");
	Thread.sleep(3000);
	
	//select state
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[4]/div[4]/div/div/div/div/div/span[2]/span")).click();
	Thread.sleep(2000);
	
	
	
	
	
	Robot robot =new Robot();
	for(int i=0; i<3; i++){
		Thread.sleep(500);
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyRelease(KeyEvent.VK_DOWN);
	}
	
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	Thread.sleep(1000);
	
	
	//add postal code
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[4]/div[5]/div/div/div/input")).clear();
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[4]/div[5]/div/div/div/input")).sendKeys("07686886");
	Thread.sleep(1000);
	
	//add country
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[4]/div[6]/div/div/div/div/div/span[2]/span")).click();
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyRelease(KeyEvent.VK_DOWN);
	
	
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	Thread.sleep(1000);
	
		
}

public void add_links() throws Exception{
	//click on link tab
	driver.findElement(By.xpath(".//*[@id='tab2']")).click();
	
	//add business/person
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/input[1]")).click();
	Thread.sleep(2000);
	Robot robot=new Robot();
	for(int i=0; i<6; i++){
		Thread.sleep(500);
		
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		}
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(1000);
	
	//select role or add relation
		if(driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div/div[3]/div[1]/div/div/div/div/div/input[1]")).isDisplayed()){
			driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div/div[3]/div[1]/div/div/div/div/div/input[1]")).click();
			Thread.sleep(1000);
			for(int i=0; i<6; i++){
				Thread.sleep(500);
				
				robot.keyPress(KeyEvent.VK_DOWN);
				robot.keyRelease(KeyEvent.VK_DOWN);
				}
				
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				
				Thread.sleep(1000);
			
		}
		else{
			driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div/div[3]/div[1]/div/div/div/input")).isDisplayed();
			driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div/div[3]/div[1]/div/div/div/input")).clear();
			driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div/div[3]/div[1]/div/div/div/input")).sendKeys("QA");
		}

	//tick charges box
		driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div/div[3]/div[2]/div/div/div/div/label/div")).click();
	
	//add charge
		driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div/div[3]/div[3]/div/div/div/div/div/input[1]")).click();
		Thread.sleep(1000);
		for(int i=0; i<4; i++){
			Thread.sleep(500);
			
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			}
			
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
			Thread.sleep(1000);
	
	
	//click add button
			if(driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div/div[3]/div[2]/div/div/div/div/label/div")).isDisplayed()){
				driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div/div[3]/div[4]/button")).click();
				
			}
			
			else{
				driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div/div[3]/div[2]/button")).click();
				
			}
			Thread.sleep(3000);
	
}

	
public void add_trading_details() throws Exception{
	//go to trading&bank tab
	driver.findElement(By.xpath(".//*[@id='tab3']")).click();
	Thread.sleep(500);
	//add type of business
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div/div/div/div/span[2]/span")).click();
	Robot robot =new Robot();
	for(int i=0; i<2; i++){
		Thread.sleep(500);
		
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		}
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(1000);
	
	//add trading name
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div[3]/div/div/div/input")).clear();
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div[3]/div/div/div/input")).sendKeys("madushika traders");

	//add ABN
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div[4]/div/div/div/input")).clear();
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div[4]/div/div/div/input")).sendKeys("06777767");
	
	//add ACN number
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div[5]/div/div/div/input")).clear();
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div[5]/div/div/div/input")).sendKeys("567575757");
	
	//select trading status
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div[6]/div/div/div/div/div/span[2]/span")).click();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(1000);
		
	//add tick to GST
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div[7]/div/div/div/div/label/div")).click();
	Thread.sleep(1000);
}

public void add_bank_details() throws Exception{
	//select process
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[3]/div[2]/div/div/div/div/div/span[2]/span")).click();
	Robot robot =new Robot();
	for(int i=0; i<2; i++){
		Thread.sleep(500);
		
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		}
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(1000);
	
		
	//add BSB number
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[3]/div[3]/div/div/div/input")).clear();
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[3]/div[3]/div/div/div/input")).sendKeys("344545");
	
	//add Account number
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[3]/div[4]/div/div/div/input")).clear();
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[3]/div[4]/div/div/div/input")).sendKeys("45567677");
	
	
}

public void add_roles() throws Exception{
	//click roles tab
	driver.findElement(By.xpath(".//*[@id='tab4']")).click();
	Thread.sleep(500);
	
	//set as primary
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div[1]/span")).click();
	
	//tick secondary roles
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div/div[1]/div/div[1]/div/label/div")).click();
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/label/div")).click();
	
	//edit secon roles(livestock buyer)
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div/div[1]/div/div[2]/a")).click();
	Thread.sleep(1000);
	
	//tick on overide
	driver.findElement(By.xpath("html/body/div[5]/div/div/div[2]/div/div/div/div[2]/div/div/div/label/div")).click();
	Thread.sleep(1000);
	
	//overide the values
	driver.findElement(By.xpath("html/body/div[5]/div/div/div[2]/div/div/div/div[2]/div[2]/div/input")).clear();
	driver.findElement(By.xpath("html/body/div[5]/div/div/div[2]/div/div/div/div[2]/div[2]/div/input")).sendKeys("23");
	Thread.sleep(1000);
	
	//click cancel
	driver.findElement(By.xpath("html/body/div[5]/div/div/div[3]/button[1]")).click();
	Thread.sleep(1000);
	
	//edit secon roles(vendor)
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[2]/a")).click();
	driver.findElement(By.xpath("html/body/div[5]/div/div/div[2]/div[1]/div/div/div[2]/div/div/div/label/div")).click();
	
	//overide values
	driver.findElement(By.xpath("html/body/div[5]/div/div/div[2]/div[1]/div/div/div[2]/div[2]/div/input")).clear();
	driver.findElement(By.xpath("html/body/div[5]/div/div/div[2]/div[1]/div/div/div[2]/div[2]/div/input")).sendKeys("12");

	//click save
	driver.findElement(By.xpath("html/body/div[5]/div/div/div[3]/button[2]")).click();
	Thread.sleep(1000);
		
}

public void add_livestock() throws Exception{
	//click livestock tab
	driver.findElement(By.xpath(".//*[@id='tab5']")).click();
	
	//add pic
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div/input")).clear();
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div/input")).sendKeys("8997");
	
	//add pic name
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div/div[3]/div/div/div/input")).clear();
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div/div[3]/div/div/div/input")).sendKeys("new pic");

	//add pic address
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div/div[4]/div/div/div/input")).clear();
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div/div[4]/div/div/div/input")).sendKeys("34 main street");
	
	//click add button
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div/div[5]/button")).click();
	Thread.sleep(1000);
	
}

public void add_interactions() throws Exception{
	//click interactions tab
	driver.findElement(By.xpath(".//*[@id='tab6']")).click();
	
	//add note
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div/textarea")).clear();
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div/textarea")).sendKeys("new auction details");
	
	//attach file
	driver.findElement(By.xpath(".//*[@id='fileInput']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='fileInput']")).sendKeys("file:///home/thinkcube/Pictures/Screenshot%20from%202017-10-09%2009-58-48.png ");
	Thread.sleep(1000);
	
	//click add button
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[2]/div/div[2]/div/div[4]/button")).click();
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[1]/div[1]/div/button[2]")).click();
	
	
	
	//click save
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[1]/div[1]/div/button[2]")).click();
	Thread.sleep(5000);
}






@AfterClass
public void end() throws Exception{
	driver.quit();
	
}
}
