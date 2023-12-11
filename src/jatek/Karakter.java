/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jatek;

import java.util.ArrayList;

/**
 *
 * @author tegzes.marton
 */
public class Karakter {
   private int eletero, ugyesseg, szerencse;
   private ArrayList<Targy> fleszereles;

    public Karakter(int eletero, int ugyesseg, int szerencse) {
        this.eletero = eletero;
        this.ugyesseg = ugyesseg;
        this.szerencse = szerencse;
        
    }
    

    public int getEletero() {
        return eletero;
    }

    public void setEletero(int eletero) {
        this.eletero = eletero;
    }

    public int getUgyesseg() {
        return ugyesseg;
    }

    public void setUgyesseg(int ugyesseg) {
        this.ugyesseg = ugyesseg;
    }

    public int getSzerencse() {
        return szerencse;
    }

    public void setSzerencse(int szerencse) {
        this.szerencse = szerencse;
    }
   
}

