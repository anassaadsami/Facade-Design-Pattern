package fasadeIntro;

class Pizza implements Food{
	String preparedItem;
	@Override
	public void prepareFood(String itemRequired) {
		preparedItem = "this crust pizza with ingrdients "+ itemRequired ;
		
	}

	@Override
	public String deliveryFood() {
		return preparedItem;
	}

}
