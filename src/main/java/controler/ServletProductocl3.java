package controler;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.Productocl3Imp;
import model.TblProductocl3;


/**
 * Servlet implementation class ServletProductocl3
 */
public class ServletProductocl3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletProductocl3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		TblProductocl3 prod = new TblProductocl3();
		Productocl3Imp crud  = new Productocl3Imp();
		List<TblProductocl3> listprodcl3 = crud.ListPrductoscl3();
		//invocamos el listado de  productos
		request.setAttribute("listadoprodcl3", listprodcl3);
		//redireccionamos
		request.getRequestDispatcher("/RegistroProd.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String desc = request.getParameter("desc");
		String estado = request.getParameter("estado");
		String preciocomp = request.getParameter("preciocomp");
		String preciovent = request.getParameter("preciovent");
		String nom = request.getParameter("nom");
		
		//convertir en doble
		double preciocompd = Double.parseDouble(preciocomp);
		double precioventd = Double.parseDouble(preciovent);
		
		
		TblProductocl3 prodcl2 = new TblProductocl3();
		Productocl3Imp crud = new Productocl3Imp();
		
		prodcl2.setDescripcl3(desc);
		prodcl2.setEstadocl3(estado);
		prodcl2.setPreciocompcl3(preciocompd);
		prodcl2.setPrecioventacl3(precioventd);
		prodcl2.setNombrecl3(nom);
		
		
		
		crud.RegistrarProductoCL3(prodcl2);
		request.getRequestDispatcher("/RegistroProd.jsp").forward(request, response);
	}

}
