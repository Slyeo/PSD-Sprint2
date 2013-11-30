package sprint2;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class AdminController {
 
    @Autowired
    private AdminDao adminDao;
 
    @RequestMapping(value="/admin")
    public ModelAndView guestbook(HttpServletRequest request) {
        // Handle a new guest (if any):
    	String lecName = request.getParameter("lecName");
        String lessonDate = request.getParameter("lessonDate");
        String lessonTime = request.getParameter("lessonTime");
        String lessonDuration= request.getParameter("lessonDuration");
        String repeatFreq = request.getParameter("repeatFreq");
        String maxAttendance = request.getParameter("maxAttendance");
        String compulsory = request.getParameter("compulsory");
        String venue = request.getParameter("venue");
        
        
        if (lecName != null){
        	adminDao.persist(new Admin(
            		lecName, 
            		lessonDate, 
            		lessonTime, 
            		lessonDuration, 
            		repeatFreq, 
            		maxAttendance, 
            		compulsory, 
            		venue));
            /*teachSessionDao.persist(new TeachSession(lessonDate));
            teachSessionDao.persist(new TeachSession(lessonTime));
            teachSessionDao.persist(new TeachSession(lessonDuration));
            teachSessionDao.persist(new TeachSession(repeatFreq));
            teachSessionDao.persist(new TeachSession(lecName));
            teachSessionDao.persist(new TeachSession(maxAttendance));
            teachSessionDao.persist(new TeachSession(compulsory));
            teachSessionDao.persist(new TeachSession(venue));*/
        }
        // Prepare the result view (guest.jsp):
        return new ModelAndView("admin.jsp", "adminDao", adminDao);
    }
}