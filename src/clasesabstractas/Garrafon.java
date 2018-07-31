/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesabstractas;

/**
 *
 * @author rafaelm
 */
public abstract class Garrafon {
    private String marca;
    private int capacidad;
    
    //puedo declarar mi constructor
    protected Garrafon(String marca){
        this.marca = marca;
    }
    
    //puedo yo declarar metodos abstractos
    public abstract void gritar();

    //tambien metodos concretos
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    
    
}
