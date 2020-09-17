/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import modele.Lieu;
import modele.Vente;

/**
 *
 * @author sio2
 */
public class LieuTest {
    
    public static void main(String[] args) {
        
        Lieu unLieu1 = new Lieu(1, "Caen", 7, " Fragiles ");
        Vente vente1 = new Vente(1," Ete ", "20/02/2020")  ;
       
        unLieu1.addUneVente(vente1);
        
        for (int i = 0; i < unLieu1.getLesVentes().size(); i++) {
            System.out.println (" La Vente va se passer en " +unLieu1.getLesVentes().get(i).getNom());
           
        }
    }
    
}
