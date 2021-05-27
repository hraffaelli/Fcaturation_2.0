/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classe;

import java.util.ArrayList;

/**
 *
 * @author Heremoana
 */
public class produit {
    private int nPiece ;
    private String nomArticle ;
    private int prixUni ;
    private int quantite ;  
    private int TotalProduit = 0;
    private int TotalPrix = 0;
    private int TotalQ = 0;
    
    
    public produit(int nPiece, String nomArticle, int prixUni, int quantite) {
        this.nPiece = nPiece;
        this.nomArticle = nomArticle;
        this.prixUni = prixUni;
        this.quantite = quantite;
    }

    public produit() {
    }
    

    public int getnPiece() {
        return nPiece;
    }

    public void setnPiece(int nPiece) {
        this.nPiece = nPiece;
    }

    public String getNomArticle() {
        return nomArticle;
    }

    public void setNomArticle(String nomArticle) {
        this.nomArticle = nomArticle;
    }

    public int getPrixUni() {
        return prixUni;
    }

    public void setPrixUni(int prixUni) {
        this.prixUni = prixUni;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
    
    
    
    @Override
    public String toString() {
        return "produit{" + "nPiece=" + nPiece + ", nomArticle=" + nomArticle + ", prixUni=" + prixUni + ", quantite=" + quantite + '}';
    }

    public String[] toTableau(){
        String[] str = new String[5];
        str[0] = "" + nPiece;
        str[1] = nomArticle;
        str[2] = "" + prixUni;
        str[3] = "" + quantite ;       
        return str;
    }
    
    
    
    
    
}
