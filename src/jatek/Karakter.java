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
   private ArrayList<Felszereles> felszereles;

    public Karakter(int eletero, int ugyesseg, int szerencse, ArrayList<Felszereles> felszereles) {
        this.eletero = kockadobas() + kockadobas() + 12;
        this.ugyesseg = kockadobas() + 6;
        this.szerencse = kockadobas() + 6;
        this.felszereles = felszereles;
    }

    public ArrayList<Felszereles> getFleszereles() {
        return felszereles;
    }

    public void setFleszereles(ArrayList<Felszereles> fleszereles) {
        this.felszereles = fleszereles;
    }

    @Override
    public String toString() {
        return "Karakter{" + "eletero=" + eletero + ", ugyesseg=" + ugyesseg + ", szerencse=" + szerencse + ", fleszereles=" + fleszereles + '}';
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
    public void felvesz(Felszereles targyak){
        felvesz(targyak, 1);
    }
    public void felvesz(Felszereles targyak, int menny){
        for (int i = 0; i < menny; i++) {
            felszereles.add(targyak);
        }
      
    }
    public static int kockadobas(){
        return (int) ((Math.random()*(6-1)) + 1);
    }
    public void hasznal(String nev){
        if(this.hasznal(nev, 1)){
           this.hasznal(nev, 1); 
        }
    }
    public boolean hasznal(String nev, int menny){
        if(this.hasznal(nev, menny, true)){
            this.hasznal(nev, menny, true);
            return true;
        }
        else{
            return false;
        }
    }
    public boolean hasznal(String nev, int menny, boolean eleg){
        if(eleg){
             int i =0, N = felszereles.size();
        while(i < N && !(felszereles.get(i).getNev().equals(nev))){
            i++;
        }
        if(i < N){
            for (int j = 0; j < menny; j++) {
                felszereles.remove(nev);
            }
            
        }else{
            System.out.println("Nincs elég belőle");
            return false;
        }
          return true;
        }
         else{
            return false;
        }
        
    }
    
    
    
   
}

