package com.hxzy.mapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.hxzy.entity.User;

public class UserMapperTest {

	@Test
	public void testAdd() {
		String resource = "mybatis-config.xml";
		InputStream inputStream;
		SqlSession session = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
			session = factory.openSession();
			
			UserMapper mapper = session.getMapper(UserMapper.class);
			
			User user = new User(0, "test", "111", new Date(), new Date(), 1, 1);
			
			int add = mapper.add(user);
			
			if (add != 0) {
				System.out.println("key:" + user.gettId());
			}
			
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
