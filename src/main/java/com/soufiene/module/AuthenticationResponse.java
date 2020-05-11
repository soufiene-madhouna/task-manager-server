package com.soufiene.module;

public class AuthenticationResponse {

	private final String jwt;

	/**
	 * @return the jwt
	 */
	public String getJwt() {
		return jwt;
	}

	public AuthenticationResponse(String jwt) {
		this.jwt = jwt;
	}
	
	
}
