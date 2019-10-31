package Automation.php;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;


	import java.io.FileInputStream;
    import java.io.IOException;
    import java.util.Properties;
    import java.util.concurrent.TimeUnit;

 

    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;

 
        
        
    public class Hotel extends Launch{       
       
         
   static By hotelbtn=By.xpath("//a[@class='text-center hotels active']");
        static By hotelsname=By.xpath("//span[contains(text(),'Search by Hotel or City Name')]");
        static By hotelsel=By.xpath("//div[@id='s2id_autogen1']//a[@class='select2-choice']");
        static By hotelselect = By.xpath("//div[contains(text(),'gapore, Singapore')]");
        static By checkin=By.xpath("//input[@id='checkin']");
        static By checkout=By.xpath("//input[@id='checkout']");
        static By adultbtn=By.xpath("//div[contains(@class,'col o2')]//button[contains(@class,'btn btn-white bootstrap-touchspin-up')][contains(text(),'+')]");
        static By child=By.xpath("//div[contains(@class,'col 01')]//button[contains(@class,'btn btn-white bootstrap-touchspin-up')][contains(text(),'+')]");
        static By searchbtn=By.xpath("//div[contains(@class,'col-md-2 col-xs-12 o1')]//button[contains(@class,'btn btn-primary btn-block')][contains(text(),'Search')]");

 


        public static void Hotelsearch() throws IOException {
            prop=new Properties();
            FileInputStream fis=new FileInputStream("C:\\Users\\Online Test\\git\\Php-project\\php\\src\\main\\java\\files\\data.properties");
            prop.load(fis);
            
            driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
            //hotel name
            driver.findElement(hotelbtn).click();
            driver.findElement(hotelsname).click();
            driver.findElement(hotelsel).sendKeys("Sin");
            driver.findElement(hotelselect).click();
            
            driver.findElement(checkin).click();
            
            //checkin
            while(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/nav[1]/div[2]")).getText().contains("November"))
            {
                driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/nav[1]/div[3]/*")).click();
                break;
            }
            int count = driver.findElements(By.xpath("//div[1]//div[1]//div[1]//div[2]//div[26]")).size();
            System.out.println(count);
            for(int i=0;i<count;i++)
            {
                String text = driver.findElements(By.xpath("//div[1]//div[1]//div[1]//div[2]//div[26]")).get(i).getText();
                if(text.equalsIgnoreCase("21"))
                {
                    driver.findElements(By.xpath("//div[1]//div[1]//div[1]//div[2]//div[26]")).get(i).click();
                }
            }
            
            driver.findElement( checkout).click();
            //checkout
            while(!driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/nav[1]/div[2]")).getText().contains("November"))
            {
                driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/nav[1]/div[3]/*")).click();
                break;
            }
           
            int count1 = driver.findElements(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[33]")).size();
            for(int i=0;i<count1;i++)
            {
                String text = driver.findElements(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[33]")).get(i).getText();
                if(text.equalsIgnoreCase("28"))
                {
                    driver.findElements(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[33]")).get(i).click();
                }
            }
            
            
            driver.findElement(adultbtn).click();
            driver.findElement(child).click();
            driver.findElement(searchbtn).click();
            
        }
        	public static void main(String[] args) throws IOException{
        		// TODO Auto-generated method stub
        	Launchbrowser();
        	Hotelsearch();
    }
    }
