package tpoint;

public class TestEmployeeDetailsDemo{

	
	public static void main(String[] args){

		
		
		
		EmployeeDetails n1=new EmployeeDetails();
		TestEmployeeDetails n2 = new TestEmployeeDetails();
		n1.setname("Vasu");
		n1.setid(9542);
		n1.setdesignation("java");

	System.out.println("Name:"+ " " +n1.getname());
	System.out.println("Employee Id:"+ " " +n1.getid());
	System.out.println("Designation:"+ " "+n1.getdesignation());
	
	
	n2.setapt(802);
	n2.setcity("Fremont");
	n2.setstate("CA");
	n2.setzip(94538);
	n2.setStreet("40640 High street");
	
	System.out.println("Street Address:"+ " " +n2.getstreet());
	System.out.println("Apartment:"+ " " +n2.getapt());
	System.out.println("City:"+ " "+n2.getcity());
	System.out.println("Zip code:"+ " " +n2.getzip());
	System.out.println("State :"+ " "+n2.getstate());
	
	
	

	
	}
	


}