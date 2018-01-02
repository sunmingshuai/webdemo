package com.github;


import com.github.service.TransferService;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@ContextConfiguration("classpath:spring/*.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class TransferServiceTest {

	@Resource
	private TransferService transferService;

	@Test
	public void transfer(){
		boolean transfer = transferService.transfer("sunms", "com/github",100);
		Assert.assertTrue(transfer);
	}
}
