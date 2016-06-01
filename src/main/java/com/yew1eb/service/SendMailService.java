package com.yew1eb.service;

public interface SendMailService {

	void signup(String username, String email, final String code);

	void forgot(String login_name, String email, String code);
	
}
