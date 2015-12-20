package org.zen.sandbox.services.interfaces;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.zen.sandbox.persistence.entity.User;

public interface UserService {

	public Page<User> findAllUser();
	
	public void save(User user);
	
	public Page<User> findByNom(String nom, Pageable pageable);
	
}
