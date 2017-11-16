package org.bsk.arda.rdpd.service;

import java.util.List;

import org.bsk.arda.entity.Income;
import org.bsk.arda.rdpd.income.dao.IncomeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class IncomeServiceImpl implements IncomeService {

	//need to inject customer DAO
	@Autowired
	private IncomeDAO incomeDAO;
	
	@Override
	@Transactional
	public List<Income> getIncomeDetails() {
		
		return incomeDAO.getIncomeDetails();
	}

	@Override
	@Transactional
	public void saveIncome(Income income) {
		
		incomeDAO.saveIncome(income);
	}

	@Override
	@Transactional
	public float getTotalIncome() {
		
		return incomeDAO.getTotalIncome();
	}

}
