package com.mn.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

import com.mn.serviceImpl.UserDtlsServiceImpl;

@Configuration
@EnableWebSecurity
public class LibraryManagementSecurityConfig  {
		@Autowired
	    private UserDtlsServiceImpl userDtlsServiceImpl;
	 
	@Bean
	  public SecurityFilterChain publicSecurityFilterChain(HttpSecurity http) throws Exception {
		  return http.csrf(c->c.disable())
				  .authorizeHttpRequests(a->a.anyRequest()
						  					 .authenticated()).userDetailsService(userDtlsServiceImpl)
	                .httpBasic(Customizer.withDefaults())
	                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
	                .and()
	                .build();
    }

}
