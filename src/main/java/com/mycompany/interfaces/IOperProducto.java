/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interfaces;

import com.mycompany.entities.Producto;
import java.util.List;


/**
 *
 * @author georg
 */
public interface IOperProducto {
    
    public int InsertarProducto(Producto p);
    public int BorrarProducto(int productoId);
    public List<Producto> ConsultarProductos();
}
