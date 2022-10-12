import java.util.*;

import food.AlooBurger;
import food.CheeseSandwich;
import food.ChickenPizza;
import food.EggRoll;
import food.PaneerSamosa;
import food.PrawnPattis;
import food.Shwarma;
import food.Snack;
import food.VadaPav;

public class FastFoodCourt {

	private String location;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	 public ArrayList<Snack>orderFood(ArrayList<String>order, Integer i){		 
		
		 Snack item = null; 
		// Scanner food = new Scanner(System.in);
		// System.out.println("Please enter the item you wish to order");	
		 
		// String snack = food.nextLine(); 
		 ArrayList<Snack> bill = new ArrayList(); 
			 
		 for(int n = 0; n <order.size()-1; i++) {
			 
			 if(order.get(n) == "Vada Pav") 
			 {
				 item = new VadaPav(order.get(n));
				 item.setQty(i);
				 System.out.printf("Ordered "+ order.get(n)+" "+ item.getQty()+ " ");
				 item.setName(order.get(n));
	//			 System.out.println(item.getName());			
	//			 System.out.println("Your bill is " + item.getQty() * item.getPrice()+" rs.");
			 }
		 else if(order.get(n) == "Paneer Samosa")
		 	{
				 item = new PaneerSamosa();
				 item.setName("Paneer Samosa");
				 System.out.println("Ordered "+ item.getName()); 
				 item.setQty(i);
				 item.getQty();
	//			 System.out.println("Your bill is " + item.getQty() * item.getPrice()+" rs.");
			 }
		 else if (order.get(n) == "Cheese Sandwich")
			 {
				 item = new CheeseSandwich();
				 item.setName("Cheese Sandwich");
				 System.out.println("Ordered "+ item.getName());
				 item.setQty(i);
	//			 System.out.println("Your bill is " + item.getQty() * item.getPrice()+" rs.");
			 }
		 else if (order.get(n) == "Aloo Burger")
			 {
				item = new AlooBurger(order.get(n));
				item.setName("Aloo Burger");
				 System.out.println("Ordered "+item.getName());
			
				 item.setQty(i);
	//			 System.out.println("Your bill is " + item.getQty() * item.getPrice()+" rs.");
			 }
		 else if(order.get(n) =="Shawrma")
			 {
				 item = new Shwarma();
				 item.setName("Shawrma");
				 System.out.println("Ordered "+item.getName());
				
				 item.setQty(i);
	//			 System.out.println("Your bill is " + item.getQty() * item.getPrice()+" rs.");
			 }
		 else if(order.get(n) == "Chicken Pizza") 
			 {
				 item = new ChickenPizza(order.get(n));
				 item.setName("Chicken Pizza");
				 System.out.println("Ordered"+item.getName());
			
				 item.setQty(i);
	//			 System.out.println("Your bill is " + item.getQty() * item.getPrice()+" rs.");
			 }
		 else if(order.get(n) == "Prawn Pattis") 
			 {
				 item = new PrawnPattis(order.get(n));
	//			 item.setName("Prawn Pattis");
				 System.out.println("Ordered "+item.getName());
			
				 item.setQty(i);
	//			 System.out.println("Your bill is " + item.getQty() * item.getPrice()+" rs.");
			 }
		 else if(order.get(n) == "Egg Roll") 
			 {
				 item = new EggRoll(order.get(n));
	//			 item.setName("Egg Roll");
				 System.out.println("Ordered "+item.getName());
				 item.setQty(i);
	//			 System.out.println("Your bill is " + item.getQty() * item.getPrice()+" rs.");
			 }
		 else { 
			 System.out.println("Please place proper order");
		 }
		 
		bill.add(item); 
		}
		 return bill; 
	 } 
}
	
