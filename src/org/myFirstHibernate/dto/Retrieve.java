package org.myFirstHibernate.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.myFirstHibernate.dto.UserDetails;

import java.util.Date;

public class Retrieve {

    public static void main(String[] args) {

        UserDetailsOnly user = new UserDetailsOnly();
        UserDetailsCollection udc = new UserDetailsCollection();

        SessionFactory sessionFac = new Configuration().configure().buildSessionFactory();
        Session session = sessionFac.openSession();
        session.beginTransaction();
        user = (UserDetailsOnly) session.get(UserDetailsOnly.class, 1); // For non-Collection
        System.out.println("The Desc is  " + user.getDescription());
       //udc = (UserDetailsCollection) session.get(UserDetailsCollection.class, 1);// The sql query is created by .get method
        //System.out.println("The Desc is  " + user.getDescription());
        //session.close(); //If I close the session here, the proxy subclass cant access the list.
        // so either I've to delete it or initialize the fetch type to Eager/Lazy
        System.out.println("The Desc is  " + udc.getListOfAddress().size());
    }

}
