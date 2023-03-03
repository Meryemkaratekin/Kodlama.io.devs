package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.dataAccess.concretes.InMemoryLanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;
@Service
public class LanguageManager implements LanguageService {

	private LanguageRepository languageRepository;
	@Autowired 
	public LanguageManager(LanguageRepository languageRepository) {

		this.languageRepository = languageRepository;
	}

	@Override
	public List<Language> getall() {
		// TODO Auto-generated method stub
		return languageRepository.getall();
	}

	@Override
	public void add(Language language) {
		if(language.getName().isEmpty()) {
			System.out.println("Programlama dili boş geçilemez");
		    }
		for(Language _language : languageRepository.getall()) {
		    if(_language.getName().equalsIgnoreCase(language.getName())) {
		        System.out.println("Programlama dili aynı olamaz ");
		    }
		}
		
	}

	private Object name(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(int id, String name) {
		
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Language getById(int id) {
		// TODO Auto-generated method stub
		return languageRepository.getById();
	}

	@Override
	public Language findByName(String name) {
		// TODO Auto-generated method stub
		return languageRepository.findByName(name);
	}
}

