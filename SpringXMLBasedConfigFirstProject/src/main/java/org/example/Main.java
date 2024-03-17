package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        try{
            ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

            Employee employee = (Employee) context.getBean("employee");
            System.out.println(employee.getName());
            System.out.println(employee.getId());

        }
        catch (Exception ex){
            System.out.println(ex);
        }



    }
}