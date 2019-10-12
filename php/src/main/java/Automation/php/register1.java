package Automation.php;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class register1 extends homepage {
	
	static By FirstName = By.xpath("//input[@placeholder='First Name']");
	static By LastName = By.xpath("//input[@placeholder='Last Name']");
	static By Mobilenum= By.xpath("//input[@placeholder='Mobile Number']");
	static By Email= By.xpath("//input[@placeholder='Email']");
	static By Password= By.xpath("//input[@placeholder='Password']");
	static By confirmpass= By.xpath("//input[@placeholder='Confirm Password']");
	static By cookies=By.xpath("//*[@id=\'cookyGotItBtn\']");
	static By signupbutton=By.xpath("//button[@class='signupbtn btn_full btn btn-action btn-block btn-lg']");
	
public static void reg() {
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(cookies).click();
	driver.findElement(FirstName).sendKeys(prop.getProperty("FirstName"));
	driver.findElement(LastName).sendKeys(prop.getProperty("LastName"));
	driver.findElement(Mobilenum).sendKeys(prop.getProperty("Mobilenum"));
	driver.findElement(Email).sendKeys(prop.getProperty("Email"));
	driver.findElement(Password).sendKeys(prop.getProperty("Password"));
	driver.findElement(confirmpass).sendKeys(prop.getProperty("confirmpass"));
	driver.findElement(signupbutton).click();
	
}
public static void main(String[] args) throws IOException{
		Launchbrowser();
        SignUp();
       reg();
       File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
   	FileUtils.copyFile(src,new File("C:\\Ganavi\\register"));
   	
        

	

}
}