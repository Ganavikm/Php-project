package Automation.php;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class homepage extends Launch {
	
	static By MyAccount=By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/div[1]/a[1]");
	static By SignUp=By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/div[1]/div[1]/div[1]/a[2]");
	static By Login=By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/div[1]/div[1]/div[1]/a[1]");
public static void SignUp() {
	driver.findElement(MyAccount).click();
	driver.findElement(SignUp).click();
}
public static void Login() {
	driver.findElement(MyAccount).click();
	driver.findElement(Login).click();
	
}
public static void main(String[] args)throws IOException {
	Launchbrowser();
	SignUp();
	Login();
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src,new File("C:\\Ganavi\\home"));
	
}
}
