package com.inchtek.demo.test;

import com.inchtek.demo.annotation.Company;


public class AnnotationTest {

    public static void main(String[] args) {
        if (MyCompany.class.isAnnotationPresent(Company.class)) {
            System.out.println("Class Mycompany has Annotation Company");
            Company company = MyCompany.class.getAnnotation(Company.class);
            System.out.println(company.type());
        }

        int a[][] = {{2}, {3,4}, {5,6,7}, {8,9}, {10,11}};
        System.out.println(a[2][1]);
    }
}
