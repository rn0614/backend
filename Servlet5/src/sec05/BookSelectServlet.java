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
 * Servlet implementation class BookSelectServlet
 */
@WebServlet("/bookSelect")
public class BookSelectServlet extends HttpServlet {
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
		System.out.println("1");
		BookDAO dao = BookDAO.getInstance();
		List list= dao.ListBook();
		
		response.setContentType("text/html;charset=utf-8");
		
		//출력문
		PrintWriter out = response.getWriter();
		
		out.println("<html><head></head><body>");
		out.println("<table border='1'>");	
		out.println("<tr align='center' bgcolor='lightgreen'>");	
		out.println("<td>책번호</td><td>책이름</td><td>저자</td>"
				+ "<td>가격</td><td>출간일</td><td>재고</td><td>출판사번호</td><td>삭제</td></tr>");	
		
		
		for(int i=0; i< list.size(); i++) {
			BookVO vo = (BookVO) list.get(i);
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
					pubNo + "</td><td>"+
									"<a href='/Servlet5/bookDelete?command=del&bookNo="+bookNo+
									"'>삭제</a></td></tr>");
					
		}
		out.println("</table></body></html>");
		
	}
}
