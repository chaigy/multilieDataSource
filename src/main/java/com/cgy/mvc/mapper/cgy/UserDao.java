package com.cgy.mvc.mapper.cgy;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface UserDao {
	
	@Insert("insert into user values(floor(rand()*10000),#{name},#{pwd})")
	public int insert(String name,String pwd);
	
	@Select("select * from user ")
	public List<Map<String,Object>> getUser();
}
