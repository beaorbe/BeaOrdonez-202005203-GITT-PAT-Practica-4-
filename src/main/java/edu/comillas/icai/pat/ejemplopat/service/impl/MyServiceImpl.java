package edu.comillas.icai.pat.ejemplopat.service.impl;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.comillas.icai.pat.ejemplopat.service.MyService;
import edu.comillas.icai.pat.ejemplopat.dao.Demo;
import edu.comillas.icai.pat.ejemplopat.model.Persona;
import edu.comillas.icai.pat.ejemplopat.repository.*;



@Service
public class MyServiceImpl implements MyService {

	@Autowired
	private DemoRepository personaRepository;
 

    //POST
	@Override
	public Demo createPersona(Demo demo) {
        //Integer id = persona.getID();
         // Optional<Demo> data=personaRepository.findById(id);
        //Optional<Demo> data=personaRepository.findById(id);
		return personaRepository.save(demo);
	}


    @Override
    public Demo searchPersona(Integer id) {

        return personaRepository.findById(id).get();

        /* 
        Optional<Demo> data=personaRepository.findById(id);
		Persona persona;

		if (data.isPresent())
            persona = new Persona(data.get().getName(), data.get().getSurmame(),data.get().getEmail(),data.get().getPhone());	
		else
            persona= new Persona("","","","");
		
		return persona;
        */
    }
/* 
	@Override
	public String getInfo(Persona persona) {
		String responseGetInfo="Servicio OK! - " ;
		return responseGetInfo;
	}
*/
	//crear persona
    
    /* 
	@Override
	public Persona createPersona(Persona persona) {
		
		return personaRepository.save(id);
	}*/


	//buscar persona 
	
       /*  Persona response = null;
        if (personaRepository.existsById(id)) {
            Iterable<Persona> personas = personaRepository.searchPersona(id);
            for (Persona persona : personas) {
                response = persona;
            }
            return response;
        }
        return response;*/
    }
    /*
	//update persona
	@Override
    public Persona updatePersona(String id, Persona persona) {
        if (personaRepository.existsById(id)) {
            return personaRepository.save(persona);
        } else {
            return null;
        }
    }


	//delete Persona
	@Override
    public void deletePersona(String id) {
    	personaRepository.deleteById(id);
    }



     */









