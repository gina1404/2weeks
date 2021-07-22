package com.twoweeks.spring.common.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class CheckLoginInterceptor extends HandlerInterceptorAdapter {
//	@Override
//	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
//			throws Exception {
//		Member m=(Member)request.getSession().getAttribute("loginMember");
//		if(m==null) {
//			request.setAttribute("msg", "로그인 후 이용 가능한 서비스입니다.");
//			request.setAttribute("loc", "/");
//			request.getRequestDispatcher("/WEB-INF/views/common/msg.jsp").forward(request, response);
//			return false;
//		}else {
//			return true;
//		}
//	}
}
