
public class PersonalInfo {
	
	contactDetails cd = new contactDetails();
	office o = new office();
	Main m = new Main();
	
	String Name;
	int phy, che, mat;
	float total, per;
	
	
	
	public void Calculation(){
		
		total = phy + che + mat;
		per = total * 100/450;
	}
	public void showResults(){
		System.out.println("Total: "+ total);
		System.out.println("Percentage: "+ per);
	}

	public void showAddress(){
		
		String full;
		
		full = cd.ad.street + ", " + cd.ad.city + ", " + cd.ad.postcode;
		System.out.println("Contact Address: " + full);
	}
	
	public void officeAddress(){
		
		String full;
		full = o.ad.street + ", " + o.ad.city + ", " + ", " + o.ad.postcode;
		System.out.println("Office Address: " + full);
	}
	
	public String getname(){
		
		
		
		return Name;
		
	}
}
