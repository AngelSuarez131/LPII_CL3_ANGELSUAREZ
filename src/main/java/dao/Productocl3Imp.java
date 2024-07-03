package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import interfaces.IProductocl3;
import model.TblProductocl3;


public class Productocl3Imp implements IProductocl3{

	@Override
	public void RegistrarProductoCL3(TblProductocl3 producto) {
		// TODO Auto-generated method stub
				//Condectar con persistence
				EntityManagerFactory fab = Persistence.createEntityManagerFactory("LPII_CL3_ANGELSUAREZ");
				//permite gestionar entidades(clases)
				EntityManager em = fab.createEntityManager();
				em.getTransaction().begin();
				em.persist(producto);
				System.out.println("Producto registrado");
				em.getTransaction().commit();
				em.close();
		
	}

	@Override
	public void ActualizarProductoCL3(TblProductocl3 producto) {
				EntityManagerFactory fab = Persistence.createEntityManagerFactory("LPII_CL3_ANGELSUAREZ");
				EntityManager em = fab.createEntityManager();
				em.getTransaction().begin();
				em.merge(producto);
				em.getTransaction().commit();
				em.close();
		
	}

	@Override
	public void EliminarProductoCL3(TblProductocl3 producto) {
		//establecer concexion con unidad de persistencia
				EntityManagerFactory fab = Persistence.createEntityManagerFactory("LPII_CL3_ANGELSUAREZ");
				//permitir gestionar entidades
				EntityManager em = fab.createEntityManager();
				//Iniciar transaccion
				em.getTransaction().begin();
				//recuperar codigo a eliminar
				TblProductocl3 elim = em.merge(producto);
				//Eliminar del registro
				em.remove(elim);
				//Mensaje en consola
				System.out.println("Producto eliminado correctamente");
				//confirmar
				em.getTransaction().commit();
				//cerrar
				em.close();		
	}

	@Override
	public TblProductocl3 BuscarProductoCL3(TblProductocl3 producto) {
		//establecer conexion con unidad de persistence
				EntityManagerFactory em = Persistence.createEntityManagerFactory("ProyectoMavenSabadoJPA");
				//gestionar las entidades
				EntityManager emanager=em.createEntityManager();
				//Iniciar la transaccion
				emanager.getTransaction().begin();
				//Recuperamos el codigo a eliminar
				TblProductocl3 buscarpro=emanager.find(TblProductocl3.class,producto.getIsproductoscl3());
				//Confirmar 
				emanager.getTransaction().commit();
				//Cerrar
				emanager.close();
				//retornar cliente buscado
				return buscarpro;
	}

	@Override
	public List<TblProductocl3> ListPrductoscl3() {
		EntityManagerFactory em = Persistence.createEntityManagerFactory("LPII_CL3_ANGELSUAREZ");
		EntityManager emanager=em.createEntityManager();
		emanager.getTransaction().begin();				
		List<TblProductocl3> listado = emanager.createQuery("select c from TblProductocl3 c",TblProductocl3.class).getResultList();		
		emanager.getTransaction().commit();
		emanager.close();
		return listado;
	}

}
