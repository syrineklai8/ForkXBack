package tn.esprit.examen.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import tn.esprit.examen.entities.Dishes;

public interface DishesRepository extends MongoRepository<Dishes, String> {
}
