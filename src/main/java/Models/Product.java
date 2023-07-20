package Models;

public class Product 
{
	private int prid;
	private String prname;
	private int price;
	private int qty;
	
	
	
	Product(){};
	Product(int id,String nm,int pr,int q)
	{
		this.prid = id;
		this.prname = nm;
		this.price = pr;
		this.qty = q;		
	}
	
	
	
	public int getPrid() {
		return prid;
	}
	public void setPrid(int prid) {
		this.prid = prid;
	}
	public String getPrname() {
		return prname;
	}
	public void setPrname(String prname) {
		this.prname = prname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	
	
	public String toString()
	{
		return "Prid: "+prid+"Product Name: "+prname+"Price: "+price+"Quantity: "+qty;
	}
	
}
}