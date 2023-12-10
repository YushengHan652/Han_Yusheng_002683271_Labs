/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.Role;

import System.MusicStudioSystem;
import System.Organization.Organization;
import System.UserAccount.UserAccount;
import javax.swing.JPanel;
import UI.ReviewAdmin.ReviewAdminWorkAreaJPanel;

/**
 *
 * @author seanmacbook
 */
public class ReviewAdminRole extends Role{

    public ReviewAdminRole() {
        this.type = RoleType.ReviewAdmin;
    }
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, MusicStudioSystem system) {
        
        return new ReviewAdminWorkAreaJPanel(userProcessContainer, account, system);
    }
}
