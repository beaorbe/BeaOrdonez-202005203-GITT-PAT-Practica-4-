package edu.comillas.icai.pat.ejemplopat.service;
import edu.comillas.icai.pat.ejemplopat.model.Persona;

public interface MyService {

    String getInfo(Persona persona);
    Persona createPersona(Persona persona);
    Persona updatePersona(String nombre, Persona persona);
    Persona searchPersona(String nombre);
    Persona deletePersona(String nombre);

}

