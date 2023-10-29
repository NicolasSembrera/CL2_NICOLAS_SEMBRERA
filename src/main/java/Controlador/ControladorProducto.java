package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.TblProductocl2;
import DAO.ProductoDAO;


/**
 * Servlet implementation class ControladorProducto
 */
public class ControladorProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProducto() {
        //super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		/*
		ProductoDAO dao = new ProductoDAO();
		List<TblProductocl2> lista = dao.ListarProductos();
		request.setAttribute("lista", lista);
		
		request.getRequestDispatcher("/FrmGestionarEmpleado.jsp").forward(request, response);*/

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		TblProductocl2 producto = new TblProductocl2();
		producto.setNombrecl2(request.getParameter("nombre"));
		producto.setPreciocompcl2(Double.parseDouble(request.getParameter("precio")));
		producto.setPrecioventacl2(Double.parseDouble(request.getParameter("precioven")));
		producto.setEstadocl2(request.getParameter("estado"));
		producto.setDescripcl2(request.getParameter("descripcion"));
		
		ProductoDAO dao = new ProductoDAO();
		dao.RegistrarProducto(producto);
		
		List<TblProductocl2> lista = dao.ListarProductos();
		
		request.setAttribute("lista", lista);
		request.getRequestDispatcher("/Producto.jsp").forward(request, response);

	}

}
