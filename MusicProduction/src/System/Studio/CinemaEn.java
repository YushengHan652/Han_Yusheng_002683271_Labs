/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.Studio;

import System.Platform.RoomDirectory;
import System.Platform.TimePeriodDirectory;
import System.Role.Role;
import java.util.ArrayList;



/**
 *
 * @author seanmacbook
 */
public class CinemaEn extends Studio{
    
    public RoomDirectory roomDirectory;
    public TimePeriodDirectory timePeriodDirectory;
    
    public CinemaEn(String name) {
        super(name, EnterpriseType.CinemaEn);
        this.roomDirectory = new RoomDirectory();
        this.timePeriodDirectory = new TimePeriodDirectory();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public RoomDirectory getRoomDirectory() {
        return roomDirectory;
    }

    public void setRoomDirectory(RoomDirectory roomDirectory) {
        this.roomDirectory = roomDirectory;
    }

    public TimePeriodDirectory getTimePeriodDirectory() {
        return timePeriodDirectory;
    }

    public void setTimePeriodDirectory(TimePeriodDirectory timePeriodDirectory) {
        this.timePeriodDirectory = timePeriodDirectory;
    }
    
    
}
