package org.bsk.arda.rdpd.service;

import java.util.List;

import org.bsk.arda.entity.Income;

public interface IncomeService {

	public List<Income> getIncomeDetails();

	public void saveIncome(Income income);
	
	public float getTotalIncome();
}
