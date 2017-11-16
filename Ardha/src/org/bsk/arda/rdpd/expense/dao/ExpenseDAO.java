package org.bsk.arda.rdpd.expense.dao;

import java.util.List;

import org.bsk.arda.entity.Expense;

public interface ExpenseDAO {

	public List<Expense> getExpenseDetails();

	public void saveExpense(Expense expense);
	

}
