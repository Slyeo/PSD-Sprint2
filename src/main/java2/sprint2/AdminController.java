package sprint2;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.SortedMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;

@Controller
@Transactional
public class AdminController {
 
    @Autowired
    private AdminDao adminDao;
    
    static String userName;
 
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
    public ModelAndView lectureSusSession(HttpServletRequest request, Model m) {

    	String courseName = request.getParameter("courseName");
    	if(request.getParameter("userName") != null){
        	userName = request.getParameter("userName");
        	
        }
        m.addAttribute("username",  userName);
       
    	/*adminDao.getDrAlvisTiming();
    	adminDao.getDrKeohTiming();
    	adminDao.getDrLiewTiming(lecName);
    	adminDao.getDrStevenTiming();*/
        HashSet<String> test = new HashSet<String>();
        for (Admin list : adminDao.getAllGuests()) {
        	test.add("Hello");
        	test.remove(list);
        } 
        
    	adminDao.getLecTiming(courseName);
    	return new ModelAndView("user.jsp", "adminDao", adminDao);
    }
    
    
    @RequestMapping("/index")
    public ModelAndView loadHomePage(HttpServletRequest request, Model m) {
		return new ModelAndView("index.jsp", "adminDao", adminDao);
	}
    /*public String loadHomePage(Model m) {
    	m.addAttribute("username", "WinWin");
    	return "index";
    }*/
    
    @RequestMapping(value="/date")
    public ModelAndView stuViewSession(HttpServletRequest request, Model m) {

    	/*String courseName = request.getParameter("courseName");
    	if(request.getParameter("userName") != null){
        	userName = request.getParameter("userName");
        	
        }
        m.addAttribute("username",  userName);
    	
    	adminDao.getLecTiming(courseName);*/
    	String courseName = null;
    	
    	if(request.getParameter("userName") != null){
        	userName = request.getParameter("userName");
        	courseName = request.getParameter("courseName");
        }
        m.addAttribute("username",  userName);
        m.addAttribute("coursename", courseName);
    	
    	return new ModelAndView("date.jsp", "adminDao", adminDao);
    }
}