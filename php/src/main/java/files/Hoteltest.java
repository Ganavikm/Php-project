package files;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import Automation.php.Hotel;
import Automation.php.Launch;
import Automation.php.flight;

public class Hoteltest extends Launch{
	Launch l1 = new Launch();

	Hotel h2 = new Hotel();
	
	@Test
	 public void method() throws IOException, InterruptedException{
		l1.Launchbrowser();
       h2.Hotelsearch();
	
       File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
   	FileUtils.copyFile(src,new File("C:\\Ganavi\\Hotel"));
}
}


