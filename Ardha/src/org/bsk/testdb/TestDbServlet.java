package org.bsk.testdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestDbServlet
 */
@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestDbServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		//set up connection variable
		String user="root";
		String pass="root";
		
		String url="jdbc:mysql://localhost:3306/ardha?useSSL=false";
		String driver="com.mysql.jdbc.Driver";
		//get the connection to database
		
		try {
			
			PrintWriter out = response.getWriter();
			out.println("connecting to database "+url);
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url,user,pass);
			
			out.println("Success");
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
			throw new ServletException();
		}
	}

}
