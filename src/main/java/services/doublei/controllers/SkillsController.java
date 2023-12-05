package services.doublei.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import services.doublei.models.*;
import services.doublei.services.SkillsBusinessService;
import services.doublei.services.SkillsBusinessServiceInterface;

@Controller
@RequestMapping("/skills")
public class SkillsController {

	//With dependency injection	
	//SkillsBusinessService service;
	//SkillsBusinessService2 service2;
	SkillsBusinessServiceInterface service;
	
	//For dependency injection
	@Autowired
	//public SkillsController(SkillsBusinessService service) {
	public SkillsController(SkillsBusinessServiceInterface service) {
		super();
		this.service = service;
	}

	@GetMapping("/")	
	public String showAllOrders(Model model){
		
		//Without dependency injection would have
		//SkillsBusinessService service = new SkillsBusinessService();
		List<SkillsModel> skills = service.getSkills();
		
		model.addAttribute("title","Some of my skills");
		model.addAttribute("skills",skills);
		return "skills.html";
	}

	
}
