package edu.comillas.icai.pat.ejemplopat.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import edu.comillas.icai.pat.ejemplopat.service.MyService;
import jakarta.validation.Valid;

import edu.comillas.icai.pat.ejemplopat.model.Persona;


@RestController
@RequestMapping("/api")
public class PersonaController {

	private Persona persona;

	@Autowired
	MyService myService;
	
	@PostMapping(path = "/info",
	consumes = MediaType.APPLICATION_JSON_VALUE,
	produces =MediaType.TEXT_PLAIN_VALUE)

	public  ResponseEntity<String> contacto(@RequestBody Persona persona) {
				
		return new ResponseEntity<>(persona.toString(),HttpStatus.OK);
	}

	@GetMapping("/info/{id}")
    public ResponseEntity<Persona> retrieveWine(@PathVariable String id) {
        Persona response = MyService.retrievePersona(id);
        return ResponseEntity.ok().body(response);
    }



}

