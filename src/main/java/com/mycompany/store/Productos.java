/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.store;

import com.mycompany.entities.Producto;
import com.mycompany.operations.OperProducto;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author georg
 */
@Path("/productos")
public class Productos {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Producto> getProductos()
    {
        OperProducto oper = new OperProducto();
        return oper.ConsultarProductos();
    }
    
    @GET
    @Path("/prueba")
    public String prueba()
    {
        return "funcionando";
    }
}
