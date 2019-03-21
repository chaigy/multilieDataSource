/*package com.cgy.mvc.aop;

import java.util.List;

import org.apache.commons.lang3.ArrayUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Aspect
@Component
@SuppressWarnings("all")
public class PageAop {
	
	
	@Pointcut("execution(* com.cgy.mvc.server..*.get*(..))")
	public void page() {
	}
	
	@Around(value="page()")
	public PageInfo<Object> around(ProceedingJoinPoint point) throws Throwable {
		
		
		Object[] args = point.getArgs();
		MethodSignature signature = (MethodSignature)point.getSignature();
		String[] params = signature.getParameterNames();
		
		Integer page =0;
		Integer pageSize=0;
		
		int pageIndex = ArrayUtils.indexOf(params, "page");
		
		int pageSizeIndex = ArrayUtils.indexOf(params, "pageSize");
		
		if(pageIndex>0 || pageSizeIndex>0) {
			
			page = (Integer) args[pageIndex];
			
			pageSize = (Integer) args[pageSizeIndex];
			
			PageHelper.startPage(page, pageSize);
		}
		
		List<Object> obj = (List<Object>) point.proceed(args);
		
		PageInfo<Object> info = new PageInfo<Object>(obj);
		
		
		return info;
		
	}
	
}
*/