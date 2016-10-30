package cn.itcast.cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class CglibProxy {

	public Driver getDriver(Class clazz){
		
		Enhancer eh = new Enhancer();
		eh.setSuperclass(clazz);
		Callback callback = new MethodInterceptor() {
			
			@Override
			public Object intercept(Object obj, Method method, Object[] objs,
					MethodProxy methodProxy) throws Throwable {
				System.out.println("在这里对原始类进行加强");
				Object object = methodProxy.invokeSuper(obj, objs);
				
				return object;
			}
		};
		eh.setCallback(callback);
		Object cglibProxy = eh.create();
		return (Driver)cglibProxy;
		
	}
}
