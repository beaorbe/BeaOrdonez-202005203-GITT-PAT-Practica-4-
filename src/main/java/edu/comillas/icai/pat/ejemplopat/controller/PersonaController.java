package edu.comillas.icai.pat.ejemplopat.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import edu.comillas.icai.pat.ejemplopat.service.MyService;
import jakarta.validation.Valid;
import edu.comillas.icai.pat.ejemplopat.dao.Demo;



@RestController
@RequestMapping("/api")
public class PersonaController {

	@Autowired
	MyService myService;

	//POST 
	@PostMapping(path = "/create")
	public  ResponseEntity<Demo> createPersona(@RequestBody Demo demo) 
	{
	   Demo newDemo = myService.createPersona(demo);
	   return new ResponseEntity<>(newDemo,HttpStatus.OK);
	}
	
/* 
	@PostMapping(path = "/create",
	consumes = MediaType.APPLICATION_JSON_VALUE,
	produces =MediaType.TEXT_PLAIN_VALUE)

	public  ResponseEntity<Demo> createPersona(@RequestBody Demo demo) 
	{
	   return new ResponseEntity<>(myService.createPersona(demo),HttpStatus.OK);
	}
*/

   //buscar persona
	@GetMapping("/buscar/{id}")
    public ResponseEntity<Object> searchPersona(@PathVariable("id") Integer id) {
        
		return new ResponseEntity<>(myService.searchPersona(id),HttpStatus.OK);
    }


	/* 
	//crear persona
	@PostMapping("/crearpersona")
	public ResponseEntity<Persona> createPersona(@RequestBody Persona persona) 
	{
        Persona newPersona = myService.createPersona(persona);
        return ResponseEntity.ok().body(newPersona);

	}*/

    
	


   /* 
	//update Persona 
	@PutMapping("/persona/{id}")
    public ResponseEntity<Persona> updatePersona(@PathVariable String id, @RequestBody Persona persona) {
        Persona newPersona = myService.updatePersona(id, persona);
        if (newPersona == null) {
            return ResponseEntity.badRequest().body(null);
        }
        return ResponseEntity.ok().body(newPersona);
    }


	//Borrar persona
    @DeleteMapping("/persona/{id}")
    public ResponseEntity<Persona> deletePersona(@PathVariable String id) {
        myService.deletePersona(id);
        return ResponseEntity.noContent().build();
    }

*/







	//


}
