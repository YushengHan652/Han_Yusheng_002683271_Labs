/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.Role;

import System.MusicStudioSystem;
import System.Movie.MovieDirectory;
import System.Organization.Organization;
import System.UserAccount.UserAccount;
import javax.swing.JPanel;
import UI.FilmAdmin.FilmAdminWorkAreaJPanel;


/**
 *
 * @author seanmacbook
 */
public class FilmAdminRole extends Role{
    public FilmAdminRole() {
        this.type = RoleType.FilmAdmin;
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, MusicStudioSystem system) {
        
        return new FilmAdminWorkAreaJPanel(userProcessContainer, account, system);
    }
}
