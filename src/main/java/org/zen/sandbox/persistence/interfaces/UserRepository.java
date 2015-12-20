package org.zen.sandbox.persistence.interfaces;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;
import org.zen.sandbox.persistence.entity.User;

public interface UserRepository extends Repository<User, Long>{
	
	Page<User> findAll(Pageable pageable);
	
	void save(User user);
	
	Page<User> findByNomEqualsAllIgnoringCase(String nom, Pageable pageable);
}
