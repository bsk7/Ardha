package org.bsk.arda.rdpd.income.dao;

import java.util.List;

import org.bsk.arda.entity.Income;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class IncomeDAOImpl implements IncomeDAO {

	
	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public List<Income> getIncomeDetails() {
		
		//get the  current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		//create the a query..... sort this by last name
		Query<Income> query = currentSession.createQuery("from Income order by date desc",Income.class);
		
		query.setFirstResult(0);
		query.setMaxResults(7);
		
		//execute query and get resut
		List<Income> incomes = query.getResultList();
		
		//return the result
		return incomes;
	}


	@Override
	public void saveIncome(Income income) {
		
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// save th ecustomer
		currentSession.save(income);
		
	}


	@Override
	public float getTotalIncome() {
		
		float total =0;
		///get the  current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		//create the a query..... sort this by last name
		Query query = currentSession.createQuery("select i.amount from Income i");
		
		List<Float> amountList = query.getResultList();
		
		for(float f:amountList) {
			total=total+f;
		}
						
		//return the result
		return total;
	}

}
