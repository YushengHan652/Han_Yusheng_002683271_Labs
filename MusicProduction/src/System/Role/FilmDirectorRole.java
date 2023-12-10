/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.Role;

import System.MusicStudioSystem;
import System.Organization.Organization;
import System.UserAccount.UserAccount;
import javax.swing.JPanel;
import UI.FilmDirector.FilmDirectorWorkAreaJPanel;

/**
 *
 * @author seanmacbook
 */
public class FilmDirectorRole extends Role{

    public FilmDirectorRole() {
        this.type = RoleType.FilmDirector;
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, MusicStudioSystem system) {
        
        return new FilmDirectorWorkAreaJPanel(userProcessContainer, account, system);
    }
}
