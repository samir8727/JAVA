package co.samir.myProgram.entity;

public class Product2 implements Comparable<Product2>{
	private int id;
	private String name;
	private double price;
	
	
	public Product2() {
		
	}


	public Product2(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Product2 [id=" + id + ", name=" + name + ", price=" + price + "]";
	}


	@Override
	public int compareTo(Product2 p) {
		int cmp=this.id-p.id;
		if(cmp==0) {
			cmp=this.name.compareTo(p.name);
			if(true) {
				cmp=Double.compare(this.price, p.price);
			}
		}
		
		return cmp;
	}
	
	
	

}
