package com.hxzy.mapper;

import java.util.List;

import com.hxzy.entity.Orders;

public interface OrdersMapper extends CommonMapper<Orders> {
	/**
	 * 查询所有订单信息
	 * @return
	 */
	public List<Orders> queryAll();
	public List<Orders> queryAllLazy();
}
