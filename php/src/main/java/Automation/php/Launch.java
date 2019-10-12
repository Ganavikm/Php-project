package Automation.php;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	public static WebDriver driver;
	public static Properties prop=new Properties();
	public static void Launchbrowser() throws IOException{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Online Test\\Documents\\selenium jars\\wdrivers\\chromedriver.exe");
driver = new ChromeDriver();
FileInputStream fis =new FileInputStream("C:\\javasel\\php\\src\\main\\java\\files\\data.properties");
prop.load(fis);
driver.get(prop.getProperty("HOST"));
driver.manage().window().maximize();
}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Launchbrowser();

	}

}
