package com.NIMI505.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.NIMI505.Lead.Lead;
import com.NIMI505.Service.LeadService;

@Controller
public class LeadController {
	@Autowired
  private LeadService leadserv;

	@RequestMapping("/viewCreateLead")
	public String viewCreateLead() {
		return "create_Lead";
	}
	
	@RequestMapping(value = "/LeadNimi", method = RequestMethod.POST)
	public String LeadNimi(@ModelAttribute("lead") Lead lead, ModelMap model) {
		try {
			leadserv.LeadNimiInfo(lead);
			model.addAttribute("lead", lead);
		} catch (Exception e) {
			model.addAttribute("emailError", "email is already exist");
			return "create_Lead";
		}
		return "Lead_Details";
	}

}
