package tn.esprit.examen.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import tn.esprit.examen.entities.Staff;

import java.util.Optional;

public interface StaffRepository extends MongoRepository<Staff, String> {
  Optional<Staff> findByEmail(String email);            // 🔹 pour le login
  boolean existsByEmail(String email);                  // 🔹 pour éviter doublon signup
}
