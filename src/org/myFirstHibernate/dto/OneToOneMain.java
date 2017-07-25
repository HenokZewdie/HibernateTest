package org.myFirstHibernate.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import java.util.Date;

public class OneToOneMain {

    public static void main(String[] args) {


        UserDetailsOnly user = new UserDetailsOnly();
        Vehicle vehicle = new Vehicle();

        user.setUsername("Mena");
        user.setDescription("My oldest daughter");
        user.setDate(new Date());

        vehicle.setVehicleName("BENZ");

        SessionFactory sessionFac = new Configuration().configure().buildSessionFactory();
        Session session = sessionFac.openSession();
        session.beginTransaction();

        session.save(user);
        session.save(vehicle);
        session.getTransaction().commit();
        session.close();
    }

}
