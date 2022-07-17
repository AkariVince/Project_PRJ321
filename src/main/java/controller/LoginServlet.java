package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("home.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		try {
		String userID = request.getParameter("username");
		String password = request.getParameter("password");
		
		boolean isUserNameOK = userID!=null && userID.trim().length()>0;
		boolean isPassWordOK = password!=null && password.trim().length()>0;
		
		if (isUserNameOK && isPassWordOK) {
			String uid = getServletContext().getInitParameter("username");
			String pwd = getServletContext().getInitParameter("password");
			if ( password.equals(pwd) && userID.equalsIgnoreCase(uid)) {
				HttpSession session = request.getSession();
				session.setAttribute("name", userID);
				response.sendRedirect("admin/admin");
			}
			else {
				HttpSession session = request.getSession();
				session.setAttribute("error", "Wrong username or password");
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				rd.include(request,response);
			}
		} else {
				HttpSession session = request.getSession();
				session.setAttribute("error", "Username or password must be enter!");
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				rd.include(request,response);
			}
		} catch (Exception ex) {
		response.getWriter().println(ex);
		}
	}
}
