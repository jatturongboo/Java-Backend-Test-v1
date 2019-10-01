package com.krungsri.kma.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.krungsri.kma.api.entity.RegisterAccount;
import com.krungsri.kma.api.entity.User;
import com.krungsri.kma.api.repository.UserRepository;
import com.krungsri.kma.api.service.UserService;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping(value = "/v1/user-management/")
public class UserController implements ErrorController {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	UserService UserService;
	
	//Returns a list of users
	@GetMapping("/users")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
	
	//Returns a specific user
	@GetMapping("/users/{user_id}")
	public User getUser(@PathVariable("user_id") long userId){
		return userRepository.getOne(userId);
	}
	
	//Register a new user
	@PostMapping("/users")
	public void createUser(@RequestBody RegisterAccount account) {
		   userRepository.save(UserService.initialUser(account));
	}

	@RequestMapping("/error")
	public ModelAndView handleError(HttpServletResponse response) {
		ModelAndView modelAndView = new ModelAndView();

		if(response.getStatus() == HttpStatus.NOT_FOUND.value()) {
			modelAndView.setViewName("error-404");
		}
		else if(response.getStatus() == HttpStatus.FORBIDDEN.value()) {
			modelAndView.setViewName("error-403");
		}
		else if(response.getStatus() == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
			modelAndView.setViewName("error-500");
		}
		else {
			modelAndView.setViewName("error");
		}

		return modelAndView;
	}

	@Override
	public String getErrorPath() {
		return "/error";
	}
}

