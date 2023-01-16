package cat.itacademy.barcelonactiva.basilicata.paolo.s04.t01.n01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/HelloWorld")
	@ResponseBody
	public String saluda(@RequestParam(name = "nom", required = false, defaultValue = "UNKNOWN")String nom) {
		return "Hola, " + nom + ".Estàs executant un projecte Maven.";
		
	}
	
	@GetMapping({"HelloWorld2","/HelloWorld2/{nom}"})
	@ResponseBody
	public String saluda2(@PathVariable(name = "nom", required = false) String nom) {
		if(nom == null) {
			return  "Hola, UNKNOWN.Estàs executant un projecte Maven.";
		}else {
			return  "Hola, " + nom + ".";
		}
		
		
	}

}
