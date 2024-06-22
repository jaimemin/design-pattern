package com.tistory.jaimemin.designpattern.structural_patterns.adapter.after;

import com.tistory.jaimemin.designpattern.structural_patterns.adapter.after.security.LoginHandler;
import com.tistory.jaimemin.designpattern.structural_patterns.adapter.after.security.UserDetailsService;

public class App {

	public static void main(String[] args) {
		AccountService accountService = new AccountService();
		UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);

		LoginHandler loginHandler = new LoginHandler(userDetailsService);
		String login = loginHandler.login("root", "root");
		System.out.println(login);
	}
}
