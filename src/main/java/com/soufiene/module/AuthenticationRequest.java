package com.soufiene.module;

import lombok.Data;

@Data
public class AuthenticationRequest {

	private String username;
	private String password;
	public AuthenticationRequest() {
		super();
	}
	
	
}
