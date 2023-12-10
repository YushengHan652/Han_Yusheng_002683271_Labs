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
public class ReviewEn extends Studio{

    public ReviewEn(String name) {
        super(name, EnterpriseType.ReviewEn);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
