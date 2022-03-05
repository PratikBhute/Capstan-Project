package com.example.Spring.security.Security;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>  {
 @Query(" select u from Admin u where u.username=?1")
  Admin findByUsername(String username);
	
}
