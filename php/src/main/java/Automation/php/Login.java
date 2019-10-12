package Automation.php;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Login extends homepage {
static By email=By.xpath("//input[@placeholder='Email']");
static By password=By.xpath("//input[@placeholder='Password']");
static By login=By.xpath("//button[@class='btn btn-action btn-lg btn-block loginbtn']");
public static void loginpage()
{
	driver.findElement(email).sendKeys(prop.getProperty("Email"));
	driver.findElement(password).sendKeys(prop.getProperty("Password"));
	driver.findElement(login).click();
}
public static void main(String[] args) throws IOException{
	
	Launchbrowser();
	Login();
	loginpage();
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src,new File("C:\\Ganavi\\Login"));
	
}
}
