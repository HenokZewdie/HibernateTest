package org.myFirstHibernate.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class Retrieve {

    public static void main(String[] args) {

        UserDetails user = new UserDetails();

        SessionFactory sessionFac = new Configuration().configure().buildSessionFactory();
        Session session = sessionFac.openSession();
        session.beginTransaction();
        user = (UserDetails) session.get(UserDetails.class, 2);
        System.out.println("The Desc is  " + user.getDescription());
    }

}
