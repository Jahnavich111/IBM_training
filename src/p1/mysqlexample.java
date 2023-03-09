package p1;
import java.sql.*;

public class mysqlexample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","Mysql@1");
		Statement smt=con.createStatement();
		ResultSet rs=smt.executeQuery("select * from employee");
		while (rs.next()) {
			System.out.println(rs.getString("Firstname"));
		}
	}
}
