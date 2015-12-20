package org.zen.sandbox.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.zen.sandbox.persistence.entity.User;
import org.zen.sandbox.persistence.interfaces.UserRepository;
import org.zen.sandbox.services.interfaces.UserService;

@Component("userService")
@Transactional
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;
	
	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
		
		this.createUsers();
	}
	
	public Page<User> findAllUser()
	{
		return userRepository.findAll(null);
	}
	
	public Page<User> findByNom(String nom, Pageable pageable)
	{
		return userRepository.findByNomEqualsAllIgnoringCase(nom, pageable);
	}
	
	public void save(User user)
	{
		userRepository.save(user);
	}
	
	private void createUsers()
	{
		save(new User("Ozen","Chris","3 rue du zen","Janville"));
		save(new User("OZen","Chris","3 rue du zen","Janville"));
		save(new User("Ozen1","Chris1","4 rue du zen","Janville1"));
		save(new User("Ozen2","Chris2","5 rue du zen","Janville2"));
		save(new User("Ozen3","Chris3","6 rue du zen","Janville3"));
	}
	
}
