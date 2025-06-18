package tn.esprit.examen.services;

import org.springframework.data.mongodb.repository.MongoRepository;
import tn.esprit.examen.entities.Dishes;
import tn.esprit.examen.entities.Product;

import java.util.List;

public interface IDishesService {
  public Dishes createDish(Dishes dish) ;
  public List<Dishes> getAllDishes() ;
  public Dishes updateDish(String id, Dishes newDish) ;
  public void deleteDish(String id) ;
  }
