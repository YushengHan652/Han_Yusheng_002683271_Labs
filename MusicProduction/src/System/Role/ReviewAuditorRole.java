/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.Role;

import System.MusicStudioSystem;
import System.Organization.Organization;
import System.UserAccount.UserAccount;
import javax.swing.JPanel;
import UI.Auditor.AuditorWorkAreaJPanel;

/**
 *
 * @author seanmacbook
 */
public class ReviewAuditorRole extends Role{

    public ReviewAuditorRole() {
        this.type = RoleType.ReviewAuditor;
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, MusicStudioSystem system) {
        
        return new AuditorWorkAreaJPanel(userProcessContainer, account, system);
    }
}
