package Automation.php;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Tour extends Launch {
	
	
//tatic By cookies=By.xpath("//button[@id='cookyGotItBtn']");
	static By Tours = By.xpath("//div[@id='body-section']//li[3]//a[1]");
	static By search =By.xpath("//span[contains(text(),'Search by Listing or City Name')]");
	static By search1= By.xpath("//div[@id='s2id_autogen3']//a[@class='select2-choice select2-default']");
	static By search2= By.xpath("//*[@id=\"select2-drop\"]/ul/li[1]/ul/li[1]/div");
	static By departure = By.xpath("//div[@id='tchkin']//input[@placeholder='Check in']");
	static By guest = By.xpath("//select[@id='adults']");
	static By typetour = By.xpath("//select[@id='tourtype']");
	static By typetours = By.xpath("//option[contains(text(),'Couples')]");
	static By Sea = By.xpath("//div[@class='col-md-2 form-group go-right col-xs-12 search-button']//button[@class='btn-primary btn btn-lg btn-block pfb0 loader'][contains(text(),'Search')]");
	
	public static void Toursearch() throws InterruptedException    {
		
		driver.findElement(Tours).click();
//iver.findElement(cookies).click();
Thread.sleep(1000);
	driver.findElement(search).click();
	driver.findElement(search1).sendKeys(prop.getProperty("Source"));
	driver.findElement(search1).sendKeys(Keys.DOWN);
	driver.findElement(search2).click();
	
	driver.findElement(departure).click();
	while(true)
	{
		String s= driver.findElement(By.xpath("//div[11]//div[1]//tr[1]//th[2]")).getText();
		if(s.equals(prop.getProperty("tmonth")))
{
	break;
}
else {
	driver.findElement(By.xpath("//div[11]//div[1]//tr[1]//th[3]")).click();
}
	}
	
	driver.findElement(By.xpath("//div[11]//tr//td[contains(text(),"+prop.getProperty("tday")+")]")).click();
	//checkout

	driver.findElement(guest).click();
	driver.findElement(By.xpath("//select[@id='adults']//option[4]")).click();
	
	driver.findElement(typetour).click();
	driver.findElement(typetours).click();
	
	driver.findElement(Sea).click();
	}
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
	Launchbrowser();
	try {
		Toursearch();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src,new File("C:\\Ganavi\\Tour"));
	
	}
	}

