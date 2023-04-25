package edu.comillas.icai.pat.ejemplopat.service;
import edu.comillas.icai.pat.ejemplopat.dao.Demo;

public interface MyService {

      Demo createPersona(Demo demo);
      Demo searchPersona(Integer id);

   // Persona createPersona(Persona persona);
   // Persona updatePersona(String id, Persona persona);
   // void deletePersona(String id);

}

