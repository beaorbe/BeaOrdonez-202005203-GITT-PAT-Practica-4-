package edu.comillas.icai.pat.ejemplopat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import edu.comillas.icai.pat.ejemplopat.service.MyService;
import jakarta.validation.Valid;
import edu.comillas.icai.pat.ejemplopat.dto.Persona;


@RestController
@RequestMapping("/api")
public class PersonasController {

	@Autowired
	MyService myService;
	
	@PostMapping(path = "/info",
	consumes = MediaType.APPLICATION_JSON_VALUE,
	produces =MediaType.TEXT_PLAIN_VALUE)

	///he incluido esto pero no he conseguido que funcione bien 
	public String checkPersonaInfo(@Valid Persona persona,
					BindingResult bindingResult) {
						
						if (bindingResult.hasErrors())
						{
							return "LOS DATOS NO CUMPLEN LOS REQUISITOS";
						} else {
							return "DATOS VALIDADOS CORRECTAMENTE";
						}
						
					}

	//funciona 
	public  ResponseEntity<String> contacto(@RequestBody Persona persona) {
				
		return new ResponseEntity<>(persona.toString(),HttpStatus.OK);
	}
}



/* BindingResult BindingResult) {
			if(BindingResult.hasErrors()){
				return "KO";
				 
			}
			return myService.getInfo(persona);*/ 
