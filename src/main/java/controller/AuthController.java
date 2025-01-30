package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import model.User;
import service.UserService;

@Controller
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/signup")
    public String signupForm() {
        return "signup";
    }

    @PostMapping("/register")
    public String registerUser(User user, Model model) {
        user.setRole("ROLE_USER");
        userService.saveUser(user);
        model.addAttribute("success", "User registered successfully!");
        return "login";
    }
}
