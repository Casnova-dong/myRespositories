import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class test {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("无法加载驱动");
		}
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssm","root","hqd520zxx");
			if (!con.isClosed()) {
				System.out.println("success");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
