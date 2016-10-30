package cn.itcast.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class JDKProxy implements InvocationHandler{

	private Driver driver;
	
	public Driver getDriver(Driver driver){
		this.driver=driver;
		ClassLoader loader = driver.getClass().getClassLoader();
		Class<?>[] interfaces = driver.getClass().getInterfaces();
		InvocationHandler h = this;
		Object object = Proxy.newProxyInstance(loader, interfaces, h);
		
		return (Driver)object;
	}
	
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		//创建新的对象后会调用这里的invoke
		//增强
		System.out.println("这是JDK增强后的方法");
		method.invoke(driver, args);
		
		return null;
	}


	

}
