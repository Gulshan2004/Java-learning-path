package com.gulshan;

public class Alien {

    private int age;
    private int salary;
    private Computer com;
    public Alien(){
//        System.out.println("Object Created");
    }

//    public Alien(int age, Computer com) {
//        System.out.println("para constructor Called");
//        this.age = age;
//        this.lap =lap;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
//        System.out.println("setter called ");
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        System.out.println("Coding");
        com.compile();
    }
}
