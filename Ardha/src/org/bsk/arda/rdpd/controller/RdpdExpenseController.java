package org.bsk.arda.rdpd.controller;

import java.util.List;

import org.bsk.arda.entity.Expense;
import org.bsk.arda.entity.Income;
import org.bsk.arda.rdpd.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/expense")
public class RdpdExpenseController {

	//need to inject the CustomerServi
	@Autowired
	private ExpenseService expenseService;
	
	@GetMapping("/showExpenses")
	public String listIncomes(Model model) {
			
		//get the customers from the DAO
		List<Expense> expenses = expenseService.getExpenseDetails();
		
		//add the Expense to the model
		model.addAttribute("expenses",expenses);
		
		
		return "show-expenses";
	}
	
	@GetMapping("/showFormForAddExpense")
	public String showExpense(Model model) {
			
		//create a model attribute to bind the form data
		Expense expense = new Expense();
		
		model.addAttribute("expense", expense);
		return "expense-form";
	}
	
	@PostMapping("/saveExpense")
	public String addExpense(@ModelAttribute("expense") Expense expense) {
			
		//save the customer using service
		expenseService.saveExpense(expense);
		
		return "redirect:/expense/showExpenses";
	}
}
