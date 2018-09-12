package com.inchtek.demo.webservice;

import javax.jws.WebService;

@WebService(name="MyGreetingService", serviceName = "MyGreetingWebService", targetNamespace = "www.inchtek.com")
public class MyGreetingServiceImpl implements IGreetingService {

    @Override
    public String hello(String user) {
        return "欢迎你，"+ user;
    }

}
