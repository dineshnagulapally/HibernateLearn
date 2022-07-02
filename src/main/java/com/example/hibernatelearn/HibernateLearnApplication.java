package com.example.hibernatelearn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateLearnApplication {

    public static void main(String[] args) {

//        SpringApplication.run(HibernateLearnApplication.class, args);
        SampleUsers u = new SampleUsers();
        u.setUid(102);
        u.setUcolor("Cyan");
        AllName n = new AllName();
        n.setFirst("Nagulapelly");
        n.setMiddle("Dinesh");
        n.setLast("Reddy");
        u.setName(n);
        Configuration con = new Configuration().configure().addAnnotatedClass(SampleUsers.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(u);
        //u = (SampleUsers)session.get(SampleUsers.class,102);
        session.getTransaction().commit();
    }

}
