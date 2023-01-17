package com.kh.checkbox;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckBoxServlet
 */
@WebServlet("/showResult.do")
public class CheckBoxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckBoxServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] places = request.getParameterValues("place");
		request.setAttribute("places", places);
		RequestDispatcher view = request.getRequestDispatcher("checkBox/checkResult.jsp");
		view.forward(request, response);
		
		// 한글이 깨지는것을 방지하기 위한 설정
//		response.setContentType("text/html; charset=utf-8");
		// 콘솔 출력
//		System.out.println("가고싶은곳");
//		for(String value : values) {
//			System.out.println(value + ", ");
//		}
		// 브라우져 출력
//		PrintWriter out = response.getWriter();
//		out.println("<html><head><title>관광지 선택 결과</title></head>");
//		out.println("<body>");
//		for(String value : values) {
//			out.println(value + ", ");
//		}
//		out.println("</body>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
