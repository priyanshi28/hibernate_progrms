package org.kls.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.kls.dto.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		
		UserDetails user =new UserDetails();
        user.setUserid(3);
        user.setUserName("Third User");
        
      SessionFactory sessionFactory =  new Configuration().configure().buildSessionFactory();
	   Session session= sessionFactory.openSession();
       session.beginTransaction();
       session.save(user);
       session.getTransaction().commit();
	}

}
