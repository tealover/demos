package com.inchtek.demo.webservice;

import javax.jws.WebService;

public interface IGreetingService {

    /**
     * 问候
     * @param user 用户
     * @return 欢迎词
     */
    public String hello(String user);
}
