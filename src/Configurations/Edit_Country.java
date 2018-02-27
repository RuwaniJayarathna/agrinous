package Configurations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class Edit_Country {
	WebDriver driver=new FirefoxDriver();

@BeforeClass
public void begin() throws Exception{
	driver.manage().timeouts().implicitlyWait(1/2, TimeUnit.MINUTES);
}

@Test
public void test() throws Exception{
	login();
	go_to_Edit_country();
	edit_details();
	
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

public void go_to_Edit_country() throws Exception{
	//click on configurations tab
	driver.findElement(By.xpath(".//*[@id='root']/section/div[2]/div/div[1]/section/ul/li[4]/a")).click();
	Thread.sleep(2000);
	
	//click on geographical configurations tab
	driver.findElement(By.xpath(".//*[@id='root']/section/div[2]/div/div[1]/section/ul/li[4]/ul/li/a[4]")).click();
	Thread.sleep(2000);
	
	//click on edit country icon
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[3]/div/div[1]/a/i")).click();
	Thread.sleep(1000);
}

public void edit_details() throws Exception{
	//edit coutry code
	driver.findElement(By.xpath(".//*[@id='country_code']")).clear();
	driver.findElement(By.xpath(".//*[@id='country_code']")).sendKeys("AUS");
	
	//tick the box
	
	WebElement element=driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[3]/div/div[2]/div[5]/div/div[1]/div/div/label/div"));
	if(element.getAttribute("value") == null){
		driver.findElement(By.xpath(".//*[@id='tax_value']")).clear();
		driver.findElement(By.xpath(".//*[@id='tax_value']")).sendKeys("10");
		
		
		
	}
	else{
		driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[3]/div/div[2]/div[5]/div/div[1]/div/div/label/div")).click();
		driver.findElement(By.xpath(".//*[@id='tax_value']")).clear();
		driver.findElement(By.xpath(".//*[@id='tax_value']")).sendKeys("10");
		
		
		
	}
	Thread.sleep(1000);
	
	//click on save
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[3]/div/div[2]/div[7]/button[2]")).click();
	Thread.sleep(2000);
}

@AfterClass
public void end() throws Exception{
	driver.close();
}

	
}
