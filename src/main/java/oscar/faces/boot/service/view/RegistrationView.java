package oscar.faces.boot.service.view;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import lombok.Data;
import oscar.faces.boot.model.User;
import oscar.faces.boot.service.UserService;


@ManagedBean(name="registrationView")
@RequestScoped
@Controller
@Data
public class RegistrationView {
	
	@Autowired
    private UserService userService;
	
	private User user = null;
	
	public RegistrationView(){
		super();
		user = new User();
	}
	public void userRegistration(){
		FacesContext context = FacesContext.getCurrentInstance();
	    try {
			context.getExternalContext().redirect("/process.xhtml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(user.getName()+"adsda");
		userService.saveUser(user);
	}
}