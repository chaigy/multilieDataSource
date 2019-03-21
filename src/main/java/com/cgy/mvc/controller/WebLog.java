package com.cgy.mvc.controller;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class WebLog {
	@Pointcut("execution(* com.cgy.mvc.controller..*.*(..))")
	public void web() {
	}
	
	@Before("web()")
	public void before(JoinPoint point) {
		System.out.println(point.getSignature().getClass());
		Object[] args = point.getArgs();
		if(args!=null && !args.equals("")) {
			
		}
		System.out.println("我是前置通知信息....");
		
		
	}
	
	@AfterReturning(returning="ret",pointcut="web()")
	public void after(JoinPoint point,Object ret) {
		
		System.out.println(point.getSignature().getClass());
		Object[] args = point.getArgs();
		if(args!=null && !args.equals("")) {
			
		}
		System.out.println("我是前置通知信息....ret"+ret);
		
	}
	
	
}

