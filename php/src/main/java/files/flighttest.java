package files;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import Automation.php.Hotel;
import Automation.php.Launch;
import Automation.php.Login;
import Automation.php.flight;
import Automation.php.homepage;
import Automation.php.register1;

public class flighttest extends Launch {
	Launch l1 = new Launch();
	flight f2 = new flight();
	
	@Test
	 public void method() throws IOException, InterruptedException{
		l1.Launchbrowser();
 
       f2.flights();
	
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src,new File("C:\\Ganavi\\flight"));
}
}
