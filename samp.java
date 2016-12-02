
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

	public class samp {

		private static String JDBC_CONNECTION_URL = 
				"jdbc:oracle:thin:@aatrng1.appsassociates.com:1521:VIS";

		
		public static void main(String[] args) {
			try {

				CSVLoader loader = new CSVLoader(getCon());
				
				loader.loadCSV("E:/csv_flj.csv", "csv", true);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		private static Connection getCon() {
			Connection connection = null;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				connection = DriverManager.getConnection(JDBC_CONNECTION_URL,"apps","apps");

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}

			return connection;
		}
	}

