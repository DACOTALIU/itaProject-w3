package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import po.cDishes;
import util.JSONUtil;

/**
 * Servlet implementation class CartAjaxServlet
 */
public class CartAjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartAjaxServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("doget>.....................");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("dopost..........................");
		// TODO Auto-generated method stub
//		String dishesJson =  new String(request.getParameter("array"));//.getBytes("ISO-8859-1"),"UTF-8"
		String dishJ =request.getParameter("query");
		System.out.println(dishJ);
//		Object cDish=JSONUtil.json2Object(dishJ, cDishes.class);
//		System.out.println(cDish.toString());
//		for (cDishes cDishes : dishes) {
//			System.out.println(cDishes.getdName());
//		}
//		if(dishesJson != null){
//			Object dishObj = JSONUtil.json2Object(dishesJson, cDishes.class);
//			System.out.println(dishesJson.length()+"content"+dishesJson.toString());
			
//			System.out.println(cDishesObject.toString());
			
//			List<Areas> areas=showListDao.showAllAreas(rp);
//			response.setCharacterEncoding("utf-8");
//			for(Areas as:areas){
//				System.out.println(as.getArea());
//			}
			PrintWriter writer = response.getWriter();
//			List<String> list = data.get(rp);
//			if (areas != null) {
//				String jsonList = JSONUtil.objetc2Json(areas);
//				System.out.println(jsonList);
//				writer.println(dishesJson);
//			}else {
//				writer.println("");
//			}
		}
//		doGet(request, response);
	}


