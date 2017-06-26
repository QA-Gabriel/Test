
public class Main {
	
	public static void main(String x[]){
		
		PersonalInfo records[] = new PersonalInfo[5];
		String a;
		
		records[0] = new PersonalInfo();
		
		records[0].Name="Gabriel";
		records[0].phy=75;
		records[0].che=60;
		records[0].mat=89;
		records[0].cd.Email="gabrielifesanya@hotmail.com";
		records[0].cd.Tele="07949967357";
		records[0].cd.ad.street= "Foss Avenue";
		records[0].cd.ad.city="London";
		records[0].cd.ad.postcode="cr0 4el";
		records[0].o.NI="JZ599878";
		records[0].o.salary=23500;
		records[0].o.Grade="A";
		records[0].o.ad.street="Brick Lane";
		records[0].o.ad.city="London";
		records[0].o.ad.postcode="SE23 74D";
		records[0].cd.ad.street="Foss Avenue";
		
		records[0].getname();
		records[0].showAddress();
		records[0].officeAddress();
		records[0].Calculation();
		records[0].showResults();
		
		
		
		
		
	}
	
}
