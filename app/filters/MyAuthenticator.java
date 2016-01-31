package filters;



import javax.inject.Inject;

import play.mvc.Http.Context;
import play.mvc.Result;
import play.mvc.Security.Authenticator;
import services.LoginService;
/**
 * 备注：此类执行登录验证
 * @author yzj
 * @2016年1月22日
 */
public class MyAuthenticator extends Authenticator {
	
	@Inject
	private LoginService loginService;
	
	@Override
	public String getUsername(Context context) {
		
		loginService.getUserName();
		return super.getUsername(context);
	}
	
	@Override
	public Result onUnauthorized(Context arg0) {
		System.out.println("===================无法获得用户名和密码");
		return super.onUnauthorized(arg0);
	}

}
