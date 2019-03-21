/*package com.cgy.mvc.tmpPage;

import java.util.List;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

public abstract class TmpPage {
	
	public static Object get(int page,int pageSize,TmpPage pp) {
	
		PageHelper.startPage(page, pageSize);
		Object rest = pp.getInfo();
		PageInfo<Object> obj =new PageInfo<Object>((List<Object>) rest); 
		return obj;
	}
	
	protected abstract Object getInfo();
	
}
*/