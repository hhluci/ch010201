package com.bee.sample.client;

import com.bee.sample.service.UserClientService;
import com.bee.sample.service.impl.UserClientServiceImpl;
import com.bee.sample.util.BeanFactory;

/**
 * 
 * �������1��ʹ�ù�����������
 * ��һ�����⣺��ν������ͷ����ࡢDao��
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
