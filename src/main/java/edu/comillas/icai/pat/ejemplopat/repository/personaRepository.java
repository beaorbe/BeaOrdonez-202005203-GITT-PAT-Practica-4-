package edu.comillas.icai.pat.ejemplopat.repository;
import edu.comillas.icai.pat.ejemplopat.model.Persona;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

public interface personaRepository extends CrudRepository<Persona, String> {

    @Query("SELECT * FROM PERSONA WHERE PERSONA.USER_NOMBRE= :user_nombre")
    Iterable<Persona> retrievePersona(String id);

    @Query("SELECT * FROM PERSONA WHERE PERSONA.ID= :id")
    Iterable<Persona> retrievePersonasByNombre(int nombreInt);
    
}
