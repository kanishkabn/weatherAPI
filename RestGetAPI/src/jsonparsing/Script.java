package jsonparsing;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Script {


	public static void main(String[] args) {
		RequestSpecification r = RestAssured.given();
		Response res = r.request(Method.GET,"https://samples.openweathermap.org/data/2.5/forecast/hourly?q=London,us&appid=b6907d289e10d714a6e88b30761fae22");
		String value = res.asString();
		JsonPath Path = new JsonPath(value);
			 String d = "dt_txt";
			 if (d.equals("2019-03-31 17:00:00") ){
					String temp = Path.getString("list.main.temp");
					System.out.println("if the user press 1");
					System.out.println(temp);
				String WindSpeed = Path.getString("list.wind.speed");
				System.out.println("if the user press 2");
				System.out.println(WindSpeed);
				String pressure = Path.getString("list.main.pressure");
				System.out.println("if the user press3");
				System.out.println(pressure);
			}
			 else {
				 System.out.println("user press 0 terminate the program");
			 }
			
				
			
		
		
		

	}

}
