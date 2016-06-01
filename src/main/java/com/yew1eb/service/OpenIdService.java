package com.yew1eb.service;


import com.yew1eb.model.OpenId;

public interface OpenIdService {
	
	OpenId getOpenid(String type, Long open_id);
	
	boolean save(String type, Long open_id, Long uid);
	
	boolean delete(String type, Long uid);
		
}
