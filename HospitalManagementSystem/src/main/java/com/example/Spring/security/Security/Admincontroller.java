package com.example.Spring.security.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
@Controller
public class Admincontroller {
	@Autowired
	public AdminRepository adminRepository;
	
	@GetMapping("/Adminhome1")
	public String home()
	{
		return "AdminHome";
	}
	 
	 @GetMapping("/register")
	 public String singup( Model model) {
		
		 model.addAttribute("admin", new Admin());
		 return "SignupForm";
	}
	 
	 @PostMapping("/stddata")
	 public String storedatam(Model model ,Admin admin)
	 {
		 BCryptPasswordEncoder encoder= new BCryptPasswordEncoder();
		 String encodedPassword= encoder.encode(admin.getPassword());
		 admin.setPassword(encodedPassword);
		 adminRepository.save(admin);
		 return "redirect:/Adminhome1";
	 }
	 
	 
	 
}
