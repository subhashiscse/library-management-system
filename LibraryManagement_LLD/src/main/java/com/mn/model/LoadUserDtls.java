package com.mn.model;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class LoadUserDtls implements UserDetails{

	private static final long serialVersionUID = 1L;
	
	private Users users;
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
				return users.getUserRoles().stream()
										   .map(UserRole :: getUserRoleName)
										   .map(SimpleGrantedAuthority::new)
										   .collect(Collectors.toList());
	}

	@Override
	public String getPassword() {
		return users.getPassword();
	}

	@Override
	public String getUsername() {
		return users.getUserName();
	}

	@Override
	public boolean isAccountNonExpired() {
		return !users.isStatusExpired();
	}

	@Override
	public boolean isAccountNonLocked() {
		return !users.isStatusLocked();
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return false;
	}

	

}
