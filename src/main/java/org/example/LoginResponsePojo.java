package org.example;

public class LoginResponsePojo {
    private String message;
    private DataPojo data;

    public LoginResponsePojo(){

        //default constructor needed for de-serialistion
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataPojo getData() {
        return data;
    }

    public void setData(DataPojo data) {
        this.data = data;
    }

    public LoginResponsePojo(String message, DataPojo data) {
        this.message = message;
        this.data = data;
    }

    @Override
    public String toString() {
        return "LoginResponsePojo{" +
                "message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
