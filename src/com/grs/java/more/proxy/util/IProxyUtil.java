package com.grs.java.more.proxy.util;

import java.lang.reflect.Method;

/**
 * 类说明:
 * 
 * @author 作者:gaoruishan
 * @email 邮箱:grs0515@163.com
 * @time 创建时间：2018年5月4日 下午12:44:42
 */
public class IProxyUtil {
	/**
	 * 中间处理
	 * 
	 * @param args
	 * @return
	 */
	public static Object[] dealSomething(Method method, Object[] args) {
		if ("doMoney".equals(method.getName())) {
			if (args != null && args.length > 0) {
				doMoney(args);
			}
		}

		return args;
	}

	/**
	 * 处理钱财方法
	 * 
	 * @param args
	 */
	private static void doMoney(Object[] args) {
		if (args.length == 1 && args[0] instanceof Double) {
			args[0] = (double) args[0] - 10;
		}
	}

}
