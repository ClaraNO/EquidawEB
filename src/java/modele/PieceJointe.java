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
public class PieceJointe {
    
    private int id;
    private String chemin;
    private String desccription;
    
    private ArrayList<Mail> LesMail ;
    
    public PieceJointe() {
        
    }

    public PieceJointe(int id, String chemin, String desccription) {
        this.id = id;
        this.chemin = chemin;
        this.desccription = desccription;
    }

    public int getId() {
        return id;
    }

    public String getChemin() {
        return chemin;
    }

    public String getDesccription() {
        return desccription;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setChemin(String chemin) {
        this.chemin = chemin;
    }

    public void setDesccription(String desccription) {
        this.desccription = desccription;
    }

    public ArrayList<Mail> getLesMail() {
        return LesMail;
    }

    public void setLesMail(ArrayList<Mail> LesMail) {
        this.LesMail = LesMail;
    }
    
    public void addUnMail ( Mail unMail ) {
        if ( LesMail == null ) {
            LesMail = new ArrayList<Mail>();
        }
        LesMail.add( unMail );
    }
    
}
