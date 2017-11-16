package org.bsk.arda.rdpd.service;

import java.util.List;

import org.bsk.arda.entity.Expense;
import org.bsk.arda.rdpd.expense.dao.ExpenseDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ExpenseServiceImpl implements ExpenseService {

	//need to inject customer DAO
		@Autowired
		private ExpenseDAO expenseDAO;
		
		@Override
		@Transactional
		public List<Expense> getExpenseDetails() {
			
			return expenseDAO.getExpenseDetails();
		}

		@Override
		@Transactional
		public void saveExpense(Expense expense) {
			
			expenseDAO.saveExpense(expense);
		}

		
}
