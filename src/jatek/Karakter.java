/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jatek;

/**
 *
 * @author tegzes.marton
 */
public class Karakter {
   private int eletero, ugyesseg, szerencse;
   private String fleszereles;

    public Karakter(int eletero, int ugyesseg, int szerencse, String fleszereles) {
        this.eletero = eletero;
        this.ugyesseg = ugyesseg;
        this.szerencse = szerencse;
        this.fleszereles = fleszereles;
    }

    public String getFleszereles() {
        return fleszereles;
    }

    public void setFleszereles(String fleszereles) {
        this.fleszereles = fleszereles;
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

