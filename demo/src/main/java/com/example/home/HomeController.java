package com.example.home;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {
	@GetMapping("/home")
    public String home() {
        return "home";  // Returns home.html
    }

    @GetMapping("/login")
    public String login() {
        return "login";  // Returns login.html
    }
}
