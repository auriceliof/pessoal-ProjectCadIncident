package daos;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;


import entities.Usuario;
import utils.JPAUtil;

public class LoginDao {
	
public Usuario getUsuario(String login, String senha) {
		
		EntityManager em = JPAUtil.creatingEntityManager();

		try {
			Usuario usuario = (Usuario) em
				.createQuery("SELECT u from Usuario u where u.login = :login and u.senha = :senha ")
				.setParameter("login", login)
				.setParameter("senha", senha)
				.getSingleResult();

			return usuario;

		} catch (NoResultException e) {
			return null;
		}
	}
}
