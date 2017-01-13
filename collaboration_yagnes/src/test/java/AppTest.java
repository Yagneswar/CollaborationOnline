import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.collaboration.dao.UserDAO;
import com.niit.collaboration.model.User;

public class AppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
    	context.scan("com.niit.collaboration");
    	context.refresh();
    	UserDAO dao=(UserDAO)context.getBean(UserDAO.class);
    	User u=new User();
    	 u.setId("1");
    	 u.setAddress("BBSR");
    	 u.setContactno("9777157459");
    	 u.setEmail("yagnes@gmail.com");
    	 u.setIsonline('Y');
    	 u.setPassword("sinu");
    	 u.setReason("Yes");
    	 u.setRole("Admin");
    	 u.setStatus('N');
    	 u.setUsername("Yagneswar");
    	 
    	 
    	 
    	 dao.save(u);
    	
    	
    	
	}

}
