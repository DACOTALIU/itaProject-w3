package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import po.CClient;
import service.CClientManager;
import service.impl.CClientManagerImpl;

/**
 * Servlet implementation class loginServlet
 */
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public loginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		HttpSession httpSession = request.getSession();
		CClientManager cClientManager = new CClientManagerImpl();
		if (cClientManager.checkPwd(username, password) == 1) {
			System.out.println("enter right");
			CClient client = new CClient(username, password);
			httpSession.setAttribute("client", client);
		} else {
			System.out.println("Your enter is wrong");
		}
		request.getRequestDispatcher("HomePage.jsp").forward(request, response);
//		  RequestDispatcher   requestDispatcher=request.getRequestDispatcher("/itaProject-w3/index.html");   
//		  requestDispatcher.forward(request,response);
//		response.sendRedirect("/itaProject-w3/index.html");//重定向
//		request.getRequestDispatcher("/itaProject-w3/index.html").forward(request, response);
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
