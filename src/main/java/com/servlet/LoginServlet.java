package com.servlet;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.factory.LoginFactory;
import com.mapper.LoginMapper;
import com.repository.LoginRepository;
import com.service.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       LoginRepository mapper = LoginFactory.createLoginRepositoryInstance();
        LoginService service = LoginFactory.createLoginServiceInstance();
        String message = service.validateUser(mapper.fetchLoginDetail(request)); 
         
    			if(message.contains("login successfully")) {
		RequestDispatcher rd1 = request.getRequestDispatcher("home.html");
		rd1.include(request, response);
		System.out.println("Nikita");
		}
		else {
		RequestDispatcher rd2 = request.getRequestDispatcher("fail.html");
		rd2.include(request, response);
		System.out.println("Error");
		}
		
	}
	}

