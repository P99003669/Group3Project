package com.ltts.project.Dao;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ltts.project.model.Complaint;

@Repository
public class ComplaintDao {

	@Autowired
	private SessionFactory sf;

	public boolean InsertComplaint(Complaint m) {
		boolean b = false;
		Session s = null;
		try {
			s = sf.openSession();
			s.beginTransaction();

			s.save(m);
			s.getTransaction().commit();

		} catch (Exception e) {
			System.out.println("Exception " + e);
			b = true;
		}

		return b;
	}

	@SuppressWarnings("unchecked")
	public List<Complaint> getAllComplaints() {
		Session session = sf.openSession();
		session.beginTransaction();

		@SuppressWarnings("deprecation")
		List<Complaint> li = sf.openSession().createCriteria(Complaint.class).list();
		// List<ProductsModel>
		// product=sessionFactory.openSession().createCriteria(ProductsModel.class).list();

		session.getTransaction().commit();

		return li;

	}

	public boolean updateComplaint(Integer EmployeeID, String remarks, String status) {
		Session session = sf.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Complaint employee = (Complaint) session.get(Complaint.class, EmployeeID);
			employee.setComplaintRemark(remarks);
			employee.setRequestStatus(status);
			session.update(employee);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return false;
	}

}