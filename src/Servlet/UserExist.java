package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import po.CClient;
import service.CClientManager;
import service.impl.CClientManagerImpl;

/**
 * Servlet implementation class UserExist
 */
public class UserExist extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CClientManager cClientManager=new CClientManagerImpl();
	class Exist {
		int existSatus = 0;

		public Exist(int existSatus) {
			super();
			this.existSatus = existSatus;
		}

		public int getExistSatus() {
			return existSatus;
		}

		public void setExistSatus(int existSatus) {
			this.existSatus = existSatus;
		}
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserExist() {
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
		String password = request.getParameter("password");
		HttpSession httpSession = request.getSession();
		System.out.println(username + "--" + password);
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		// out=null;
		CClientManager cClientManager = new CClientManagerImpl();
		if (username.length() > 0) {

			if (cClientManager.checkUserExist(username) == 1) {
				System.out.println("the username is right");
				out.print("the username doesn't exist by ajax");

				// request.getRequestDispatcher("index.html").forward(request,
				// response);
//				httpSession.setAttribute("client", client);
			} else {

				out.print("Sorry !the username is exist");
				System.out.println("the username is exist by ajax");
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession httpSession = request.getSession();
		String username = new String(request.getParameter("username").getBytes("ISO-8859-1"), "UTF-8");
		String password = request.getParameter("password");
		//判断是否username in database is it exist;
		CClient client = new CClient(username, password);
		httpSession.setAttribute("client",client);
		System.out.println(client.getcPassword() + "password");
		cClientManager.addCClient(client.getcUsername(), client.getcPassword());

		PrintWriter out = response.getWriter();
		System.out.println("post");
		out.println("<script>alert(\"add successful\");window.location.href='index.html'</script>");
//		request.getRequestDispatcher("index.html").forward(request, response);

	}

}
