package controllers;


import com.google.inject.Inject;

import filters.MyAuthenticator;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security.Authenticated;
import services.TestService;

public class Application extends Controller {
	
	@Inject
	private TestService testService;
	

	@Authenticated(MyAuthenticator.class)
    public Result index() {
  // = Init.getInjector().getInstance(CustomMapper.class);
    	
    	//testService.testDao();
		//testService.testDao();
    	
       return ok("===============测试成功！");
    }

}
