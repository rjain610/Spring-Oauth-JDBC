package com.rahul.oauth.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	 @Autowired
	 AuthenticationManager authenticationManager;
	 @Autowired
	 UserDetailsService customUserDetailsService;
	 
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .antMatcher("/**")
                .authorizeRequests()
                .antMatchers("/", "/login**")
                .permitAll()
                .anyRequest()
                .authenticated();
    }
    @Autowired      // here is configuration related to spring boot basic authentication
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
      /*  auth.inMemoryAuthentication()                                               // static users
        .withUser("zone1").password("mypassword").roles("USER")
        .and()
        .withUser("zone2").password("mypassword").roles("USER")
        .and()
        .withUser("zone3").password("mypassword").roles("USER")
        .and()
        .withUser("zone4").password("mypassword").roles("USER")
        .and()
        .withUser("zone5").password("mypassword").roles("USER");*/
		
	auth.parentAuthenticationManager(authenticationManager)
        .userDetailsService(customUserDetailsService);
    }
    
    
}
