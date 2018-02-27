package Admin_Dash;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class ViewProfile {
	WebDriver driver=new FirefoxDriver();
	
@BeforeClass
public void begin() throws Exception{
	driver.manage().timeouts().implicitlyWait(1/2, TimeUnit.MINUTES);
	
}

@Test
public void test() throws Exception{
	login();
	click_profile();
	click_edit_user();
	add_all_details();
	
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

public void click_profile() throws Exception{
	driver.findElement(By.xpath(".//*[@id='root']/section/div[1]/div/div/a[2]/span")).click();
	Thread.sleep(5000);
	WebElement element = driver.findElement(By.xpath(".//*[@id='root']/section/div[1]/div/div/a/div/ul/li[1]"));
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", element);
	

	Thread.sleep(5000);
}
public void click_edit_user() throws Exception{

/*	WebElement element = driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[1]/a"));
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", element); */
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[1]/a/i")).click();
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[1]/a/i")).click();
	
	Thread.sleep(5000);
	
}

public void add_all_details() throws Exception{
	//add last name
	driver.findElement(By.xpath(".//*[@id='last_name']")).clear();
	driver.findElement(By.xpath(".//*[@id='last_name']")).sendKeys("admin");
	
	//add passport
	driver.findElement(By.xpath(".//*[@id='passport']")).clear();
	driver.findElement(By.xpath(".//*[@id='passport']")).sendKeys("AU566");
	
	//click on update
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[2]/div[2]/div/div/div[3]/button[2]")).click();
	
	Thread.sleep(3000);
}

public void change_password() throws Exception{
	//go to change password tab
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[2]/div[1]/div/a[2]")).click();
	
	//add old password
	driver.findElement(By.xpath(".//*[@id='oldPassword']")).clear();
	driver.findElement(By.xpath(".//*[@id='oldPassword']")).sendKeys("admin");
	
	//add new password
	driver.findElement(By.xpath(".//*[@id='newPassword']")).clear();
	driver.findElement(By.xpath(".//*[@id='newPassword']")).sendKeys("12345admin");
	
	//confirm new password
	driver.findElement(By.xpath(".//*[@id='confirmPassword']")).clear();
	driver.findElement(By.xpath(".//*[@id='confirmPassword']")).sendKeys("12345admin");
	
	//click on reset button
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[2]/div[2]/div/div/div[3]/button[1]")).click();
	Thread.sleep(1000);
	
	//click change password button
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[2]/div[2]/div/div/div[3]/button[2]")).click();
	
	Thread.sleep(3000);
}


@AfterClass
public void end() throws Exception{
	driver.quit();
	
}

}
