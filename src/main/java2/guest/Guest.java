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
    private String lessonDate;
    private String lessonTime;
    private String lessonDuration;
    private String repeatFreq;
    private String lecName;
    private String maxAttendance;
    private String compulsory;
    private String venue;
    
 
    // Constructors:
    public Guest() {
    }
 
    public Guest(String name, String lessonDate, String lessonTime, String lessonDuration2, String repeatFreq2, String lecName, String maxAttendance2, String compulsory, String venue) {
        this.name = name;
        this.signingDate = new Date(System.currentTimeMillis());
        this.lessonDate = lessonDate;
        this.lessonTime = lessonTime;
        this.lessonDuration = lessonDuration2;
        this.repeatFreq = repeatFreq2;
        this.lecName = lecName;
        this.maxAttendance = maxAttendance2;
        this.compulsory = compulsory;
        this.venue = venue;
    }
 
    // String Representation:
    @Override
    public String toString() {
    	String changeName = name +" "+ signingDate + " " + lessonDate + lessonTime + lessonDuration +
    			repeatFreq + lecName + maxAttendance + compulsory + venue;
        //return name + " (signed on " + signingDate + ") \n ";
    	return changeName;
    }
}