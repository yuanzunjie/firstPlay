package core;

import java.util.Properties;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionManager;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.mybatis.guice.MyBatisModule;
import org.mybatis.guice.datasource.dbcp.BasicDataSourceProvider;
import org.mybatis.guice.datasource.helper.JdbcHelper;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.PrivateModule;
import com.google.inject.name.Names;


/**
 * 备注：此类执行动态加载配置，目前不起总用
 * @author yzj
 * @2016年1月21日
 */
public class Init {
	
	//private static Injector injector = null;
	
	/**
	 * 此处集成其他插件，请勿擅自修改
	 */
	
	static {
	/*	
		injector = Guice.createInjector(
				
				
				new MyBatisModule(){
					@Override
					protected void initialize() {
						environmentId("yzj");
						bindDataSourceProviderType(BasicDataSourceProvider.class);
						bindTransactionFactoryType(JdbcTransactionFactory.class);
						Names.bindProperties(binder(), createDbProperties());
						//install(JdbcHelper.MySQL);
						
						addMapperClasses("mapper");
					}
				}
				
				
				
				
				
				
				new PrivateModule(){ //此处加载mybatis的配置文件，guice和Mybatis集成，请看mybatis配置文件
					@Override
					protected void configure() {
						install(new XMLMyBatisModule(){
							@Override
							protected void initialize() {
								//setEnvironmentId("firstPlay");
								//setClassPathResource("conf/Mybatis-conf.xml");
								bindDataSourceProviderType(BasicDataSourceProvider.class);
								install(JdbcHelper.MySQL);
							}
						});
					}
				},
				new PrivateModule(){
					@Override
					protected void configure() {
						install(new MyBatisModule(){
							@Override
							protected void initialize() {
								environmentId("yzj");
								bindDataSourceProviderType(BasicDataSourceProvider.class);
								bindTransactionFactoryType(JdbcTransactionFactory.class);
								Names.bindProperties(binder(), createDbProperties());
								//install(JdbcHelper.MySQL);
								//addSimpleAliases("model");
								addMapperClasses("mapper");
							}
						});
					}
				}
				
				
				
				new PrivateModule(){ //此处加载通用mapper
					@Override
					protected void configure() {
						install(new MyBatisModule(){
							@Override
							protected void initialize() {
								//MapperHelper mapperHelper = new MapperHelper();
								//Config config = new Config();
								//mapperHelper.setConfig(config);
								//mapperHelper.registerMapper(Mapper.class);
								//addMapperClass(Mapper.class);
								
							}
						});
					}
				}	
		);
	*/
	}
	
/*	//硬编码配置
	public static Properties createDbProperties(){
		
		final Properties p = new Properties();
		p.setProperty("mybatis.environment.id", "yzj");
		p.setProperty("JDBC.driver", "com.mysql.jdbc.Driver");
		p.setProperty("JDBC.url", "jdbc:mysql://192.168.1.186:3306/wyjf");
		p.setProperty("JDBC.username", "root");
		p.setProperty("JDBC.password", "root");
		return p;
	}
	
	
	
	public static Injector getInjector(){
		return injector;
	}*/
}
