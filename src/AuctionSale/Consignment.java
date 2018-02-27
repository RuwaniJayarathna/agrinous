package AuctionSale;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class Consignment {

	WebDriver driver=new FirefoxDriver();

@BeforeTest
public void begin() throws Exception{
	driver.manage().timeouts().implicitlyWait(1/2,TimeUnit.MINUTES);
}

@Test
public void test() throws Exception{
	login();
	go_to_consignment_tab();
	check_coulumn_visiblity();
	set_column_visible();
	close_sale();
	
	
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

public void go_to_consignment_tab() throws Exception{
	//click on auction & sale tab
	driver.findElement(By.xpath(".//*[@id='root']/section/div[2]/div/div[1]/section/ul/li[2]/a/span")).click();
	
	/*Thread.sleep(1000);
	//click on livestock tab
	driver.findElement(By.xpath(".//*[@id='root']/section/div[2]/div/div[1]/section/ul/li[2]/ul/li[1]/a/span")).click();
	*/
	
	Thread.sleep(6000);
	
	
	//click on a auction
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[3]/div/div[1]/div/div[3]/a[2]")).click();
	Thread.sleep(5000);
}

public void check_coulumn_visiblity() throws Exception{
	//click column visibility button
	driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[3]/div/div/div/div[1]/div[2]/div/button")).click();
	
	//tick coulmns to hide
	driver.findElement(By.xpath("html/body/div[5]/div/div/div/div/div/div/div[1]/label/div")).click();
	driver.findElement(By.xpath("html/body/div[5]/div/div/div/div/div/div/div[2]/label/div")).click();
	driver.findElement(By.xpath("html/body/div[5]/div/div/div/div/div/div/div[last()]/label/div")).click();
	Thread.sleep(1000);
}
public void set_column_visible() throws Exception{
	driver.findElement(By.xpath("html/body/div[5]/div/div/div/div/div/div/div[last()]/label/div")).click();
	Thread.sleep(1000);
}

public void close_sale() throws Exception{
	
	
	//click on ok to confirm
	if(!(driver.findElements(By.xpath("//*[contains(text(),'Sale Closed')]")).size() != 0)){
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='root']/section/div[3]/div[2]/div[1]/div/div[1]/div[2]/button")).click();
		Thread.sleep(2000);
	}		
else{
		driver.close();
		
		}	
	}

@AfterClass
public void end() throws Exception{
	driver.quit();
} 


}




