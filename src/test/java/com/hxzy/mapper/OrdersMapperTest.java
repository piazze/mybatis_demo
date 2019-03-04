package com.hxzy.mapper;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.hxzy.entity.Orders;

public class OrdersMapperTest {

	@Test
	public void testQueryAll() throws IOException {
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = factory.openSession();
		
		OrdersMapper mapper = session.getMapper(OrdersMapper.class);
		
		/*List<Orders> list = mapper.queryAllLazy();
		
		for (Orders o : list) {
			System.out.println(o);
		}*/
		
		Orders queryOne = mapper.queryOne(1);
		System.out.println(queryOne);
		
		session.close();
	}

}
