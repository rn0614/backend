package sec03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BookDAO {
	
	private Connection con =null;
	DataSource dataSource=null;
	
	//싱글톤 선언 static 객체, privae, getinstance
	private static  BookDAO instance= new BookDAO();
	
	private BookDAO() {
		try {
			Context context = new InitialContext();
			dataSource =(DataSource)context.lookup("java:comp/env/jdbc/oracle");
			
		} catch (Exception e) {
			System.out.println("오류발생1");
		}
		
	}
		
	public static BookDAO getInstance() {
		return instance;
	}
		
	
	public List ListBook() {
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		
		List list = new ArrayList();

		try {
			con = dataSource.getConnection();
			
			String sql = "select * from book";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String bookNo = rs.getString("bookNo");
				String bookName = rs.getString("bookName");
				String bookAuthor = rs.getString("bookAuthor");
				int bookPrice = rs.getInt("bookPrice");
				String bookDate = rs.getDate("bookDate").toString();
				int bookStock = rs.getInt("bookStock");
				String pubNo = rs.getString("pubNo");
				
				BookVO vo = new BookVO();
				vo.setBookNo(bookNo);
				vo.setBookName(bookName);
				vo.setBookAuthor(bookAuthor);
				vo.setBookPrice(bookPrice);
				vo.setBookDate(bookDate);
				vo.setBookStock(bookStock);
				vo.setPubNo(pubNo);
				
				
				list.add(vo);
			}
			
			
		} catch (Exception e) {
			System.out.println("오류발생2");
		} finally {
			try {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				
				pstmt.close();
				con.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	return list;
	}
	
	public void insertBook(BookVO vo) {
		PreparedStatement pstmt = null;
		
		System.out.println("구간3");
		try {
			con = dataSource.getConnection();
			SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date bDate=transFormat.parse(vo.getBookDate());
			java.sql.Date sqlDate = new java.sql.Date(bDate.getTime());

			
			System.out.println("구간1");
			String sql ="insert into book(bookNo,bookName,bookAuthor,bookPrice"
					+ ",bookStock,pubNo) values(?,?,?,,?,?,?)";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, vo.getBookNo());
			pstmt.setString(2, vo.getBookName());
			pstmt.setString(3, vo.getBookAuthor());
			pstmt.setInt(4, vo.getBookPrice());
			
			
			
			pstmt.setInt(5, vo.getBookStock());
			pstmt.setString(6, vo.getPubNo());
			System.out.println("구간2");
			int result =pstmt.executeUpdate();
			System.out.println("구간3");
			if(result>0) {
				System.out.println("도서등록 성공");
			}
		} catch (Exception e) {
			System.out.println("오류발생");
		}finally {
			
			try {
				if(pstmt !=null) {
				pstmt.close();
				pstmt=null;}
				
				if(con!=null) {
					con.close();
					con=null;}
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	}
	
	public void deleteBook(String bookNo) {
		PreparedStatement pstmt = null;
		
		try {
			con =dataSource.getConnection();
			
			String sql="delete from book where bookNo=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, bookNo);
			
			int result= pstmt.executeUpdate();
			if(result>0) {
				System.out.println("책 삭제 성공");
			}
			
		} catch (Exception e) {
			System.out.println("오류 발생");
			e.printStackTrace();
		}finally {
			
			try {
				if(pstmt !=null) {
				pstmt.close();
				pstmt=null;}
				
				if(con!=null) {
					con.close();
					con=null;}
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	}
}
