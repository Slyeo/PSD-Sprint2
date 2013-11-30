package sprint2;
 
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
 
@Entity
public class Admin implements Serializable {
    private static final long serialVersionUID = 1L;
 
    // Persistent Fields:
    @Id @GeneratedValue
    Long id;
    private String lecName;
    private String lessonDate;
    private String lessonTime;
    private String lessonDuration;
    private String repeatFreq;
    private String maxAttendance;
    private String compulsory;
    private String venue;
    
 
    // Constructors:
    public Admin() {
    }
 
    public Admin(String lecName, String lessonDate, String lessonTime, String lessonDuration2, String repeatFreq2, String maxAttendance2, String compulsory, String venue) {
        this.lecName = lecName;
        this.lessonDate = lessonDate;
        this.lessonTime = lessonTime;
        this.lessonDuration = lessonDuration2;
        this.repeatFreq = repeatFreq2;
        this.maxAttendance = maxAttendance2;
        this.compulsory = compulsory;
        this.venue = venue;
    }
 
    // String Representation:
    @Override
    public String toString() {
    	String changeName = lecName +" " + lessonDate+" " + lessonTime+" " + lessonDuration+" " +
    			repeatFreq+" " + maxAttendance+" " +compulsory +" " + venue;
        //return name + " (signed on " + signingDate + ") \n ";
    	return changeName;
    }
}