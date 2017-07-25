package org.myFirstHibernate.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.myFirstHibernate.dto.Address;
import org.myFirstHibernate.dto.UserDetails;

import java.util.Date;

public class MainHibernate {

    public static void main(String[] args) {

       // UserDetailsCollection userCollection = new UserDetailsCollection();
        UserDetailsOnly user = new UserDetailsOnly();
        Address address = new Address();
        Address address2 = new Address();

       // userCollection.setUserID(7);
      //  userCollection.setUsername("Hawi");

        address.setStreet("6701 14th str");
        address.setCity("DC");
        address.setState("Washington");
        address.setZipcode("20012");

        user.setUsername("Mena");
        user.setDescription("My oldest daughter");
        user.setDate(new Date());

        address2.setStreet("12757 Turqouise Ter");
        address2.setCity("Fairland");
        address2.setState("Maryland");
        address2.setZipcode("20904");

       // userCollection.getListOfAddress().add(address);
       // userCollection.getListOfAddress().add(address2);

        SessionFactory sessionFac = new Configuration().configure().buildSessionFactory();
        Session session = sessionFac.openSession();
        session.beginTransaction();
        //session.save(userCollection);
        session.save(user);
        session.getTransaction().commit();
        session.close();
    }

}
