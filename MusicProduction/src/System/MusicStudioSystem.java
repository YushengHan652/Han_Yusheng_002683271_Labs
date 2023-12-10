/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System;

import System.Network.Network;
import System.Organization.Organization;
import System.Role.Role;
import System.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author seanmacbook
 */
public class MusicStudioSystem extends Organization{
    private static MusicStudioSystem business;
    private ArrayList<Network> networkList;
    
    public static MusicStudioSystem getInstance() {
        if (business == null) {
            business = new MusicStudioSystem();
        }
        return business;
    }
    
    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    
    private MusicStudioSystem() {
        super(null);
        networkList = new ArrayList<Network>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network:networkList){
            
        }
        return true;
    }
}
