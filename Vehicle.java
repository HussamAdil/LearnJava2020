import java.util.Random;

public class Vehicle {

	private String model;
	
	private double price; 

	public Vehicle() {
		super();
		
		setModel();
		
		setPrice();
	}
	
	public void setModel()
	{
		Random rand = new Random();
		
		 this.model = " d15 - " + rand.nextInt();
	}
	
	public String getModel()
	{
		return this.model;
	}
	
	public void setPrice()
	{
		this.price = Math.random();
	}
	
	public double getPrice()
	{
		return price;
	}
	
}
