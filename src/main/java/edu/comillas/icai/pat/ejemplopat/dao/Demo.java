package edu.comillas.icai.pat.ejemplopat.dao;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;



@Table("DEMO")
public class Demo {
    private @Column("ID") @Id
    Integer DemoID;
    private @Column("FIRST_NAME")
    String Name;
    private @Column("LAST_NAME")
    String Surmame;
    private @Column("EMAIL")
    String email;
    private @Column("TELEFONO")
    String phone;
    
    public Integer getDemoID() {
        return DemoID;
    }
    
    public String getName() {
        return Name;
    }
    public String getSurmame() {
        return Surmame;
    }
    public String getEmail() {
        return email;
    }
    public String getPhone() {
        return phone;
    }

    public void setDemoID(Integer demoID) {
        DemoID = demoID;
    }
    
    public void setName(String name) {
        Name = name;
    }
    public void setSurmame(String surmame) {
        Surmame = surmame;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }


    public Demo(Integer id, String name, String surmame, String email, String phone) {
        this.DemoID = id;
       
        Name = name;
        Surmame = surmame;
        this.email = email;
        this.phone = phone;
    }

    public Demo() {
        this.DemoID =0;
        Name = "";
        Surmame = "";
        this.email = "";
        this.phone = "";
    }





    

    
    
}
