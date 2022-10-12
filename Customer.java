import java.util.ArrayList;

import food.*;

public class Customer {

	public static void main(String[] args) {
	
		FastFoodCourt shop =new FastFoodCourt();
		
		shop.setLocation("Panaji");
	
		System.out.println(shop.getLocation());
		
		Snack s = new Snack("");
		
		ArrayList<String> order = new ArrayList() {
			{
				add("Vada Pav");
				add ("Chicken Pizza");
			}

		};
		
		shop.orderFood(order,2);
		
		for(int i = 0, i<orderFood.size(); i++)
		{
	}
}

