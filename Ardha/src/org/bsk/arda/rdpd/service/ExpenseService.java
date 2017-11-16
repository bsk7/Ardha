package org.bsk.arda.rdpd.service;

import java.util.List;

import org.bsk.arda.entity.Expense;
import org.bsk.arda.entity.Income;

public interface ExpenseService {

	public List<Expense> getExpenseDetails();

	public void saveExpense(Expense expense);
	
}
