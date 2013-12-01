package sprint2;
 
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
    
    public List<Admin> getDrLiewTiming() {
        TypedQuery<Admin> query = em.createQuery(
            "SELECT g FROM Admin g WHERE g.lecName = 'Dr. Liew Pak San'", Admin.class);
        return query.getResultList();
    }
    
    public List<Admin> getDrStevenTiming() {
        TypedQuery<Admin> query = em.createQuery(
            "SELECT g FROM Admin g WHERE g.lecName = 'Dr. Steven Goh'", Admin.class);
        return query.getResultList();
    }
    
    public List<Admin> getDrAlvisTiming() {
        TypedQuery<Admin> query = em.createQuery(
            "SELECT g FROM Admin g WHERE g.lecName = 'Dr. Alvis Fong'", Admin.class);
        return query.getResultList();
    }
    
    public List<Admin> getDrKeohTiming() {
        TypedQuery<Admin> query = em.createQuery(
            "SELECT g FROM Admin g WHERE g.lecName = 'Dr. Keoh Sye Loong'", Admin.class);
        return query.getResultList();
    }
}