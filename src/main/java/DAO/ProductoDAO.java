package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProducto;
import model.TblProductocl2;

public class ProductoDAO implements IProducto {

	public List<TblProductocl2> ListarProductos() {
		
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("LPII_CL2_SembreraJimenez");
		EntityManager emanager=conex.createEntityManager();

		emanager.getTransaction().begin();
		
		List<TblProductocl2> listado=emanager.createQuery("select e from TblProductocl2 e",TblProductocl2.class).getResultList();

		emanager.getTransaction().commit();		
		emanager.close();
		
		return listado;
	}

	public void RegistrarProducto(TblProductocl2 producto) {
			
			EntityManagerFactory conex = Persistence.createEntityManagerFactory("LPII_CL2_SembreraJimenez");
			EntityManager emanager = conex.createEntityManager();
		
			emanager.getTransaction().begin();
			emanager.persist(producto);
			emanager.getTransaction().commit();
			emanager.close();
	}

}
