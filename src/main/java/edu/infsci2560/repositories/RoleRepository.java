package edu.infsci2560.repositories;

import edu.infsci2560.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long>{
}