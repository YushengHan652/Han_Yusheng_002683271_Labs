/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.Role;

import System.MusicStudioSystem;
import System.Organization.Organization;
import System.UserAccount.UserAccount;
import javax.swing.JPanel;
import UI.FilmCameraman.FilmCameramanWorkAreaJPanel;

/**
 *
 * @author seanmacbook
 */
public class FilmCameramanRole extends Role{

    public FilmCameramanRole() {
        this.type = RoleType.FilmCameraman;
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, MusicStudioSystem system) {
        
        return new FilmCameramanWorkAreaJPanel(userProcessContainer, account, system);
    }
}
