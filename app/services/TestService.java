package services;

import com.google.inject.Inject;

import mapper.CustomMapper;


public class TestService {
	
	@Inject
	private CustomMapper customMapper;

	public void testDao(){
		
		System.out.println("list========================="+customMapper.getAll().size());
		System.out.println("==============================测试成功！！");
		
	}

}
