/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQuery(name = "findAll", query = "from Salle")
@NamedNativeQuery(name = "findAllNative", query = "select * from Salle", resultClass = Salle.class)
public class Salle implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSalle;
    private String code;
    
    
    
    @OneToMany(mappedBy = "salle", cascade = CascadeType.ALL)
    private List<Machine> machines = new ArrayList<>();
    

    public Salle() {
    }

    public Salle(String code) {
        this.code = code;
    }

    public int getIdSalle() {
        return idSalle;
    }

    public String getCode() {
        return code;
    }

    public List<Machine> getMachines() {
        return machines;
    }

    public void setIdSalle(int idSalle) {
        this.idSalle = idSalle;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMachines(List<Machine> machines) {
        this.machines = machines;
    }

    @Override
    public String toString() {
        return "Salle{" + "idSalle=" + idSalle + ", code=" + code + ", machines=" + machines + '}';
    }

    

  
    
    
           
}
