package com.rahul.oauth.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
/**
 * UserDetails is a template class provided by Spring , inorder to use our own custom class create a 
 * CustomUserDetails class and extend it by our User model 
 * @author rahul
 *
 */
public class CustomUserDetails extends Users implements UserDetails {
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomUserDetails(Users user) {
		super(user);
	
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Set<GrantedAuthority> setAuths = new HashSet<GrantedAuthority>();
		setAuths.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
		// Build user's authorities
	/*	for (Role userRole : super.getRoles()) {
			setAuths.add(new SimpleGrantedAuthority(userRole.getRole()));
		}
*/
		List<GrantedAuthority> Result = new ArrayList<GrantedAuthority>(setAuths);

		return Result;
		
	}

	@Override
	public String getPassword() {
		return null;
	}

	@Override
	public String getUsername() {
		return super.getName();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
