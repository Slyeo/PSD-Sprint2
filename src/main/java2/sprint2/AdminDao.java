package sprint2;
 
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
 
@Component
public class AdminDao {
    // Injected database connection:
    @PersistenceContext private EntityManager em;

    ArrayList<User> inputUser = new ArrayList<User>();
    User users;
 
    // Stores a new guest:
    @Transactional
    public void persist(Admin admin) {
        em.persist(admin);
    }
 
    // Retrieves all the guests:
    public List<Admin> getAllGuests() {
        TypedQuery<Admin> query = em.createQuery(
            "SELECT g FROM Admin g ORDER BY g.id", Admin.class);
        return query.getResultList();
    }
    
    public List<Admin> getLecTiming(String getVal) {
        TypedQuery<Admin> query = em.createQuery(
            "SELECT g FROM Admin g WHERE g.courseName = '"+ getVal + "'", Admin.class);
        return query.getResultList();
    }
    
    public String getAllUsers(){
    	
		
		
    	return users.toString(); 
    }
}