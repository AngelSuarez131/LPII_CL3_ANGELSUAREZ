package controler;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.Productocl3Imp;
import model.TblProductocl3;
import model.TblUsuariocl3;


/**
 * Servlet implementation class ServletProductocl3
 */
public class ServletProductocl3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("your-persistence-unit");
       
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
		String accion = request.getParameter("accion");
		//aplicar condicion
		if(accion!=null) {
			switch(accion) {
			case "Modificar":
				int codigo = Integer.parseInt(request.getParameter("cod"));
				//asignar el codigo
				prod.setIsproductoscl3(codigo);
				TblProductocl3 buscarcod = crud.BuscarProductoCL3(prod);
				//enviar valores buscados por codigo de la bd al formlaro actualizar
				request.setAttribute("codigo", buscarcod.getIsproductoscl3());
				request.setAttribute("nombre", buscarcod.getDescripcl3());
				request.setAttribute("apellido", buscarcod.getEstadocl3());
				request.setAttribute("dni", buscarcod.getPreciocompcl3());
				request.setAttribute("email", buscarcod.getPrecioventacl3());
				request.setAttribute("telefono", buscarcod.getNombrecl3());
				//redireccionar
				request.getRequestDispatcher("/FormActualizarProducto.jsp").forward(request, response);
			case "Eliminar":
				int codelim=Integer.parseInt(request.getParameter("cod"));
				//asignar codigoa aelmiinar
				prod.setIsproductoscl3(codelim);
				//invocarmetodoeliminar
				crud.EliminarProductoCL3(prod);
				//refrescar el listado
				List<TblProductocl3> list = crud.ListPrductoscl3();
				request.setAttribute("listadoproducto", list);
				//redireccionar
				request.getRequestDispatcher("/FormActualizarProducto.jsp").forward(request, response);
				break;
				
			case "Listar":
				List<TblProductocl3> listado=crud.ListPrductoscl3();
				//invocamos el listado  de productos para la vista
				request.setAttribute("listadoproducto",listado);
				//redireccionamos
				request.getRequestDispatcher("/ListadoProd.jsp").forward(request, response);
				//salimos
				break;
			}
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String codigo = request.getParameter("cod");
		String desc = request.getParameter("desc");
		String estado = request.getParameter("estado");
		String preciocomp = request.getParameter("preciocomp");
		String preciovent = request.getParameter("preciovent");
		String nom = request.getParameter("nom");
		
		List<TblProductocl3> listadoprod = null;

		
		//convertir en doble
		double preciocompd = Double.parseDouble(preciocomp);
		double precioventd = Double.parseDouble(preciovent);
		
		
		TblProductocl3 prodcl3 = new TblProductocl3();
		Productocl3Imp crud = new Productocl3Imp();
		
		prodcl3.setDescripcl3(desc);
		prodcl3.setEstadocl3(estado);
		prodcl3.setPreciocompcl3(preciocompd);
		prodcl3.setPrecioventacl3(precioventd);
		prodcl3.setNombrecl3(nom);
		if(codigo!=null) {
			int cod = Integer.parseInt(codigo);
			//codigo a actualizar
			prodcl3.setIsproductoscl3(cod);
			crud.ActualizarProductoCL3(prodcl3);
			listadoprod=crud.ListPrductoscl3();
			
		}
		else {
			crud.RegistrarProductoCL3(prodcl3);
			listadoprod=crud.ListPrductoscl3();
		}//fin del else
		
		
		request.setAttribute("listadoproducto", listadoprod);
		request.getRequestDispatcher("/ListadoProd.jsp").forward(request, response);
		
		
		
		crud.RegistrarProductoCL3(prodcl3);
		request.getRequestDispatcher("/RegistroProd.jsp").forward(request, response);
		
		
		 String usuario = request.getParameter("usuario");
	        String contra = request.getParameter("contra");

	        // Perform login validation
	        if (validateLogin(usuario, contra)) {
	            // Login successful
	            request.getRequestDispatcher("/success.jsp").forward(request, response);
	        } else {
	            // Login failed
	            request.setAttribute("errorMessage", "Invalid username or password");
	            request.getRequestDispatcher("/login.jsp").forward(request, response);
	        }
	    }

	    private boolean validateLogin(String usuario, String contra) {
	        EntityManager em = emf.createEntityManager();
	        try {
	            TypedQuery<TblUsuariocl3> query = em.createQuery("SELECT u FROM TblUsuariocl3 u WHERE u.usuariocl3 = :username AND u.passwordcl3 = :password", TblUsuariocl3.class);
	            query.setParameter("username", usuario);
	            query.setParameter("password", contra);

	            TblUsuariocl3 user = query.getSingleResult();
	            return user != null;
	        } catch (Exception e) {
	            e.printStackTrace();
	            return false;
	        } finally {
	            em.close();
	        }
	    }
	}

}
