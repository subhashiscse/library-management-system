package com.mn.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mn.model.LoadUserDtls;
import com.mn.repository.UsersRepository;
@Service
public class UserDtlsServiceImpl implements UserDetailsService {
	@Autowired
	UsersRepository usersRepository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		 return usersRepository.findByUserName("manu")
	                .map(LoadUserDtls::new)
	                .orElseThrow(() -> new UsernameNotFoundException("User not found: " + username));
	}

}
