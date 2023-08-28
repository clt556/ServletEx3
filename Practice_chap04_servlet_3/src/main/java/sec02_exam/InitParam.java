package sec02_exam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/IP"}, initParams = {@WebInitParam(name = "id", value="admin"),@WebInitParam(name = "pwd", value="pwd"),@WebInitParam(name = "path", value="gfdsfsdvc")})
public class InitParam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String id = this.getInitParameter("id");
//		String pwd = this.getInitParameter("pwd");
//		String path = this.getInitParameter("path");
		
		String id = this.getServletContext().getInitParameter("id");
		String pwd = this.getServletContext().getInitParameter("pwd");
		String path = this.getServletContext().getInitParameter("path");
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter writer = response.getWriter();
		String data = "<html><head></head><body>";
		data += "ID: " + id + "<br/>";
		data += "PWD: " + pwd + "<br/>";
		data += "PATH: " + path + "<br/>";
		data += "</body></html>";
		writer.print(data);
	}
	
	//initParam은 서블릿 하나에서만 쓰는 변수 선언
	//context-param은 서블릿 공통 변수 선언

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
