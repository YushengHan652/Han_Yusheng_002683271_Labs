/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.Studio;

import java.util.ArrayList;
import static javax.management.Query.or;

/**
 *
 * @author seanmacbook
 */
public class StudioDirectory {
    private ArrayList<Studio> enterpriseList;
   

    public ArrayList<Studio> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Studio> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public StudioDirectory(){
        enterpriseList=new ArrayList<Studio>();
    }
    
    //Create enterprise
    public Studio createAndAddEnterprise(String name, Studio.EnterpriseType type){
        Studio enterprise = null;
        if (type == Studio.EnterpriseType.CinemaEn){
            enterprise = new CinemaEn(name);
            enterpriseList.add(enterprise);
        } else if (type == Studio.EnterpriseType.CustomerEn){
            enterprise = new CustomerEn(name);
            enterpriseList.add(enterprise);
        } else if (type == Studio.EnterpriseType.FilmEn) {
            enterprise = new FilmEn(name);
            enterpriseList.add(enterprise);
        } else if (type == Studio.EnterpriseType.ReviewEn) {
            enterprise = new ReviewEn(name);
            enterpriseList.add(enterprise);
        } else if (type == Studio.EnterpriseType.SystemAdminEn) {
            enterprise = new SystemAdminEn(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
}
