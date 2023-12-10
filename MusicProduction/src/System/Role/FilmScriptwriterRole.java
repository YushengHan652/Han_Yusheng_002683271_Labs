/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.Role;

import System.MusicStudioSystem;
import System.Organization.Organization;
import System.UserAccount.UserAccount;
import javax.swing.JPanel;
import UI.FilmScriptwriter.FilmScriptwriterWorkAreaJPanel;

/**
 *
 * @author seanmacbook
 */
public class FilmScriptwriterRole extends Role{

    public FilmScriptwriterRole() {
        this.type = RoleType.FilmScriptwriter;
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, MusicStudioSystem system) {
        
        return new FilmScriptwriterWorkAreaJPanel(userProcessContainer, account, system);
    }
}
