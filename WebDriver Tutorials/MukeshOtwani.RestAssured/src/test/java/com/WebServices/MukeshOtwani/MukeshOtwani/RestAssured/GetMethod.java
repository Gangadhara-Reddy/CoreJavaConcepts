package com.WebServices.MukeshOtwani.MukeshOtwani.RestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import junit.framework.Assert;

public class GetMethod {
	public static void main(String[] args) {
		Response resp = RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		//Response resp = RestAssured.get("api.openweathermap.org/data/2.5/weather?q=London");
		int StatusCode = resp.getStatusCode();
		System.out.println("Ststus Code:"+StatusCode);
		System.out.println("resp.asstring:"+resp.asString());
		System.out.println("resp.getbody:"+resp.getBody());
		System.out.println("resp.getcontenttype:"+resp.getContentType());
		System.out.println("resp.getheaders:"+resp.getHeaders());
		//resp.then().body("icon", "09d");
		//System.out.println(resp.body());
		//Assert.assertEquals(StatusCode,"200");
		System.out.println("resp.getheaders:"+resp.xmlPath());
		//ResponseBody resp1 = resp.getBody();
		//ResponseBody.class
	}
	//@Test
	//public void Get_RestAssured() {
		
	//}
}
