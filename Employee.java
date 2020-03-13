import java.util.Random;

public class Employee {

	public String name;
	
	private String mail;
	
	private int empId;
	
	public Employee(String name, String mail) {
	
		super();
		
		this.name = name;
 		  
		 setMail(mail);	 
 		
 		 setEmpId();
	}
	
	public void setMail(String mail)
	{
		 this.mail =  mail + "@company.com";
	}
	
	public String getMail()
	{
		return mail;
	}

	public void setEmpId()
	{
		Random rand = new Random();
		
		this.empId = rand.nextInt(7457);
		
	}
	
	public int getempId()
	{		
		return empId;
	}

}
