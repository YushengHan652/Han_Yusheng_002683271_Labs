/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.Network;

import System.Studio.StudioDirectory;

/**
 *
 * @author seanmacbook
 */
public class Network {
    private String name;
    private StudioDirectory enterpriseDirectory;
    
    public Network() {
        enterpriseDirectory = new StudioDirectory();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public StudioDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
