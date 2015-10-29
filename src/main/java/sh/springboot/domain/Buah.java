/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sh.springboot.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author sopie
 */
@Entity
@Table(name="buah")
public class Buah {
    
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name= "system-uuid", strategy = "uuid2")
    private String id;
    
    private String nama;
    private String rasa;
    
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }
    
}
