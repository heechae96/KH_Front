package student.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import student.model.service.StudentService;
import student.model.vo.Student;

/**
 * Servlet implementation class StudentEnrollServlet
 */
@WebServlet("/student/enroll.do")
public class StudentEnrollServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StudentEnrollServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/student/enroll.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 인코딩을 안해서 보내면 한글이 깨져서 받아짐
		request.setCharacterEncoding("UTF-8");

		String studentId = request.getParameter("id");
		String studentPw = request.getParameter("pw");
		String studentName = request.getParameter("name");
		String studentEmail = request.getParameter("email");
		String studentPhone = request.getParameter("number");
		String studentAddress = request.getParameter("addr");
		String studentGender = request.getParameter("gender");

		Student student = new Student();
		student.setStudentId(studentId);
		student.setStudentPw(studentPw);
		student.setStudentName(studentName);
		student.setStudentEmail(studentEmail);
		student.setStudentPhone(studentPhone);
		student.setStudentAddress(studentAddress);
		student.setStudentGender(studentGender);

		StudentService sService = new StudentService();
		int result = sService.registerStudent(student);

		if (result > 0) {
			// 가입 성공을 했으면 로그인 화면으로 보내주자

			// 1. 특정 값을 보내면서 페이지 이동의 경우
			// request.setAttribute("result", result);
			// request.getRequestDispatcher("/index.jsp").forward(request, response);

			// 2. 단순 페이지 이동의 경우
			// 전달값으로 페이지 경로 가능, URL도 가능
			// but. URL의 경우 method="get"
			// ★★★ login.jsp는 method="post"라 불가능 ★★★
			// response.sendRedirect("/login.jsp");
			
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		} else {
			request.setAttribute("title", "회원 가입 실패");
			request.setAttribute("msg", "회원가입이 완료되지 않았습니다.");
			request.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(request, response);
		}
	}
}
