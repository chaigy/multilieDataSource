package com.cgy.mvc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
//@EnableAspectJAutoProxy(proxyTargetClass=true)
public class SpringItBootApplication implements ApplicationRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringItBootApplication.class, args);
	}
//	
//	@Autowired
//	private AsynService s1;
//		
//	@Autowired
//	private AsynService2 s2;
	
	@Value("${name}")
	private String name;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("name:"+name);
		
		/*s1.say();
		s2.say();*/
	}

}
