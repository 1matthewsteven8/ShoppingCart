package src.ShoppingCart;

import java.util.ArrayList;

public class Catalog {

	String catalog_name;
	ArrayList<Item> list;
		public Catalog(String gift_Catalog1156) {

		list = new ArrayList<Item>();
		catalog_name = gift_Catalog1156;
		}
		
		String getName() {
			return catalog_name;
				}
			int size() {
			return list.size();
				}
			
		Item get(int i) {
			return list.get(i);
				}
			void add(Item item) {
				list.add(item);
				}
}