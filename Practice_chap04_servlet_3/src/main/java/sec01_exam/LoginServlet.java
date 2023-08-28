package sec01_exam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter writer = response.getWriter();
		
		String id = request.getParameter("user_id");
		String pwd = request.getParameter("user_pwd");
		String location = request.getParameter("user_address");
		
		String data = "<html><body>";
		data += "입력한 아이디: " + id + "<br/>";
		data += "입력한 비밀번호: " + pwd + "<br/>";
		data += "입력되서 온 주소: " + location + "<br/>";
		writer.print(data);
	}

}
