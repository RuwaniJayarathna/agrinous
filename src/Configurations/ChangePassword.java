package Configurations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class ChangePassword {
	WebDriver driver=new FirefoxDriver();
	
@BeforeClass
public void begin() throws Exception{
	driver.manage().timeouts().implicitlyWait(1/2, TimeUnit.MINUTES);
	
}

@Test
public void test() throws Exception{
	login();
	go_to_view_user_page();
	change_password();
	
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
public void change_password() throws Exception{
	//click on edit icon of a user
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[1]/a/i")).click();
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[1]/a/i")).click();
	Thread.sleep(1000);
	//click on change password tab
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[2]/div[1]/div/a[2]")).click();
	
	//enter old password
	driver.findElement(By.xpath(".//*[@id='oldPassword']")).clear();
	driver.findElement(By.xpath(".//*[@id='oldPassword']")).sendKeys("madu1992?");
	
	//enter new password
	driver.findElement(By.xpath(".//*[@id='newPassword']")).clear();
	driver.findElement(By.xpath(".//*[@id='newPassword']")).sendKeys("madu1992");
	
	//enter confirm password
	driver.findElement(By.xpath(".//*[@id='confirmPassword']")).clear();
	driver.findElement(By.xpath(".//*[@id='confirmPassword']")).sendKeys("madu1992");
	
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[2]/div[2]/div/div/div[3]/button[2]")).click();
	Thread.sleep(3000);
		
}

@AfterClass
public void end() throws Exception{
	driver.close();
	
	
}
	
}
