package tn.esprit.examen.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "products")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
  @Id
  private String idProduct;
  private String nameProduct;
  private Integer currentQuantity;
  private String unitOfMeasure;
  private LocalDate expirationDate;



}
