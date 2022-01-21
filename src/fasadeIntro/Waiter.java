package fasadeIntro;
 class Waiter {
	 /*
	  * this class is facade interface for all other classes cause now when a customer 
	  * want to order a food just contact with Waiter class not with all other classes 
	  * so customer avoid contact with the complexity between classes 
	  */
	static String deliverFood(FoodType foodtype) {
		Ingredient topp = new Ingredient();
		
		switch(foodtype) {
		case PASTA :
			Food pasta = new Pasta();   // polymorphism
			String pastaItem = topp.getPastaItem();
			pasta.prepareFood(pastaItem);
			return(pasta.deliveryFood());
			
		case PIZZA :
			Food pizza = new Pizza();   // polymorphism
			String pizzaItem = topp.getPizzaItem();
			pizza.prepareFood(pizzaItem);
			return(pizza.deliveryFood());
		}
		return null;
	}

}
