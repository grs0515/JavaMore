package com.grs.java.more.proxy.impl;

import com.grs.java.more.proxy.interf.IMyProxy;

/**
 * 类说明:
 * 
 * @author 作者:gaoruishan
 * @email 邮箱:grs0515@163.com
 * @time 创建时间：2018年5月4日 上午11:18:36
 */
public class ProxyImpl2 implements IMyProxy {

	@Override
	public void doSomething() throws Exception {
		System.out.println("doSomething2");

	}

	@Override
	public void doMoney(double money) throws Exception {
		System.out.println("doMoney2:" + money);
	}

	@Override
	public void doMyself() throws Exception {
		System.out.println("myself");
	}

}
