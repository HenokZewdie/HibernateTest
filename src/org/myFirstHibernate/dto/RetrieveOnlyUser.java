package org.myFirstHibernate.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.myFirstHibernate.dto.UserDetails;

import java.util.Date;

public class RetrieveOnlyUser {

    public static void main(String[] args) {

        UserDetailsOnly user = new UserDetailsOnly();

        SessionFactory sessionFac = new Configuration().configure().buildSessionFactory();
        Session session = sessionFac.openSession();
        session.beginTransaction();

        user = (UserDetailsOnly) session.get(UserDetailsOnly.class, 1); // For non-Collection
        System.out.println(user.getUsername() + "  is  " + user.getDescription());

    }

}
