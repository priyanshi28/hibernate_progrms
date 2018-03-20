package org.kls.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import org.kls.dto.Address;
import org.kls.dto.UserDetails;

public class HibernateTest {
    /**
     * @param args
     */
    public static void main(String[] args) 
    {
        UserDetails user1 = new UserDetails(); //create first user
        UserDetails user2 = new UserDetails(); //create second user
              
        user1.setUserName("Ashutosh Tiwari");
        user2.setUserName("Shyam Saini");
        
        Address address1 = new Address(); //create first value type object for  entity type object user1
        address1.setStreet("E 10 ");
        address1.setCity("Sector - 73");
        address1.setState("noida");
        address1.setPincode("201301");
        user1.setAddress(address1);
        
        Address address2 = new Address();//create second value type object for  entity type object user2
        address2.setStreet("E 10 ");
        address2.setCity("Sector - 73");
        address2.setState("noida");
        address2.setPincode("201301");
        user2.setAddress(address2);
        
        user1.setDob(new Date());
        user1.setPhone("+91-9654680242");
        
        user2.setDob(new Date());
        user2.setPhone("+91-9716437030");
        
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory(); //create a session factory object
        Session session = sessionFactory.openSession(); // create session object from session factory
        session.beginTransaction(); //begin transaction for this session
        
        session.save(user1); //save the first user 
        session.save(user2); //save the second user
        
        session.getTransaction().commit(); //commit the transaction the session
        session.close(); //close the session
    }
}
