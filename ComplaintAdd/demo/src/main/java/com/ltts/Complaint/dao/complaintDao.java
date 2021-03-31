package com.ltts.Complaint.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ltts.Complaint.model.Complaint;

@Repository
public class complaintDao {
	
	@Autowired
	private EntityManager em;
	
	@Autowired
	private SessionFactory sf;
	
	
	public boolean InsertComplaint(Complaint m) {
		boolean b=false;
		Session s=null;
		try {
			s=sf.openSession();
			s.beginTransaction();
			
			s.save(m);
			//System.out.println(st);
			s.getTransaction().commit();
			
		}
		catch(Exception e) {
			System.out.println("Exception "+e);
			b=true;
		}
//		finally {
//			sf.close();
//			em.close();
//		}
		
		return b;
	}
	
	
	/*
	 * public List<Member> getMembers(){ List }
	 */
	
	public List<Complaint> getAllComplaints(){
		Session session=sf.openSession();
        session.beginTransaction();
        
        List<Complaint> li=sf.openSession().createCriteria(Complaint.class).list();
        //List<ProductsModel> product=sessionFactory.openSession().createCriteria(ProductsModel.class).list();
        
        session.getTransaction().commit();
     
		return li;
		
	}	
}