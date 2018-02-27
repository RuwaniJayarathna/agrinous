package Configurations;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;


public class Edit_User {
	WebDriver driver=new FirefoxDriver();
	
@BeforeClass
public void begin() throws Exception{
	driver.manage().timeouts().implicitlyWait(1/2, TimeUnit.MINUTES);
}

@Test
public void test() throws Exception{
	login();
	go_to_view_user_page();
	edit_profile();
	
	
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
public void go_to_view_user_page() throws Exception{
	//click on configurations tab
	driver.findElement(By.xpath(".//*[@id='root']/section/div[2]/div/div[1]/section/ul/li[4]/a")).click();
	//click on view icon of a user
	Thread.sleep(1000);
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[1]/div/div[2]/div[2]/table/tbody/tr[2]/td[5]/p/a")).click();
	Thread.sleep(1000);
}

public void edit_profile() throws Exception{
	//click on edit user icon
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[1]/a/i")).click();
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[1]/a/i")).click();
	Thread.sleep(1000);
	//edit first name
	driver.findElement(By.xpath(".//*[@id='first_name']")).clear();
	driver.findElement(By.xpath(".//*[@id='first_name']")).sendKeys("darshika");
	
	//edit last name
	driver.findElement(By.xpath(".//*[@id='last_name']")).clear();
	driver.findElement(By.xpath(".//*[@id='last_name']")).sendKeys("jayarathna");
	
	//edit username
	driver.findElement(By.xpath(".//*[@id='username']")).clear();
	driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("dana");
	
	//edit email
	driver.findElement(By.xpath(".//*[@id='email']")).clear();
	driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("dana@gmail.com");
	
	//edit phone
	driver.findElement(By.xpath(".//*[@id='phone']")).clear();
	driver.findElement(By.xpath(".//*[@id='phone']")).sendKeys("011234567");
	
	//edit mobile
	driver.findElement(By.xpath(".//*[@id='mobile_number']")).clear();
	driver.findElement(By.xpath(".//*[@id='mobile_number']")).sendKeys("0712346565");
	
	//edit passport
	driver.findElement(By.xpath(".//*[@id='passport']")).clear();
	driver.findElement(By.xpath(".//*[@id='passport']")).sendKeys("ADY56");
	
	//edit address
	driver.findElement(By.xpath(".//*[@id='address']")).clear();
	driver.findElement(By.xpath(".//*[@id='address']")).sendKeys("345 west hills");
	
	//edit date of birth
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[2]/div[2]/div/div/div[2]/div[9]/div/div/div/div/input")).clear();
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[2]/div[2]/div/div/div[2]/div[9]/div/div/div/div/input")).sendKeys("08-02-2000");
	Thread.sleep(1000);
	
	//edit roles
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[2]/div[2]/div/div/div[2]/div[12]/div/div/div/div/div/span[2]/span")).click();
	
	Thread.sleep(1000);
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	//click on update
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[2]/div[2]/div/div/div[3]/button[2]")).click();
	Thread.sleep(3000);
	
}


@AfterClass
public void	end() throws Exception{
	driver.close();
}
	
	
	
}
