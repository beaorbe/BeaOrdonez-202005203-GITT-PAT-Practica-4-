package edu.comillas.icai.pat.ejemplopat.service;
import edu.comillas.icai.pat.ejemplopat.model.Persona;

public interface MyService {

    String getInfo(Persona persona);
    Persona createPersona(Persona persona);
    Persona updatePersona(String id, Persona persona);
    Persona searchPersona(String id);
    void deletePersona(String id);

}

