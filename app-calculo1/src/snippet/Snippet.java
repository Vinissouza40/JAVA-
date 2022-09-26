package snippet;

public class Snippet {
	EntityManagerFactory emf = Persistence
					.createEntityManagerFactory("exercicios-jpa");
			EntityManager em = emf.createEntityManager();
	
			Usuario usuario = em.find(Usuario.class, 7L);
			System.out.println(usuario.getNome());
			
			em.close();
			emf.close();
}

