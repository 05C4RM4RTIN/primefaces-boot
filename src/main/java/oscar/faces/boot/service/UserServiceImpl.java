package oscar.faces.boot.service;

import org.springframework.stereotype.Service;

import oscar.faces.boot.model.User;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Override
	public void saveUser(User user) {
		System.out.println(user.getName());
		
	}

}