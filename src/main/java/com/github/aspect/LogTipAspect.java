package com.github.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *  spring只实现了xml式编程 注解式的aop实现需要依赖aspectjrt aspectjweaver这两个jar包
 * Created by sunms on 6/7/17.
 */
@Component
@Aspect
public class LogTipAspect {

	@Around("@annotation(com.github.annotation.LogTip)")
	public String aroundEntry(ProceedingJoinPoint pjp){
		System.out.print("before aroundEntry");
//		try {
//			pjp.proceed();
//		} catch (Throwable throwable) {
//			throwable.printStackTrace();
//		}
//		System.out.print("before aroundEntry");
		try {
			pjp.proceed();
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
		return "spring";
	}


	@Around(value = "@annotation(com.github.annotation.LogTip) && args(request,response)")
	public String aroundEntryWithArgu(ProceedingJoinPoint pjp, HttpServletRequest request, HttpServletResponse response){
		System.out.print("before aroundEntry");
//		try {
//			pjp.proceed();
//		} catch (Throwable throwable) {
//			throwable.printStackTrace();
//		}
//		System.out.print("before aroundEntry");
		try {
			pjp.proceed();
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
		return "spring";
	}

	@Before("@annotation(com.github.annotation.LogTip)")
	public void beforeEntry(JoinPoint joinPoint){
		System.out.print("beforeEntry");
		Object[] objects = joinPoint.getArgs();
		return;
	}

	@Before(value = "@annotation(com.github.annotation.LogTip) && args(request)")
	public void beforeEntryWithArgu(HttpServletRequest request){
		System.out.print("beforeEntry");
//		Object[] objects = joinPoint.getArgs();
		return;
	}

	@After("@annotation(com.github.annotation.LogTip)")
	public void afterEntry(){
		System.out.print("afterEntry");
	}

	@AfterThrowing("@annotation(com.github.annotation.LogTip)")
	public void afterThrowing(){
		System.out.print("afterEntry");
	}

	@AfterReturning("@annotation(com.github.annotation.LogTip)")
	public void afterReturning(){
		System.out.print("afterReturning");
	}

}
