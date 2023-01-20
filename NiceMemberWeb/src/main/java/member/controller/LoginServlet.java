package member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import member.model.service.MemberService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/member/login.kh")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String memberId = request.getParameter("member-id"); // from input[name=member-id]
		String memberPw = request.getParameter("member-pw"); // from input[name=member-pw]

		// 초반 확인용
		// System.out.println(memberId + ", " + memberPw);

		MemberService mService = new MemberService();
		int result = mService.selectCheckLogin(memberId, memberPw);

		// 초반 확인용
		// System.out.println(result);

		if (result > 0) {
			// 성공 페이지
			// 로그인 유지
			HttpSession session = request.getSession();
			session.setAttribute("memberId", memberId);
			response.sendRedirect("/index.jsp");
			
			// 아래와 같은 방법으로는 로그인이 유지되지 않는다
//			request.setAttribute("memberId", memberId);
//			RequestDispatcher view = request.getRequestDispatcher("/index.jsp");
//			view.forward(request, response);
		} else {
			// 실패 페이지
			request.setAttribute("title", "로그인 실패");
			request.setAttribute("msg", "아이디와 비밀번호를 다시 확인해주세요.");
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/member/error.jsp");
			view.forward(request, response);
		}

	}

}
