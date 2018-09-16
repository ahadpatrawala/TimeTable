package Project;
import java.sql.*;

public class connect
{
	public static void main(String args[])
	{
		try
		{
                    Class.forName("org.gjt.mm.mysql.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/timetable","root","");
	Statement s=con.createStatement();
	
	ResultSet rs=s.executeQuery("Select * from information");
	while(rs.next())
	{
		String sr=rs.getString("uname");
		String f=rs.getString("umail");
                String t=rs.getString("upass");
                String u=rs.getString("ucountry");      
		System.out.println(s+"\t\t"+f+"\t"+t+"\t"+u);
	}

	s.close();
	con.close();

	System.out.println("Connection succesful");
		}
		catch(Exception e)
		{System.out.println(e);}
	}
}


