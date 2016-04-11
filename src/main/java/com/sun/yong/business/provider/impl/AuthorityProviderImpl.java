package com.sun.yong.business.provider.impl;

import com.sun.yong.business.provider.IAuthorityProvider;
import com.sun.yong.common.entity.common.LogIndex;
import com.sun.yong.common.entity.request.LoginRequest;
import com.sun.yong.common.entity.response.LoginResponse;
import com.sun.yong.dataservice.IDataService;

public class AuthorityProviderImpl implements IAuthorityProvider {

	private IDataService dataServiceimpl;
	@Override
	public LoginResponse login(LoginRequest loginRequest, LogIndex logInfo) {

		try {
			dataServiceimpl.getUserInfo();
		} catch (Exception e) {
			
		}
		return null;
	}

}
