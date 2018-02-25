/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.operations;


import com.mycompany.entities.Deportivo;
import com.mycompany.entities.Producto;
import com.mycompany.entities.Tecnologia;
import com.mycompany.interfaces.IOperProducto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author georg
 */
public class OperProducto implements IOperProducto {

    TiendaManagerDB db = null;
    
    public OperProducto()
    {
        db = new TiendaManagerDB();
    }
    
    @Override
    public int InsertarProducto(Producto p) {
        int result = 0;
        Connection con = db.conectarse();
        if(con != null)
        {
            try {
                PreparedStatement ps = con.prepareStatement("INSERT INTO producto (nombre, descripcion, categoria, precio) values (?, ?, ? ,?)");
                ps.setString(1, p.getNombre());
                ps.setString(2, p.getDescripcion());
                ps.setString(3, p.getCategoria());
                ps.setDouble(4, p.getPrecio());
                
                result = ps.executeUpdate();
                db.desconectarse();
            } catch (SQLException ex) {
                Logger.getLogger(OperProducto.class.getName()).log(Level.SEVERE, null, ex);
                return 0;
            }
        }
        return result;
    }
    
    @Override
    public int BorrarProducto(int productoId)
    {
        int result = 0;
        Connection con = db.conectarse();
        if(con != null)
        {
            try {
                PreparedStatement ps = con.prepareStatement("DELETE producto WHERE id = ?");
                ps.setInt(1, productoId);
                
                result = ps.executeUpdate();
                db.desconectarse();
            } catch (SQLException ex) {
                Logger.getLogger(OperProducto.class.getName()).log(Level.SEVERE, null, ex);
                return 0;
            }
        }
        return result;
    }
    
    @Override
    public List<Producto> ConsultarProductos()
    {
        List<Producto> result = new ArrayList<>();
        
        result.add(new Tecnologia(1,"radio", 59, "Radio AM/FM marca Sony"));
        result.add(new Tecnologia(2,"televisor", 250, "LCD 52 pulgadas"));
        result.add(new Deportivo(3, "Zapatilla Nike", 150, "Par de zapatillas"));
        return result;
    }
}
