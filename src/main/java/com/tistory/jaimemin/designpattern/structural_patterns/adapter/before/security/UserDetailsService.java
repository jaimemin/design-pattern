package com.tistory.jaimemin.designpattern.structural_patterns.adapter.before.security;

public interface UserDetailsService {

	UserDetails loadUser(String username);

}
