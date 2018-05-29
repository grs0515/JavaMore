package com.grs.java.more.proxy;

import com.grs.java.more.proxy.impl.ProxyImpl;
import com.grs.java.more.proxy.impl.ProxyImpl2;
import com.grs.java.more.proxy.interf.IMyProxy;
import com.grs.java.more.proxy.interf.IProxy;

/**
 * 类说明:
 * 
 * @author 作者:gaoruishan
 * @email 邮箱:grs0515@163.com
 * @time 创建时间：2018年5月4日 上午10:52:33
 */
public class ProxyTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
		IProxy proxyImpl = new ProxyImpl();
		// IProxy proxyImpl = new ProxyImpl2();
		IProxy proxy = IProxyFactory.getProxyService(proxyImpl);
		// proxy.doSomething();
		proxy.doMoney(10);

		// IMyProxy impl = IProxyFactory.getProxyService2(new ProxyImpl2());
		// impl.doMyself();

		IMyProxy proxyService3 = IProxyFactory.getProxyService(new ProxyImpl2(), IMyProxy.class);
		proxyService3.doMyself();

		IProxy proxyService32 = IProxyFactory.getProxyService(proxyImpl, IProxy.class);

		IProxy proxyService33 = IProxyFactory.getProxyService(new ProxyImpl2(), IProxy.class);
	}
}
