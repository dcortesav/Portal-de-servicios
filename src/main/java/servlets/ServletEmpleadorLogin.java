package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.EmpleadorController;

@WebServlet("/ServletEmpleadorLogin")
public class ServletEmpleadorLogin extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    public ServletEmpleadorLogin() {
        super();
    }
        @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		EmpleadorController emp = new EmpleadorController();
		String id_empleador = request.getParameter("id_empleador");
		String contrasena = request.getParameter("contrasena");
		String result = emp.login(id_empleador, contrasena);
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println(result);
		out.flush();
		out.close();
	}

        @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}