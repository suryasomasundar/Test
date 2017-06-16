package Utils;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Utils.Constants;

public class DBConnection {

	private static Connection getDBConnection() throws ClassNotFoundException, SQLException {
		System.out.println("-------- Starting Oracle JDBC Connection Testing ------");
		System.out.println("");
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(Constants.HostName, Constants.JDBC_USRNAME, Constants.JDBC_PWD);
		return con;
	}

	public static PreparedStatement getPreparedStatement(String sqlQuery) throws SQLException, ClassNotFoundException {
		Connection dbConnection = getDBConnection();
		PreparedStatement stmt = null;
		if (dbConnection != null) {
			stmt = dbConnection.prepareStatement(sqlQuery);
		}
		return stmt;
	}
}
