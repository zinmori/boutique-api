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

/**
 *
 * @author BigZ
 */
public class Produit {

    private long id;

    private String libelle;

    private double prixUnitaire;

    @JsonFormat(pattern = "yyyy-MM-dd") // Spécifie le format de la date
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonProperty("datePeremption")
    private LocalDate datePeremption;

    private Categorie categorie;

    public Produit() {

    }

    public Produit(long id, String libelle,
            double prixUnitaire,
            @JsonFormat(pattern = "yyyy-MM-dd") // Spécifie le format de la date
            @JsonSerialize(using = LocalDateSerializer.class)
            @JsonDeserialize(using = LocalDateDeserializer.class)
            @JsonProperty("datePeremption") LocalDate datePeremption, Categorie categorie) {
        this.id = id;
        this.libelle = libelle;
        this.prixUnitaire = prixUnitaire;
        this.datePeremption = datePeremption;
        this.categorie = categorie;
    }

    public long getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public LocalDate getDatePeremption() {
        return datePeremption;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public void setDatePeremption(LocalDate datePeremption) {
        this.datePeremption = datePeremption;
    }

    public boolean estPerime() {
        return datePeremption.isBefore(LocalDate.now());
    }

    public boolean estPerime(LocalDate dateReference) {
        return datePeremption.isBefore(dateReference);
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + (int) (this.id ^ (this.id >>> 32));
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
        final Produit other = (Produit) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return libelle + ", " + prixUnitaire + " F,";
    }

}
