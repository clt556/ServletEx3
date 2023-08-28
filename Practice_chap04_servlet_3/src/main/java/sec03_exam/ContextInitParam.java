package sec03_exam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/cp")
public class ContextInitParam extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = this.getServletContext().getInitParameter("id");
		String pwd = this.getServletContext().getInitParameter("pwd");
		String path = this.getServletContext().getInitParameter("path");
	
		response.setContentType("text/html; charset=utf-8");
		PrintWriter writer = response.getWriter();
		String data = "<html><head></head><body>";
		data += "ID: " + id + "<br/>";
		data += "PWD: " + pwd + "<br/>";
		data += "PATH: " + path + "<br/>";
		data += "</body></html>";
		writer.print(data);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
