package Automation.php;
import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

public class Login extends homepage {
    static Logger log=Logger.getLogger("Login");

static By email=By.xpath("//input[@placeholder='Email']");
static By password=By.xpath("//input[@placeholder='Password']");
static By login=By.xpath("//button[@class='btn btn-primary btn-lg btn-block loginbtn']");
public static void loginpage() {
//Properties	prop = new Properties();
PropertyConfigurator.configure("C:\\Users\\Online Test\\git\\Php-project\\php\\test-output\\lo1g4j.properties");

	driver.findElement(email).sendKeys(prop.getProperty("Email"));
	driver.findElement(password).sendKeys(prop.getProperty("Password"));
	driver.findElement(login).click();
	String title=driver.getTitle();
	 log.info(title);
	 
	
   
}
public static void main(String[] args) throws IOException{
	
	Launchbrowser();
	Login();
	loginpage();
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src,new File("C:\\Ganavi\\Login"));
	
}
}
