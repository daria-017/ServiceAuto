
package proiectjava.serviceauto;

/**
 *
 * @author Daria
 */

abstract class Vehicle {
    // Instance variables
    private int capacitateCilindrica;
    private String marca;
    private String model;
    private int anFabricatie;
    private double pret;
    
    
    // Variabilă protejată
    /*protected*/ private String stare;//fara accidente, avariat
    
    //constante
    public static final String DEALERSHIP = "ACIEE DEALERSHIP";
    public static final short VITEZA_MAX_LEGALA = 130; 
    

    //Constructor implicit
    public Vehicle() {
        marca="Necunoscut";
        model="Necunoscut";
        anFabricatie=0;
        pret=0;
    }
   
    public Vehicle(int capacitateCilindrica, String marca, String model, int anFabricatie,double pret) {
        this.capacitateCilindrica = capacitateCilindrica;
        this.marca = marca;
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.pret=pret;
        
    }
    
    // Constructor de copiere
    public Vehicle(Vehicle vehicle) {
        this.capacitateCilindrica = vehicle.capacitateCilindrica;
        this.marca = vehicle.marca;
        this.model = vehicle.model;
        this.anFabricatie = vehicle.anFabricatie;
        this.pret = vehicle.pret;
       
    }

   
    public String toString() {
        return "\nmarca: " +this.marca + "\nmodel: " + this.model + "\ncapacitate cilindrica: " 
                + this.capacitateCilindrica + "\nan fabricatie: " + this.anFabricatie+"\npret: "+pret;
    }

   
   public abstract String verificareITP();
   public abstract String inmatriculare();


    //metode finale
    public final String vitezaMax() {
        return "Limita maxima de viteza pe autostrada e de: " + VITEZA_MAX_LEGALA+" km/h";
    }
    public final String reprezentanta(){
        return "Ati vizitat site-ul "+DEALERSHIP+"!";
    }
    
    // Metodă pentru obținerea valorii variabilei "stare"
  /*  protected String getStare() {
        return this.stare;
    }
    protected String setStare(String stare){
        this.stare=stare;
        return null;
    }
    */
    //getteri
    public int getCapacitateCilindrica(){
        return capacitateCilindrica;
    }
    public String getMarca(){
        return marca;
    }
    public String getModel(){
        return model;
    }
    public int getAnFabricatie(){
        return anFabricatie;
    }
    public double getPret(){
        return pret;
    }

    public String getStare() {
        return stare;
    }
    
    
    //Setteri

    public void setCapacitateCilindrica(int capacitateCilindrica) {
        this.capacitateCilindrica = capacitateCilindrica;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setAnFabricatie(int anFabricatie) {
        this.anFabricatie = anFabricatie;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public void setStare(String stare) {
        this.stare = stare;
    }
    
    
    
}
