package services.doublei;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import services.doublei.services.SkillsBusinessService;
import services.doublei.services.SkillsBusinessService2;
import services.doublei.services.SkillsBusinessServiceInterface;

@Configuration
public class SpringConfig {

	@Bean(name="skillsBusinessService", initMethod="init", destroyMethod="destroy")
	@RequestScope //@SessionScope //SOS If none annotation then is singleton bean
	public SkillsBusinessServiceInterface getSkillsBusiness() {
		return new SkillsBusinessService(); //Mavredakis instead of primary on service (see service class)
		//return new SkillsBusinessService2();
	}
	
}
