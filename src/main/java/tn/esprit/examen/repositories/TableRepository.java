package tn.esprit.examen.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import tn.esprit.examen.entities.Table;

public interface TableRepository  extends MongoRepository<Table, String> {
}
