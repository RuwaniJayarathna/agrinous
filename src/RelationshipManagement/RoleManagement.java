package RelationshipManagement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;


public class RoleManagement {
	WebDriver driver=new FirefoxDriver();
	
@BeforeClass	
public void begin() throws Exception{
	driver.manage().timeouts().implicitlyWait(1/2, TimeUnit.MINUTES);	
}

@Test
public void test() throws Exception{
	login();
	go_to_RoleManagement();
	create_roles();
	edit_secondary_roles();
	edit_primary_roles();
	//delete_secondary_roles();
	delete_primary_roles();
	
	
	
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
public void go_to_RoleManagement() throws Exception{
	
	driver.findElement(By.xpath(".//*[@id='root']/section/div[2]/div/div[1]/section/ul/li[3]/a")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath(".//*[@id='root']/section/div[2]/div/div[1]/section/ul/li[3]/ul/li[3]/a")).click();
	Thread.sleep(1000);
	
	
}	
public void create_roles() throws Exception{
	//enter primary role name
	driver.findElement(By.xpath(".//*[@id='role_name']")).clear();
	driver.findElement(By.xpath(".//*[@id='role_name']")).sendKeys("Test Role");
	
	//click create button
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[1]/div[1]/button")).click();
	Thread.sleep(2000);
	
	//click(+) icon
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[1]/div[2]/div/div[2]/div[1]/a/i")).click();
	Thread.sleep(1000);
	
	//enter secondary role
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[1]/div[2]/div/div[2]/div[2]/div/div[1]/div/div/input")).sendKeys("test new");	
	Thread.sleep(1000);
	
	//click create button
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[1]/div[2]/div/div[2]/div[2]/div/div[2]/button[1]")).click();
	Thread.sleep(2000);
}	

public void delete_secondary_roles() throws Exception{
	//click on delete icon of sec role
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[1]/div[2]/div/div[2]/div[3]/div/div/div[2]/a[2]")).click();
	//click on ok
	Thread.sleep(3000);
	driver.findElement(By.xpath("html/body/div[4]/div/div/div[2]/a[2]")).click();
	Thread.sleep(3000);
	
	
}

public void delete_primary_roles() throws Exception{
	//click on delete icon of primary role
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[1]/div[2]/div/div[1]/div[2]/a[2]")).click();
	//click on ok
	Thread.sleep(1000);
    WebElement element =driver.findElement(By.xpath("html/body/div[4]/div/div/div[2]/a[2]"));
	JavascriptExecutor executor  = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click(); ",element);
	
	//driver.findElement(By.xpath("html/body/div[4]/div/div/div[2]/a[2]")).click();
	Thread.sleep(1000);
}

public void edit_secondary_roles() throws Exception{
	//click on edit icon of a sec role
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[1]/div[2]/div/div[2]/div[3]/div/div/div[2]/a[1]")).click();
	
	//click on sec role field
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[1]/div[2]/div/div[2]/div[3]/div/div/div/div[1]/div/div/input")).clear();
	
	//edit the field
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[1]/div[2]/div/div[2]/div[3]/div/div/div/div[1]/div/div/input")).sendKeys("test new role edit");
	
	//click on save
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[1]/div[2]/div/div[2]/div[3]/div/div/div/div[2]/button[1]")).click();
	Thread.sleep(2000);
}

public void edit_primary_roles() throws Exception{
	//click on edit icon of a primary role
		driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[1]/div[2]/div/div[1]/div[2]/a[1]")).click();
		
		//click on primary role field
		driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[1]/div[2]/div/div[1]/div/div[1]/div/div/input")).clear();
		
		//edit the field
		driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[1]/div[2]/div/div[1]/div/div[1]/div/div/input")).sendKeys("test");
		
		//click on save
		driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div[1]/div[2]/div/div[1]/div/div[2]/button[1]")).click();
		Thread.sleep(2000);
}
@AfterClass	
public void end() throws Exception{
	driver.close();
}	


}
