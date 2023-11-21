package cm.ktvl.reuniondriver.repository;

import cm.ktvl.reuniondriver.entites.Reunion;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ReunionRepository extends JpaRepository<Reunion, Long> {
    Reunion findByName( String   name);
}
