package org.example.simpleSpringMvcApp.service;

import org.example.simpleSpringMvcApp.dao.UserRepository;
import org.example.simpleSpringMvcApp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public List<User> getAll() {
		return userRepository.findAll();
	}
	
	@Override
	public User get(int id) {
		return userRepository.getOne(id);
	}
	
	@Override
	public void remove(int id) {
		userRepository.deleteById(id);
	}
	
	@Override
	public User save(User user) {
		return userRepository.saveAndFlush(user);
	}
	
	@Override
	public User update(User user) {
		return userRepository.saveAndFlush(user);
	}
}
