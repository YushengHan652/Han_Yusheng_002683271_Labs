/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.Role;

import System.Platform.RoomDirectory;
import System.MusicStudioSystem;
import System.Organization.Organization;
import System.UserAccount.UserAccount;
import javax.swing.JPanel;
import UI.PlatformAdmin.CinemaAdminWorkAreaJPanel;


/**
 *
 * @author seanmacbook
 */
public class CinemaManagerRole extends Role{
    
    public CinemaManagerRole() {
        this.type = RoleType.CinemaManager;
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, MusicStudioSystem system) {
        
        return new CinemaAdminWorkAreaJPanel(userProcessContainer, account, system);
    }
    
}
