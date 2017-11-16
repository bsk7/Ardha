package org.bsk.arda.rdpd.income.dao;

import java.util.List;

import org.bsk.arda.entity.Income;

public interface IncomeDAO {

	public List<Income> getIncomeDetails();

	public void saveIncome(Income income);
}
