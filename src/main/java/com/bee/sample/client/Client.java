package com.bee.sample.client;

import com.bee.sample.service.UserClientService;
import com.bee.sample.service.impl.UserClientServiceImpl;
import com.bee.sample.util.BeanFactory;

/**
 * 
 * 解耦策略1：使用工厂类来解耦
 * 下一个问题：如何解耦工厂类和服务类、Dao类
 * @author hhluci
 *
 */
public class Client {

	public static void main(String[] args) {
		//UserClientService userClientService = new UserClientServiceImpl();

		UserClientService userClientService = BeanFactory.getUserClientService();
		userClientService.saveCustom();
	}

}
