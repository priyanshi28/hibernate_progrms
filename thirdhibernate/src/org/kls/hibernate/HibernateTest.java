package org.kls.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import org.kls.dto.UserDetails;

public class HibernateTest {
/**
* @param args
*/
public static void main(String[] args)
{
UserDetails user = new UserDetails(); 
user.setUserId(1);
user.setUserName("john john");

UserDetails user2 = new UserDetails();
user2.setUserId(2);
user2.setUserName("xyz xyz");

SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory(); //Creating a session factory object
Session session = sessionFactory.openSession(); 
session.beginTransaction(); 

session.save(user); 
session.getTransaction().commit();
session.close(); 
user = null;  
session = sessionFactory.openSession();
session.beginTransaction(); 

user = (UserDetails) session.get(UserDetails.class, 1); 
System.out.println(user);
}
}