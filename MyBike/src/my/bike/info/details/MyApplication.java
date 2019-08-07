package my.bike.info.details;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplication {

	public static void main(String[] args) {
		// create the container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Detalis detalis = context.getBean("b350", Detalis.class);
		
		System.out.println("Bike Name: " + detalis.getBikeName() + "\n" + "Bike price: " + detalis.getPrice() + "\n"
				+ "Bike Feedback: " + detalis.getFeedBack());

		Detalis detalis2 = context.getBean("b500", Detalis.class);
		
		System.out.println("Bike Name: " + detalis2.getBikeName() + "\n" + "Bike price: " + detalis2.getPrice() + "\n"
				+ "Bike Feedback: " + detalis2.getFeedBack());

		context.close();

	}

}
