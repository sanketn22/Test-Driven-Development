import java.util.Scanner;
public class FastFoodCourt {

	private String location;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	 public void order(String snack){		 
		
		 Snack item = null; 
		// Scanner food = new Scanner(System.in);
		// System.out.println("Please enter the item you wish to order");	
		 
		// String snack = food.nextLine(); 	 
		 
		 if(snack == "Vada Pav") {
			 item = new VadaPav();
			 System.out.println("How many do you want");
			 item.setQty(5);
			 System.out.printf("Ordered "+ item.qty+ " ");
			 System.out.println(item.name); 
		 }
		 else if(snack == "Paneer Samosa"){
			 item = new PaneerSamosa();	
			 System.out.println("Ordered "+ item.name); 
		 }
		 else if(snack == "Cheese Sandwich") {
			 item = new CheeseSandwich();
			 System.out.println("Ordered "+ item.name); 
		 }
		 else if(snack == "Aloo Burger"){
			item = new AlooBurger();
			 System.out.println("Ordered "+item.name); 
		 }
		 else if(snack == "Shawrma") {
			 item = new Shwarma();
			 System.out.println("Ordered "+item.name); 
		 }
		 else if(snack == "Chicken Pizza") {
			 item = new ChickenPizza();
			 System.out.println("Ordered"+item.name);
		 }
		 else if(snack == "Prawn Pattis") {
			 item = new PrawnPattis();
			 System.out.println("Ordered "+item.name); 
		 }
		 else if(snack == "Egg Roll") {
			 item = new EggRoll();
			 System.out.println("Ordered "+item.name); 
		 }
		 else { 
			 System.out.println("Please place proper order");
		 }
		 	
		}
	 
}
	
