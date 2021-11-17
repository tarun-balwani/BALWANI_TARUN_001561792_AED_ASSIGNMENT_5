/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;
import Business.Organization;
import Business.Role.AdminRole;
import Business.Role.Role;
import java.util.ArrayList;
/**
 *
 * 
 */
public class Restaurant extends Organization{
    public Restaurant() {
        super(Organization.Type.RestaurantAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AdminRole());
        return roles;
    }
    
}
