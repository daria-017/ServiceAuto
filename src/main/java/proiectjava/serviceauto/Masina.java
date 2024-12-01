/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proiectjava.serviceauto;

/**
 *
 * @author Daria
 */
public class Masina extends Vehicle{
    String caroserie;
    String categoriePermis;
    String seria;
    
    Masina(){
        super();
        caroserie="Neprecizat";
        categoriePermis="B";
        seria="";
    }
    
    public Masina(int capacitateCilindrica, String marca, String model, int anFabricatie,double pret, String caroserie, String categoriePermis, String seria){
        super(capacitateCilindrica, marca, model, anFabricatie,pret);
        this.caroserie=caroserie;
        this.categoriePermis=categoriePermis;
        this.seria=seria;        
    }
    public Masina(Masina masina){
        super(masina);
        this.caroserie=masina.caroserie;
        this.categoriePermis=masina.categoriePermis;
        this.seria=masina.seria;
    }
    
    @Override
    public String verificareITP() {
        return "Masina a trecut ITP-ul!";
    }
   
    @Override
    public String inmatriculare() {
        return "Masina este inmatriculata!";
    }
    @Override
    public String toString(){
        return"\nMasina:"+super.toString()+"\ncaroserie:"+caroserie+"\ncategorie permis: "+categoriePermis+"\nseria: "+seria;
    }
    //getteri
    public String getCaroserie(){
        return caroserie;
    }
    public String getCategoriPermis(){
        return categoriePermis;
    }
    public String getSeria(){
        return seria;
    }

    //setteri
    public void setCaroserie(String caroserie) {
        this.caroserie = caroserie;
    }

    public void setCategoriePermis(String categoriePermis) {
        this.categoriePermis = categoriePermis;
    }

    public void setSeria(String seria) {
        this.seria = seria;
    }

    
    
}
