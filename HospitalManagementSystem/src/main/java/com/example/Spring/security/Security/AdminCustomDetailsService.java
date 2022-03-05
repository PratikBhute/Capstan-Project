package com.example.Spring.security.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class AdminCustomDetailsService implements UserDetailsService {

	@Autowired 
	private AdminRepository adminRepository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Admin admin=adminRepository.findByUsername(username);
		if(admin==null)
		{
			throw new UsernameNotFoundException("user not found");
		}
		return new Admincustomdetails(admin);
	}

}
