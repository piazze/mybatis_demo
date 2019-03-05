package com.hxzy.mapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Ignore;
import org.junit.Test;

import com.hxzy.entity.User;

public class UserMapperTest {

	@Test
	@Ignore
	public void testAdd() {
		String resource = "mybatis-config.xml";
		InputStream inputStream;
		SqlSession session = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
			session = factory.openSession();
			
			UserMapper mapper = session.getMapper(UserMapper.class);
			
			
			/*
			 *提交事务 
			 */
			session.commit();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				//释放资源
				session.close();
			}
		}
	}

}
