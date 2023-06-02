package daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import entities.Agressor;
import entities.Incidente;
import entities.Vitima;
import utils.JPAUtil;

public class IncidenteDao {
	
	public static void salvar(Vitima v, Agressor a, Incidente i) {
		
		EntityManager em = JPAUtil.creatingEntityManager();
		em.getTransaction().begin();
		i.setVitima(v);
		i.setAgressor(a);
		em.persist(i);
		em.getTransaction().commit();
		em.close();
	}
	
	public static void editar(Incidente i) {
		EntityManager em = JPAUtil.creatingEntityManager();
		em.getTransaction().begin();
		em.merge(i);
		em.getTransaction().commit();
		em.close();
	}

	public static void deletar(Incidente i) {
		
		EntityManager em = JPAUtil.creatingEntityManager();
		em.getTransaction().begin();
		i = em.find(Incidente.class, i.getId());
		em.remove(i);
		em.getTransaction().commit();
		em.close();
	}
	
	
	public static List<Incidente> listarTodos() {
		
		EntityManager em = JPAUtil.creatingEntityManager();
		Query q = em.createQuery("select i from Incidente i");
		@SuppressWarnings("unchecked")
		List<Incidente> list = q.getResultList();
		em.close();
		return list;
	}
	
	
	public static Incidente listarPorId(Integer id) {
	
		EntityManager em = JPAUtil.creatingEntityManager();
		em.getTransaction().begin();
		Incidente i = em.find(Incidente.class, id);
		em.close();
		return i;
	}	
}
