package com.cgy.mvc.controller.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author chaigy
 *					
 * @date   2019年3月18日
 * @project spring-it-boot
 */
@Component
@Slf4j
public class AsynService {
	
	@Async
	public void say() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				log.error(AsynService.class.getName(), e);
			}
			System.out.println("say:"+i);
		}
	}
}
