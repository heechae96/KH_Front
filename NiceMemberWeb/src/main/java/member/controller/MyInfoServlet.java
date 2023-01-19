package member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.model.service.MemberService;
import member.model.vo.Member;

/**
 * Servlet implementation class MyInfoServlet
 */
@WebServlet("/member/myInfo.kh")
public class MyInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MyInfoServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String memberId = request.getParameter("member-id");
		if (memberId != null) {
			// id가 존재하면 DB에서 데이터를 가져옴
			MemberService mService = new MemberService();
			Member member = mService.printOneById(memberId);
			request.setAttribute("member", member);
			request.getRequestDispatcher("/WEB-INF/views/member/myInfo.jsp").forward(request, response);
		} else {
			// id가 없을때 에러페이지로 이동
			request.setAttribute("title", "아이디로 조회 실패");
			request.setAttribute("msg", "해당하는 데이터가 존재하지 않습니다");
			request.getRequestDispatcher("/WEB-INF/views/member/error.jsp").forward(request, response);
		}
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
