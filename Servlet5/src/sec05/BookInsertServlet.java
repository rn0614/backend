package sec05;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BookInsertServlet
 */
@WebServlet("/bookInsert")
public class BookInsertServlet extends HttpServlet {
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
	
		response.setContentType("text/html;charset=utf-8");
		
		String bookNo = request.getParameter("bookNo");
		String bookName = request.getParameter("bookName");
		String bookAuthor = request.getParameter("bookAuthor");
		int bookPrice = Integer.parseInt(request.getParameter("bookPrice"));
		
		String year =request.getParameter("year");
		String month =request.getParameter("month");
		String date =request.getParameter("date");
		
		
		
		String bookDate = year +"-"+month+"-"+date;
		
		
		
		int bookStock = Integer.parseInt(request.getParameter("bookStock"));
		String pubNo = request.getParameter("pubNo");
		
		String command =request.getParameter("command");
		
		BookVO vo = new BookVO();
		vo.setBookNo(bookNo);
		vo.setBookName(bookName);
		vo.setBookAuthor(bookAuthor);
		vo.setBookPrice(bookPrice);
		vo.setBookDate(bookDate);
		vo.setBookStock(bookStock);
		vo.setPubNo(pubNo);
		
		BookDAO dao = BookDAO.getInstance();
		dao.insertBook(vo);
		
		
		response.sendRedirect("bookSelect");
	}
}
