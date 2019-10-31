package assgnmnt;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import static io.restassured.RestAssured.given;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class weather {
	Logger log= Logger.getLogger("posttweet");
	Properties prop;
	@Test
	public void getWeather() throws IOException
	{
		prop = new Properties();
		PropertyConfigurator.configure("C:\\javasel\\APIAutomation\\test-output\\log4j.properties");
    	FileInputStream fis = new FileInputStream("C:\\javasel\\APIAutomation\\src\\assgnmnt\\data.properties");
    	prop.load(fis);
		RestAssured.baseURI="https://api.twitter.com/1.1/search/";
		Response res = given().auth().oauth(prop.getProperty("ConsumerKey"), prop.getProperty("ConsumerSecret"),prop.getProperty("Token"),prop.getProperty("TokenSecret")).
		queryParam("q","weather,Banglore")
		.when().get("/tweets.json").
		then().assertThat().statusCode(200).and().contentType(ContentType.JSON).extract().response();
	    String response = res.asString();
	    System.out.println(response);
	    log.info(response);
	}

}
