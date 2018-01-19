package com.github.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.annotation.LogTip;
import com.github.domain.User;
import com.github.mapper.UserMapper;
import com.github.service.BlogService;
import com.github.service.impl.BlogServiceImpl;

/**
 * Created by sunms on 2017/4/26.
 */
//@Service
//@RequestMapping("blog")
public class BlogController {

	@Value("${name}")
	private String name;

//	@Autowired
//	private BlogService blogService;

	@Autowired
	private HttpServletRequest request;

	@Resource
	private UserMapper userMapper;

	private BlogServiceImpl blogServiceImpl;

	@Resource
	private BlogService blogService;

	@RequestMapping("helloBlog")
	public String helloBlog(HttpServletRequest request,HttpServletResponse response) {
		System.out.println(name);
		//不写注解也是可以的 default-autowire="byName"的作用
		blogServiceImpl.tip(request, response);
		// 子容器拿父容器的bean
//		TestService testService = SpringContextsUtil.getBean(TestService.class);
		return "blog";
	}

	//被LogTip处理
	@RequestMapping("helloWorld")
	@LogTip
	public String helloWorld(HttpServletRequest request, HttpServletResponse response){
		User user = userMapper.selectUserById(1);
		request.setAttribute("user",user);
		return "blog";
	}

//	public BlogService getBlogService() {
//		return blogService;
//	}
//
//	public void setBlogService(BlogService blogService) {
//		this.blogService = blogService;
//	}


	public BlogServiceImpl getBlogServiceImpl() {
		return blogServiceImpl;
	}

	public void setBlogServiceImpl(BlogServiceImpl blogServiceImpl) {
		this.blogServiceImpl = blogServiceImpl;
	}

	public BlogService getBlogService() {
		return blogService;
	}

	public void setBlogService(BlogService blogService) {
		this.blogService = blogService;
	}

	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}
}
