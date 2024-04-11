/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique.entite;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author BigZ
 */
public class Achat {
    
    @JsonProperty("id")
    private long id;
    
    @JsonFormat(pattern = "yyyy-MM-dd")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonProperty("date")
    private LocalDate date;
    
    private double remise;
    
    private List<ProduitAchete> produitAchete;
    
    private Employe employe;
    
    private Client client;
    
    public Achat(){
        
    }
    public Achat(long id, LocalDate date, double remise, Employe employe, Client client, List<ProduitAchete> p) {
        this.id = id;
        this.date = date;
        this.remise = remise;
        this.employe = employe;
        this.client = client;
        this.produitAchete = p;
    }
    
    public long getId() {
        return this.id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public LocalDate getDate() {
        return this.date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public double getRemise() {
        return this.remise;
    }

    public List<ProduitAchete> getProduits() {
        return produitAchete;
    }

    public void setRemise(double remise) {
        this.remise = remise;
    }

    public void setProduits(List<ProduitAchete> produits) {
        this.produitAchete = produits;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    
    public double getRemiseTotale(){
        double remiseTotale = 0;
        for(ProduitAchete produit : produitAchete){
            remiseTotale += produit.getRemise();
        }
        remiseTotale += this.remise; 
        return remiseTotale;
    }
    
    public double getTotalAPayer(){
        double totaleAPayer = 0;
        for(ProduitAchete produit : produitAchete){
            totaleAPayer += produit.getProduit().getPrixUnitaire() * produit.getQuantite();
        }
        totaleAPayer -= this.getRemiseTotale();
        return totaleAPayer ;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (this.id ^ (this.id >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Achat other = (Achat) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Achat #" + id + "\n" +
               "date :" + date +  "\n" +
               "remise:" + remise + "\n" +
               "produits achetés :" + produitAchete.toString() + "\n" +
               "Client : " + client.toString() + "\n" +
               "Employé chargé : " + employe.toString() ;
    }
    
}
