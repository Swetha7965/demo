package register.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


import register.dto.UserTable;


public class UserCrud {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("kaveri");
	  EntityManager em = emf.createEntityManager();
	  EntityTransaction et = em.getTransaction();
//	  
	  public void saveUser(UserTable u) {
		  et.begin();
		  em.persist(u);
		  et.commit();
	  }
	  public UserTable fetchByEmail(String email) {
			
			Query query = em.createQuery("select a from UserTable a where email = ?1 ");
			query.setParameter(1, email);
			
			//UserTable s = (UserTable) query.getSingleResult();
			
			
			return (UserTable) query.getSingleResult();

		}
}
}
