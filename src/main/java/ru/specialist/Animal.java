package ru.specialist;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
//@Lazy
public class Animal {
    private String name;
    private int age;

    public Animal(@Value("Sergey") String name, @Value("33") int age) {
        super();
        this.name = name;
        this.age = age;
        System.out.println("Animal created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString()  {
        return String.format("%s -- %s", getName(), getAge());
    }
}
