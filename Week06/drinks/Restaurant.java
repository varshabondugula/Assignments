package com.RestaurantDrinks.drinks;

public class Restaurant {

	HotDrinks hotdrinks;
	
	Restaurant(HotDrinks hotdrinks){
		
		this.hotdrinks=hotdrinks;
	}


	public void prepareHotDrink() {
		hotdrinks.prepareHotDrink();
	}

}
  