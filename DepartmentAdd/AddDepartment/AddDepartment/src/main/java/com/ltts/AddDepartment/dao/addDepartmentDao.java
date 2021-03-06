package com.ltts.AddDepartment.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ltts.AddDepartment.model.*;

@Repository
public class addDepartmentDao {

	@Autowired
	private EntityManager em;

	@Autowired
	private SessionFactory sf;

//	public boolean InsertDepartment(AddDepartment d) {
//		boolean b = false;
//		Session s = null;
//		try {
//			s = sf.openSession();
//			s.beginTransaction();
//			s.save(d);
//			s.getTransaction().commit();
//
//		} catch (Exception e) {
//			System.out.println("Exception " + e);
//			b = true;
//		}
//		return b;
//	}
	@SuppressWarnings("unchecked")
	public List<AddDepartment> getAllDepartments(){
		Session session=sf.openSession();
        session.beginTransaction();
        
        List<AddDepartment> li=sf.openSession().createCriteria(AddDepartment.class).list();
        //List<ProductsModel> product=sessionFactory.openSession().createCriteria(ProductsModel.class).list();
        
        session.getTransaction().commit();
     
		return li;
		
	}

}