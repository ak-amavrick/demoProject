package com.NIMI505.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.NIMI505.DAO.UserRepo;
import com.NIMI505.Lead.User;

@Controller
public class UserController {

	@Autowired
	private UserRepo userrepo;
	
	 @RequestMapping("/ShowLoginPage")
	 public String ShowLoginPage() {
		 return"login/login";
	 }
	
	 @RequestMapping("/ShowReg")
	 public String ShowReg() {
		 return"login/ShowReg";
	 }
	 
	 @RequestMapping("saveReg")
	 public String saveReg(@ModelAttribute("user") User user)
	 {
		 userrepo.save(user);
		 return "login/login";
	 }
	
	 @RequestMapping("verifyLoginPage")
	 public String verifyLogin(@RequestParam("emailId")String emailId , @RequestParam("password")  String password ,ModelMap model) {
		 User user = userrepo.findByEmail(emailId);
		 if(user!=null) {
		 if(user.getEmail().equals(emailId) && user.getPassword().equals(password)) {
			 return "create_Lead";
		 }else {
			 model.addAttribute("error" , "email /password not valid");
			 return "login/login"; 
		 }
		 }else {
			 model.addAttribute("error" , "email /password not valid");
			 return "login/login"; 
		 }
	 
	 }
	 }
