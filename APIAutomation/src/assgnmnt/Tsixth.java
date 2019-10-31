package assgnmnt;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class Tsixth {
	 int[] k = {1,2295383,28218,23424977,23424852};
	 Logger log= Logger.getLogger("posttweet");
	 Properties prop;
	@Test
	public void createTweet() throws IOException {
		prop = new Properties();
		PropertyConfigurator.configure("C:\\javasel\\APIAutomation\\test-output\\log4j.properties");
		FileInputStream fis = new FileInputStream("C:\\javasel\\APIAutomation\\src\\assgnmnt\\data.properties");
		prop.load(fis);
		 for(int i=0;i<k.length;i++)
         {
         RestAssured.baseURI="https://api.twitter.com/1.1/trends";
         Response res = given().auth().oauth(prop.getProperty("ConsumerKey"), prop.getProperty("ConsumerSecret"),prop.getProperty("Token"),prop.getProperty("TokenSecret")).
        	       
         queryParam("id",k[i]).
         when().get("/place.json").then().extract().response();
         String responce=res.asString();
         System.out.println(responce);
         log.info(responce);
         
    
      
         }   
	}
}