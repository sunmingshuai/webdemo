package com.github.service.impl;


import com.github.annotation.LogTip;
import com.github.service.BlogService;

import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by sunms on 5/24/17.
 */
@Service
public class BlogServiceImpl implements BlogService {
	

	@LogTip
	public void tip(HttpServletRequest request, HttpServletResponse response) {
	
	}
}
