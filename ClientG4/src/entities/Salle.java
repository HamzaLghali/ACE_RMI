/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author vanha
 */
import java.io.Serializable;

public class Salle implements Serializable{
    private int idSalleSalle;
    private String code;
  

    public Salle() {
    }

    public Salle(String code, String marque, double prix) {
        this.code = code;
    }

    public int getId() {
        return idSalleSalle;
    }

    public void setId(int idSalle) {
        this.idSalleSalle = idSalle;
    }

    public String getRef() {
        return code;
    }

    public void setRef(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Salle{" + "idSalleSalle=" + idSalleSalle + ", code=" + code + '}';
    }

    

   
    
    
           
}
