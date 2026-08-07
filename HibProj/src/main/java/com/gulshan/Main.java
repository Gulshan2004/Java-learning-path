package com.gulshan;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.setsName("Faisal");
        s1.setRollNo(40);
        s1.setsAge(22);

        Student s2 =null;

//        Configuration cfg = new Configuration();
//        cfg.addAnnotatedClass(com.gulshan.Student.class);
//        cfg.configure();
        //I've Merged the line no. 16,17,18 in a single line which is line no. 21.

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.gulshan.Student.class)
                .configure()
                .buildSessionFactory();
        Session session = sf.openSession();

        s2 = session.find(Student.class,46); //use to get the data from db based on the primary key

       // Transaction transaction = session.beginTransaction();
       // session.persist(s1); //saving the data
        // transaction.commit();


        session.close();
        sf.close();
        System.out.println(s2);
        }
    }
/*NOTE:-
before sessionFactory we need configuration object
buildSessionFactory() will give the object of sessionFactory
To open the session we need Session Factory and its a heavy weight process  so use this once per database in the application
also We need to  Use try with resources along with  SessionFactory or we can close the session and the session Factory
* For every unit of work we will be using session hence we can open session can be used n no. of times
we dont need transaction object when we are fetching the records it is only required when we are doing some sort of manipulation */