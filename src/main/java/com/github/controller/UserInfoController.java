package com.github.controller;


import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.github.domain.User;
import com.github.mapper.UserMapper;

/**
 *  sql相关语句仅为了测试
 * @author sunms
 */
@Controller
@RequestMapping("userInfo")
public class UserInfoController {

	@Resource
	private UserMapper userMapper;


	@RequestMapping("/i/{id}")
	public ModelAndView userInfo(@PathVariable("id") Long id){
		User user = userMapper.selectUserById(id);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("user",user);
		modelAndView.setViewName("userInfoList");
		return modelAndView;
	}

	@RequestMapping("list")
	public ModelAndView userInfoList(){
		User user = userMapper.selectUserById(1L);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("user",user);
		modelAndView.setViewName("userInfoList");
		return modelAndView;
	}

	@RequestMapping("info")
	public String userInfo(HttpServletRequest request, HttpServletResponse response){
		String userName = request.getParameter("userName");
		String mobile = request.getParameter("mobile");
		User user = userMapper.selectUserByUserNameAndMobile(userName,mobile);
		request.setAttribute("user",user);
		return "userInfoList";
	}

	@RequestMapping("emojiStr")
	public void emojiTest(HttpServletRequest request,HttpServletResponse response){
		User user = userMapper.selectUserById(1L);
		user.setDesc("");
		writeGson(response,user);
	}

	protected void writeGson(HttpServletResponse response, Object obj) {
		String json = JSON.toJSONString(obj);
		response.setContentType("text/html; charset=UTF-8");
		try {
			response.getWriter().println(json);
		} catch (IOException e) {
		}
	}
}
