package com.cgy.mvc.server;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cgy.mvc.mapper.cgy.UserDao;
import com.cgy.mvc.mapper.cgy1.UserDao1;

@Service("useSrvice")
@SuppressWarnings("all")
public class UseService {
	
	@Autowired
	private UserDao useDao;
	
	@Autowired
	private UserDao1 useDao1;
	
	//@Transactional(value="cgyTransaction")
	public void insertCgy(String name,String pwd) {
		useDao.insert(name, pwd);
		//int i=1/0;
		System.out.println("cgy数据库插入.....");
	}
	
	//@Transactional(value="cgy1TransactionManager")
	public void insertCgy1(String name,String pwd) {
		useDao1.insert(name, pwd);
		int i=1/0;
		System.out.println("cgy1数据库插入.....");
	}
	
	//@Transactional(value="cgy1TransactionManager")
	@Transactional
	public void insert(String name,String pwd) {
		useDao.insert(name, pwd);
		//int i=1/0;
		useDao1.insert(name, pwd);
		System.out.println("插入两个数据库");
	}
	
	public Object getInfo(){
		
		List<Map<String,Object>> ret = useDao.getUser();
	
		return ret;
	}
}
