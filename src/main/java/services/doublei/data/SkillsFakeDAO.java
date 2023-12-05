package services.doublei.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import services.doublei.models.SkillsModel;

@Repository
public class SkillsFakeDAO implements SkillsDataAccessInterface{

	List<SkillsModel> skills = new ArrayList<SkillsModel>();	
	
	public SkillsFakeDAO() {
		//super();
		skills.add(new SkillsModel(1,"Java", "English", "Programming"));
		skills.add(new SkillsModel(2,"Python", "Deutsch", "Single Board Computers"));
		skills.add(new SkillsModel(3,"VB .NET", "Spanish", "Travelling"));
	}

	@Override
	public SkillsModel getById(long id) {
		for(int i = 0; i < skills.size(); i++) {
			if (skills.get(i).getId() == id) {
				return  skills.get(i); //new SkillsModel(100,"TEST", "TEST", "TEST");
			}
		}
		return null; //new SkillsModel(200,"TEST", "TEST", "TEST");
	}

	@Override
	public List<SkillsModel> getSkills() {
		
		return skills;
	}

	@Override
	public List<SkillsModel> searchSkills(String searchTerm) {
		//searchSkills
		List<SkillsModel> foundItems = new  ArrayList<SkillsModel>();//List<SkillsModel>();
		for (int i=0; i < skills.size(); i++){
			if (skills.get(i).getLanguages().toLowerCase().contains(searchTerm.toLowerCase())){
				foundItems.add(skills.get(i));
			}
		}
		return foundItems;
	}

	@Override
	public long addOne(SkillsModel newSkill) {
		// TODO Auto-generated method stub
		//return 0;
		
		boolean success = skills.add(newSkill);
		if (success) {
			return 1;			
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean deleteOne(long id) {
		for(int i = 0; i < skills.size(); i++) {
			if (skills.get(i).getId() == id) {
				skills.remove(i);
				return  true; //new SkillsModel(100,"TEST", "TEST", "TEST");
			}
		}
		return false;
	}

	@Override
	public SkillsModel updateOne(long idToUpdate, SkillsModel updateSkill) {
		
		for(int i = 0; i < skills.size(); i++) {
			if (skills.get(i).getId() == idToUpdate) {
				skills.set(i, updateSkill);
				return  skills.get(i); //new SkillsModel(100,"TEST", "TEST", "TEST");
			}
		}
		
		
		return null;
	}

	
	
}
