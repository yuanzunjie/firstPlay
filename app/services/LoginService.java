package services;

import com.google.inject.Inject;

import Interfaces.I_LoginService;
import mapper.CustomMapper;
import play.mvc.Http.Context;
public class LoginService implements I_LoginService {
	
	@Inject
	private CustomMapper customMapper;
	
	public String getUserName(){	
		System.out.println("================="+customMapper.getAll());
		return Context.current().session().get("user");
		
	}

}
