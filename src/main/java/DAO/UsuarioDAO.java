package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Interfaces.IUsuario;
import model.TblUsuariocl2;

public class UsuarioDAO implements IUsuario {

	public String ValidarUsuario(TblUsuariocl2 usuario) {
	
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("LPII_CL2_SembreraJimenez");
		EntityManager em = fac.createEntityManager();
		
		em.getTransaction().begin();
		
		Query consulta = em.createQuery("SELECT t FROM TblUsuariocl2 t where t.usuariocl2 =:u and t.passwordcl2=:p"
				,TblUsuariocl2.class);
		consulta.setParameter("u",usuario.getUsuariocl2());
		consulta.setParameter("p",usuario.getPasswordcl2());
		
		String resultado = "";
		TblUsuariocl2 user;
		
		try
		{
			user =(TblUsuariocl2)consulta.getSingleResult();
			resultado = "SI";
		}
		catch(Exception e)
		{
			user = null;
			resultado = "NO";
		}
		
		return resultado;
	}

}
