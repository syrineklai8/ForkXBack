package tn.esprit.examen.services;

import org.springframework.data.mongodb.repository.MongoRepository;
import tn.esprit.examen.entities.Product;

import java.util.List;

public interface IProductService {
  public Product createProduct(Product product) ;
  public List<Product> getAllProducts() ;
  public Product updateProduct(String id, Product newProduct) ;
  public void deleteProduct(String id) ;
  }
