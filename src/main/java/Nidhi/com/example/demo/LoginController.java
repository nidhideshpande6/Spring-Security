package Nidhi.com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {
	
	@RequestMapping("/check-csrf")
	public String checkCsrf(HttpSession session) {
	    Object csrfToken = session.getAttribute("_csrf");
	    return csrfToken != null ? csrfToken.toString() : "No CSRF token in session";
	}


    @GetMapping("/login")
    public String login() {
        return "login";  // Return the login.html view
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "welcome";  // Return the welcome.html view
    }
    
    @GetMapping("/logout-success")
    public String logoutSuccess(Model model) {
        model.addAttribute("message", "You have successfully logged out.");
        return "logout-success";  // This will refer to a Thymeleaf template called logout-success.html
    }
}
