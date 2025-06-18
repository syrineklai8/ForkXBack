package tn.esprit.examen.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import tn.esprit.examen.entities.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
}
