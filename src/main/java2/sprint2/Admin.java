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
    private String courseName;
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
 
    public Admin(String lecName, String courseName, String lessonDate, String lessonTime, String lessonDuration, String repeatFreq, String maxAttendance, String compulsory, String venue) {
        this.lecName = lecName;
        this.courseName = courseName;
        this.lessonDate = lessonDate;
        this.lessonTime = lessonTime;
        this.lessonDuration = lessonDuration;
        this.repeatFreq = repeatFreq;
        this.maxAttendance = maxAttendance;
        this.compulsory = compulsory;
        this.venue = venue;
    }
 
    // String Representation:
    @Override
    public String toString() {
    	String changeName = lecName + " " + courseName +" " + lessonDate+" " + lessonTime+" " + lessonDuration+" " +
    			repeatFreq+" " + maxAttendance+" " +compulsory +" " + venue;
        //return name + " (signed on " + signingDate + ") \n ";
    	return changeName;
    }
    
    public void setLecName(String lecName){
    	this.lecName = lecName;
    }
    
    public String getLecName(){
    	return lecName;
    }
    
    public void setCourseName(String courseName){
    	this.courseName = courseName;
    }
    
    public String getCourseName(){
    	return courseName;
    }
    
    public void setLessonDate(String lessonDate){
    	this.lessonDate = lessonDate;
    }
    
    public String getLessonDate(){
    	return lessonDate;
    }
    
    public void setLessonTime(String lessonTime){
    	this.lessonTime = lessonTime;
    }
    
    public String getLessonTime(){
    	return lessonTime;
    }
    
    public void setLessonDuration(String lessonDuration){
    	this.lessonDuration = lessonDuration;
    }
    
    public String getLessonDuration(){
    	return lessonDuration;
    }
    
    public void setRepeatFreq(String repeatFreq){
    	this.repeatFreq = repeatFreq;
    }
    
    public String getRepeatFreq(){
    	return repeatFreq;
    }
    
    public void setMaxAttendance(String maxAttendance){
    	this.maxAttendance = maxAttendance;
    }
    
    public String getMaxAttendance(){
    	return maxAttendance;
    }
    
    public void setCompulsory(String compulsory){
    	this.compulsory = compulsory;
    }
    
    public String getCompulsory(){
    	return compulsory;
    }
    
    public void setVenue(String venue){
    	this.venue = venue;
    }
    
    public String getVenue(){
    	return venue;
    }
}