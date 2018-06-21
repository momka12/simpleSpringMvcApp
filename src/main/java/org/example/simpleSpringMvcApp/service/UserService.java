package org.example.simpleSpringMvcApp.service;

import org.example.simpleSpringMvcApp.model.User;

import java.util.List;

public interface UserService {
	
	List<User> getAll();
	
	User get(int id);
	
	void remove(int id);
	
	User save(User user);
	
	User update(User user);
}
