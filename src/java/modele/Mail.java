/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.ArrayList;

/**
 *
 * @author sio2
 */
public class Mail {
    
    private int id;
    private int date;
    private String objet;
    private String corps;
    private Vente UneVente;
    
    private ArrayList<PieceJointe> LesPieceJointe;
    
    public Mail() {
        
    }

    public Mail(int id, int date, String objet, String corps) {
        this.id = id;
        this.date = date;
        this.objet = objet;
        this.corps = corps;
    }

    public int getId() {
        return id;
    }

    public int getDate() {
        return date;
    }

    public String getObjet() {
        return objet;
    }

    public String getCorps() {
        return corps;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public void setCorps(String corps) {
        this.corps = corps;
    }

    public Vente getUneVente() {
        return UneVente;
    }

    public void setUneVente(Vente UneVente) {
        this.UneVente = UneVente;
    }

    public ArrayList<PieceJointe> getLesPieceJointe() {
        return LesPieceJointe;
    }

    public void setLesPieceJointe(ArrayList<PieceJointe> LesPieceJointe) {
        this.LesPieceJointe = LesPieceJointe;
    }
     
    public void addUnePieceJointe ( PieceJointe unePieceJointe ) {
        if ( LesPieceJointe == null ) {
            LesPieceJointe = new ArrayList<PieceJointe>();
        }
        LesPieceJointe.add( unePieceJointe );
    }
    
}
