package firstpackage;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StoreCookies
 */
@WebServlet("/StoreCookies")
public class StoreCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StoreCookies() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
		doGet(request, response);
		String number=request.getParameter("number");
		String pass=request.getParameter("pwd");
		Cookie c1=new Cookie("number", number);
		Cookie c2=new Cookie("pass", pass);
		response.addCookie(c1);
		response.addCookie(c2);
		RequestDispatcher rs=request.getRequestDispatcher("accept.html");
		rs.forward(request, response);
	}
}
