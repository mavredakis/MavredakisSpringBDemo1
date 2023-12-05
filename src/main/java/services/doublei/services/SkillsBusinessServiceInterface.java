package services.doublei.services;

import java.util.List;

import services.doublei.models.SkillsModel;

public interface SkillsBusinessServiceInterface {

	public void test();
	//public List<SkillsModel> getSkills();
	
	public void init();
	public void destroy();
	
	public SkillsModel getById(long id);
	public List<SkillsModel> getSkills();
	public List<SkillsModel> searchSkills(String searchTerm);
	public long addOne(SkillsModel newSkill);
	public boolean deleteOne(long id);
	public SkillsModel updateOne(long idToUpdate, SkillsModel updateSkill);
	
	//future methods
	
	//searchSkills(String searchterm)
	
	//addSkill(OrderModel new0)
	
	//deleteSkill(Long id)
	
	//updateSkill(SkillsModel updateMe)
	
	//getOneSkill (Long id)
}
