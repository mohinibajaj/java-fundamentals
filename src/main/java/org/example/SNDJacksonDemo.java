package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

//Using Jackson

public class SNDJacksonDemo {
    public static void main(String[] args) throws JsonProcessingException {

    User user1 = new User("Mohini", 28);
        System.out.println(user1);


        // Serialisation using JACKSON
      ObjectMapper mapper = new ObjectMapper();
      String data =  mapper.writeValueAsString(user1);

      //writerWithDefaultPrettyPrinter is used to print data in pretty way


        String prettyData =  mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user1);
        System.out.println(data);
        System.out.println(prettyData);

        String jsonData = "{\"name\":\"Rashmi\",\"age\":56}";

        User userData =  mapper.readValue(jsonData, User.class); // this returns the java object of user class
        System.out.println(userData);


        //Jackson doesn't use parameterized constructor hence it needs a default constructor

    }}
