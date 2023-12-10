/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.Role;

import System.MusicStudioSystem;
import System.Organization.Organization;
import System.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author huangrongjing
 */
public abstract class Role {
    public enum RoleType{
        CinemaEmployee("CinemaEmployee"),
        CinemaManager("CinemaManager"),
        //CinemaTimebale("CinemaTimebale"),
        Customer("Customer"),
        FilmActor("FilmActor"),
        FilmAdmin("FilmAdmin"),
        FilmCameraman("FilmCameraman"),
        FilmDirector("FilmDirector"),
        FilmEditor("FilmEditor"),
        FilmScriptwriter("FilmScriptwriter"),
        ReviewAdmin("ReviewAdmin"),
        ReviewAuditor("ReviewAuditor"),
        Room("Room"),
        SystemAdmin("SystemAdmin");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public RoleType type;
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, MusicStudioSystem system);
    
    @Override
    public String toString() {
        //return this.getClass().getName();
        return (type != null) ? this.type.getValue() : this.getClass().getName();
    }
}
