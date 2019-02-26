package com.hxzy.mapper;

public interface CommonMapper<T> {
	int add(T t);
	int update(T t);
	int deleteById(Object id);
	T queryOne(Object id);
}
