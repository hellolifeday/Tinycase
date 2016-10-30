package cn.itcast.cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class CglibProxy2 implements MethodInterceptor{

	public Driver createProxyDriver(){
		
		Enhancer enhancer = new Enhancer();
		
		enhancer.setSuperclass(Driver.class);
		
		enhancer.setCallback(this);
		
		Object object = enhancer.create();
		return (Driver)object;
		
		
	}

	@Override
	public Object intercept(Object object, Method method, Object[] arg2,
			MethodProxy methodProxy) throws Throwable {
		if(method.getName().equals("say")){
			System.out.println("对原来的Driver类进行加强");
			methodProxy.invokeSuper(object, arg2);
		}
		
		return null;
	}
}
