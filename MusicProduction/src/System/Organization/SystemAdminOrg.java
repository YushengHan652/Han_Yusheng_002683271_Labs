/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.Organization;

import System.Role.CinemaEmployeeRole;
import System.Role.Role;
import System.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author seanmacbook
 */
public class SystemAdminOrg extends Organization{

    public SystemAdminOrg() {
        super(Organization.Type.SystemAdmin.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SystemAdminRole());
        return roles;
    }
}
