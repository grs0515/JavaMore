package com.grs.java.more.proxy.impl;

import com.grs.java.more.proxy.interf.IProxy;

/**
 * 类说明:
 * 
 * @author 作者:gaoruishan
 * @email 邮箱:grs0515@163.com
 * @time 创建时间：2018年5月4日 上午10:47:39
 */
public class ProxyImpl implements IProxy {

	@Override
	public void doSomething() throws Exception {
		System.out.println("doSomething");// 正常
		// System.out.println("doSomething" + 1 / 0);// 异常
	}

	@Override
	public void doMoney(double money) throws Exception {
		System.out.println("doMoney:" + money);

	}

}
