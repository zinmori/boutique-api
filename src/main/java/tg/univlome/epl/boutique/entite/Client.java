/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique.entite;

import java.time.LocalDate;



/**
 *
 * @author BigZ
 */
public class Client extends Personne {
        
    private String cin;
    private String carteVisa;
    
    public Client(){
        super();
    }
    public Client(long id, String nom, String prenom, LocalDate dateNaissance, String cin, String carteVisa){
        super(id, nom, prenom, dateNaissance);
        this.cin = cin;
        this.carteVisa = carteVisa;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getCarteVisa() {
        return carteVisa;
    }

    public void setCarteVisa(String carteVisa) {
        this.carteVisa = carteVisa;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
