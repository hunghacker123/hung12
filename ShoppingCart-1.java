package lesson10;

	import java.util.ArrayList;
	/**
	 * Name: Hung Duc Tran	
	 * Date: 04 July 2018
	 * Course: CS211
	 * Assignment: #10
	 * shopping cart;
	 * problem for me is when I put quantity as number the total prices do not work.
	 */
	public class ShoppingCart extends ArrayList<NumSelected> {
		// build field
		private double totalPrice;
		private boolean discount;
		private ArrayList<NumSelected> list = new ArrayList<NumSelected>();
		// constructor of shopping cart 
		public ShoppingCart() {
			super();
		}
		// set discount with total price = total price * 0.9 if box is selected.
			public void SetDiscount (boolean selected) {
				if ( selected) {
					totalPrice = totalPrice *0.9;
					discount = true;
				}
				else {
					totalPrice = totalPrice * 0.9;
					discount = false;
				}
			}
			// return total 
			public double getTotal () {
				totalPrice = 0;
				// using for loop to let value run to get total price
				for ( int i = 0; i < list.size()-1; i++) {
					NumSelected str = list.get(i);
				totalPrice += str.getPrice();
					
				}
				return totalPrice;
			}
			// using boolean to add items if true.
			public boolean add ( NumSelected item) {
				super.add( item );
				for (int i = 0; i < list.size()-1; i++) {
					NumSelected str = list.get(i);
					if ( list.get (i).equals ( item.getSku())){
						list.set(i, item);
					}
				}
				return true;
			}
			
}
