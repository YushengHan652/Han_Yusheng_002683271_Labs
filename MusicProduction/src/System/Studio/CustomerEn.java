/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.Studio;

import System.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author seanmacbook
 */
public class CustomerEn extends Studio{

    public CustomerEn(String name) {
        super(name, EnterpriseType.CustomerEn);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
