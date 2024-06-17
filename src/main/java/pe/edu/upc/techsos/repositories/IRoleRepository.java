package pe.edu.upc.techsos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.techsos.entities.Role;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Long> {
}
