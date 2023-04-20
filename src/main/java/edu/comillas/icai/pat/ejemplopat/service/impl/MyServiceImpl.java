package edu.comillas.icai.pat.ejemplopat.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.comillas.icai.pat.ejemplopat.service.MyService;
import edu.comillas.icai.pat.ejemplopat.model.Persona;
import edu.comillas.icai.pat.ejemplopat.repository.*;



@Service
public class MyServiceImpl implements MyService {

	@Autowired
	private personaRepository personaRepository;


	@Override
	public String getInfo(Persona persona) {
		String responseGetInfo="Servicio OK! - " ;
		return responseGetInfo;
	}


	//crear persona
	@Override
	public Persona createPersona(Persona persona) {
		
		return personaRepository.save(persona);
	}


	//buscar persona 
	@Override
    public Persona searchPersona(String id) {
        Persona response = null;
        if (personaRepository.existsById(id)) {
            Iterable<Persona> personas = personaRepository.searchPersona(id);
            for (Persona persona : personas) {
                response = persona;
            }
            return response;
        }
        return response;
    }

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










}


