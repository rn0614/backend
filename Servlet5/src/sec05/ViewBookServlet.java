package sec05;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class ViewBookServlet
 */
@WebServlet("/viewBooks")
public class ViewBookServlet extends HttpServlet {
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
		doHandle(request, response);
	}
	protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		List bookList = (List) request.getAttribute("bookList");
		
		out.println("<html><head></head><body>");
		out.println("<table border='1'>");	
		out.println("<tr align='center' bgcolor='lightgreen'>");	
		out.println("<td>책번호</td><td>책이름</td><td>저자</td>"
				+ "<td>가격</td><td>출간일</td><td>재고</td><td>출판사번호</td></tr>");	
		
		for(int i=0; i<bookList.size();i++) {
			BookVO vo = (BookVO) bookList.get(i);
			String bookNo = vo.getBookNo();
			String bookName = vo.getBookName();
			String bookAuthor = vo.getBookAuthor();
			int bookPrice = vo.getBookPrice();
			String bookDate = vo.getBookDate();
			int bookStock = vo.getBookStock();
			String pubNo = vo.getPubNo();
			
			
			
			out.println("<tr><td>" + bookNo + "</td><td>" +
					bookName + "</td><td>" +
					bookAuthor + "</td><td>" +
					bookPrice + "</td><td>" +
					bookDate + "</td><td>"+
					bookStock + "</td><td>"+
					pubNo + "</td>");
		}
		
		out.println("</table></body></html>");
	
	}

}
