package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;
@Repository
public class InMemoryLanguageRepository  implements LanguageRepository{
	List<Language> languages;
	
	

	public InMemoryLanguageRepository() {
		languages = new ArrayList<Language>();
		languages.add(new Language (1,"C#"));
		languages.add(new Language (2, "Java"));
		languages.add(new Language (3, "Python"));
		languages.add(new Language (4 ,"Python" ));
		
	}



	@Override
	public List<Language> getall() {
		// TODO Auto-generated method stub
		return languages;
	}



	@Override
	public void add(Language language) {
	
		
	}



	@Override
	public void update(int id, String name) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public Language getById() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Language findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}


}