package edu.comillas.icai.pat.ejemplopat.repository;
import edu.comillas.icai.pat.ejemplopat.dao.Demo;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;

import org.springframework.data.jdbc.repository.query.Query;

public interface DemoRepository extends CrudRepository<Demo, Integer> {

    //@Query("SELECT * FROM PERSONA WHERE PERSONA.NOMBRE= :id")
    //public Iterable<Persona> searchPersona(String nombre);
    
}
