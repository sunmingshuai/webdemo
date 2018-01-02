package com.github.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;

/**
 *  spring只实现了xml式编程 注解式的aop实现需要依赖aspectjrt aspectjweaver这两个jar包
 * Created by sunms on 6/7/17.
 */
//@Component
//@Aspect
public class LogTipAspect2 {

	@Around("@annotation(com.github.annotation.LogTip)")
	public void aroundEntry2(ProceedingJoinPoint pjp){
		System.out.print("before aroundEntry2");
		try {
			pjp.proceed();
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
		System.out.print("before aroundEntry2");
	}

	@Before("@annotation(com.github.annotation.LogTip)")
	public void beforeEntry2(){
		System.out.print("beforeEntry2");
	}

	@After("@annotation(com.github.annotation.LogTip)")
	public void afterEntry2(){
		System.out.print("afterEntry2");
	}

	@AfterThrowing("@annotation(com.github.annotation.LogTip)")
	public void afterThrowing(){
		System.out.print("afterEntry2");
	}

	@AfterReturning("@annotation(com.github.annotation.LogTip)")
	public void afterReturning(){
		System.out.print("afterReturning2");
	}

}
