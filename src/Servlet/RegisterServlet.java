package Servlet;
//no need more
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import po.CClient;
import service.CClientManager;
import service.impl.CClientManagerImpl;
import util.JSONUtil;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = new String(request.getParameter("username").getBytes("ISO-8859-1"), "UTF-8");
//		String password = request.getParameter("password");
//		HttpSession httpSession = request.getSession();
		CClientManager cClientManager = new CClientManagerImpl();
		PrintWriter writer = response.getWriter();
		if (cClientManager.checkUserExist(username) == 1) {
			System.out.println("the username is right");
			response.setCharacterEncoding("utf-8");
//			CClient client = new CClient(username, password);
			writer.print("the username doesn't exist");

//			httpSession.setAttribute("client", client);
		} else {
			writer.print("the username is exist");
			System.out.println("the username is exist");
		}
		System.out.println("hihi");
		request.getRequestDispatcher("index.html").forward(request, response);
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
