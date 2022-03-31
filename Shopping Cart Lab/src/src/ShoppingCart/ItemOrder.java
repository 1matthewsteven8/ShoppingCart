package src.ShoppingCart;

public class ItemOrder {
	   private Item item;
	   private int quantity;

	   //order
	   public ItemOrder(Item item, int quantity) {
	       this.item = item;
	       this.quantity = quantity;
	   }
	   

	//price
	   public double getPrice() {
	       return item.priceFor(quantity);
	   }
	   
	   //item
	   public Item getItem() {
	       return item;
	   }

}
	   
