/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jatek;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    public void mentes(Karakter karakterek){
           try(ObjectOutputStream objKi= new ObjectOutputStream(new FileOutputStream("karakterek.bin"))){
           
            objKi.writeObject(karakterek);
            
           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Jatek.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Jatek.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void betoltes(Karakter karakterek){
        try(ObjectInputStream objBe= new ObjectInputStream(new FileInputStream("karakterek.bin"))){
            /* a kiírásnak megfelelő típusú objektum a megfelelő sorrendben
               visszaolvasható, visszaállítható, 
               a kiírásnak megfelelő object kerül beolvasása: Karakter[]
            */
            karakterek = (Karakter) objBe.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Jatek.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Jatek.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}

