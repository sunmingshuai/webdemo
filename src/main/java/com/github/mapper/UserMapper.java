package com.github.mapper;


import org.apache.ibatis.annotations.Param;

import com.github.domain.User;

/**
 * 方法仅为了测试用
 */
public interface UserMapper {

	//转入
	int IN = 1;

	//转出
	int OUT = -1;

	/**
	 * 测试一个入参
	 */
	User selectUserById(long id);

	/**
	 * 测试多个入参
	 * 不建议map作为入参 这样无法知道传入的参数是什么 遇到问题不好排查
	 */
	User selectUserByUserNameAndMobile(@Param("userName") String userName, @Param("mobile") String mobile);

	/**
	 * 事务测试
	 *
	 * @param type 1:转入,-1:转出
	 */
	int updateUserBalance(@Param("type") int type, @Param("userName") String userName, @Param("amount") float amount);

	void updateUser(@Param("user") User user);

	/**
	 //	 *  分页查询 用pageHelper插件
	 //	 * @return
	 //	 */
//	List<User> selectListByPage(@Param("pageNum") int pageNum,@Param("pageSize") int pageSize);
}
