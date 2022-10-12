package food;

public  class Snack {
	protected String name; 
	protected Integer qty;
	protected Integer price; 

	public void ordered() {
		System.out.println("Ordered");		
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Snack(String name) {
		super();
		this.name = name;
		this.qty = qty;
		this.price = price;
	}

	
	
}
