package sprint2;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;
 
import java.util.ArrayList;

@Controller
@Transactional
public class AdminController {
 
    @Autowired
    private AdminDao adminDao;
 
    @Transactional
    @RequestMapping(value="/admin")
    public ModelAndView lectureSession(HttpServletRequest request) {
        // Handle a new guest (if any):
    	String lecName = request.getParameter("lecName");
    	String courseName = request.getParameter("courseName");
        String lessonDate = request.getParameter("lessonDate");
        String lessonTime = request.getParameter("lessonTime");
        String lessonDuration= request.getParameter("lessonDuration");
        String repeatFreq = request.getParameter("repeatFreq");
        String maxAttendance = request.getParameter("maxAttendance");
        String compulsory = request.getParameter("compulsory");
        String venue = request.getParameter("venue");
        
        if (lecName != null){
        	adminDao.persist(new Admin(lecName, courseName, lessonDate, lessonTime, lessonDuration, repeatFreq, maxAttendance, compulsory, venue));
        }
        return new ModelAndView("admin.jsp", "adminDao", adminDao);
    }
    
    @RequestMapping(value="/user")
    public ModelAndView lectureSusSession(HttpServletRequest request) {
    	String lecName = request.getParameter("lecName");
    	/*adminDao.getDrAlvisTiming();
    	adminDao.getDrKeohTiming();
    	adminDao.getDrLiewTiming(lecName);
    	adminDao.getDrStevenTiming();*/
    	adminDao.getLecTiming(lecName);
    	return new ModelAndView("user.jsp", "adminDao", adminDao);
    }
    
    
    @RequestMapping("/index")
	public String loadHomePage(Model m) {
		
		return "index";
	}
}