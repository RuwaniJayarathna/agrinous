package Configurations;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.*;

public class Users {
	WebDriver driver=new FirefoxDriver();

@BeforeClass
public void begin() throws Exception{
	driver.manage().timeouts().implicitlyWait(1/2, TimeUnit.MINUTES);
	
}
	
@Test

public void test() throws Exception{
	login();
	goto_add_user_page();
	add_image();
	enter_details();
	select_organization();
	select_status();
	select_roles();
	click_save();
	
	
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
public void goto_add_user_page() throws Exception{
	
	driver.findElement(By.xpath(".//*[@id='root']/section/div[2]/div/div[1]/section/ul/li[4]/a/span")).click();
	Thread.sleep(3000);
	//driver.findElement(By.xpath(".//*[@id='root']/section/div[2]/div/div[1]/section/ul/li[4]/ul/li/a[1]/span")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[1]/div/div[1]/a/i")).click();
	Thread.sleep(4000);
	
}	
public void add_image() throws Exception{
	
	
	driver.findElement(By.xpath(".//*[@id='fileInput']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(".//*[@id='fileInput']")).sendKeys("file:///home/thinkcube/Downloads/21584087_1846649405351713_298844488_o.jpg");
	
	Thread.sleep(3000);
	

}

public void enter_details() throws Exception{
	driver.findElement(By.xpath(".//*[@id='first_name']")).clear();
	driver.findElement(By.xpath(".//*[@id='first_name']")).sendKeys("Ruwani");
	
	driver.findElement(By.xpath(".//*[@id='last_name']")).clear();
	driver.findElement(By.xpath(".//*[@id='last_name']")).sendKeys("madurika");
	
	driver.findElement(By.xpath(".//*[@id='username']")).clear();
	driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("ru");
	
	driver.findElement(By.xpath(".//*[@id='email']")).clear();
	driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("madurikgmail.com");
	
	driver.findElement(By.xpath(".//*[@id='phone']")).clear();
	driver.findElement(By.xpath(".//*[@id='phone']")).sendKeys("087888999");
	
	driver.findElement(By.xpath(".//*[@id='passport']")).clear();
	driver.findElement(By.xpath(".//*[@id='passport']")).sendKeys("AUS345");
	
	driver.findElement(By.xpath(".//*[@id='address']")).clear();
	driver.findElement(By.xpath(".//*[@id='address']")).sendKeys("34 mawanella");
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[2]/div/div/div/div[2]/div[8]/div/div/div/div/input")).clear();
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[2]/div/div/div/div[2]/div[8]/div/div/div/div/input")).sendKeys("08-12-1990");
	
	Thread.sleep(3000);
}
public void select_organization() throws Exception{
	/*Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[2]/div[2]/div[9]/div/div/div/div/div/span[2]/span")).click();
	Select org = new Select(driver.findElement(By.xpath(".//*[@id='react-select-2--value']/div[1]")));
	org.selectByVisibleText("McKean McGregor");
	Thread.sleep(1000);
	*/
	
	driver.findElement(By.xpath(".//*[@id='react-select-2--value']/div[1]")).click();
	Thread.sleep(2000);
	
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyRelease(KeyEvent.VK_DOWN);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(1000);
	
}

public void select_status() throws Exception{
	
	
	driver.findElement(By.xpath(".//*[@id='react-select-3--value']/div[1]")).click();
	Thread.sleep(1000);
	
	Robot robot=new Robot();
	
	//robot.keyPress(KeyEvent.VK_DOWN);
	//robot.keyRelease(KeyEvent.VK_DOWN);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	
}

public void select_roles() throws Exception{
	
	
	driver.findElement(By.xpath(".//*[@id='react-select-4--value']/div[1]")).click();
	Thread.sleep(3000);
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyRelease(KeyEvent.VK_DOWN);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(1000);
	
}

public void click_save() throws Exception{
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[3]/button[2]")).click();
	Thread.sleep(1000);
	if(driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[2]/div[2]/div[4]/span")).isDisplayed()){
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='email']")).clear();
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("madu@gmail.com");
	}
	
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[3]/button[2]")).click();
	Thread.sleep(6000);
}
@AfterClass
public void end() throws Exception{
	driver.quit();
}
	
	
	
	
	
	
}
