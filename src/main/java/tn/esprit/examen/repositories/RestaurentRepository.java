package tn.esprit.examen.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import tn.esprit.examen.entities.Restaurent;

public interface RestaurentRepository extends MongoRepository<Restaurent, String> {
}
