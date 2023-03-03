package kodlama.io.Kodlama.io.Devs.webApi.contrellers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;
@RestController 
@RequestMapping("/api/languages")
public class LanguageController {
	private LanguageService languageService;
	@Autowired
	public LanguageController(LanguageService languageService) {
	
		this.languageService = languageService;
	}

	
	
	@GetMapping("/getall")
	 public List<Language> getall() {
		return languageService.getall();
	}
}
