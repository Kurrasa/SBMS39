package in.ashokit;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Resturantservice bean = context.getBean(Resturantservice.class);
		bean.billpayment(34.0);
	}

}
