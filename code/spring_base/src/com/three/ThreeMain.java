package com.three;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ThreeMain {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beanThree.xml");
        Person person= (Person) context.getBean("person");
        person.test();
    }
}
