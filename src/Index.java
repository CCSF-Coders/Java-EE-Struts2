
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Index extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:mem:mymemdb", "sa", ""); // password
			Statement stmt = conn.createStatement();
			String sql = "select * from REGISTRATION";
	
			ResultSet results = stmt.executeQuery(sql);
			results.next();
			request.setAttribute("name", results.getString(2) + " " + results.getString(3));
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		request.getRequestDispatcher("WEB-INF/index.jsp").forward(request, response);
	}

}
