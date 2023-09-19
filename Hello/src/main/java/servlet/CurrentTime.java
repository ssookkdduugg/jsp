package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CurrentTime
 */
@WebServlet("/CurrentTime")
public class CurrentTime extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CurrentTime() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		Calendar c = Calendar.getInstance();
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		
		request.setAttribute("hour", hour); //setattribute 데이터 넣는거 
		request.setAttribute("minute", minute);
		request.setAttribute("second", second);
		RequestDispatcher dispatcher = request.getRequestDispatcher("CurrentTime.jsp");
		//jsp형태로 띄어주라고 requstdispatcher가 중간다리 (request가 중간다리임 정확하게)
		dispatcher.forward(request, response); //request를 보낸다.jsp 파일로 jsp파일로가면 request.getattribute 명령어로 값을 출력함
		
	}

}
