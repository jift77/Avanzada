/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.store;

import com.mycompany.entities.Producto;
import com.mycompany.operations.OperProducto;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author georg
 */
@Path("/productos")
public class ProductoController {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Producto> getProductos()
    {
        OperProducto oper = new OperProducto();
        return oper.ConsultarProductos();
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addProduct(Producto producto)
    {
        return null;
    }
    
    @DELETE
    public Response deleteProduct(int productId)
    {
        return null;
    }
    
}
