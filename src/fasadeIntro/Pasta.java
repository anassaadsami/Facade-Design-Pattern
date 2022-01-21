package fasadeIntro;

public class Pasta implements Food{
	String preparedItem;
	
	@Override
	public void prepareFood(String itemRequired) {
		preparedItem = "tomato pasta with ingrdients "+ itemRequired  ;
		
	}

	@Override
	public String deliveryFood() {
		return preparedItem;
	}


}
