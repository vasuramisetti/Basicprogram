package tpoint;

public class TestEmployeeDetails extends EmployeeDetails  {
	
	private String street;
	private int apt;
	private String city;
	private int zip;
	private String state;

public void setStreet(String street){
	this.street=street;
	
}


public String getstreet(){
	return this.street;

	
}
	public void setapt(int apt){
		
		this.apt=apt;
	}
	
public int getapt(){
	return this.apt;
}
	
public void setzip(int zip){
	
	this.zip=zip;
}

public int getzip(){
return this.zip;
}


public void setstate(String state){
	
	this.state=state;
}

public String getstate(){
return this.state;
}



public  void setcity(String city){
	this.city=city;
	
}

public String getcity(){
	
	return this.city;

}



} 

