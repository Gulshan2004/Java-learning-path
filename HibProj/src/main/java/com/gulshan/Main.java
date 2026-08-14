package com.gulshan;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
/*        Student s1= new Student();
          s1.setsName("Anvit");
          s1.setRollNo(106);
          s1.setsAge(29);

        //Student s2 =null;

//        Configuration cfg = new Configuration();
//        cfg.addAnnotatedClass(com.gulshan.Student.class);
//        cfg.configure();
        //I've Merged the line no. 16,17,18 in a single line which is line no. 21.

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.gulshan.Student.class)
                .configure()
                .buildSessionFactory();
        Session session = sf.openSession();

       // session.merge(s1); // merge() is used for updating  and adding new entries to the db

        //s2 = session.find(Student.class,46); //use to get the data from db based on the primary key

        //session.remove(s1); //remove() is used to delete an entry from the database

        Transaction transaction = session.beginTransaction();

       session.persist(s1); //saving the data

       transaction.commit();

       session.close();
       sf.close();

        System.out.println(s1);
        */

/*
        Laptop l1= new Laptop();
        l1.setLid(4);
        l1.setBrand("Asus");
        l1.setModel("Strix");
        l1.setRam(16);

        Laptop l2= new Laptop();
        l2.setLid(2);
        l2.setBrand("Dell");
        l2.setModel("Inspiron 15");
          l2.setRam(8);

        Laptop l3= new Laptop();
        l3.setLid(3);
        l3.setBrand("Apple");
        l3.setModel("Macbook");
        l3.setRam(32);

        Alien a1 =new Alien();
        a1.setAid(101);
        a1.setAname("Gulshan");
        a1.setTech("Java");

        Alien a2 =new Alien();
        a2.setAid(102);
        a2.setAname("Harsh");
        a2.setTech(" c++");

        a1.setLaptops(Arrays.asList(l1,l2));
        a2.setLaptops(Arrays.asList(l3));

        l1.setAlien(Arrays.asList(a1,a3));
        l2.setAlien(Arrays.asList(a1,a2));
        l3.setAlien(Arrays.asList(a2));


        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.gulshan.Alien.class)
                .addAnnotatedClass(com.gulshan.Laptop.class)
                .configure()
                .buildSessionFactory();

        Session session1 = sf.openSession();

        Transaction transaction = session1.beginTransaction();
        session1.persist(l1);
        session1.persist(l2);
        session1.persist(l3);

        session1.persist(a1);
        session1.persist(a2);

        transaction.commit();

        a2 = session1.find(Alien.class, 101);
        System.out.println(a2);

        session1.close();

        Session session2 = sf.openSession();

        a2 = session2.find(Alien.class, 101);
        System.out.println(a2);

        session2.close();

        sf.close();
*/


        Laptop l1= new Laptop();
        l1.setLid(4);
        l1.setBrand("Asus");
        l1.setModel("Strix");
        l1.setRam(16);

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(Laptop.class)
                .configure()
                .buildSessionFactory();

        Session session3 = sf.openSession();

//        Transaction transaction = session3.beginTransaction();
//        session3.persist(l1);
//        transaction.commit();

        //select * from laptop where ram =32 -> Sql
        //from Laptop where ram =32 ->hql


//        Query query = session3.createQuery("from Laptop where ram =32",Laptop.class);

        String brand = "Asus";

//        Query query = session3.createQuery("from Laptop where brand like ?1"); //this will give the entire field of that particular laptop
//        Query query = session3.createQuery("Select model from Laptop where brand like ?1"); //this will select only the model of that particular laptop

        Query query = session3.createQuery("Select brand,model from Laptop where brand like ?1");
        query.setParameter(1,brand); // 1 is gettig replaced by brand
        List<Object[]> laptops =query.getResultList();

//        l1 = session3.find(Laptop.class, 3);
//        System.out.println(l1);

        for(Object[] data : laptops){
            System.out.println((String)data[0] + " "+ (String) data[1]); //by deafult thet are objects so we needed to typecast them
        }

        System.out.println(laptops);

        session3.close();

        sf.close();

    }
    }
/*NOTE:-
before sessionFactory we need configuration object
buildSessionFactory() will give the object of sessionFactory
To open the session we need Session Factory and its a heavy weight process  so use this once per database in the application
also We need to  Use try with resources along with  SessionFactory or we can close the session and the session Factory
* For every unit of work we will be using session hence we can open session can be used n no. of times
we dont need transaction object when we are fetching the records it is only required when we are doing some sort of manipulation

Level1 - Cache works in the same session
lazy-fetch = Is used to fetch  only those entries that belons to the same entity  so to get all the entries the user need to explicity print the variable that stores fetch recult  */

/*Note:-
* In HQL if we need to pass ? followed by a number which is used when we are dealing with multiple entiries
* so to avoid confusions we use these numbers  so that whem we replace them later  we know exactly which number are we targaating */