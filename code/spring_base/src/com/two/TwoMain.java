package com.two;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TwoMain {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beanTwo.xml");
        Student1 student1= (Student1) context.getBean("student1");
        student1.print();
        Student2 student2= (Student2) context.getBean("student2");
        student2.print();
        UserService userService= (UserService) context.getBean("userService");
        userService.add();
    }
}
