package Automation.php;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Launch {
	public static WebDriver driver;
	public static Properties prop=new Properties();
	
	public static void Launchbrowser() throws IOException{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Online Test\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
driver = new ChromeDriver();
FileInputStream fis =new FileInputStream("C:\\Users\\Online Test\\git\\Php-project\\php\\src\\main\\java\\files\\data.properties");
prop.load(fis);
driver.get(prop.getProperty("HOST"));

//driver.manage().window().maximize();
}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Launchbrowser();

	}

}
