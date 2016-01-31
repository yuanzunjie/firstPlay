
import java.lang.reflect.Method;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.DefaultSessionStorageEvaluator;
import org.apache.shiro.mgt.DefaultSubjectDAO;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.util.Factory;
import org.springframework.context.ApplicationContext;

import play.Application;
import play.GlobalSettings;
import play.api.mvc.Handler;
import play.mvc.Action;
import play.mvc.Http.Request;
import play.mvc.Http.RequestHeader;
import shiro.PlayRealm;
import shiro.PlaySecurityManager;
/**
 * 备注：此类为应用程序的全局配置，不可放到任何包下
 * @author yzj
 * @2016年1月22日
 */
public class Global extends GlobalSettings {
	
	//private Injector injector;
	
	@Override
	public void onStart(Application arg0) {
		
		System.out.println("=======================启动权限模块");

		
		//加载shiro配置
/*		Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro.ini");
		SecurityManager securityManager = factory.getInstance();
		SecurityUtils.setSecurityManager(securityManager);*/
		
		System.out.println("=======================启动权限模块已经结束");
		
		
		
/*		PlayRealm sampleRealm = new PlayRealm();
		PlaySecurityManager securityManager = new PlaySecurityManager();
		securityManager.setRealm(sampleRealm);
		DefaultSubjectDAO subjectDao = (DefaultSubjectDAO)securityManager.getSubjectDAO();
		DefaultSessionStorageEvaluator sessionStorageEvaluator =  (DefaultSessionStorageEvaluator)subjectDao.getSessionStorageEvaluator();
		sessionStorageEvaluator.setSessionStorageEnabled(false);*/
		
		super.onStart(arg0);
	}
		
	
	@Override
	public Handler onRouteRequest(RequestHeader arg0) {
		return super.onRouteRequest(arg0);
	}
	
	@Override
	public Action onRequest(Request arg0, Method arg1) {
		
		return super.onRequest(arg0, arg1);
	}
	
	

}
