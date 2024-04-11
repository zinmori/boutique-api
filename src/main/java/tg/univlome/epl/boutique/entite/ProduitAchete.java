/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique.entite;

import java.util.Objects;


/**
 *
 * @author BigZ
 */
public class ProduitAchete {
    
    private double remise;
    
    private int quantite;
    
    private Produit produit;
    
    private long achat;
    
    public ProduitAchete(){
        
    }
    public ProduitAchete(Produit produit, double remise, int quantite){
        this.produit = produit;
        this.remise = remise;
        this.quantite = quantite;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }
    
    public double getRemise() {
        return remise;
    }

    public void setRemise(double remise) {
        this.remise = remise;
    }

    public long getAchat() {
        return achat;
    }

    public void setAchat(long achat) {
        this.achat = achat;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.produit);
        hash = 17 * hash + Objects.hashCode(this.achat);
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
        final ProduitAchete other = (ProduitAchete) obj;
        if (!Objects.equals(this.produit, other.produit)) {
            return false;
        }
        return Objects.equals(this.achat, other.achat);
    }
    
    
    
    @Override
    public String toString() {
        return  produit.getLibelle() + ", q : " + quantite + ", remise : " + remise;
    }
    
}
