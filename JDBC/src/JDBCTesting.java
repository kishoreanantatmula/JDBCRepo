

import java.sql.*;

//import com.mysql.jdbc.Driver;


public class JDBCTesting {

		public static void main(String[] args) {
		
			
			try
			{
				// Loading the Driver
				
				Class.forName("com.mysql.jdbc.Driver");
				
				System.out.println("Driver successfully loaded");
				
	}
			catch(Exception e)
			{
				
				e.printStackTrace();
				
				
			}
			
			try
			{
							
				Connection connection = null;
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root", "kishore");
				System.out.println("Connection to DD successfull");
				
				Statement st = connection.createStatement();
				ResultSet rs = st.executeQuery("select * from Emp");
				while(rs.next())
				{
								
					int Empid = rs.getInt("ID");
					String Name = rs.getString("Name");
					int salary = rs.getInt("Salary");
					
					System.out.println("Employee id is"+ " "+Empid);
					System.out.println("Employee Name is"+ " "+Name);
					System.out.println("Salary is"+ " "+ salary);
				}
									
					
				}
			
				
			
			
			catch(Exception e)
			{
				
				e.printStackTrace();
				
				
			}
		

	}

}
