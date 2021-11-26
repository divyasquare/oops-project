	class Product{

//atributes
private	int pid;
private String name;
private int price;
	
	//construtor
	Product(){
	  System.out.println("product obj construtor");
	}
	
	//method
	//to write data to object by tbis method
	void setProductDetails(int pid,String name,int price)
	{ this.pid=pid;
	  this.name=name;
	  this.price=price;
		
	}
	//to read data from pruduct obj
	void getProductDetails()
	{
		System.out.println("product id--"+pid+"");
		System.out.println("product name--"+name+"");
		System.out.println("product price--"+price+"");

		
	}
     void setPid(int pid)
     {
    	 this.pid=pid;
     }
     int getPid()
     {
    	 return pid;
     }
	}

public class InheritanceApp {

	//call by JVM
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create an product object
		Product p=new Product();
		//product is not an object it is a refrencr variable which hold the hashcode of object in hexadecimal notation
	System.out.println("product---"+p);	 // not an obje..refrnce varible pointing to obje
	
	//writing data in object
	p.setProductDetails(101, "iphobe x", 70000);
	p.getProductDetails();
	
	Product p1=new Product();
	p1.setPid(102);
	
	System.out.println("anothe objec"+p1.getPid());

	}

}
