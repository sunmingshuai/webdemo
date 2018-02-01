package com.github;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.domain.User;
import com.github.mapper.UserMapper;


import junit.framework.TestCase;

@ContextConfiguration("classpath:spring/*.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class UserMapperTest extends TestCase {

	@Resource
	private UserMapper userMapper;

	@Test
	public void testSelectUserById() {
		User user = userMapper.selectUserById(1);
		user.setDesc("扎心了吖！\uD83D\uDE02感觉都是命吖！命吖！");
		System.out.println(user);
	}

	@Test
	public void updateUserTest(){
		User user = userMapper.selectUserById(1);
		user.setDesc("扎心了吖！感觉都是命吖！命吖！");
		userMapper.updateUser(user);
	}
}