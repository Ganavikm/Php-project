package assgnmnt;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.RestAssured;

public class posttweet{
	Logger log= Logger.getLogger("posttweet");
	
	 Properties prop;
@Test
	public void createTweet() throws IOException {
	prop = new Properties();
	PropertyConfigurator.configure("C:\\javasel\\APIAutomation\\test-output\\log4j.properties");
	FileInputStream fis = new FileInputStream("C:\\javasel\\APIAutomation\\src\\assgnmnt\\data.properties");
	prop.load(fis);
		RestAssured.baseURI = "https://api.twitter.com/1.1/statuses/";
		 Response res = given().auth().oauth(prop.getProperty("ConsumerKey"), prop.getProperty("ConsumerSecret"),prop.getProperty("Token"),prop.getProperty("TokenSecret")).
      	       
        queryParam("status","I am  learning API testing using RestAssured Java #Qualitest1")
        .when().post("/update.json").then().extract().response();
        
        String response = res.asString();
        System.out.println(response);
        log.info(response);
       JsonPath js = new JsonPath(response);
        String id = js.get("id").toString();
        log.info(id);

        System.out.println(id);
        String text = js.get("text").toString();
        log.info(text);
        System.out.println(text);
        
	}

}
