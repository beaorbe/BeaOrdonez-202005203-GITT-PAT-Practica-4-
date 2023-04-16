package edu.comillas.icai.pat.ejemplopat.service;
import edu.comillas.icai.pat.ejemplopat.model.Persona;


public interface MyService {
    Iterable<Persona> retrievePersonas();
    String getInfo(Persona persona);
    Persona createPersona(Persona persona);
    Persona retrievePersona(String id);
    Persona updatePersona(String id, Persona persona);
    void deletePersona(String id);
}

