package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person p = context.getBean(Person.class);
        System.out.println("Person name: " + p.getName());
        System.out.println("Person's parrot: " + p.getParrot());
    }
}