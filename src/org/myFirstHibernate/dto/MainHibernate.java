package org.myFirstHibernate.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class MainHibernate {

    public static void main(String[] args) {

        UserDetails user = new UserDetails();
        user.setUserID(3);
        user.setUsername("Lidya");
        user.setDate(new Date());
        user.setDescription("Lidya is my wife's old name given by God in February 20/2009");

        SessionFactory sessionFac = new Configuration().configure().buildSessionFactory();
        Session session = sessionFac.openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();
    }

}
