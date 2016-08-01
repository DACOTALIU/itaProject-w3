package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.omg.PortableInterceptor.ForwardRequest;

import dao.impl.COrderDaoImpl;
import po.COrder;
import service.COrderManager;
import service.impl.COrderManagerImpl;

/**
 * Servlet implementation class ShowOrder
 */
public class ShowOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;
       COrderManager cOrderManager=new COrderManagerImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowOrder() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("showOrder...get.");
		List<COrder>listOrder=cOrderManager.listOrder();
		HttpSession httpSession=request.getSession();
		httpSession.setAttribute("listOrder", listOrder);
		request.getRequestDispatcher("/ShowOrder.jsp").forward(request, response);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
