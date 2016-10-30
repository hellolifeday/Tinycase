package cn.itcast.cglib;

public class APP {

	public static void main(String[] args) {
		Class clazz = Driver.class;
		Driver driver = new CglibProxy().getDriver(clazz);
		driver.say();
	}
}
