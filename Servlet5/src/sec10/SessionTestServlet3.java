package sec10;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionTestServlet3
 */
@WebServlet("/session3")
public class SessionTestServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
	
		//getSession() : 최초 요청 시 세션 개게를 새로 생성하거나
		// 기존 세션을 반환
		HttpSession session = request.getSession();
		
		// getId() : 생성된 세션 객체의 id 반환
		out.println("세션 아이디 : "+ session.getId() +"<br>");
		
		// getCreationTime() : 최초 생성 시간 반환
		out.println("최초 세션 생성 시간 : "+ new Date(session.getCreationTime())+"<br>");
		// getLastAccessedTime() : 최근 접근 시간 반환
		out.println("최근 세션 접근 시간 : "+ new Date(session.getLastAccessedTime()) +"<br>");
		
		out.println("세션 유효 시간 : "+ session.getMaxInactiveInterval() +"<br>");
		
		
		if(session.isNew()) {
			out.println("새 세션이 만들어졌습니다.");
		}
		
		//세션 강제 삭제
		session.invalidate();
		
	}

}
