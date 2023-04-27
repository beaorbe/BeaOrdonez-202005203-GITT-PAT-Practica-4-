package edu.comillas.icai.pat.ejemplopat.dao;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;



@Table("DEMO")
public class Demo {
    private @Column("ID") @Id
    Integer DemoID;
    private @Column("FIRST_NAME")
    String name;
    private @Column("LAST_NAME")
    String surmame;
    private @Column("EMAIL")
    String email;
    private @Column("TELEFONO")
    String phone;
    
    public Integer getDemoID() {
        return DemoID;
    }
    
    public String getName() {
        return name;
    }
    public String getSurmame() {
        return surmame;
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
        this.name = name;
    }
    public void setSurmame(String surmame) {
        this.surmame = surmame;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }


    public Demo(Integer id, String name, String surmame, String email, String phone) {
        this.DemoID = id;
       
        this.name = name;
        this.surmame = surmame;
        this.email = email;
        this.phone = phone;
    }

    public Demo() {
        this.DemoID =0;
        name = "";
        surmame = "";
        this.email = "";
        this.phone = "";
    }





    

    
    
}
