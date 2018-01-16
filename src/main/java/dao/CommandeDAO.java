package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Commande;


public class CommandeDAO {
	
	private static SessionFactory factory;
	
	public static void initFactory()
	{
		if(factory == null)
			factory = new Configuration()
					.configure()
					.addAnnotatedClass(Commande.class)
					.buildSessionFactory();
	}
	
	public static boolean save(Commande cmd)
	{
		initFactory();
		
		Session s = factory.getCurrentSession();
		
		try {						
			s.beginTransaction();
			
			s.save(cmd);
			
			s.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}
}
