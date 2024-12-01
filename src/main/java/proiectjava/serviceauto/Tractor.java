/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proiectjava.serviceauto;

/**
 *
 * @author Daria
 */
public class Tractor extends Vehicle {
    private int greutate;

    public Tractor(int capacitateCilindrica, String marca, String model, short anFabricatie,double pret, int greutate) {
        super(capacitateCilindrica, marca, model, anFabricatie,pret);
        this.greutate = greutate;
    }

    @Override
    public String toString() {
        return "\nTractor:"+super.toString()+"\ngreutate: "+greutate;
    }
    public void setGreutateTractor(int greutate) {
        if (greutate > 0 && greutate < 7) {
            this.greutate = greutate;
        }
    }

   @Override
    public String verificareITP() {
        return "Tractorul a trecut ITP-ul!";
    }
   
    @Override
    public String inmatriculare() {
        return "Tractorul este inmatriculata!";
    }

    //get
    public int getGreutate() {
        return greutate;
    }
    
    //set

    public void setGreutate(int greutate) {
        this.greutate = greutate;
    }
    
    
}
