package sec07;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet05
 */
@WebServlet("/second05")
public class SecondServlet05 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			
			//first05 에서 보낸 데이터 받아오기
			String name = request.getParameter("name");
			
			out.println("<html><head></head><body>");
			out.println("이름 : " + name);
			out.println("<br>dispatch방법을 이용한 포워딩입니다.");
			out.println("</body></html>");
		
	}

}
