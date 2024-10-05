package com.demo.pojo;
public class Test {
    public static void main(String[] args) {
        
        Person person = new Person("Alice", 30, "alice@example.com");

     
        System.out.println(person);

       
        person.setAge(31);

  
        System.out.println("Updated age: " + person.getAge());
    }
}
