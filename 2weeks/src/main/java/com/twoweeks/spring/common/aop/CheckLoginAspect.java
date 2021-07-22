package com.twoweeks.spring.common.aop;

import javax.servlet.http.HttpSession;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import lombok.extern.slf4j.Slf4j;

@Component
@Aspect
@Slf4j
public class CheckLoginAspect {
	
//	@Before("execution(* com.twoweeks.spring.admin..*Dao*.*Insert(..))")
//	public void checkLogin(JoinPoint jp) {
//		log.debug("===== 로그인 체크 =====");
//		HttpSession session=(HttpSession)RequestContextHolder.currentRequestAttributes().resolveReference(RequestAttributes.REFERENCE_SESSION); 
//		Member loginMember=(Member)session.getAttribute("loginMember");
//		if(!loginMember.getUserId().equals("admin")) {
//			try { 
//				throw new Exception("입력권한이 없습니다.");
//			}catch(Exception e) {
//				throw new RuntimeException(e.getMessage());
//			}
//		}
//	}
}
