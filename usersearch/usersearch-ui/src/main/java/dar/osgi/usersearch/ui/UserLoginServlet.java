package dar.osgi.usersearch.ui;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dar.osgi.usersearch.userservice.UserLogin;
import dar.osgi.usersearch.userservice.UserRegister;

public class UserLoginServlet extends HttpServlet {
	UserRegister userRegister;
	UserLogin userLogin;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		String optionId = req.getParameter("optionId");
		PrintWriter writer = resp.getWriter();
		if (optionId != null && optionId.length() > 0) {
			showOption(writer, optionId);
		} else {
			showOptionList(writer);
		}
	}
	
	private void showOptionList(PrintWriter writer) {
		writer.println("<h1>Options</h1>");
		Map<Integer, String> optionMap = new HashMap<Integer, String>();
		optionMap.put(1, "Login");
		optionMap.put(2, "Register");
		for (Entry<Integer, String> entry : optionMap.entrySet()) {
			writer.println("<a href=\"?optionId=" + entry.getKey() + "\">"
					+ entry.getValue() + "</a><BR/>");
		}
	}
	
	private void showOption(PrintWriter writer, String optionId) {
	    if (optionId != null) {
			if(Integer.valueOf(optionId) == 1){
				boolean result = userLogin.login("Deba", "Test");
				if(result == true){
					writer.println("<h1> Hello Debaghya </h1>");
				}else{
					writer.println("<h1> Ke re Bhai!!!! </h1>");
				}
			}else if(Integer.valueOf(optionId) == 2){
				boolean result = userRegister.register("Deba", "Test");
				if(result == true){
					writer.println("<h1> Hoiche </h1>");
				}else{
					writer.println("<h1> Choriache </h1>");
				}
			}
	    }
	}

	public void setUserRegister(UserRegister userRegister) {
		this.userRegister = userRegister;
	}

	public void setUserLogin(UserLogin userLogin) {
		this.userLogin = userLogin;
	}
}
