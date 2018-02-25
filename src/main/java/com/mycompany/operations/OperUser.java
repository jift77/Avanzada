/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.operations;

import com.mycompany.entities.User;
import com.mycompany.interfaces.IOperUser;

/**
 *
 * @author georg
 */
public class OperUser implements IOperUser{
    
    @Override
    public boolean Autenticar(User user)
    {
         /*Connection con = new UserManagerDb().conectarse();
         if(con != null)
        {
            try {
                PreparedStatement ps = con.prepareStatement("SELECT count(*) FROM users WHERE login = ? and password = ?");
                ps.setString(1, user.getLogin());
                ps.setString(2, user.getPassword());
                
                ResultSet rta = ps.executeQuery();
                while(rta.next())
                {   
                    int i = rta.getInt("count");
                    
                    if(i > 0)
                        return true;
                    
                    return false;
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(OperUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }*/
        return false;
    }
}
