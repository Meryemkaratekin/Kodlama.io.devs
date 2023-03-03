package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageService {
	   List<Language> getall();
	      void add(Language language );
	      void update(int id , String name);
	      void delete (int id );
	     Language getById(int id);
	     Language findByName(String name);}