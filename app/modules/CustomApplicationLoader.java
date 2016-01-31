package modules;

import play.inject.guice.GuiceApplicationBuilder;
import play.inject.guice.GuiceApplicationLoader;

public class CustomApplicationLoader extends GuiceApplicationLoader {
	
	@Override
	public GuiceApplicationBuilder builder(Context arg0) {
		System.out.println("=====================加载器已经执行！！");
		return super.builder(arg0);
	}

}
