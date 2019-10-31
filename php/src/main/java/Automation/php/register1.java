package Automation.php;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

public class register1 extends homepage {
    static Logger log=Logger.getLogger("register1");
	static By FirstName = By.xpath("//input[@placeholder='First Name']");
	static By LastName = By.xpath("//input[@placeholder='Last Name']");
	static By Mobilenum= By.xpath("//input[@placeholder='Mobile Number']");
	static By Email= By.xpath("//input[@placeholder='Email']");
	static By Password= By.xpath("//input[@placeholder='Password']");
	static By confirmpass= By.xpath("//input[@placeholder='Confirm Password']");
	static By signupbutton=By.xpath("//button[@class='signupbtn btn_full btn btn-success btn-block btn-lg']");
	
public static void reg() {
	//Properties	prop = new Properties();
	PropertyConfigurator.configure("C:\\Users\\Online Test\\git\\Php-project\\php\\test-output\\lo1g4j.properties");
	
	
	
	driver.findElement(FirstName).sendKeys(prop.getProperty("FirstName"));
	driver.findElement(LastName).sendKeys(prop.getProperty("LastName"));
	driver.findElement(Mobilenum).sendKeys(prop.getProperty("Mobilenum"));
	driver.findElement(Email).sendKeys(prop.getProperty("Email"));
	driver.findElement(Password).sendKeys(prop.getProperty("Password"));
	driver.findElement(confirmpass).sendKeys(prop.getProperty("confirmpass"));
	//driver.manage().window().maximize();
	driver.findElement(signupbutton).sendKeys(Keys.ENTER);
	String title=driver.getTitle();
	 log.info(title);
	
	
}
public static void main(String[] args) throws IOException{
		Launchbrowser();
        SignUp();
       reg();
     
        

	

}
}