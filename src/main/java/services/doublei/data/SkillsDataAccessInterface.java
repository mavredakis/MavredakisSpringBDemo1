package services.doublei.data;

import java.util.List;

import services.doublei.models.SkillsModel;

public interface SkillsDataAccessInterface {

	public SkillsModel getById(long id);
	public List<SkillsModel> getSkills();
	public List<SkillsModel> searchSkills(String searchTerm);
	public long addOne(SkillsModel newSkill);
	public boolean deleteOne(long id);
	public SkillsModel updateOne(long idToUpdate, SkillsModel updateSkill);
}
