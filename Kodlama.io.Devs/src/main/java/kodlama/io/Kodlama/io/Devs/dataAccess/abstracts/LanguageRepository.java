package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageRepository {
      List<Language> getall();
      void add(Language language );
      void update(int id , String name);
      void delete (int id );
     Language getById();
	 Language findByName(String name);
}
