package Configurations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class AddNewRole {
	WebDriver driver=new FirefoxDriver();

@BeforeClass
public void begin() throws Exception{
	driver.manage().timeouts().implicitlyWait(1/2, TimeUnit.MINUTES);
	
	
}	
@Test
public void test() throws Exception{
	login();
	go_to_addNewRole_page();
	add_new_role();
	
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
public void go_to_addNewRole_page() throws Exception{
	//click configurations tab
	//driver.findElement(By.xpath(".//*[@id='root']/section/div[2]/div/div[1]/section/ul/li[4]/a")).click();
	//driver.findElement(By.xpath("//*[contains(text(),'Configurations')]")).click();
	driver.findElement(By.xpath("//*[contains(@href,'/configurations')]")).click();
	
	
	
	//click roles configuration tab
	driver.findElement(By.xpath(".//*[@id='root']/section/div[2]/div/div[1]/section/ul/li[4]/ul/li/a[2]")).click();
	
	//click on add new role icon
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[1]/div/div[1]/a/i")).click();
	Thread.sleep(2000);
}	

public void add_new_role() throws Exception{
	//enter role name
	driver.findElement(By.xpath(".//*[@id='name']")).clear();
	driver.findElement(By.xpath(".//*[@id='name']")).sendKeys("Testing role-QA");
	
	//enter description
	driver.findElement(By.xpath(".//*[@id='description']")).clear();
	driver.findElement(By.xpath(".//*[@id='description']")).sendKeys("new role");
	
	//add permisions
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[2]/div[5]/div[2]/div/div/div/div[1]/label/div")).click();
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[2]/div[5]/div[2]/div/div/div/div[4]/label/div")).click();
	
	//click save
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[2]/div[10]/button[2]")).click();
	Thread.sleep(3000);
	
}
@AfterClass	
public void end() throws Exception{
	driver.close();
	
}	
	
	
	
	
	
}
