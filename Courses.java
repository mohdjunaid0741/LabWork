package com.exe.LabWork;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration con1 = new Configuration().configure().addAnnotatedClass(Teacher.class);
    	Configuration con2 = new Configuration().configure().addAnnotatedClass(Courses.class);
        SessionFactory ss = con1.buildSessionFactory();
        Session s = ss.openSession();
        Transaction t = s.beginTransaction();
        
        Courses c1 = new Courses();
        c1.setId(101);
        c1.setCourse_name("Java Programming");
        c1.setCourse_name("4 Months");
        
        Courses c2 = new Courses();
        c2.setId(102);
        c2.setCourse_name("Python Programming");
        c2.setCourse_name("3 Months");
        
        Courses c3 = new Courses();
        c1.setId(103);
        c1.setCourse_name("Angular Programming");
        c1.setCourse_name("3.5 Days");
        
        Teacher t1 = new Teacher();
        t1.setId(1);
        t1.setName("Mrudula");
        
        t1.getCourse().add(c1);
        t1.getCourse().add(c2);
        t1.getCourse().add(c3);
        
        s.persist(t1);
        
        t.commit();
        
        s.close();
        
    	System.out.println( "Hello World!" );
    }
}

