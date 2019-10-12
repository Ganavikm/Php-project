package Automation.php;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hotel extends Launch{
	
	static By hotel = By.xpath("//span[contains(text(),'Hotels')]");
	//static By cookies=By.xpath("//button[@id='cookyGotItBtn']");
	//static By hotelsea=By.xpath("//span[contains(text(),'Search by Hotel or City Name')]");
	//static By search = By.xpath("//div[@id='s2id_location']//a[@class='select2-choice select2-default']");
	//static By Hotelname= By.xpath("//*[@id=\"select2-drop\"]/u1/li/u1/li/div");
  //static By picsel =By.xpath("//li[@class='select2-results-dept-1 select2-result select2-result-selectable select2-highlighted']//div[@class='select2-result-label'][contains(text(),'lin, United States')]");
	static By checkin= By.xpath("//div[@id='dpd1']//input[@placeholder='Check in']");
	
	public static void hotelsearch()    {
		driver.findElement(hotel).click();
		//driver.findElement(cookies).click();
		//driver.findElement(hotelsea).click();
		//driver.findElement(search).sendKeys(prop.getProperty("search"));
		
		//Thread.sleep(3000);
		
	
		//driver.findElement(Hotelname).click();
		//driver.findElement(picsel).click();
		driver.findElement(checkin).click();
		
		
		while(true)
		{
			String s= driver.findElement(By.xpath("/html[1]/body[1]/div[14]/div[1]/table[1]/thead[1]/tr[1]/th[2]")).getText();
			if(s.equals(prop.getProperty("MONTH")))
	{
		break;
	}
	else {
		driver.findElement(By.xpath("/html[1]/body[1]/div[14]/div[1]/table[1]/thead[1]/tr[1]/th[3]")).click();
	}
		}
		
		driver.findElement(By.xpath("//div[14]//tr[4]//td[7][contains(text(),"+prop.getProperty("day")+")]")).click();
		//checkout
		while(true)
		{
			String s=driver.findElement(By.xpath("html[1]/body[1]/div[15]/div[1]/table[1]/thead[1]/tr[1]/th[2]")).getText();
			if(s.equals(prop.getProperty("MONTH1")))
			{
				break;
			}
			else {
				driver.findElement(By.xpath("/html[1]/body[1]/div[15]/div[1]/table[1]/thead[1]/tr[1]/th[3]")).click();
				s=driver.findElement(By.xpath("")).getText();
			}
			}
		driver.findElement(By.xpath("//div[15]//tr[5]//td[5][contains(text(),"+prop.getProperty("day1")+")]")).click();
		
		driver.findElement(By.xpath("//input[@id='htravellersInput']")).click();
		driver.findElement(By.xpath("//input[@id='hadultInput']")).sendKeys(prop.getProperty("adultip"));
		driver.findElement(By.xpath("//input[@id='hchildInput']")).sendKeys(prop.getProperty("childtip"));
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[6]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/form[1]/div[5]/button[1]")).click();
		}
		
		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			Launchbrowser();
			hotelsearch();
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File("C:\\Ganavi\\Hotel"));
			
       
	
		}
}

