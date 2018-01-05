package com.github.service.impl;


import com.github.mapper.UserMapper;
import com.github.service.TransferService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


@Service
public class TransferServiceImpl implements TransferService {

	@Resource
	private UserMapper userMapper;


	@Transactional
	public boolean transfer(String in, String out, float amount) {

//		userMapper.updateUserBalance(UserMapper.IN,in,100f);
//		int i = 1 / 0;
//		userMapper.updateUserBalance(UserMapper.OUT,out,100f);
//		return true;

//		return moneyInAndOut(in,out,amount);
		boolean transfer = moneyInAndOut(in,out,amount);
		int i = 1/0;
		return this.moneyInAndOut(in, out, amount);

	}

	/**
	 * 1. transfer(有事务)调用moneyInAndOut(没事务) 事务起作用
	 * 2. transfer(没事务)调用moneyInAndOut(有事务) 即AOP方法内调用 事务不起作用
	 */
//	@Transactional
	public boolean moneyInAndOut(String in, String out, float amount) {
		userMapper.updateUserBalance(UserMapper.IN, in, 100f);
		int i = 1 / 0;
		userMapper.updateUserBalance(UserMapper.OUT, out, 100f);
		return true;
	}

	/**
	 * 与moneyInAndOut方法一起测试两个事务的执行
	 * @param in
	 * @param out
	 * @param amount
	 * @return
	 */
	@Transactional
	public boolean moneyTransferInAndOut(String in, String out, float amount) {
		userMapper.updateUserBalance(UserMapper.IN, in, 100f);
		int i = 1 / 0;
		userMapper.updateUserBalance(UserMapper.OUT, out, 100f);
		return true;
	}

	/**
	 * 测试方法调用
	 */
	public void moneyIn(String in, float amount) {
		userMapper.updateUserBalance(UserMapper.IN, in, 100f);
	}

	public void moneyOut(String out, float amount) {
		userMapper.updateUserBalance(UserMapper.OUT, out, 100f);
	}

}
