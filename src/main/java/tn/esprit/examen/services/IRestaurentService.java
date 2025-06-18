package tn.esprit.examen.services;

import org.springframework.data.mongodb.repository.MongoRepository;
import tn.esprit.examen.entities.Product;
import tn.esprit.examen.entities.Restaurent;

import java.util.List;

public interface IRestaurentService  {
  public Restaurent createRestaurent(Restaurent restaurent) ;
  public List<Restaurent> getAllRestaurents() ;
  public Restaurent updateRestaurent(String id, Restaurent newRestaurent) ;
  public void deleteRestaurent(String id) ;
  }
