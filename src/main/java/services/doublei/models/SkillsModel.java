package services.doublei.models;

public class SkillsModel {

	int id =0;
	String ProgLanguages ="";
	String Languages="";
	String Hobbies="";
	
	
	
	public SkillsModel(int id, String progLanguages, String languages, String hobbies) {
		super();
		this.id = id;
		ProgLanguages = progLanguages;
		Languages = languages;
		Hobbies = hobbies;
	}
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProgLanguages() {
		return ProgLanguages;
	}
	public void setProgLanguages(String progLanguages) {
		ProgLanguages = progLanguages;
	}
	public String getLanguages() {
		return Languages;
	}
	public void setLanguages(String languages) {
		Languages = languages;
	}
	public String getHobbies() {
		return Hobbies;
	}
	public void setHobbies(String hobbies) {
		Hobbies = hobbies;
	}
	
	@Override
	public String toString() {
		return "SkillsModel [id=" + id + ", ProgLanguages=" + ProgLanguages + ", Languages=" + Languages + ", Hobbies="
				+ Hobbies + "]";
	}
	
	
	

	
	
}
