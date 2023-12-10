/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.Organization;

import System.Role.FilmCameramanRole;
import System.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author seanmacbook
 */
public class FilmShootOrg extends Organization {

    public FilmShootOrg() {
        super(Organization.Type.FilmShoot.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FilmCameramanRole());
        return roles;
    }
}
