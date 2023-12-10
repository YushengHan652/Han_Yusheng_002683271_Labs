/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System;

import System.Employee.Employee;
import System.Studio.Studio;
import System.Network.Network;
import System.Organization.Organization;
import System.Role.ReviewAdminRole;
import System.Role.SystemAdminRole;
import System.UserAccount.UserAccount;

/**
 *
 * @author seanmacbook
 */
public class ConfigureSystem {
    
    public static MusicStudioSystem configure() {
        MusicStudioSystem system = MusicStudioSystem.getInstance();
        Network network = system.createAndAddNetwork();
        network.setName("MusicStudioNetwork");
        Studio systemAdminEn = network.getEnterpriseDirectory().createAndAddEnterprise("systemAdminEn", Studio.EnterpriseType.SystemAdminEn);
        Organization systemAdminOrg = systemAdminEn.getOrganizationDirectory().createOrganization(Organization.Type.SystemAdmin);
        UserAccount sysadmin = systemAdminOrg.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", new SystemAdminRole());
        
        Studio customerEn = network.getEnterpriseDirectory().createAndAddEnterprise("CustomerEn", Studio.EnterpriseType.CustomerEn);
        Organization customerOrg = customerEn.getOrganizationDirectory().createOrganization(Organization.Type.Customer);
        
        Studio reviewEn = network.getEnterpriseDirectory().createAndAddEnterprise("reviewEn", Studio.EnterpriseType.ReviewEn);
        Organization reviewOrg = reviewEn.getOrganizationDirectory().createOrganization(Organization.Type.ReviewAdmin);
        reviewOrg.setName("ReviewAdminOrg");
        Organization reviewAuditorOrg = reviewEn.getOrganizationDirectory().createOrganization(Organization.Type.ReviewAuditor);
        reviewAuditorOrg.setName("ReviewAuditorOrg");
        UserAccount reviewAdmin = reviewOrg.getUserAccountDirectory().createUserAccount("rad", "rad", new ReviewAdminRole());
        //Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin");
        //UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", new SystemAdminRole());
        
        return system;
    }
    
}
