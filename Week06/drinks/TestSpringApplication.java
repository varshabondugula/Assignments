package com.RestaurantDrinks.drinks;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringApplication {

	public static void main(String args[]) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("SpringBeans.xml");
		
		Restaurant restaurantObj= (Restaurant) context.getBean("restaurantBean");
		
		restaurantObj.prepareHotDrink();
		
		
	}
	
	
}
