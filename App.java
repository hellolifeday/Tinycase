package cn.itcast.proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		Driver driver  = new DriverImpl();
		 Driver driver2 = new JDKProxy().getDriver(driver);
		 driver2.say();
	}
}
