package sprint2;
 
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
 
@Entity
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
 
    // Persistent Fields:
    @Id @GeneratedValue
    Long id;
    private String stuUser;
    private String stuPass;
    private String stuAccess;
    private String stuName;
    private String stuCourse;
    private String stuContact;
    
    List<User> inputUser = new ArrayList<User>();
    
    // Constructors:
    public User() {
    	
    	User u1 = new User("user", "user","2", "WW", "", "9991234");
		User u2 = new User("admin", "admin","1", "WW2", "", "9991235");
		User u3 = new User("test1", "test1","2", "Daemian", "", "99999999");
		User u4 = new User("test2", "test2","2", "Yee Keng", "", "99987654");
		User u5 = new User("test3", "test3","2", "Boon Keong", "", "99915432");
		
		inputUser.add(u1);
		inputUser.add(u2);
		inputUser.add(u3);
		inputUser.add(u4);
		inputUser.add(u5);
    }
 
    public User(String stuUser, String stuPass, String stuAccess, String stuName, String stuCourse, String stuContact) {
        this.stuUser = stuUser;
        this.stuPass = stuPass;
        this.stuAccess = stuAccess;
        this.stuName = stuName;
        this.stuCourse = stuCourse;
        this.stuContact = stuContact;
    }
    
    public List<User> getAllUser(){
    	return inputUser;
    }

	public String getStuUser() {
		return stuUser;
	}

	@Override
	public String toString() {
		return "User =" + stuUser + ", stuPass="
				+ stuPass + ", stuName=" + stuName + ", stuCourse=" + stuCourse
				+ ", stuContact=" + stuContact + "]<br>";
	}

	public void setStuUser(String stuUser) {
		this.stuUser = stuUser;
	}

	public String getStuPass() {
		return stuPass;
	}
	
	public void setStuAccess(String stuAccess) {
		this.stuAccess = stuAccess;
	}

	public String getStuAccess() {
		return stuAccess;
	}

	public void setStuPass(String stuPass) {
		this.stuPass = stuPass;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuCourse() {
		return stuCourse;
	}

	public void setStuCourse(String stuCourse) {
		this.stuCourse = stuCourse;
	}

	public String getStuContact() {
		return stuContact;
	}

	public void setStuContact(String stuContact) {
		this.stuContact = stuContact;
	}
 
    // String Representation:
    //@Override
   /* public String toString() {
    	String changeName = lecName + " " + courseName +" " + lessonDate+" " + lessonTime+" " + lessonDuration+" " +
    			repeatFreq+" " + maxAttendance+" " +compulsory +" " + venue;
        //return name + " (signed on " + signingDate + ") \n ";
    	return changeName;
    }*/
    
   
}