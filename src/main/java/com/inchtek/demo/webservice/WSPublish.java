package com.inchtek.demo.webservice;

import javax.xml.ws.Endpoint;

public class WSPublish {

    public static void main(String[] args){

        System.out.println("Starting public web service");

        Endpoint.publish("http://127.0.0.1:8080/MyGreetingService", new MyGreetingServiceImpl());

        System.out.println("End public web service");

    }
}
