package BFM;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class index
 */
@WebServlet("/Index")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Index() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//		HttpSession session = request.getSession();

		try {

//			//商品情報を取得
//			ArrayList<ItemDataBeans>itemList = ItemDAO.getRandItem(4);
//
//			//リクエストスコープにセット
//			request.setAttribute("itemList", itemList);
//
//			//セッションにsearchWordが入っていたら破棄する
//			String searchWord = (String)session.getAttribute("searchWord");
//			if(searchWord != null) {
//				session.removeAttribute("searchWord");
//			}

			request.getRequestDispatcher(PagePass.TOP).forward(request, response);

		} catch (Exception e) {
			e.printStackTrace();
//			session.setAttribute("errorMessage", e.toString());
//			response.sendRedirect("Error");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
