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
public class Employe extends Personne {
        
    private String cnss;
    
    public Employe(){
        super();
    }
    public Employe(long id, String nom, String prenom, LocalDate dateNaissance, String cnss){
        super(id, nom, prenom, dateNaissance);
        this.cnss = cnss;
    }

    public String getCnss() {
        return cnss;
    }

    public void setCnss(String cnss) {
        this.cnss = cnss;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
