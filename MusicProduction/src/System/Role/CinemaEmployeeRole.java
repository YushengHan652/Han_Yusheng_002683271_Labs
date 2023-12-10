/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.Role;

import System.MusicStudioSystem;
import System.Organization.Organization;
import System.UserAccount.UserAccount;
import javax.swing.JPanel;
import UI.PlatformEmployee.CinemaEmployeeWorkAreaJPanel;

/**
 *
 * @author seanmacbook
 */
public class CinemaEmployeeRole extends Role{

    public CinemaEmployeeRole() {
        this.type = RoleType.CinemaEmployee;
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, MusicStudioSystem system) {
        
        return new CinemaEmployeeWorkAreaJPanel(userProcessContainer, account, system);
    }
    
}
