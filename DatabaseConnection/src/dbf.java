import java.sql.*;
 

public class dbf {
	public static void main(String x[]){
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(
					 "jdbc:mysql://localhost:3306/database1","root","root");
			Statement stm = con.createStatement();
			
			//Update Statement
			//stm.executeUpdate("update table1 set name = 'stuart' where name = 'stuat'");	
			
			//Insert Statement
			//stm.executeUpdate("insert into table1 values(5, 'Chris')");
			
			ResultSet rs =  stm.executeQuery("select * from table1");
			while(rs.next()){
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				}
			
		} catch (Exception e) {
			System.out.println(e);
			
		
		}
	}
}