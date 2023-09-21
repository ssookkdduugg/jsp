package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.Account;

/**
 * Servlet implementation class AccountInfo
 */
@WebServlet("/accountInfo")
public class AccountInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		
		
		HttpSession session = request.getSession();
		Account acc = (Account)session.getAttribute("id");
		RequestDispatcher dispatcher = request.getRequestDispatcher("main.jsp");
		if(acc!=null) {
			request.setAttribute("acc", acc);
			request.setAttribute("page", "accountinfo");
		}else {
			request.setAttribute("err", "계좌번호가 틀립니다.");/* error.jsp파일에 request.getattribute("err")로 주고 그자리에 */
										/*	"계좌번호가 틀립니다." 오류 메세지 주기 */
			request.setAttribute("page", "error");/* 페이지 이름이 error인곳에*/
		}
		dispatcher.forward(request, response);
	}

}
