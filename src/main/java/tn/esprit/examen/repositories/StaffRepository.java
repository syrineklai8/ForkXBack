package tn.esprit.examen.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import tn.esprit.examen.entities.Staff;

public interface StaffRepository extends MongoRepository<Staff, String> {
}
