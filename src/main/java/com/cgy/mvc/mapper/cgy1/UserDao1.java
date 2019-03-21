package com.cgy.mvc.mapper.cgy1;

import org.apache.ibatis.annotations.Insert;

public interface UserDao1 {
	
	@Insert("insert into user values(floor(rand()*10000),#{name},#{pwd})")
	public int insert(String name,String pwd);
}
