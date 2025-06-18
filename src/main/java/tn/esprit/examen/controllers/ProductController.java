package tn.esprit.examen.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.examen.entities.Product;
import tn.esprit.examen.repositories.ProductRepository;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {
  @Autowired
  private ProductRepository productRepository;
  @PostMapping("/products")
  public Product addProduct(@RequestBody Product p) {
    return productRepository.save(p);
  }
}
