package ru.specialist;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("1");
        ApplicationContext context = new AnnotationConfigApplicationContext(
                "ru.specialist");
        System.out.println("2");
        Person p = context.getBean(Person.class);
        System.out.println("3");
        Person p2 = context.getBean(Person.class);
        System.out.println("4");
        Animal a = context.getBean(Animal.class);
        System.out.println("5");
        Animal a2 = context.getBean(Animal.class);
        System.out.println("6");

        System.out.println(p == p2);
        System.out.println(a == a2);
    }
}
