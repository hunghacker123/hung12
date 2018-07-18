package lesson10;
/**
* Name: Hung Duc Tran	
* Date: 04 July 2018
* Course: CS211
* Assignment: #10
* shopping cart;
*/
public class Sku {
// field
	private String name;
private double price;
private int quantity;
private int BulkQuantity;
private double BulkPrice;
private int n;
private double total;
private int NumberUnique;
// constructor sku with string name and double price.
public Sku(String name, double price) {
	this.name = name;
	this.price = price;
	if ( price < 0) {
		throw new IllegalArgumentException ( " quantity can not be negative.");
	}
	
}
// settup mutator of sku
public Sku( String name, double price, double BulkPrice, double d) {
	this.name = name;
	this.price = price;
	this.BulkPrice = BulkPrice;
	this.BulkQuantity = (int) d;
			if ( d < 0 && price < 0 && d < 0) {
				throw new IllegalArgumentException ( " quantity can not be negative.");
			}
}
// using double for pricefor
public double priceFor ( int quantity) {
	// if bulkquantity = 0 total is normal price
if ( BulkQuantity == 0 ) {
		return total = price * quantity;
	}
// if quantity 10 or bulk quantity == 1 so total - this total/2
	else if (quantity == 10 || BulkQuantity == 1) {
		return BulkPrice = this.total - (this.total/2);
	}
// if quantity = 10 * n and bulk quantity > 1 so +0.99 + bulk price
	else if ( quantity == 10 * n || BulkQuantity > 1) {
		return BulkPrice = (this.total - (this.total /2)) + 0.99;
	}
	else {
		throw new IllegalArgumentException("quanlity can not be negative");}
	}
// return string
public String toString(){
	if ( quantity < 10) {
		return this.name + "," + this.price;
	}
	else {
		return this.name + "," + this.price + "(" + this.BulkQuantity + " for $" + this.BulkPrice + ")";
	}
}
// return name = name;
public boolean equals(Sku other){
	 return (other.name).equals(this.name);	
}
// return unique id of sku
public int getSku() {
	return this.NumberUnique;
}
}


