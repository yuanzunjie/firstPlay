package modules;

import java.util.Properties;

import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.mybatis.guice.MyBatisModule;
import org.mybatis.guice.datasource.dbcp.BasicDataSourceProvider;

import com.google.inject.name.Names;

/**
 * 备注：此为mybatis模块，请勿修改！
 * @author yzj
 * @2016年1月22日
 */
public class MybatisModule extends MyBatisModule{

	@Override
	protected void initialize() {
		bindDataSourceProviderType(BasicDataSourceProvider.class);
		bindTransactionFactoryType(JdbcTransactionFactory.class);
		Names.bindProperties(binder(), createDbProperties());
		System.out.println("=====================已加载了mybatis模块");
		addMapperClasses("mapper");
		
	}
	
	//硬编码，数据库配置
		public static Properties createDbProperties(){
			
			final Properties p = new Properties();
			p.setProperty("mybatis.environment.id", "yzj");
			p.setProperty("JDBC.driver", "com.mysql.jdbc.Driver");
			p.setProperty("JDBC.url", "jdbc:mysql://192.168.1.186:3306/wyjf");
			p.setProperty("JDBC.username", "root");
			p.setProperty("JDBC.password", "root");
			return p;
		}

}
