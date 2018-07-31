/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion;

import clasesabstractas.Garrafon;

/**
 *
 * @author rafaelm
 */
public class Santorini extends Garrafon{
    
    public Santorini(String marca){
        super(marca);
    }
        
    @Override
    public void gritar() {
        System.out.println("El aguaaaaa Santoriniiiiiii");
    }
    
    
}
