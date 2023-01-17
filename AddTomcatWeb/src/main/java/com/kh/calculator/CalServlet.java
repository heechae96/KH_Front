package com.kh.calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalServlet
 */
@WebServlet("/operating.do")
public class CalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public CalServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int firstNum = Integer.parseInt(request.getParameter("first-num"));
		String opCode = request.getParameter("op-code");
		int secondNum = Integer.parseInt(request.getParameter("second-num"));
		// 프론트에서 백엔드로 데이터가 넘어옴(서버로 데이터가 넘어왔음)
		int result = 0;
		// 두 개의 값을 연산한 결과값을 사용자에게 전송
		switch (opCode) {
			case "+":
				result = firstNum + secondNum;
				break;
			case "-":
				result = firstNum - secondNum;
				break;
			case "x":
				result = firstNum * secondNum;
				break;
			case "/":
				result = firstNum / secondNum;
				break;
			case "%":
				result = firstNum % secondNum;
				break;
		}
		// jsp에는 자바코드를 작성하여 웹페이지를 구성(Model 1방식)할 수 있지만 사용하지 않음
		// jsp는 MVC패턴에서 View역할을 할 것임
		// 그렇게 하기 위해서는 Servlet에서 JSP로 결과값을 보내주어야 함
		// 앞으로 JSP로 데이터를 보내주는 코드를 작성 할 것
		// 1. JSP에서 쓸 데이터를 request에 저장(request는 전역변수처럼 사용, 컨테이너가 동작하는 동안 생성되어 있으므로)
		request.setAttribute("result", result);
		// 2. 어떤 JSP에서 request에 set한 데이터를 사용할지 지정해줌(JSP파일은 많이 존재하므로)
		RequestDispatcher view = request.getRequestDispatcher("/calculator/output.jsp");
		view.forward(request, response);
		
		// result = Integer.parseInt(firstNum) + Integer.parseInt(secondNum);
		// 스트림을 통해서 페이지를 만들어 응답함
//		PrintWriter out = response.getWriter();
//		out.println("<html><head><title>계산결과</title></head>");
//		out.println("<body>result: ");
//		out.println("<strong>" + result + "</strong");
//		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
