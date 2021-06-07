package com.springboot.loginThymeleaf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springboot.loginThymeleaf.entity.Bill;
import com.springboot.loginThymeleaf.entity.Stock;
import com.springboot.loginThymeleaf.service.BillService;
import com.springboot.loginThymeleaf.service.StockServices;

@Controller
public class BillController {
	@Autowired
    private BillService billservice;
	
	@RequestMapping(value = "/billpage", method = RequestMethod.GET)
	   public String index() 
	    {
	      return "subtotal";
	   }

	@GetMapping("/logoutpage")
	public String logout()
	{
		
		return "welcome";
	}

	
	
    /*@GetMapping("/billpage")
     public String viewBillPage(Model model) {
         List<Bill> listbill = billservice.listAll();
         model.addAttribute("billstock", listbill);
         //System.out.print("Get / ");	
         return "billing";
     }
    

    @GetMapping("/stocklist")//add new button 
    public String addCusStock(Model model) {
        model.addAttribute("bill", new Bill());
        return "savelist";
    }
    
    @RequestMapping(value = "/savecuslist", method = RequestMethod.POST)//save button 
    public String saveCusStock(@ModelAttribute("bill") Bill bill) {
    	billservice.save(bill);
        return "redirect:/billpage";
    }*/
}
