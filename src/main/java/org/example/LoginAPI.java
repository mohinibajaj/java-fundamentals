package org.example;

import static io.restassured.RestAssured.*;

import com.google.gson.Gson;
import io.restassured.response.Response;

public class LoginAPI {

    public static void main(String[] args) {

        LoginRequestPojo loginRequest = new LoginRequestPojo("iamfd", "password");

////        Response response =  given().baseUri("http://64.227.160.186:9000/v1").
////                header("Content-type" , "application/json").
////                body(convertToJson(loginRequest)).post("/login");
//
//        System.out.println(response.asPrettyString());

        LoginResponsePojo loginResponse = given().baseUri("http://64.227.160.186:9000/v1").
                header("Content-type", "application/json").
                body(convertToJson(loginRequest)).post("/login").as(LoginResponsePojo.class);

        System.out.println(loginResponse);

        System.out.println(loginResponse.getMessage());
        //to fetch token, we can use getters
        System.out.println(loginResponse.getData().getToken());

    }

    private static String convertToJson(Object obj) {
        Gson gson = new Gson();
        return gson.toJson(obj);

    }
}
