package com.bee.sample.util;

import com.bee.sample.dao.UserClientDao;
import com.bee.sample.dao.impl.UserClientDaoImpl;
import com.bee.sample.service.UserClientService;
import com.bee.sample.service.impl.UserClientServiceImpl;

public class BeanFactory {

	public static UserClientService getUserClientService() {
		return new UserClientServiceImpl();
	}
	public static UserClientDao getUserClientDao() {
		return new UserClientDaoImpl();
	}
	//BeanFactory UserClientService UserClientServiceImpl
}
