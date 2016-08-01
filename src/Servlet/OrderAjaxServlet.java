package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import po.CCart;
import po.CClient;
import po.COrder;
import service.CCartManager;
import service.COrderManager;
import service.impl.CCartManagerImpl;
import service.impl.COrderManagerImpl;

/**
 * Servlet implementation class OrderAjaxServlet
 */
public class OrderAjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	COrderManager cOrderManager = new COrderManagerImpl();
	CCartManager cCartManager = new CCartManagerImpl();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public OrderAjaxServlet() {
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
		PrintWriter out = response.getWriter();
		HttpSession httpSession = request.getSession();
		CCart cCart = (CCart) httpSession.getAttribute("cart");
		if (cCart != null) {
			Date now = new Date();
			long nowTime = now.getTime();

			COrder cOrder = new COrder(cCart.getcId(), cCart, nowTime);
			cOrderManager.addCOrder(cOrder);
			cCartManager.deleteCCartManager(cCart.getcId());
			httpSession.setAttribute("cart", "");
			response.getWriter().append("Served at: ").append(request.getContextPath());
		} else {
			out.print("<script>alert(\"you haven't login yet\")</script>");
			request.getRequestDispatcher("./jsp/loginJsp.jsp").forward(request, response);
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
