package com.github;

import com.github.domain.User;
import com.github.mapper.UserMapper;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@ContextConfiguration("classpath:spring/*.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class UserMapperTest extends TestCase {

	@Resource
	private UserMapper userMapper;

	@Test
	public void testSelectUserById() {
		User user = userMapper.selectUserById(1);
		System.out.println(user);
	}
}