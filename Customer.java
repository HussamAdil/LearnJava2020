
public class Customer {

	public String name;
	public String mail;
	
	public Customer(String name, String mail) {
		super();
		this.name = name;
		this.mail = mail;
	}

	public String getCustomer()
	{
		return " name : " + this.name + " email : " + this.mail;
	}


}
