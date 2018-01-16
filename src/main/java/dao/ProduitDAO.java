package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Produit;

public class ProduitDAO {
	
	private static SessionFactory factory;
	
	public static void initFactory()
	{
		if(factory == null)
			factory = new Configuration()
					.configure()
					.addAnnotatedClass(Produit.class)
					.buildSessionFactory();
	}
	
	public static boolean save(Produit pdt)
	{
		initFactory();
		
		Session s = factory.getCurrentSession();
		
		try {						
			s.beginTransaction();
			
			s.save(pdt);
			
			s.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}
	
	public static List<Produit> getAll() {
		
		List<Produit> produits = null;
		
		initFactory();
		Session s = factory.getCurrentSession();
		
		try {						
			s.beginTransaction();
			
			produits = s.createQuery("from produits_prix").list();
			
			s.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return produits;
	}

}
