package org.example.gamerunner.Context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ContextBean {
    public static void  main(String[] args){
        var context = new AnnotationConfigApplicationContext(MyConfiguration.class);

        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("person"));
    }

}
