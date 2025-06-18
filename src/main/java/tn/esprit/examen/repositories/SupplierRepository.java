package tn.esprit.examen.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import tn.esprit.examen.entities.Supplier;

public interface SupplierRepository extends MongoRepository<Supplier, String> {
}
