package guest;
 
import java.sql.Date;
import java.sql.Time;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class GuestController {
 
    @Autowired
    private GuestDao guestDao;
 
    @RequestMapping(value="/guest")
    public ModelAndView guestbook(HttpServletRequest request) {
        // Handle a new guest (if any):
        String name = request.getParameter("name");
        String lessonDate = request.getParameter("lessonDate");
        String lessonTime = request.getParameter("lessonTime");
        String lessonDuration= request.getParameter("lessonDuration");
        String repeatFreq = request.getParameter("repeatFreq");
        String lecName = request.getParameter("lecName");
        String maxAttendance = request.getParameter("maxAttendance");
        String compulsory = request.getParameter("compulsory");
        String venue = request.getParameter("venue");
        
        
        if (name != null){
            guestDao.persist(new Guest(name, lessonDate, lessonTime, lessonDuration, repeatFreq, lecName, maxAttendance, compulsory, venue));
            /*guestDao.persist(new Guest(lessonDate));
            guestDao.persist(new Guest(lessonTime));
            guestDao.persist(new Guest(lessonDuration));
            guestDao.persist(new Guest(repeatFreq));
            guestDao.persist(new Guest(lecName));
            guestDao.persist(new Guest(maxAttendance));
            guestDao.persist(new Guest(compulsory));
            guestDao.persist(new Guest(venue));*/
        }
        // Prepare the result view (guest.jsp):
        return new ModelAndView("guest.jsp", "guestDao", guestDao);
    }
}