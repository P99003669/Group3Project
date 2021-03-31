package com.ltts.project.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ltts.project.model.Department;

@Repository
public class departmentDao {

	@Autowired
	private SessionFactory sf;

	public boolean InsertDepartment(Department d) {
		boolean b = false;
		Session s = null;
		try {
			s = sf.openSession();
			s.beginTransaction();
			s.save(d);
			s.getTransaction().commit();

		} catch (Exception e) {
			System.out.println("Exception " + e);
			b = true;
		}

		return b;
	}

}