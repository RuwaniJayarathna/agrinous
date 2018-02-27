package Admin_Dash;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginAgrinous {
	WebDriver driver=new FirefoxDriver();
	
	@BeforeClass
	public void begin() throws Exception{
		driver.manage().timeouts().implicitlyWait(1/2, TimeUnit.MINUTES);
		
		
	}
	@Test
	public void test() throws Exception{
	login();
	logout();
	forgetPassword();
		
		
	}
	
	public void login() throws Exception{
		driver.get("https:thinkcube.agrinous.com");
		driver.findElement(By.xpath(".//*[@id='username']")).clear();
		driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath(".//*[@id='password']")).clear();
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("admin123");
		driver.findElement(By.xpath(".//*[@id='root']/section/div/section/div/form/button")).click();
		
		Thread.sleep(10000);
		
	}
	
	public void logout() throws Exception{
		driver.findElement(By.xpath(".//*[@id='root']/section/div[1]/div/div/a[2]")).click();
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.xpath("/html/body/div[3]/section/div[1]/div/div/a/div/ul/li[2]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		
	
		Thread.sleep(5000);
		
	}
	
	public void forgetPassword() throws Exception{
	
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='root']/section/div/section/div/form/a")).click();
		driver.findElement(By.xpath(".//*[@id='username']")).clear();
		driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("madur@thinkcube.com");
		driver.findElement(By.xpath(".//*[@id='root']/section/div/section/div/form/button")).click();
		Thread.sleep(3000);
		if(driver.findElement(By.xpath(".//*[@id='root']/section/div/div/span/div/div/div")).isDisplayed()){
		Thread.sleep(2000);
			driver.findElement(By.xpath(".//*[@id='root']/section/div/section/div/form/a")).click();
			
			driver.findElement(By.xpath(".//*[@id='username']")).clear();
			driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("admin");
			driver.findElement(By.xpath(".//*[@id='password']")).clear();
			driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("admin123");
			driver.findElement(By.xpath(".//*[@id='root']/section/div/section/div/form/button")).click();
			
			Thread.sleep(10000);
			
		}
		
		
		Thread.sleep(3000);
	}
	
	@AfterClass
	public void end() throws Exception{
		driver.quit();
	}

}
