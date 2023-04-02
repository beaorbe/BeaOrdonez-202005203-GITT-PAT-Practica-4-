package edu.comillas.icai.pat.ejemplopat.service.impl;

public class Persona {
    private String name_id; 
    private String apellidos_id; 
    private String email_id; 
    private String phone_id;

    public String getName_id() {
        return name_id;
    }
    public String getApellidos_id() {
        return apellidos_id;
    }
    public String getEmail_id() {
        return email_id;
    }
    public String getPhone_id() {
        return phone_id;
    }
    public void setName_id(String name_id) {
        this.name_id = name_id;
    }
    public void setApellidos_id(String apellidos_id) {
        this.apellidos_id = apellidos_id;
    }
    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }
    public void setPhone_id(String phone_id) {
        this.phone_id = phone_id;
    }
    public Persona(String name_id, String apellidos_id, String email_id, String phone_id) {
        this.name_id = name_id;
        this.apellidos_id = apellidos_id;
        this.email_id = email_id;
        this.phone_id = phone_id;
    }
    @Override
    public String toString() {
        return "Persona [name_id=" + name_id + ", apellidos_id=" + apellidos_id + ", email_id=" + email_id
                + ", phone_id=" + phone_id + "]";
    }

    
    

}
