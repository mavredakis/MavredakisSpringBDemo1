package services.doublei.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import services.doublei.models.*;
import services.doublei.services.SkillsBusinessService;
import services.doublei.services.SkillsBusinessServiceInterface;

@RestController
@RequestMapping("/api/v1/skills")
public class SkillsRestController {

	//With dependency injection	
	//SkillsBusinessService service;
	//SkillsBusinessService2 service2;
	SkillsBusinessServiceInterface service;
	
	//For dependency injection
	@Autowired
	//public SkillsController(SkillsBusinessService service) {
	public SkillsRestController(SkillsBusinessServiceInterface service) {
		super();
		this.service = service;
	}

	/*
	@GetMapping("/")	
	public String showAllOrders(Model model){
		
		//Without dependency injection would have
		//SkillsBusinessService service = new SkillsBusinessService();
		List<SkillsModel> skills = service.getSkills();
		
		model.addAttribute("title","Some of my skills");
		model.addAttribute("skills",skills);
		return "skills.html";
	}
	*/
	
	@GetMapping("/")	
	public List<SkillsModel> showAllSkills(){//(Model model){
				
		List<SkillsModel> skills = service.getSkills();
				
		return skills;
	}
	
	@GetMapping("/search/{searchTerm}")	
	public List<SkillsModel> searchSkills(@PathVariable(name="searchTerm") String searchTerm){
		List<SkillsModel> skills = service.searchSkills(searchTerm);
		return skills;
	}
	
	@PostMapping("/")
	public long addSkill(@RequestBody SkillsModel model) {
		
		return service.addOne(model);
	}
	
	@GetMapping("/{id}")
	public SkillsModel getById(@PathVariable(name="id") long id){
		return service.getById(id);
	
	}
	
	@DeleteMapping("/delete/{id}")
	public boolean deleteOne(@PathVariable(name="id") long id){
		return service.deleteOne(id);
	
	}
	
	@PutMapping("/update/{id}")
	public SkillsModel updateOne(@RequestBody SkillsModel model, @PathVariable(name="id") long id){
		return service.updateOne(id, model);
	
	}
	
	
}
