/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.Role;

import System.MusicStudioSystem;
import System.Organization.Organization;
import System.UserAccount.UserAccount;
import javax.swing.JPanel;
import UI.Customer.CustomerWorkAreaJPanel;

/**
 *
 * @author seanmacbook
 */
public class CustomerRole extends Role{

    public CustomerRole() {
        this.type = RoleType.Customer;
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, MusicStudioSystem system) {
        
        return new CustomerWorkAreaJPanel(userProcessContainer, account, system);
    }
}
