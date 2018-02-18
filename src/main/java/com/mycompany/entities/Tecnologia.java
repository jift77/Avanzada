/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entities;

/**
 *
 * @author Sala_04
 */
public class Tecnologia extends Producto{
    
    public Tecnologia(int id, String nombre, long precio, String descripcion)
    {
        super(id, nombre, precio, descripcion, "Tecnologia");
    }
    
    @Override
    public double Impuesto (boolean  costos)
    {
        double result = 0;
        
        if(costos)
            result = this.getPrecio() * 0.15;
        else
            result = this.getPrecio() * 0.12;
            
        return result;
    }
}
