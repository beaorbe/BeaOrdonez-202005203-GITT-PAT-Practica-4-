
package edu.comillas.icai.pat.ejemplopat.model;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.annotation.Id;


@Data
@Table("PERSONA")

public class Persona {
   
    @Id
    private @Column("ID") Integer id;
    private @Column("USER_NAME") String NOMBRE; 
    private @Column("APELLIDO") String APELLIDOS; 
    private @Column("EMAIL") String EMAIL; 
    private @Column("TELEFONO") String TELEFONO;

     
    public Persona(String name, String lastname, String email, String phone) {
        this.NOMBRE = name;
        this.APELLIDOS = lastname;
        this.EMAIL = email;
        this.TELEFONO = phone;
    }

    
    public Integer getID() {
        return id;
    }
    

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
    
    
    public Persona(Long id, String NOMBRE, String APELLIDOS, String EMAIL, String TELEFONO) {
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
