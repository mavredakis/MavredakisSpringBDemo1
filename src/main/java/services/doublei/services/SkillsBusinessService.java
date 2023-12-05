package services.doublei.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import services.doublei.data.SkillsDataAccessInterface;
import services.doublei.models.*; //.SkillsModel;

//Uncomment if you don't want to use the SpringConfig.java approach
//@Service
//@Primary
public class SkillsBusinessService implements SkillsBusinessServiceInterface {

	@Autowired
	SkillsDataAccessInterface skillsDAO;
	
	@Override
	public void test() {
		System.out.println("SkillsBusinessService is working");
		
	}

	@Override
	public List<SkillsModel> getSkills() {
		//Before SkillsFakeDAO.java
		/*
		List<SkillsModel> skills = new ArrayList<SkillsModel>();
		
		
		skills.add(new SkillsModel(1,"Java", "English", "Programming"));
		skills.add(new SkillsModel(2,"Python", "Deutsch", "Single Board Computers"));
		skills.add(new SkillsModel(3,"VB .NET", "Spanish", "Travelling"));
		*/
		// TODO Auto-generated method stub
		return skillsDAO.getSkills();//skills;
	}

	@Override
	public void init() {
		System.out.println("Init method of the Skills Business Service");
		
	}

	@Override
	public void destroy() {
		System.out.println("Destroy method of the Skills Business Service");
		
	}

	@Override
	public SkillsModel getById(long id) {
		// TODO Auto-generated method stub
		return skillsDAO.getById(id);
	}

	@Override
	public List<SkillsModel> searchSkills(String searchTerm) {
		// TODO Auto-generated method stub
		return skillsDAO.searchSkills(searchTerm);
	}

	@Override
	public long addOne(SkillsModel newSkill) {
		// TODO Auto-generated method stub
		//return 0;
		return skillsDAO.addOne(newSkill);
	}

	@Override
	public boolean deleteOne(long id) {
		return skillsDAO.deleteOne(id);
		//return false;
	}

	@Override
	public SkillsModel updateOne(long idToUpdate, SkillsModel updateSkill) {
		// TODO Auto-generated method stub
		//return null;
		return skillsDAO.updateOne(idToUpdate, updateSkill);
		
	}
	
	
}
