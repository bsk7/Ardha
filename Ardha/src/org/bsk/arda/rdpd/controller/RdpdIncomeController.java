package org.bsk.arda.rdpd.controller;

import java.util.List;

import org.bsk.arda.entity.Income;
import org.bsk.arda.rdpd.service.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/income")
public class RdpdIncomeController {

	//need to inject the CustomerServi
	@Autowired
	private IncomeService incomeService;
	
	@GetMapping("/showIncomes")
	public String listIncomes(Model model) {
			
		//get the customers from the DAO
		List<Income> incomes = incomeService.getIncomeDetails();
		float total= incomeService.getTotalIncome();
		//add the customers to the model
		model.addAttribute("incomes",incomes);
		model.addAttribute("total", total);
		
		return "show-incomes";
	}
	
	@GetMapping("/showFormForAddIncome")
	public String addIncome(Model model) {
			
		//create a model attribute to bind the form data
		Income income = new Income();
		
		model.addAttribute("income", income);
		return "income-form";
	}
	
	@PostMapping("/saveIncome")
	public String addCustomer(@ModelAttribute("income") Income income) {
			
		//save the customer using service
		incomeService.saveIncome(income);
		
		return "redirect:/income/showIncomes";
	}
}
