package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.EmpleadorController;

@WebServlet("/ServletEmpleadorRegister")
public class ServletEmpleadorRegister extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletEmpleadorRegister() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

        EmpleadorController emp = new EmpleadorController();

        String id_empleador = request.getParameter("id_empleador");
        String email = request.getParameter("email");
        String contrasena = request.getParameter("contrasena");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        double saldo = Double.parseDouble(request.getParameter("saldo"));
        boolean premium = Boolean.parseBoolean(request.getParameter("premium"));

        String result = emp.register(id_empleador, email, contrasena, nombre, apellido, saldo, premium);
        System.out.println(result);

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println(result);
        out.flush();
        out.close();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}