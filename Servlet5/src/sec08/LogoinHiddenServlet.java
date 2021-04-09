package sec08;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LogoinHiddenServlet
 */
@WebServlet("/loginHidden")
public class LogoinHiddenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doHandle(request, response);
	}
	protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 클라이언트 요청 데이터 저장 : request 처리
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String user_id =request.getParameter("user_id");
		String user_pw =request.getParameter("user_pw");
		String user_address =request.getParameter("user_address");
		String user_email =request.getParameter("user_email");
		String user_hp =request.getParameter("user_hp");
		
		
		// 클라이언트에게 : response 처리
		out.println("<html><head></head><body>");
		out.println("안녕하세요! "+user_id +" 님! 로그인하셨습니다.<br>");
		out.println("아이디 :"+user_id +"<br>");
		out.println("비밀번호 : "+user_pw +"<br>");
		out.println("주소 : "+user_address +"<br>");
		out.println("이메일 : "+user_email +"<br>");
		out.println("휴대전화 : "+user_hp +"<br>");
		out.println("</body></html>");
	}
}
