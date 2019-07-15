import java.sql.*;

public class SelectRecords {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://47.107.165.165/sakila?useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";

	//  Database credentials
	static final String USER = "root";
	static final String PASS = "root";
	Connection conn = null;
	Statement stmt = null;
	public  void query1() {

		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			stmt = conn.createStatement();
			String sql = "SELECT country_id,country  FROM country";
			ResultSet rs = stmt.executeQuery(sql);

			System.out.println("country_id| " + "country_name");
			while(rs.next()){
				int country_id  = rs.getInt("country_id");
				String country_name = rs.getString("country");
				System.out.println(country_id +"|" +country_name);
			}
			rs.close();
		}catch(SQLException se){
			se.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(stmt!=null)
					conn.close();
			}catch(SQLException se){
			}
			try{
				if(conn!=null)
					conn.close();
			}catch(SQLException se){
				se.printStackTrace();
			}
		}
		System.out.println("Goodbye!");
	}
	public void query2(){
	try{
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(DB_URL, USER, PASS);

		stmt = conn.createStatement();
		String sql = "SELECT country_id,country  FROM country";
		ResultSet rs = stmt.executeQuery(sql);

		System.out.println("country_id| " + "country_name");
		while(rs.next()){
			int country_id  = rs.getInt("country_id");
			String country_name = rs.getString("country");
			System.out.println(country_id +"|" +country_name);
		}
		rs.close();
	}catch(SQLException se){
		se.printStackTrace();
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		try{
			if(stmt!=null)
				conn.close();
		}catch(SQLException se){
		}
		try{
			if(conn!=null)
				conn.close();
		}catch(SQLException se){
			se.printStackTrace();
		}
	}
		System.out.println("Goodbye!");
}

	public static void main(String[] args) {
		SelectRecords selectRecords=new SelectRecords();
		selectRecords.query1();
	}
}

