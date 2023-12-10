/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.Organization;

import System.Role.FilmDirectorRole;
import System.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author seanmacbook
 */
public class FilmDirectorOrg extends Organization{
    public FilmDirectorOrg() {
        super(Organization.Type.FilmDirector.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FilmDirectorRole());
        return roles;
    }
}
