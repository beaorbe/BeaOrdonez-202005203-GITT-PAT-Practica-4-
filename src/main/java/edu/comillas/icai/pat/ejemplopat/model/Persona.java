
package edu.comillas.icai.pat.ejemplopat.model;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;


@Data
@Builder
@Table

public class Persona {
   

    private String NOMBRE; 
    private String APELLIDOS; 
    private String EMAIL; 
    private String TELEFONO;

   
    public String getNOMBRE() {
        return NOMBRE;
    }
    
    public String getAPELLIDOS() {
        return APELLIDOS;
    }
   
    public String getEMAIL() {
        return EMAIL;
    }

    public String getTELEFONO() {
        return TELEFONO;
    }

    public void setNAME(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public void setAPELLIDOS(String APELLIDOS) {
        this.APELLIDOS = APELLIDOS;
    }
    
    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }
    
    public void setTELEFONO(String TELEFONO) {
        this.TELEFONO = TELEFONO;
    }
    
    
    public Persona(String NOMBRE, String APELLIDOS, String EMAIL, String TELEFONO) {
        this.NOMBRE = NOMBRE;
        this.APELLIDOS = APELLIDOS;
        this.EMAIL = EMAIL;
        this.TELEFONO = TELEFONO;
    }

    @Override
    public String toString() {
        return "Persona [name_id=" + NOMBRE + ", apellidos_id=" + APELLIDOS + ", email_id=" + EMAIL+ ", phone_id=" + TELEFONO + "]";
    }
}
