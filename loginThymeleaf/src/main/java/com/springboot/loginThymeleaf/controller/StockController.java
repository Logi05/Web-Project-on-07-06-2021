package com.springboot.loginThymeleaf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.loginThymeleaf.entity.Stock;
import com.springboot.loginThymeleaf.service.StockServices;



@Controller
public class StockController {
	@Autowired
    private StockServices service;
	
	
	/*@GetMapping("/")
	public String loginPage()
	{
		return "login";
	}*/
	
	/*@GetMapping("/login")
	public String login(@ModelAttribute(name="stock") Stock stock,Model model)
	{
		String username=stock.getUsername();
		String password=stock.getPassword();
		
		if("Employee".equals(username) && "admin".equals(password))
		{
			return "index";
		}
		else
		{
			model.addAttribute("Invalid Credentials", true);
			return "errorpage";
		}
	}*/
	
	
	/*@GetMapping("/login")
	public String login(@ModelAttribute("stock")Stock stock) {
		Stock s1 = service.login(stock.getUsername());
		Stock s2=service.login1(stock.getPassword());
		//System.out.println(u);
		 if("Admin".equals(s1) && "admin".equals(s2))
		{
			return "index";
		}else {
			return "errorpage";
		}		
	}*/
	
	
	

	
	
   @GetMapping("/home")
    public String viewHomePage(Model model) {
        List<Stock> liststock = service.listAll();
        model.addAttribute("liststock", liststock);
        //System.out.print("Get / ");	
        return "index";
    }
	
	
    @GetMapping("/new")//add new button 
    public String add(Model model) {
        model.addAttribute("stock", new Stock());
        return "new";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)//save button 
    public String saveStock(@ModelAttribute("stock") Stock stock) {
        service.save(stock);
        return "redirect:/home";
    }

    @RequestMapping("/edit/{id}")//edit button
    public ModelAndView showEditStockPage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("new");
        Stock stock = service.get(id);
        mav.addObject("stock", stock);
        return mav;
        
    }
    @RequestMapping("/delete/{id}")//delete button
    public String deletestock(@PathVariable(name = "id") int id) {
        service.delete(id);
        return "redirect:/home";
    }
    
    @GetMapping("/logout")
	public String loginPage()
	{
		return "welcome";
	}
    

}
