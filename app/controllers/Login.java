package controllers;

import org.apache.shiro.SecurityUtils;

import play.mvc.Controller;
import play.mvc.Result;

public class Login extends Controller{
	
	public Result index(){
		System.out.println("=======================执行了登录");
		
		if((SecurityUtils.getSubject().isRemembered()) || 
	    	      (SecurityUtils.getSubject().isAuthenticated()))
		return found("https://www.baidu.com");
		else return found("http://www.qq.com");
	}

}
