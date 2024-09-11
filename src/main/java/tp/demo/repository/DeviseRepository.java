package tp.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tp.demo.model.Devise;

public interface DeviseRepository extends JpaRepository<Devise, String> {

    //méthodes héritées : findAll(), find
}
