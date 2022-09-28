
public abstract class Snack {
	String name; 
	Integer qty; 

	public void ordered() {
		System.out.println("Ordered");		
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}
	
}
