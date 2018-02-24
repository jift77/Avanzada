/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entities;

/**
 *
 * @author georg
 */
public abstract class Producto  {
    
    private int Id;
    private String Nombre;
    private double Precio;
    private String Descripcion;
    private String Categoria;
    
    public Producto () {}
    
    public Producto(int id, String nombre, long precio, String descripcion, String categoria)
    {
        this.Nombre = nombre;
        this.Precio = precio;
        this.Descripcion = descripcion;
        this.Id = id;
        this.Categoria = categoria;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Precio
     */
    public double getPrecio() {
        return Precio;
    }

    /**
     * @param Precio the Precio to set
     */
    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
    
    public abstract double Impuesto (boolean  costos);

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * @return the Descripcion
     */
    public String getDescripcion() {
        return Descripcion;
    }

    /**
     * @param Descripcion the Descripcion to set
     */
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    /**
     * @return the Categoria
     */
    public String getCategoria() {
        return Categoria;
    }
    
}
