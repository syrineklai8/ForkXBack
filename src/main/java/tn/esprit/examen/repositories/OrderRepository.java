package tn.esprit.examen.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import tn.esprit.examen.entities.Order;

public interface OrderRepository extends MongoRepository<Order, String> {
}
