package edu.comillas.icai.pat.ejemplopat.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.comillas.icai.pat.ejemplopat.service.MyService;
//import edu.comillas.icai.pat.ejemplopat.dto.Persona;
import edu.comillas.icai.pat.ejemplopat.model.Persona;
import edu.comillas.icai.pat.ejemplopat.repository.personaRepository;



@Service
public class MyServiceImpl implements MyService {

	//hace que no tengas que hacer -- new Class();
	@Autowired
	private personaRepository personasRepository;

	//servicio Inicial
	@Override
	public String getInfo(Persona persona) {
		String responseGetInfo="Servicio OK! - " ;
		return responseGetInfo;
	}

    @Override
    public Persona createPersona(Persona persona) {
        return personasRepository.save(persona);
    }

   
	@Override
    public Iterable<Persona> retrievePersonas() {
        
    	return personasRepository.findAll();
       
    }

    @Override
    public Persona retrievePersona(String id) {
        Persona response = null;
        if (personasRepository.existsById(id)) {
            Iterable<Persona> personas = personasRepository.retrievePersona(id);
            for (Persona persona : personas) {
                response = persona;
            }
            return response;
        }
        return response;
    }

    @Override
    public Persona updatePersona(String id, Persona persona) {
        if (personasRepository.existsById(id)) {
            return personasRepository.save(persona);
        } else {
            return null;
        }
    }

    @Override
    public void deletePersona(String id) {
        personasRepository.deleteById(id);
    }


	

}
