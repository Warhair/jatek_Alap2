/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jatek;

import java.util.UUID;

/**
 *
 * @author tegzes.marton
 */
public class Felszereles {
    public String leiras, nev;
    public UUID id;
    
    

    public Felszereles(String leiras, String nev, UUID id) {
        this.leiras = leiras;
        this.nev = nev;
        this.id = UUID.randomUUID();
    }
    
    public String getLeiras() {
        return leiras;
    }

    public void setLeiras(String leiras) {
        this.leiras = leiras;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Felszereles{" + "leiras=" + leiras + ", nev=" + nev + ", id=" + id + '}';
    }
    
    
}

