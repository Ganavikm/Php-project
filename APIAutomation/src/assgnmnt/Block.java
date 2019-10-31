package assgnmnt;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import static io.restassured.RestAssured.given;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import io.restassured.response.Response;

public class Block {
	Logger log= Logger.getLogger("posttweet");
	Properties prop;
	@Test
	
	public void createtweet() throws IOException{
	prop = new Properties();
	PropertyConfigurator.configure("C:\\javasel\\APIAutomation\\test-output\\log4j.properties");
	FileInputStream fis = new FileInputStream("C:\\javasel\\APIAutomation\\src\\assgnmnt\\data.properties");
	prop.load(fis);
	
		RestAssured.baseURI="https://api.twitter.com/1.1/blocks/";
		Response res = given().auth().oauth(prop.getProperty("ConsumerKey"), prop.getProperty("ConsumerSecret"),prop.getProperty("Token"),prop.getProperty("TokenSecret")).
		queryParam("screen_name","Sirjadeja")                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
		.when().post("/create.json").then().extract().response();
     
       
        String response = res.asString();
        System.out.println(response);
        log.info(response);
	}
	}


