package org.example.project1.controller;

import org.example.project1.model.User;
import org.example.project1.service.UserService; // Ensure this import is correct
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
        @Autowired
        private UserService userService;

        @GetMapping("/register")
        public String showRegistrationForm(Model model) {
            model.addAttribute("user", new User());
            return "register"; // Thymeleaf template name
        }

        @PostMapping("/register")
        public String registerUser(User user) {
            userService.registerUser(user);
            return "redirect:/login"; // Redirect after registration
        }

        @GetMapping("/login")
        public String login() {
            return "login"; // Return the login page
        }

        @GetMapping("/")
        public String welcome() {
            return "welcome"; // Return the welcome page after login
       }
}
