package com.gulshan;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.setsName("Abdullah");
        s1.setRollNo(01);
        s1.setsAge(22);

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(com.gulshan.Student.class);
        cfg.configure();

        SessionFactory sf =cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();
        session.persist(s1); //saving the data

        transaction.commit();

        System.out.println(s1);
        }
    }
/*NOTE:-
before sessionFactory we need configuration object
buildSessionFactory() will give the object of sessionFactory
To open the session we need Session Factory and its a heavy weight process  so use this once per database in the application
* For every unit of work we will be using session hence we can open session can be used n no. of times */