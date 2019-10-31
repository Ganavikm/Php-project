package files;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import Automation.php.Launch;
import Automation.php.homepage;
import Automation.php.register1;

public class regtestcase extends register1 {
	Launch l1 = new Launch();
	homepage h1 = new homepage();
	register1 r1 = new register1();
	
	@Test
	 public void method() throws IOException{
		l1.Launchbrowser();
       h1.SignUp();
       r1.reg();
	
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src,new File("C:\\Ganavi\\register"));
}
}
