package com.WebServices.MukeshOtwani.MukeshOtwani.RestAssured;

import io.restassured.RestAssured;
//import io.restassured.internal.path.json.mapping.JsonObjectDeserializer;
import io.restassured.specification.RequestSpecification;

public class PostMethod {

	public static void main(String[] args) {
	RequestSpecification req = RestAssured.given();
	req.header("content-type","JSON/Application");
	JSONObject json = new JSONObject();
	//req.patch(URI)
	}

}
