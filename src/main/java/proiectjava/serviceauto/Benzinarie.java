/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proiectjava.serviceauto;

/**
 *
 * @author Daria
 */
public class Benzinarie implements Servicii {
        public String alimentare() {
        return "Vehicul alimentat cu benzina";
    }

    public void curatenie(int Serviciu) {
        switch (Serviciu) {
            case 1:
                System.out.println("Se curata doar pe interior");
                break;
            case 2:
                System.out.println("Se curata doar pe exterior");
                break;
            case 3:
                System.out.println("Se curata pe interior si pe exterior");
                break;
            default:
                System.out.println("Serviciul nu exista");
                break;
        }
    }
}
