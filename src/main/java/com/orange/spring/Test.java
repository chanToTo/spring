package com.orange.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author orangeC
 * @description
 * @date 2020/2/18 21:24
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
//        Person person = (Person) applicationContext.getBean("person");
        Person person = applicationContext.getBean(Person.class);
        System.out.println(person.getId());

    }
}
