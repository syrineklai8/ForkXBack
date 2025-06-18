package tn.esprit.examen.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
@Data

public class Product {
  @Id
  private String idProduct;
  private String nameProduct;


}
