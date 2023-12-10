/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.Organization;

import System.Role.ReviewAdminRole;
import System.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author seanmacbook
 */
public class ReviewAdminOrg extends Organization {

    public ReviewAdminOrg() {
        super(Organization.Type.ReviewAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ReviewAdminRole());
        return roles;
    }
}
