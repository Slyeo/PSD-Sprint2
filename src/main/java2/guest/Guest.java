package guest;
 
import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
 
@Entity
public class Guest implements Serializable {
    private static final long serialVersionUID = 1L;
 
    // Persistent Fields:
    @Id @GeneratedValue
    Long id;
    private String name;
    private Date signingDate;
    
 
    // Constructors:
    public Guest() {
    }
 
    public Guest(String name, String lessonDate, String lessonTime, String lessonDuration2, String repeatFreq2, String lecName, String maxAttendance2, String compulsory, String venue) {
        this.name = name;
        this.signingDate = new Date(System.currentTimeMillis());
    }
 
    // String Representation:
    @Override
    public String toString() {
        return name + " (signed on " + signingDate + ") \n ";
    	//return changeName;
    }
}