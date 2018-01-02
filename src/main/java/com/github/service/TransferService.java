package com.github.service;

/**
 * @author sunmingshuai1024@gmail.com
 */
public interface TransferService {

	/**
	 * 转账接口
	 */
	boolean transfer(String in, String out, float amount);
}
