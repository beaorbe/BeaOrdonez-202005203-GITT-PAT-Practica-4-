package edu.comillas.icai.pat.ejemplopat.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Table("USUARIOS")
public class Persona {
    @Id
    private Long id;

    private String user_name;
    private String apellido;
    private int telefono;
    private String email;
}
