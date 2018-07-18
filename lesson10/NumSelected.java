package lesson10;
/**
 * Name: Hung Duc Tran	
 * Date: 04 July 2018
 * Course: CS211
 * Assignment: #10
 * shopping cart;
 */
public class NumSelected {
	// field
	private Sku product;
	private int quantity;
	private double totalPrice;		
	// number selected of products
public NumSelected(Sku product, int quantity) {
	this.product = product;
	this.quantity = quantity;
}
// get price as double value
public double getPrice(){
	return product.priceFor(quantity);
}
// return this product
public Sku getSku(){
	return this.product;
}

}
