package org.example;

import javax.net.ssl.SSLContext;

public class DataPojo {
    private String token;

    public DataPojo(){

      //default constructor needed for de-serialistion
    }

    @Override
    public String toString() {
        return "DataPojo{" +
                "token='" + token + '\'' +
                '}';
    }

    public DataPojo(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
