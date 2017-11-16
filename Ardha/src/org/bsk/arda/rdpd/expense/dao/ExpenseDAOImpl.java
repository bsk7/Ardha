package org.bsk.arda.rdpd.expense.dao;

import java.util.List;

import org.bsk.arda.entity.Expense;
import org.bsk.arda.entity.Income;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ExpenseDAOImpl implements ExpenseDAO {

	
	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public List<Expense> getExpenseDetails() {
		
		//get the  current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		//create the a query..... sort this by last name
		Query<Expense> query = currentSession.createQuery("from Expense",Expense.class);
		
		
		
		//execute query and get resut
		List<Expense> expenses = query.getResultList();
		
		//return the result
		return expenses;
	}


	@Override
	public void saveExpense(Expense expense) {
		
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// save th ecustomer
		currentSession.save(expense);
		
	}


	

}
