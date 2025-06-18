package tn.esprit.examen.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.examen.entities.Product;
import tn.esprit.examen.repositories.ProductRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService implements  IProductService{
 private  final ProductRepository productRepository;
  public Product createProduct(Product product) {
    return productRepository.save(product);
  }

  public List<Product> getAllProducts() {
    return productRepository.findAll();
  }

  public Product updateProduct(String id, Product newProduct) {
    Product product = productRepository.findById(id).orElseThrow();
    product.setNameProduct(newProduct.getNameProduct());
    product.setCurrentQuantity(newProduct.getCurrentQuantity());
    product.setUnitOfMeasure(newProduct.getUnitOfMeasure());
    product.setExpirationDate(newProduct.getExpirationDate());
    return productRepository.save(product);
  }

  public void deleteProduct(String id) {
    productRepository.deleteById(id);
  }


}
