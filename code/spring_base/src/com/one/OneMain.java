package com.one;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OneMain {
    public static void main(String[] args) {
        //官方建议bean放在src下
        ApplicationContext context=new ClassPathXmlApplicationContext("beanOne.xml");
        //参数name表示IOC容器中已经实例化的bean的id或者name,且无论是id还是name都要求在IOC容器中是唯一的不能重名。那么这种方法就是通过id或name去查找获取bean.
        User user1= (User) context.getBean("user");
        System.out.println(user1);
        user1.add();
        Bean2 bean2= (Bean2) context.getBean("bean2");
        bean2.add();
        Bean3 bean3= (Bean3) context.getBean("bean3");
        bean3.add();
        User user2=(User) context.getBean("user");
        System.out.println(user2);
        User2 user3=(User2) context.getBean("user2");
        System.out.println(user3);
        User2 user4=(User2) context.getBean("user2");
        System.out.println(user4);

    }
}
