package Configurations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class Add_New_State {
	WebDriver driver=new FirefoxDriver();
	
public void begin() throws Exception{
	driver.manage().timeouts().implicitlyWait(1/2, TimeUnit.MINUTES);
}	
	
@Test
public void test() throws Exception{
	login();
	go_to_addNewState_page();
	add_new_state();
	edit_state();
	delete_state();
	
	
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

public void go_to_addNewState_page() throws Exception{
	//click on configurations tab
	driver.findElement(By.xpath(".//*[@id='root']/section/div[2]/div/div[1]/section/ul/li[4]/a")).click();
	Thread.sleep(2000);
	
	//click on geographical configuration tab
	driver.findElement(By.xpath(".//*[@id='root']/section/div[2]/div/div[1]/section/ul/li[4]/ul/li/a[4]")).click();
	Thread.sleep(2000);
	
	//click on state tab
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[2]/div/a[2]")).click();
	Thread.sleep(1000);
	
	//click on add new state icon
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[1]/div[3]/div[1]/a/i")).click();
	Thread.sleep(1000);
}
 
public void add_new_state() throws Exception{
	//enter state
	driver.findElement(By.xpath(".//*[@id='name']")).clear();
	driver.findElement(By.xpath(".//*[@id='name']")).sendKeys("Test State1");
	
	//enter Abbreviation
	driver.findElement(By.xpath(".//*[@id='abbreviation_of_state']")).clear();
	driver.findElement(By.xpath(".//*[@id='abbreviation_of_state']")).sendKeys("TT");
	
	//enter postal code
	driver.findElement(By.xpath(".//*[@id='postal_code']")).clear();
	driver.findElement(By.xpath(".//*[@id='postal_code']")).sendKeys("067888");
	
	//click on save
	driver.findElement(By.xpath("html/body/div[5]/div/div/div[3]/button[2]")).click();
	Thread.sleep(3000);
	
	
}
public void edit_state() throws Exception{
	//click on edit icon of a state
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[1]/div[3]/div[2]/table/tbody/tr[1]/td[4]/p/button[1]")).click();
	
	//edit state
	driver.findElement(By.xpath(".//*[@id='name']")).clear();
	driver.findElement(By.xpath(".//*[@id='name']")).sendKeys("New South Wales");
	
	//edit abbreviation
	driver.findElement(By.xpath(".//*[@id='abbreviation_of_state']")).clear();
	driver.findElement(By.xpath(".//*[@id='abbreviation_of_state']")).sendKeys("NSW");
	
	//edit postal code
	driver.findElement(By.xpath(".//*[@id='postal_code']")).clear();
	driver.findElement(By.xpath(".//*[@id='postal_code']")).sendKeys("0676776");
	
	//click on update
	driver.findElement(By.xpath("html/body/div[5]/div/div/div[3]/button[2]")).click();
	Thread.sleep(3000);
}
public void delete_state() throws Exception{
	//click on delete icon
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[1]/div[3]/div[2]/table/tbody/tr[1]/td[4]/p/button[2]")).click();
	
	Thread.sleep(1000);
	//click on ok
	driver.findElement(By.xpath("html/body/div[6]/div/div/div[2]/a[2]")).click();
	Thread.sleep(3000);
}
@AfterClass
public void end() throws Exception{
	driver.close();
}
	
}
