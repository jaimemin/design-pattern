package com.tistory.jaimemin.designpattern.structural_patterns.adapter.after.security;

/**
 * Security에서 제공하는 Target Interface
 */
public interface UserDetailsService {

	UserDetails loadUser(String username);

}
