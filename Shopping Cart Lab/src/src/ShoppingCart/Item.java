/*Project 1: Shopping Cart
 * Classes: Item, Catalog, ItemOrder, ShoppingCart
 * Author: Matthew Lardi
 * Due: Thursday, September 30, 2021
 * You are to write a set of supporting classes for a shopping program.  We are 
 * providing GUI code that will provide the “front end” to the program.  You are 
 * to write the back end.
 */

package src.ShoppingCart;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Item {

	private String name;
	private double price;
	private int bulkQuantity;
	private double bulkPrice;
	
	//Item method
	 public Item(String name, double price) {
	       if (price < 0) {
	           throw new IllegalArgumentException();
	           }
	       this.name = name;
	       this.price = price;
	   }
	 
	//name, price, bulk Quantity, bulk Price
	  public Item(String name, double price, int bulkQuantity, double bulkPrice) {
	       this.name = name;
	       this.price = price;
	       this.bulkQuantity = bulkQuantity;
	       this.bulkPrice = bulkPrice;
	
	  }
	  
	  //quantity
	   public double priceFor(int quantity) {
	       double actual = 0;
	       if (quantity < 0) {
	           throw new IllegalArgumentException();
	       } else {
	           if (bulkQuantity!=0) {
	               actual = (quantity / bulkQuantity) * bulkPrice
	                       + (quantity % bulkQuantity) * price;
	           } else {
	               actual = quantity * price;
	           }
	       }

	       return actual;

	   }

	   public boolean equals(Item ietm) {
	       if(this.name.equals(ietm.name)){
	           return true;
	       }
	       return false;
	   }

	   public String toString() {
	       NumberFormat format = (NumberFormat) NumberFormat.getCurrencyInstance();

	       format.setMinimumFractionDigits(2);
	       format.setMaximumFractionDigits(2);
	       String str = "";
	       str = name + ", " + format.format(price);
	       if (bulkPrice != 0) {
	           str += " ( " + bulkQuantity + " for " + format.format(bulkPrice)
	                   + " )";
	       }
	       return str;
	   }
}

