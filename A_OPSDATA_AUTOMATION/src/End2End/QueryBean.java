package End2End;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Utils.DBConnection;

public class QueryBean {

	public static void SelectTableDetails() {

		//String GetCountquery = "select  COUNT (*) from SECURITYDBO.PRICE where SECURITY_ALIAS = '59467'";
		String GetAllQuery = "select * from SECURITYDBO.PRICE";

		try {

			//PreparedStatement stmt = DBConnection.getPreparedStatement(GetCountquery);
			PreparedStatement stmt1 = DBConnection.getPreparedStatement(GetAllQuery);

			//stmt.executeQuery();
			stmt1.executeQuery();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (SQLException e) {
			e.printStackTrace();

		}

	}
}
