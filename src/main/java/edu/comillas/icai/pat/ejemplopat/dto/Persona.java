package edu.comillas.icai.pat.ejemplopat.dto;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.boot.convert.DataSizeUnit;

import com.fasterxml.jackson.annotation.JsonSubTypes.Type;

public class Persona {

    @NotNull
    @Size(min=2, max=30)
    private String NOMBRE; 

    @NotNull
    @Size(min=2, max=30)
    private String APELLIDOS; 

    @NotNull
    @Size(min=10, max=15)
    private String EMAIL; 

    @NotNull
    @Size(max=9)
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
        return "Persona [name_id=" + NOMBRE + ", apellidos_id=" + APELLIDOS + ", email_id=" + EMAIL
                + ", phone_id=" + TELEFONO + "]";
    }

    
    

}
