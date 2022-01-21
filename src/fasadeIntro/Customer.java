package fasadeIntro;

public class Customer {

	public static void main(String[] args) {
		/*
		 *  now directly with all classes 
		 */
		Ingredient topp = new Ingredient();
		Food pizza = new Pizza();   // polymorphism
		String pizzaItem = topp.getPizzaItem();
		pizza.prepareFood(pizzaItem);
		System.out.println(pizza.deliveryFood());
		
		Food pasta = new Pasta();   // polymorphism
		String pastaItem = topp.getPastaItem();
		pasta.prepareFood(pastaItem);
		System.out.println(pasta.deliveryFood());
		
		System.out.println("---- Facade ---------");
		System.out.println(Waiter.deliverFood(FoodType.PIZZA));
		System.out.println(Waiter.deliverFood(FoodType.PASTA));
	}

}
