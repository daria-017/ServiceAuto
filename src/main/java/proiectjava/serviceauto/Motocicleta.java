/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proiectjava.serviceauto;

/**
 *
 * @author Daria
 */
import java.awt.Color;
public class Motocicleta extends Vehicle {
    public short caiPutere;
    Color culoare;

    public Motocicleta(){
        super();
        caiPutere=0;
        culoare=null;
    }
    
    public Motocicleta(int capacitateCilindrica, String marca, String model, short anFabricatie,double pret, short caiPutere, Color culoare) {
        super(capacitateCilindrica, marca, model, anFabricatie,pret);
        this.culoare = culoare;
        this.caiPutere = caiPutere;
    }
    
    public Motocicleta(Motocicleta motocicleta){
        super(motocicleta);
        this.caiPutere=motocicleta.caiPutere;
        this.culoare=culoare;
    }

    @Override
    public String toString() {
        return "\nMotor:"+super.toString()+"\ncai putere: "+caiPutere+"\nculoare:"+culoare;
    }
   @Override
    public String verificareITP() {
        return "Motorul a trecut ITP-ul!";
    }
   
    @Override
    public String inmatriculare() {
        return "Motorul este inmatriculata!";
    }

    //setteri
    public void setCaiPutere(short caiPutere) {
        this.caiPutere = caiPutere;
    }

    public void setCuloare(Color culoare) {
        this.culoare = culoare;
    }
    
    //getteri

    public short getCaiPutere() {
        return caiPutere;
    }

    public Color getCuloare() {
        return culoare;
    }
    
    
    
    
    
}

