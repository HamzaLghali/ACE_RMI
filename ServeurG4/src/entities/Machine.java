/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "findAll", query = "from Machine")
@NamedNativeQuery(name = "findAllNative", query = "select * from machine", resultClass = Machine.class)
public class Machine implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String ref;
    private String marque;
    private double prix;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idsalle")
    private Salle salle;

    public Machine() {
    }

    public Machine(String ref, String marque, double prix, Salle salle) {
        this.ref = ref;
        this.marque = marque;
        this.prix = prix;
        this.salle = salle;
    }

    public int getId() {
        return id;
    }

    public String getRef() {
        return ref;
    }

    public String getMarque() {
        return marque;
    }

    public double getPrix() {
        return prix;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    @Override
    public String toString() {
        return "Machine{" + "id=" + id + ", ref=" + ref + ", marque=" + marque + ", prix=" + prix + ", salle=" + salle + '}';
    }
    
    
    
    
           
}
