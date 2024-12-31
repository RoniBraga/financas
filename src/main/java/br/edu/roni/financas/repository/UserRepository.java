package br.edu.roni.financas.repository;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.roni.financas.model.User;
public interface UserRepository extends JpaRepository<User, UUID> {
    
}
