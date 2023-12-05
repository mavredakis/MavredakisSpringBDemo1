package services.doublei.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import services.doublei.models.*; //.SkillsModel;

//Uncomment if you don't want to use the SpringConfig.java approach
//@Service
//@Primary
public class SkillsBusinessService2 implements SkillsBusinessServiceInterface {

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<SkillsModel> getSkills() {
	
		List<SkillsModel> skills = new ArrayList<SkillsModel>();
		skills.add(new SkillsModel(1,"Perl", "English", "Programming"));
		skills.add(new SkillsModel(2,"PHP", "Deutsch", "Single Board Computers"));
		skills.add(new SkillsModel(3,"Scala", "Spanish", "Travelling"));
		// TODO Auto-generated method stub
		return skills;
	}

	@Override
	public void init() {
		System.out.println("Init method of the Skills Business Service2");
		
	}

	@Override
	public void destroy() {
		System.out.println("Destroy method of the Skills Business Service2");
		
	}

	@Override
	public SkillsModel getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SkillsModel> searchSkills(String searchTerm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long addOne(SkillsModel newSkill) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean deleteOne(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public SkillsModel updateOne(long idToUpdate, SkillsModel updateSkill) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
