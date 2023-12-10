/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.Studio;

import System.Platform.RoomDirectory;
import System.Platform.TimePeriodDirectory;
import System.Organization.Organization;
import System.Organization.OrganizationDirectory;

/**
 *
 * @author seanmacbook
 */
public abstract class Studio extends Organization{
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private RoomDirectory roomDirectory;
    private TimePeriodDirectory timePeriodDirectory;
    
    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public RoomDirectory getRoomDirectory() {
        return roomDirectory;
    }

    public TimePeriodDirectory getTimePeriodDirectory() {
        return timePeriodDirectory;
    }
    
    
    public enum EnterpriseType{
        CinemaEn("CinemaEn"),
        CustomerEn("CustomerEn"),
        FilmEn("FilmEn"),
        ReviewEn("ReviewEn"),
        SystemAdminEn("SystemAdminEn");
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
        }
    }
    
    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public Studio(String name, EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        organizationDirectory=new OrganizationDirectory();    
    }
}
