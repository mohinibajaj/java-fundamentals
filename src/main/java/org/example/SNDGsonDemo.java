package org.example;

import com.google.gson.Gson;

public class SNDGsonDemo {
    public static void main(String[] args) {

        User snd = new User("Mohini", 28);
        System.out.println(snd);

        // Serialisation : convert Java objects to JSON objects
        Gson gson = new Gson();
        String data = gson.toJson(snd);
        System.out.println(data);

        // De-serialisation : convert JSON objects to Java objects

        String jsonData = "{\"name\":\"Rashmi\",\"age\":56}";  //Json in string format

        // we have to conver this data into snd class object hence we will pass SND class to specify

        User snd1 =  gson.fromJson(jsonData, User.class);
        System.out.println(snd1);

    }
}