package com.github;


import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.service.TransferService;

@ContextConfiguration("classpath:spring/*.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class TransferServiceTest {

	@Resource
	private TransferService transferService;

	@Test
	public void transfer(){
		boolean transfer = transferService.transfer("sunms", "sunmingshuai",100);
		Assert.assertTrue(transfer);
	}
}
