/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proiectjava.serviceauto;

/**
 *
 * @author Daria
 */
public class Camion extends Vehicle {
    private int capacitateTractare;
    private String categoriePermis;
    
    public Camion(){
        super();
        this.capacitateTractare=0;
        this.categoriePermis="C";
    }
    public Camion(int capacitateCilindrica, String marca, String model, short anFabricatie,double pret, int capacitateTractare, String categoriePermis) {
        super(capacitateCilindrica, marca, model, anFabricatie,pret);
        this.capacitateTractare = capacitateTractare;
        this.categoriePermis = categoriePermis;
    }

    @Override
    public String toString() {
        return "\nCamion:"+super.toString()+"\ncapacitate tractare: "+capacitateTractare+"\ncategoriPermis:"+categoriePermis;
    }


    @Override
    public String verificareITP() {
        return "Camionul a trecut ITP-ul!";
    }
   
    @Override
    public String inmatriculare() {
        return "Camionul este inmatriculata!";
    }

    //getteri
    public int getCapacitateTractare() {
        return capacitateTractare;
    }

    public String getCategoriePermis() {
        return categoriePermis;
    }
    
    //setteri

    public void setCategoriePermis(String categoriePermis) {
        this.categoriePermis = categoriePermis;
    }
    
    public void setCapacitateTractare(int capacitate) {
        if (capacitate > 0) {
            this.capacitateTractare = capacitate;
        }
    }
    
    

}

