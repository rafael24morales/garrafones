/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garrafonesabstractos;

import clasesabstractas.Garrafon;
import implementacion.Santorini;

/**
 *
 * @author rafaelm
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Garrafon santorini = new Santorini("Santorini");
        
        santorini.gritar();
        System.out.println(santorini.getMarca());
        
        
        
    }
    
}
