/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author georg
 */
public class TiendaManagerDB {
    
    Connection con = null;
    
    public Connection conectarse()
    {        
        String us = "tiendausu";
        String clave = "laclave";
        String driver = "org.postgresql.Driver";
        String url = "jdbc:postgresql://localhost:5432/tiendadb";
        
        try {
            Class.forName(driver);
            this.con = DriverManager.getConnection(url, us, clave);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(TiendaManagerDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;
    }
    
    public void desconectarse()
    {
        try {
            this.con.close();
        } catch (SQLException ex) {
            Logger.getLogger(TiendaManagerDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
