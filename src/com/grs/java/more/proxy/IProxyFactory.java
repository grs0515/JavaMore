package com.grs.java.more.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.grs.java.more.proxy.interf.IProxy;
import com.grs.java.more.proxy.util.IProxyUtil;

/**
 * 类说明:
 * 
 * @author 作者:gaoruishan
 * @email 邮箱:grs0515@163.com
 * @time 创建时间：2018年5月4日 上午10:42:57
 */
public class IProxyFactory {
	/**
	 * 获取IProxy动态代理
	 * 
	 * @param proxyImpl
	 * @return
	 */
	public static IProxy getProxyService(IProxy proxyImpl) {
		return (IProxy) Proxy.newProxyInstance(proxyImpl.getClass().getClassLoader(),
				proxyImpl.getClass().getInterfaces(), new InvocationHandler() {

					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("方法执行前");
						Object object = null;
						try {
							// 处理特殊
							args = IProxyUtil.dealSomething(method, args);
							object = method.invoke(proxyImpl, args);
						} catch (Exception e) {
							System.out.println("发生异常:" + e.getCause());
						}
						System.out.println("方法执行后");
						return object;
					}
				});
	}

	/**
	 * 获取指定的动态代理
	 * 
	 * @param <T>
	 * 
	 * @param proxyImpl
	 * @return
	 */
	public static <T> T getProxyService(IProxy proxyImpl, Class<T> t) {
		@SuppressWarnings("unchecked")
		T newProxyInstance = (T) Proxy.newProxyInstance(proxyImpl.getClass().getClassLoader(),
				proxyImpl.getClass().getInterfaces(), new InvocationHandler() {
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("方法执行前");
						Object object = null;
						try {
							// 处理特殊
							args = IProxyUtil.dealSomething(method, args);
							object = method.invoke(proxyImpl, args);
						} catch (Exception e) {
							System.out.println("发生异常:" + e.getCause());
						}
						System.out.println("方法执行后");
						return object;
					}
				});
		return newProxyInstance;
	}

}
