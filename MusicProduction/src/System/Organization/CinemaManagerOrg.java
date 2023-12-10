/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.Organization;

import System.Role.CinemaManagerRole;
import System.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author seanmacbook
 */
public class CinemaManagerOrg extends Organization{
    public CinemaManagerOrg() {
        super(Organization.Type.CinemaManager.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CinemaManagerRole());
        return roles;
    }
}
