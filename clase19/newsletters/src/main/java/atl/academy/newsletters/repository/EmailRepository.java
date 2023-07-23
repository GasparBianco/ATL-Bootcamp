package atl.academy.newsletters.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class EmailRepository {
    @PersistenceContext
    EntityManager database;

    @Transactional
    public void guardarEmail(String emailUsuario){

        String sqlQuery = "INSERT INTO Cliente (email) VALUES (:parametroEmail)";
        database.createQuery(sqlQuery).setParameter("parametroEmail", emailUsuario).executeUpdate();
    }

    @Transactional
    public void eliminarEmail(String emailUsuario) {
        String sqlQuery = "DELETE FROM Cliente WHERE (email) = :parametroEmail";
        database.createQuery(sqlQuery).setParameter("parametroEmail", emailUsuario).executeUpdate();
    }

}
