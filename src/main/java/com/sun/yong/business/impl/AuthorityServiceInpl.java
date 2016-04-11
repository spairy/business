package com.sun.yong.business.impl;

import com.sun.yong.business.IAuthorityService;
import com.sun.yong.business.provider.IAuthorityProvider;
import com.sun.yong.common.entity.common.LogIndex;
import com.sun.yong.common.entity.request.LoginRequest;
import com.sun.yong.common.entity.response.LoginResponse;

public class AuthorityServiceInpl implements IAuthorityService {

	private IAuthorityProvider authorityProviderImpl;
	
	public void setAuthorityProvider(IAuthorityProvider authorityProvider) {
		this.authorityProviderImpl = authorityProvider;
	}

	@Override
	public LoginResponse login(final LoginRequest loginRequest, final LogIndex logInfo) {
		LoginResponse loginResponse = null;

		loginResponse = authorityProviderImpl.login(loginRequest, logInfo);
		
		return loginResponse;
	}

}
